package typings.sendgrid.mod.SendGrid.Helpers.Mail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bcc extends js.Object {
  def getEmail(): Email = js.native
  def getEnable(): Boolean = js.native
  def setEmail(value: Email): Unit = js.native
  def setEnable(enabled: Boolean): Unit = js.native
  def toJSON(): typings.sendgrid.anon.Email = js.native
}

object Bcc {
  @scala.inline
  def apply(
    getEmail: () => Email,
    getEnable: () => Boolean,
    setEmail: Email => Unit,
    setEnable: Boolean => Unit,
    toJSON: () => typings.sendgrid.anon.Email
  ): Bcc = {
    val __obj = js.Dynamic.literal(getEmail = js.Any.fromFunction0(getEmail), getEnable = js.Any.fromFunction0(getEnable), setEmail = js.Any.fromFunction1(setEmail), setEnable = js.Any.fromFunction1(setEnable), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Bcc]
  }
  @scala.inline
  implicit class BccOps[Self <: Bcc] (val x: Self) extends AnyVal {
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
    def setGetEmail(value: () => Email): Self = this.set("getEmail", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEnable(value: () => Boolean): Self = this.set("getEnable", js.Any.fromFunction0(value))
    @scala.inline
    def setSetEmail(value: Email => Unit): Self = this.set("setEmail", js.Any.fromFunction1(value))
    @scala.inline
    def setSetEnable(value: Boolean => Unit): Self = this.set("setEnable", js.Any.fromFunction1(value))
    @scala.inline
    def setToJSON(value: () => typings.sendgrid.anon.Email): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

