package typings.rxjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscribable[T] extends js.Object {
  def subscribe(): Unsubscribable = js.native
  /** @deprecated Use an observer instead of a complete callback */
  def subscribe(next: js.UndefOr[Null], error: js.UndefOr[Null], complete: js.Function0[Unit]): Unsubscribable = js.native
  /** @deprecated Use an observer instead of an error callback */
  def subscribe(next: js.UndefOr[Null], error: js.Function1[/* error */ js.Any, Unit]): Unsubscribable = js.native
  def subscribe(
    next: js.UndefOr[Null],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): Unsubscribable = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit]): Unsubscribable = js.native
  /** @deprecated Use an observer instead of a complete callback */
  def subscribe(next: js.Function1[/* value */ T, Unit], error: js.UndefOr[Null], complete: js.Function0[Unit]): Unsubscribable = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ js.Any, Unit]): Unsubscribable = js.native
  def subscribe(
    next: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): Unsubscribable = js.native
  def subscribe(observer: PartialObserver[T]): Unsubscribable = js.native
}

