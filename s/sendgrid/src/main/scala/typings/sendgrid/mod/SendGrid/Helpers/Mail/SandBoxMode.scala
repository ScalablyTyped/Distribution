package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.AnonEnableBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SandBoxMode extends js.Object {
  def getEnable(): Boolean
  def setEnable(enabled: Boolean): Unit
  def toJSON(): AnonEnableBoolean
}

object SandBoxMode {
  @scala.inline
  def apply(getEnable: () => Boolean, setEnable: Boolean => Unit, toJSON: () => AnonEnableBoolean): SandBoxMode = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), setEnable = js.Any.fromFunction1(setEnable), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[SandBoxMode]
  }
}

