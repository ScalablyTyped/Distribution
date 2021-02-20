package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onEndMod {
  
  /**
    * Drain the stream and then call `cb` when done.
    */
  @JSImport("pull-stream/sinks/on-end", JSImport.Namespace)
  @js.native
  def apply(): Sink[_] = js.native
  @JSImport("pull-stream/sinks/on-end", JSImport.Namespace)
  @js.native
  def apply(cb: js.Function1[/* err */ EndOrError, _]): Sink[_] = js.native
}
