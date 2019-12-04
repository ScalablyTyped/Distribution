package typings.rxjs

import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.internalTypesMod.PartialObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/tap", JSImport.Namespace)
@js.native
object internalOperatorsTapMod extends js.Object {
  def tap[T](): MonoTypeOperatorFunction[T] = js.native
  def tap[T](next: js.UndefOr[scala.Nothing], error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
  def tap[T](next: js.UndefOr[scala.Nothing], error: js.Function1[/* error */ js.Any, Unit]): MonoTypeOperatorFunction[T] = js.native
  def tap[T](
    next: js.UndefOr[scala.Nothing],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): MonoTypeOperatorFunction[T] = js.native
  def tap[T](next: js.UndefOr[scala.Nothing], error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
  def tap[T](next: js.Function1[/* x */ T, Unit]): MonoTypeOperatorFunction[T] = js.native
  def tap[T](
    next: js.Function1[/* value */ T, Unit],
    error: js.UndefOr[scala.Nothing],
    complete: js.Function0[Unit]
  ): MonoTypeOperatorFunction[T] = js.native
  def tap[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ js.Any, Unit]): MonoTypeOperatorFunction[T] = js.native
  def tap[T](
    next: js.Function1[/* x */ T, Unit],
    error: js.Function1[/* e */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): MonoTypeOperatorFunction[T] = js.native
  def tap[T](next: js.Function1[/* value */ T, Unit], error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
  def tap[T](next: Null, error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
  def tap[T](next: Null, error: js.Function1[/* error */ js.Any, Unit]): MonoTypeOperatorFunction[T] = js.native
  def tap[T](next: Null, error: js.Function1[/* error */ js.Any, Unit], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
  def tap[T](next: Null, error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
  def tap[T](observer: PartialObserver[T]): MonoTypeOperatorFunction[T] = js.native
}

