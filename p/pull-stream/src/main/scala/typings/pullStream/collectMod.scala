package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pull-stream/sinks/collect", JSImport.Namespace)
@js.native
object collectMod extends js.Object {
  
  /**
    * Read the stream into an array, then call `cb`.
    */
  def apply[T](): Sink[T] = js.native
  def apply[T](cb: js.Function2[/* err */ EndOrError, /* results */ js.Array[T], _]): Sink[T] = js.native
}
