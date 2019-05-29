package typings
package sendgridLib.sendgridMod.SendGridNs.HelpersNs.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BypassListManagement extends js.Object {
  def getEnable(): scala.Boolean
  def setEnable(enabled: scala.Boolean): scala.Unit
  def toJSON(): sendgridLib.Anon_EnableBoolean
}

object BypassListManagement {
  @scala.inline
  def apply(
    getEnable: () => scala.Boolean,
    setEnable: scala.Boolean => scala.Unit,
    toJSON: () => sendgridLib.Anon_EnableBoolean
  ): BypassListManagement = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), setEnable = js.Any.fromFunction1(setEnable), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[BypassListManagement]
  }
}

