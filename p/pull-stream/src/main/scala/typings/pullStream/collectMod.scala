package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectMod {
  
  /**
    * Read the stream into an array, then call `cb`.
    */
  @JSImport("pull-stream/sinks/collect", JSImport.Namespace)
  @js.native
  def apply[T](): Sink[T] = js.native
  @JSImport("pull-stream/sinks/collect", JSImport.Namespace)
  @js.native
  def apply[T](cb: js.Function2[/* err */ EndOrError, /* results */ js.Array[T], _]): Sink[T] = js.native
}
