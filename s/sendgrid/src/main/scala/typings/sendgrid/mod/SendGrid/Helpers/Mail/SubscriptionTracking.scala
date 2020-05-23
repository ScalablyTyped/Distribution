package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.Html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionTracking extends js.Object {
  def getEnable(): Boolean
  def getHtml(): String
  def getSubstitutionTag(): String
  def getText(): String
  def setEnable(enabled: Boolean): Unit
  def setHtml(html: String): Unit
  def setSubstitutionTag(substitutionTag: String): Unit
  def setText(text: String): Unit
  def toJSON(): Html
}

object SubscriptionTracking {
  @scala.inline
  def apply(
    getEnable: () => Boolean,
    getHtml: () => String,
    getSubstitutionTag: () => String,
    getText: () => String,
    setEnable: Boolean => Unit,
    setHtml: String => Unit,
    setSubstitutionTag: String => Unit,
    setText: String => Unit,
    toJSON: () => Html
  ): SubscriptionTracking = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getHtml = js.Any.fromFunction0(getHtml), getSubstitutionTag = js.Any.fromFunction0(getSubstitutionTag), getText = js.Any.fromFunction0(getText), setEnable = js.Any.fromFunction1(setEnable), setHtml = js.Any.fromFunction1(setHtml), setSubstitutionTag = js.Any.fromFunction1(setSubstitutionTag), setText = js.Any.fromFunction1(setText), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[SubscriptionTracking]
  }
}

