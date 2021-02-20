package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drainMod {
  
  /**
    * Drain the stream, calling op on each `data`. Call `done` when stream is finished. If `op` returns `=== false`, abort the stream.
    */
  @JSImport("pull-stream/sinks/drain", JSImport.Namespace)
  @js.native
  def apply[T](): Sink[T] = js.native
  @JSImport("pull-stream/sinks/drain", JSImport.Namespace)
  @js.native
  def apply[T](op: js.UndefOr[scala.Nothing], cb: js.Function1[/* err */ EndOrError, _]): Sink[T] = js.native
  @JSImport("pull-stream/sinks/drain", JSImport.Namespace)
  @js.native
  def apply[T](op: js.Function1[/* data */ T, _]): Sink[T] = js.native
  @JSImport("pull-stream/sinks/drain", JSImport.Namespace)
  @js.native
  def apply[T](op: js.Function1[/* data */ T, _], cb: js.Function1[/* err */ EndOrError, _]): Sink[T] = js.native
}
