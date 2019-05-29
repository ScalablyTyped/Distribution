package typings
package sendgridLib.sendgridMod.SendGridNs.HelpersNs.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenTracking extends js.Object {
  def getEnable(): scala.Boolean
  def getSubscriptionTag(): java.lang.String
  def setEnable(enabled: scala.Boolean): scala.Unit
  def setSubscriptionTag(subscriptionTag: java.lang.String): scala.Unit
  def toJSON(): sendgridLib.Anon_EnableSubstitutiontag
}

object OpenTracking {
  @scala.inline
  def apply(
    getEnable: () => scala.Boolean,
    getSubscriptionTag: () => java.lang.String,
    setEnable: scala.Boolean => scala.Unit,
    setSubscriptionTag: java.lang.String => scala.Unit,
    toJSON: () => sendgridLib.Anon_EnableSubstitutiontag
  ): OpenTracking = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getSubscriptionTag = js.Any.fromFunction0(getSubscriptionTag), setEnable = js.Any.fromFunction1(setEnable), setSubscriptionTag = js.Any.fromFunction1(setSubscriptionTag), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[OpenTracking]
  }
}

