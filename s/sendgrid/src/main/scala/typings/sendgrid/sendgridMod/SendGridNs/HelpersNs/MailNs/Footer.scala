package typings.sendgrid.sendgridMod.SendGridNs.HelpersNs.MailNs

import typings.sendgrid.Anon_EnableHtmlText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Footer extends js.Object {
  def getEnable(): Boolean
  def getHtml(): String
  def getText(): String
  def setEnable(enabled: Boolean): Unit
  def setHtml(html: String): Unit
  def setText(text: String): Unit
  def toJSON(): Anon_EnableHtmlText
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
    toJSON: () => Anon_EnableHtmlText
  ): Footer = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getHtml = js.Any.fromFunction0(getHtml), getText = js.Any.fromFunction0(getText), setEnable = js.Any.fromFunction1(setEnable), setHtml = js.Any.fromFunction1(setHtml), setText = js.Any.fromFunction1(setText), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Footer]
  }
}

