package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Footer extends js.Object {
  def getEnable(): Boolean = js.native
  def getHtml(): String = js.native
  def getText(): String = js.native
  def setEnable(enabled: Boolean): Unit = js.native
  def setHtml(html: String): Unit = js.native
  def setText(text: String): Unit = js.native
  def toJSON(): Text = js.native
}

object Footer {
  @scala.inline
  def apply(
    getEnable: () => Boolean,
    getHtml: () => String,
    getText: () => String,
    setEnable: Boolean => Unit,
    setHtml: String => Unit,
    setText: String => Unit,
    toJSON: () => Text
  ): Footer = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getHtml = js.Any.fromFunction0(getHtml), getText = js.Any.fromFunction0(getText), setEnable = js.Any.fromFunction1(setEnable), setHtml = js.Any.fromFunction1(setHtml), setText = js.Any.fromFunction1(setText), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Footer]
  }
  @scala.inline
  implicit class FooterOps[Self <: Footer] (val x: Self) extends AnyVal {
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
    def setGetEnable(value: () => Boolean): Self = this.set("getEnable", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHtml(value: () => String): Self = this.set("getHtml", js.Any.fromFunction0(value))
    @scala.inline
    def setGetText(value: () => String): Self = this.set("getText", js.Any.fromFunction0(value))
    @scala.inline
    def setSetEnable(value: Boolean => Unit): Self = this.set("setEnable", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHtml(value: String => Unit): Self = this.set("setHtml", js.Any.fromFunction1(value))
    @scala.inline
    def setSetText(value: String => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
    @scala.inline
    def setToJSON(value: () => Text): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

