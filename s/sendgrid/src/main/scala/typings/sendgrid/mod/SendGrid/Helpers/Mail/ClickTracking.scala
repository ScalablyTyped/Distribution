package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.AnonEnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickTracking extends js.Object {
  def getEnable(): Boolean
  def getEnableText(): Boolean
  def setEnable(enabled: Boolean): Unit
  def setEnableText(enableText: Boolean): Unit
  def toJSON(): AnonEnable
}

object ClickTracking {
  @scala.inline
  def apply(
    getEnable: () => Boolean,
    getEnableText: () => Boolean,
    setEnable: Boolean => Unit,
    setEnableText: Boolean => Unit,
    toJSON: () => AnonEnable
  ): ClickTracking = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getEnableText = js.Any.fromFunction0(getEnableText), setEnable = js.Any.fromFunction1(setEnable), setEnableText = js.Any.fromFunction1(setEnableText), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[ClickTracking]
  }
}

