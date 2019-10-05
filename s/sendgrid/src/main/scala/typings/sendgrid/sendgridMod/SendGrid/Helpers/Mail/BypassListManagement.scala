package typings.sendgrid.sendgridMod.SendGrid.Helpers.Mail

import typings.sendgrid.Anon_EnableBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BypassListManagement extends js.Object {
  def getEnable(): Boolean
  def setEnable(enabled: Boolean): Unit
  def toJSON(): Anon_EnableBoolean
}

object BypassListManagement {
  @scala.inline
  def apply(getEnable: () => Boolean, setEnable: Boolean => Unit, toJSON: () => Anon_EnableBoolean): BypassListManagement = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), setEnable = js.Any.fromFunction1(setEnable), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[BypassListManagement]
  }
}

