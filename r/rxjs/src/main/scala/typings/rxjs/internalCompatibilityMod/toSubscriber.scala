package typings.rxjs.internalCompatibilityMod

import typings.rxjs.typesMod.PartialObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "toSubscriber")
@js.native
object toSubscriber extends js.Object {
  def apply[T](): typings.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](
    nextOrObserver: js.UndefOr[scala.Nothing],
    error: js.UndefOr[scala.Nothing],
    complete: js.Function0[Unit]
  ): typings.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](nextOrObserver: js.UndefOr[scala.Nothing], error: js.Function1[/* error */ js.Any, Unit]): typings.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](
    nextOrObserver: js.UndefOr[scala.Nothing],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): typings.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](nextOrObserver: js.Function1[/* value */ T, Unit]): typings.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](
    nextOrObserver: js.Function1[/* value */ T, Unit],
    error: js.UndefOr[scala.Nothing],
    complete: js.Function0[Unit]
  ): typings.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](nextOrObserver: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ js.Any, Unit]): typings.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](
    nextOrObserver: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): typings.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](nextOrObserver: PartialObserver[T]): typings.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](nextOrObserver: PartialObserver[T], error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): typings.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](nextOrObserver: PartialObserver[T], error: js.Function1[/* error */ js.Any, Unit]): typings.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](
    nextOrObserver: PartialObserver[T],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): typings.rxjs.subscriberMod.Subscriber[T] = js.native
}

