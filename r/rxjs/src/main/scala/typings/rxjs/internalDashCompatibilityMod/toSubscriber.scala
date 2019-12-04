package typings.rxjs.internalDashCompatibilityMod

import typings.rxjs.internalTypesMod.PartialObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "toSubscriber")
@js.native
object toSubscriber extends js.Object {
  def apply[T](): typings.rxjs.internalSubscriberMod.Subscriber[T] = js.native
  def apply[T](nextOrObserver: js.Function1[/* value */ T, Unit]): typings.rxjs.internalSubscriberMod.Subscriber[T] = js.native
  def apply[T](nextOrObserver: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ js.Any, Unit]): typings.rxjs.internalSubscriberMod.Subscriber[T] = js.native
  def apply[T](
    nextOrObserver: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): typings.rxjs.internalSubscriberMod.Subscriber[T] = js.native
  def apply[T](nextOrObserver: PartialObserver[T]): typings.rxjs.internalSubscriberMod.Subscriber[T] = js.native
  def apply[T](nextOrObserver: PartialObserver[T], error: js.Function1[/* error */ js.Any, Unit]): typings.rxjs.internalSubscriberMod.Subscriber[T] = js.native
  def apply[T](
    nextOrObserver: PartialObserver[T],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): typings.rxjs.internalSubscriberMod.Subscriber[T] = js.native
}

