package typings.sendgrid.sendgridMod.SendGridNs.HelpersNs.MailNs

import typings.sendgrid.Anon_Clicktracking
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackingSettings extends js.Object {
  def getClickTracking(): ClickTracking
  def getGanalytics(): Ganalytics
  def getOpenTracking(): OpenTracking
  def getSubscriptionTracking(): SubscriptionTracking
  def setClickTracking(value: ClickTracking): Unit
  def setGanalytics(value: Ganalytics): Unit
  def setOpenTracking(value: OpenTracking): Unit
  def setSubscriptionTracking(value: SubscriptionTracking): Unit
  def toJSON(): Anon_Clicktracking
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
    toJSON: () => Anon_Clicktracking
  ): TrackingSettings = {
    val __obj = js.Dynamic.literal(getClickTracking = js.Any.fromFunction0(getClickTracking), getGanalytics = js.Any.fromFunction0(getGanalytics), getOpenTracking = js.Any.fromFunction0(getOpenTracking), getSubscriptionTracking = js.Any.fromFunction0(getSubscriptionTracking), setClickTracking = js.Any.fromFunction1(setClickTracking), setGanalytics = js.Any.fromFunction1(setGanalytics), setOpenTracking = js.Any.fromFunction1(setOpenTracking), setSubscriptionTracking = js.Any.fromFunction1(setSubscriptionTracking), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[TrackingSettings]
  }
}

