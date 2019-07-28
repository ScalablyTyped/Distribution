package typings.sendgrid.sendgridMod.SendGridNs.HelpersNs.MailNs

import typings.sendgrid.Anon_EnableSubstitutiontag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenTracking extends js.Object {
  def getEnable(): Boolean
  def getSubscriptionTag(): String
  def setEnable(enabled: Boolean): Unit
  def setSubscriptionTag(subscriptionTag: String): Unit
  def toJSON(): Anon_EnableSubstitutiontag
}

object OpenTracking {
  @scala.inline
  def apply(
    getEnable: () => Boolean,
    getSubscriptionTag: () => String,
    setEnable: Boolean => Unit,
    setSubscriptionTag: String => Unit,
    toJSON: () => Anon_EnableSubstitutiontag
  ): OpenTracking = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getSubscriptionTag = js.Any.fromFunction0(getSubscriptionTag), setEnable = js.Any.fromFunction1(setEnable), setSubscriptionTag = js.Any.fromFunction1(setSubscriptionTag), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[OpenTracking]
  }
}

