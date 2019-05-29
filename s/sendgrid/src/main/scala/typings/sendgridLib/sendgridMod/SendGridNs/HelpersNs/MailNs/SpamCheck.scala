package typings
package sendgridLib.sendgridMod.SendGridNs.HelpersNs.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpamCheck extends js.Object {
  def getEnable(): scala.Boolean
  def getPosttoUrl(): java.lang.String
  def getThreshold(): scala.Double
  def setEnable(enabled: scala.Boolean): scala.Unit
  def setPosttoUrl(post_to_url: java.lang.String): scala.Unit
  def setThreshold(threshold: scala.Double): scala.Unit
  def toJSON(): sendgridLib.Anon_EnablePosttourl
}

object SpamCheck {
  @scala.inline
  def apply(
    getEnable: () => scala.Boolean,
    getPosttoUrl: () => java.lang.String,
    getThreshold: () => scala.Double,
    setEnable: scala.Boolean => scala.Unit,
    setPosttoUrl: java.lang.String => scala.Unit,
    setThreshold: scala.Double => scala.Unit,
    toJSON: () => sendgridLib.Anon_EnablePosttourl
  ): SpamCheck = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getPosttoUrl = js.Any.fromFunction0(getPosttoUrl), getThreshold = js.Any.fromFunction0(getThreshold), setEnable = js.Any.fromFunction1(setEnable), setPosttoUrl = js.Any.fromFunction1(setPosttoUrl), setThreshold = js.Any.fromFunction1(setThreshold), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[SpamCheck]
  }
}

