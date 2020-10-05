package typings.rxjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscribable[T] extends js.Object {
  def subscribe(): Unsubscribable = js.native
  def subscribe(next: js.UndefOr[scala.Nothing], error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): Unsubscribable = js.native
  def subscribe(next: js.UndefOr[scala.Nothing], error: js.Function1[/* error */ js.Any, Unit]): Unsubscribable = js.native
  def subscribe(
    next: js.UndefOr[scala.Nothing],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): Unsubscribable = js.native
  def subscribe(next: js.UndefOr[scala.Nothing], error: Null, complete: js.Function0[Unit]): Unsubscribable = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit]): Unsubscribable = js.native
  def subscribe(
    next: js.Function1[/* value */ T, Unit],
    error: js.UndefOr[scala.Nothing],
    complete: js.Function0[Unit]
  ): Unsubscribable = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ js.Any, Unit]): Unsubscribable = js.native
  def subscribe(
    next: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): Unsubscribable = js.native
  /** @deprecated Use an observer instead of a complete callback */
  def subscribe(next: js.Function1[/* value */ T, Unit], error: Null, complete: js.Function0[Unit]): Unsubscribable = js.native
  def subscribe(next: Null, error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): Unsubscribable = js.native
  /** @deprecated Use an observer instead of an error callback */
  def subscribe(next: Null, error: js.Function1[/* error */ js.Any, Unit]): Unsubscribable = js.native
  def subscribe(next: Null, error: js.Function1[/* error */ js.Any, Unit], complete: js.Function0[Unit]): Unsubscribable = js.native
  /** @deprecated Use an observer instead of a complete callback */
  def subscribe(next: Null, error: Null, complete: js.Function0[Unit]): Unsubscribable = js.native
  def subscribe(observer: PartialObserver[T]): Unsubscribable = js.native
}

