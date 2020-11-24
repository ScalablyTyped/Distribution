package typings.reactInlinesvg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Callback = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type ErrorCallback = js.Function1[
    /* error */ typings.std.Error | typings.reactInlinesvg.typesMod.FetchError, 
    scala.Unit
  ]
  
  type LoadCallback = js.Function2[/* src */ java.lang.String, /* isCached */ scala.Boolean, scala.Unit]
  
  type PreProcessorCallback = js.Function1[/* code */ java.lang.String, java.lang.String]
}
