package typings.sendgrid.sendgridMod.SendGrid.Helpers.Mail

import typings.sendgrid.Anon_Email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bcc extends js.Object {
  def getEmail(): Email
  def getEnable(): Boolean
  def setEmail(value: Email): Unit
  def setEnable(enabled: Boolean): Unit
  def toJSON(): Anon_Email
}

object Bcc {
  @scala.inline
  def apply(
    getEmail: () => Email,
    getEnable: () => Boolean,
    setEmail: Email => Unit,
    setEnable: Boolean => Unit,
    toJSON: () => Anon_Email
  ): Bcc = {
    val __obj = js.Dynamic.literal(getEmail = js.Any.fromFunction0(getEmail), getEnable = js.Any.fromFunction0(getEnable), setEmail = js.Any.fromFunction1(setEmail), setEnable = js.Any.fromFunction1(setEnable), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Bcc]
  }
}

