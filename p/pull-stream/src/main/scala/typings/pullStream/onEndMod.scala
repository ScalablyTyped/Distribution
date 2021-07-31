package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onEndMod {
  
  /**
    * Drain the stream and then call `cb` when done.
    */
  @scala.inline
  def apply(): Sink[js.Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Sink[js.Any]]
  @scala.inline
  def apply(cb: js.Function1[/* err */ EndOrError, js.Any]): Sink[js.Any] = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Sink[js.Any]]
  
  @JSImport("pull-stream/sinks/on-end", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
