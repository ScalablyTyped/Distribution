package typings
package sendgridLib.sendgridMod.SendGridNs.HelpersNs.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickTracking extends js.Object {
  def getEnable(): scala.Boolean
  def getEnableText(): scala.Boolean
  def setEnable(enabled: scala.Boolean): scala.Unit
  def setEnableText(enableText: scala.Boolean): scala.Unit
  def toJSON(): sendgridLib.Anon_Enable
}

object ClickTracking {
  @scala.inline
  def apply(
    getEnable: () => scala.Boolean,
    getEnableText: () => scala.Boolean,
    setEnable: scala.Boolean => scala.Unit,
    setEnableText: scala.Boolean => scala.Unit,
    toJSON: () => sendgridLib.Anon_Enable
  ): ClickTracking = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getEnableText = js.Any.fromFunction0(getEnableText), setEnable = js.Any.fromFunction1(setEnable), setEnableText = js.Any.fromFunction1(setEnableText), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[ClickTracking]
  }
}

