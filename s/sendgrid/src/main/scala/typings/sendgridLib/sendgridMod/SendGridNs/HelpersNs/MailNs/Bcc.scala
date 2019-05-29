package typings
package sendgridLib.sendgridMod.SendGridNs.HelpersNs.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bcc extends js.Object {
  def getEmail(): Email
  def getEnable(): scala.Boolean
  def setEmail(value: Email): scala.Unit
  def setEnable(enabled: scala.Boolean): scala.Unit
  def toJSON(): sendgridLib.Anon_Email
}

object Bcc {
  @scala.inline
  def apply(
    getEmail: () => Email,
    getEnable: () => scala.Boolean,
    setEmail: Email => scala.Unit,
    setEnable: scala.Boolean => scala.Unit,
    toJSON: () => sendgridLib.Anon_Email
  ): Bcc = {
    val __obj = js.Dynamic.literal(getEmail = js.Any.fromFunction0(getEmail), getEnable = js.Any.fromFunction0(getEnable), setEmail = js.Any.fromFunction1(setEmail), setEnable = js.Any.fromFunction1(setEnable), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Bcc]
  }
}

