package typings.rsocketCore.anon

import typings.rsocketTypes.reactiveSocketTypesMod.Frame
import typings.rsocketTypes.reactiveStreamTypesMod.ISubscription
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rsocket-types.rsocket-types.ISubscriber<rsocket-types.rsocket-types.Frame>> */
@js.native
trait PartialISubscriberFrame extends js.Object {
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  var onNext: js.UndefOr[js.Function1[/* value */ Frame, Unit]] = js.native
  var onSubscribe: js.UndefOr[js.Function1[/* subscription */ ISubscription, Unit]] = js.native
}

object PartialISubscriberFrame {
  @scala.inline
  def apply(): PartialISubscriberFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialISubscriberFrame]
  }
  @scala.inline
  implicit class PartialISubscriberFrameOps[Self <: PartialISubscriberFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnComplete(value: () => Unit): Self = this.set("onComplete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnError(value: /* error */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnNext(value: /* value */ Frame => Unit): Self = this.set("onNext", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNext: Self = this.set("onNext", js.undefined)
    @scala.inline
    def setOnSubscribe(value: /* subscription */ ISubscription => Unit): Self = this.set("onSubscribe", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubscribe: Self = this.set("onSubscribe", js.undefined)
  }
  
}

