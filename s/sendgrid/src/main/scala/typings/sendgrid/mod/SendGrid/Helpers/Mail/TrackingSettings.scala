package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.Clicktracking
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackingSettings extends js.Object {
  def getClickTracking(): ClickTracking = js.native
  def getGanalytics(): Ganalytics = js.native
  def getOpenTracking(): OpenTracking = js.native
  def getSubscriptionTracking(): SubscriptionTracking = js.native
  def setClickTracking(value: ClickTracking): Unit = js.native
  def setGanalytics(value: Ganalytics): Unit = js.native
  def setOpenTracking(value: OpenTracking): Unit = js.native
  def setSubscriptionTracking(value: SubscriptionTracking): Unit = js.native
  def toJSON(): Clicktracking = js.native
}

object TrackingSettings {
  @scala.inline
  def apply(
    getClickTracking: () => ClickTracking,
    getGanalytics: () => Ganalytics,
    getOpenTracking: () => OpenTracking,
    getSubscriptionTracking: () => SubscriptionTracking,
    setClickTracking: ClickTracking => Unit,
    setGanalytics: Ganalytics => Unit,
    setOpenTracking: OpenTracking => Unit,
    setSubscriptionTracking: SubscriptionTracking => Unit,
    toJSON: () => Clicktracking
  ): TrackingSettings = {
    val __obj = js.Dynamic.literal(getClickTracking = js.Any.fromFunction0(getClickTracking), getGanalytics = js.Any.fromFunction0(getGanalytics), getOpenTracking = js.Any.fromFunction0(getOpenTracking), getSubscriptionTracking = js.Any.fromFunction0(getSubscriptionTracking), setClickTracking = js.Any.fromFunction1(setClickTracking), setGanalytics = js.Any.fromFunction1(setGanalytics), setOpenTracking = js.Any.fromFunction1(setOpenTracking), setSubscriptionTracking = js.Any.fromFunction1(setSubscriptionTracking), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[TrackingSettings]
  }
  @scala.inline
  implicit class TrackingSettingsOps[Self <: TrackingSettings] (val x: Self) extends AnyVal {
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
    def setGetClickTracking(value: () => ClickTracking): Self = this.set("getClickTracking", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGanalytics(value: () => Ganalytics): Self = this.set("getGanalytics", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOpenTracking(value: () => OpenTracking): Self = this.set("getOpenTracking", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSubscriptionTracking(value: () => SubscriptionTracking): Self = this.set("getSubscriptionTracking", js.Any.fromFunction0(value))
    @scala.inline
    def setSetClickTracking(value: ClickTracking => Unit): Self = this.set("setClickTracking", js.Any.fromFunction1(value))
    @scala.inline
    def setSetGanalytics(value: Ganalytics => Unit): Self = this.set("setGanalytics", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOpenTracking(value: OpenTracking => Unit): Self = this.set("setOpenTracking", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSubscriptionTracking(value: SubscriptionTracking => Unit): Self = this.set("setSubscriptionTracking", js.Any.fromFunction1(value))
    @scala.inline
    def setToJSON(value: () => Clicktracking): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

