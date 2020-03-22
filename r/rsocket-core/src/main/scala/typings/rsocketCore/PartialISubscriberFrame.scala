package typings.rsocketCore

import typings.rsocketTypes.reactiveSocketTypesMod.Frame
import typings.rsocketTypes.reactiveStreamTypesMod.ISubscription
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rsocket-types.rsocket-types.ISubscriber<rsocket-types.rsocket-types.Frame>> */
trait PartialISubscriberFrame extends js.Object {
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function1[/* value */ Frame, Unit]] = js.undefined
  var onSubscribe: js.UndefOr[js.Function1[/* subscription */ ISubscription, Unit]] = js.undefined
}

object PartialISubscriberFrame {
  @scala.inline
  def apply(
    onComplete: () => Unit = null,
    onError: /* error */ Error => Unit = null,
    onNext: /* value */ Frame => Unit = null,
    onSubscribe: /* subscription */ ISubscription => Unit = null
  ): PartialISubscriberFrame = {
    val __obj = js.Dynamic.literal()
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction0(onComplete))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction1(onNext))
    if (onSubscribe != null) __obj.updateDynamic("onSubscribe")(js.Any.fromFunction1(onSubscribe))
    __obj.asInstanceOf[PartialISubscriberFrame]
  }
}

