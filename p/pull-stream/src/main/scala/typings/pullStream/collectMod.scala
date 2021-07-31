package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectMod {
  
  /**
    * Read the stream into an array, then call `cb`.
    */
  @scala.inline
  def apply[T](): Sink[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Sink[T]]
  @scala.inline
  def apply[T](cb: js.Function2[/* err */ EndOrError, /* results */ js.Array[T], js.Any]): Sink[T] = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Sink[T]]
  
  @JSImport("pull-stream/sinks/collect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
