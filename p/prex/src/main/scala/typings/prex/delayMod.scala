package typings.prex

import typings.esfxCancelable.mod.Cancelable
import typings.prex.cancellationMod.CancellationToken
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delayMod {
  
  @JSImport("prex/out/lib/delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delay(msec: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(msec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def delay(token: Cancelable, msec: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(token.asInstanceOf[js.Any], msec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def delay(token: CancellationToken, msec: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(token.asInstanceOf[js.Any], msec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def delay[T](msec: Double, value: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(msec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def delay[T](msec: Double, value: PromiseLike[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(msec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def delay[T](token: Cancelable, msec: Double, value: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(token.asInstanceOf[js.Any], msec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def delay[T](token: Cancelable, msec: Double, value: PromiseLike[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(token.asInstanceOf[js.Any], msec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def delay[T](token: CancellationToken, msec: Double, value: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(token.asInstanceOf[js.Any], msec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def delay[T](token: CancellationToken, msec: Double, value: PromiseLike[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(token.asInstanceOf[js.Any], msec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
