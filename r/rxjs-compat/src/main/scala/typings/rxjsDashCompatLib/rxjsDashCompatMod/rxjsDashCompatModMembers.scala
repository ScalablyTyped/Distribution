package typings
package rxjsDashCompatLib.rxjsDashCompatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat", JSImport.Namespace)
@js.native
object rxjsDashCompatModMembers extends js.Object {
  val ArgumentOutOfRangeError: rxjsLib.internalUtilArgumentOutOfRangeErrorMod.ArgumentOutOfRangeErrorCtor = js.native
  val EmptyError: rxjsLib.internalUtilEmptyErrorMod.EmptyErrorCtor = js.native
  val ObjectUnsubscribedError: rxjsLib.internalUtilObjectUnsubscribedErrorMod.ObjectUnsubscribedErrorCtor = js.native
  /**
   * @typedef {Object} Rx.Scheduler
   * @property {Scheduler} queue Schedules on a queue in the current event frame
   * (trampoline scheduler). Use this for iteration operations.
   * @property {Scheduler} asap Schedules on the micro task queue, which is the same
   * queue used for promises. Basically after the current job, but before the next
   * job. Use this for asynchronous conversions.
   * @property {Scheduler} async Schedules work with `setInterval`. Use this for
   * time-based operations.
   * @property {Scheduler} animationFrame Schedules work with `requestAnimationFrame`.
   * Use this for synchronizing with the platform's painting
   */
  var Scheduler: rxjsDashCompatLib.Anon_AnimationFrame = js.native
  val TimeoutError: rxjsLib.internalUtilTimeoutErrorMod.TimeoutErrorCtor = js.native
  val UnsubscriptionError: rxjsLib.internalUtilUnsubscriptionErrorMod.UnsubscriptionErrorCtor = js.native
  val operators: js.Any = js.native
  def pipe[T](): rxjsLib.internalTypesMod.UnaryFunction[T, T] = js.native
  def pipe[T, A](fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A]): rxjsLib.internalTypesMod.UnaryFunction[T, A] = js.native
  def pipe[T, A, B](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, B] = js.native
  def pipe[T, A, B, C](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, C] = js.native
  def pipe[T, A, B, C, D](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, D] = js.native
  def pipe[T, A, B, C, D, E](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, E] = js.native
  def pipe[T, A, B, C, D, E, F](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E],
    fn6: rxjsLib.internalTypesMod.UnaryFunction[E, F]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, F] = js.native
  def pipe[T, A, B, C, D, E, F, G](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E],
    fn6: rxjsLib.internalTypesMod.UnaryFunction[E, F],
    fn7: rxjsLib.internalTypesMod.UnaryFunction[F, G]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, G] = js.native
  def pipe[T, A, B, C, D, E, F, G, H](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E],
    fn6: rxjsLib.internalTypesMod.UnaryFunction[E, F],
    fn7: rxjsLib.internalTypesMod.UnaryFunction[F, G],
    fn8: rxjsLib.internalTypesMod.UnaryFunction[G, H]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, H] = js.native
  def pipe[T, A, B, C, D, E, F, G, H, I](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E],
    fn6: rxjsLib.internalTypesMod.UnaryFunction[E, F],
    fn7: rxjsLib.internalTypesMod.UnaryFunction[F, G],
    fn8: rxjsLib.internalTypesMod.UnaryFunction[G, H],
    fn9: rxjsLib.internalTypesMod.UnaryFunction[H, I]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, I] = js.native
  def pipe[T, A, B, C, D, E, F, G, H, I](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E],
    fn6: rxjsLib.internalTypesMod.UnaryFunction[E, F],
    fn7: rxjsLib.internalTypesMod.UnaryFunction[F, G],
    fn8: rxjsLib.internalTypesMod.UnaryFunction[G, H],
    fn9: rxjsLib.internalTypesMod.UnaryFunction[H, I],
    fns: (rxjsLib.internalTypesMod.UnaryFunction[_, _])*
  ): rxjsLib.internalTypesMod.UnaryFunction[T, js.Object] = js.native
}

