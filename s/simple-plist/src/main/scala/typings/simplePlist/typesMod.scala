package typings.simplePlist

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type PlistJsObj = (Record[Any, Any]) | js.Array[Any]
  
  type StringOrBuffer = String | Buffer
  
  type callbackFn[T] = js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[T], Unit]
}
