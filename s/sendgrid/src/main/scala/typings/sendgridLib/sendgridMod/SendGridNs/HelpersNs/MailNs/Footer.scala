package typings
package sendgridLib.sendgridMod.SendGridNs.HelpersNs.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Footer extends js.Object {
  def getEnable(): scala.Boolean
  def getHtml(): java.lang.String
  def getText(): java.lang.String
  def setEnable(enabled: scala.Boolean): scala.Unit
  def setHtml(html: java.lang.String): scala.Unit
  def setText(text: java.lang.String): scala.Unit
  def toJSON(): sendgridLib.Anon_EnableHtmlText
}

object Footer {
  @scala.inline
  def apply(
    getEnable: () => scala.Boolean,
    getHtml: () => java.lang.String,
    getText: () => java.lang.String,
    setEnable: scala.Boolean => scala.Unit,
    setHtml: java.lang.String => scala.Unit,
    setText: java.lang.String => scala.Unit,
    toJSON: () => sendgridLib.Anon_EnableHtmlText
  ): Footer = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getHtml = js.Any.fromFunction0(getHtml), getText = js.Any.fromFunction0(getText), setEnable = js.Any.fromFunction1(setEnable), setHtml = js.Any.fromFunction1(setHtml), setText = js.Any.fromFunction1(setText), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Footer]
  }
}

