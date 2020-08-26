package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.Substitutiontag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenTracking extends js.Object {
  def getEnable(): Boolean = js.native
  def getSubscriptionTag(): String = js.native
  def setEnable(enabled: Boolean): Unit = js.native
  def setSubscriptionTag(subscriptionTag: String): Unit = js.native
  def toJSON(): Substitutiontag = js.native
}

object OpenTracking {
  @scala.inline
  def apply(
    getEnable: () => Boolean,
    getSubscriptionTag: () => String,
    setEnable: Boolean => Unit,
    setSubscriptionTag: String => Unit,
    toJSON: () => Substitutiontag
  ): OpenTracking = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getSubscriptionTag = js.Any.fromFunction0(getSubscriptionTag), setEnable = js.Any.fromFunction1(setEnable), setSubscriptionTag = js.Any.fromFunction1(setSubscriptionTag), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[OpenTracking]
  }
  @scala.inline
  implicit class OpenTrackingOps[Self <: OpenTracking] (val x: Self) extends AnyVal {
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
    def setGetEnable(value: () => Boolean): Self = this.set("getEnable", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSubscriptionTag(value: () => String): Self = this.set("getSubscriptionTag", js.Any.fromFunction0(value))
    @scala.inline
    def setSetEnable(value: Boolean => Unit): Self = this.set("setEnable", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSubscriptionTag(value: String => Unit): Self = this.set("setSubscriptionTag", js.Any.fromFunction1(value))
    @scala.inline
    def setToJSON(value: () => Substitutiontag): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

