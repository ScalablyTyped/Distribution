package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.PartialObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/tap", JSImport.Namespace)
@js.native
object tapMod extends js.Object {
  def tap[T](): MonoTypeOperatorFunction[T] = js.native
  def tap[T](next: js.UndefOr[scala.Nothing], error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
  def tap[T](next: js.UndefOr[scala.Nothing], error: js.Function1[/* error */ /* e */ js.Any, Unit]): MonoTypeOperatorFunction[T] = js.native
  def tap[T](
    next: js.UndefOr[scala.Nothing],
    error: js.Function1[/* error */ /* e */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): MonoTypeOperatorFunction[T] = js.native
  def tap[T](next: js.UndefOr[scala.Nothing], error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
  def tap[T](next: js.Function1[/* x */ T, Unit]): MonoTypeOperatorFunction[T] = js.native
  def tap[T](
    next: js.Function1[/* value */ /* x */ T, Unit],
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

