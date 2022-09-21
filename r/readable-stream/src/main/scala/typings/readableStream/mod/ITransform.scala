package typings.readableStream.mod

import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransform
  extends StObject
     with IDuplex {
  
  def _flush(callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[Any], Unit]): Unit = js.native
  
  def _transform(
    chunk: Any,
    encoding: BufferEncoding,
    callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[Any], Unit]
  ): Unit = js.native
}
