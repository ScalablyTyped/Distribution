package typings
package rxjsLib.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscribable[T] extends js.Object {
  def subscribe(): Unsubscribable = js.native
  def subscribe(
    next: js.UndefOr[scala.Nothing],
    error: js.UndefOr[scala.Nothing],
    complete: js.Function0[scala.Unit]
  ): Unsubscribable = js.native
  def subscribe(next: js.UndefOr[scala.Nothing], error: js.Function1[/* error */ js.Any, scala.Unit]): Unsubscribable = js.native
  def subscribe(
    next: js.UndefOr[scala.Nothing],
    error: js.Function1[/* error */ js.Any, scala.Unit],
    complete: js.Function0[scala.Unit]
  ): Unsubscribable = js.native
  def subscribe(next: js.UndefOr[scala.Nothing], error: scala.Null, complete: js.Function0[scala.Unit]): Unsubscribable = js.native
  def subscribe(next: js.Function1[/* value */ T, scala.Unit]): Unsubscribable = js.native
  def subscribe(
    next: js.Function1[/* value */ T, scala.Unit],
    error: js.UndefOr[scala.Nothing],
    complete: js.Function0[scala.Unit]
  ): Unsubscribable = js.native
  def subscribe(next: js.Function1[/* value */ T, scala.Unit], error: js.Function1[/* error */ js.Any, scala.Unit]): Unsubscribable = js.native
  def subscribe(
    next: js.Function1[/* value */ T, scala.Unit],
    error: js.Function1[/* error */ js.Any, scala.Unit],
    complete: js.Function0[scala.Unit]
  ): Unsubscribable = js.native
  /** @deprecated Use an observer instead of a complete callback */
  def subscribe(
    next: js.Function1[/* value */ T, scala.Unit],
    error: scala.Null,
    complete: js.Function0[scala.Unit]
  ): Unsubscribable = js.native
  def subscribe(next: scala.Null, error: js.UndefOr[scala.Nothing], complete: js.Function0[scala.Unit]): Unsubscribable = js.native
  /** @deprecated Use an observer instead of an error callback */
  def subscribe(next: scala.Null, error: js.Function1[/* error */ js.Any, scala.Unit]): Unsubscribable = js.native
  def subscribe(
    next: scala.Null,
    error: js.Function1[/* error */ js.Any, scala.Unit],
    complete: js.Function0[scala.Unit]
  ): Unsubscribable = js.native
  /** @deprecated Use an observer instead of a complete callback */
  def subscribe(next: scala.Null, error: scala.Null, complete: js.Function0[scala.Unit]): Unsubscribable = js.native
  def subscribe(observer: PartialObserver[T]): Unsubscribable = js.native
}

