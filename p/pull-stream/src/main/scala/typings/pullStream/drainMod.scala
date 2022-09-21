package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drainMod {
  
  /**
    * Drain the stream, calling op on each `data`. Call `done` when stream is finished. If `op` returns `=== false`, abort the stream.
    */
  inline def apply[T](): Sink[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Sink[T]]
  inline def apply[T](op: js.Function1[/* data */ T, Any]): Sink[T] = ^.asInstanceOf[js.Dynamic].apply(op.asInstanceOf[js.Any]).asInstanceOf[Sink[T]]
  inline def apply[T](op: js.Function1[/* data */ T, Any], cb: js.Function1[/* err */ EndOrError, Any]): Sink[T] = (^.asInstanceOf[js.Dynamic].apply(op.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Sink[T]]
  inline def apply[T](op: Unit, cb: js.Function1[/* err */ EndOrError, Any]): Sink[T] = (^.asInstanceOf[js.Dynamic].apply(op.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Sink[T]]
  
  @JSImport("pull-stream/sinks/drain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
