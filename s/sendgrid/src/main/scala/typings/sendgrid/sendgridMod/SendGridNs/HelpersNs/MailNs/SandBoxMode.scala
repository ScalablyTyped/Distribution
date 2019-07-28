package typings.sendgrid.sendgridMod.SendGridNs.HelpersNs.MailNs

import typings.sendgrid.Anon_EnableBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SandBoxMode extends js.Object {
  def getEnable(): Boolean
  def setEnable(enabled: Boolean): Unit
  def toJSON(): Anon_EnableBoolean
}

object SandBoxMode {
  @scala.inline
  def apply(getEnable: () => Boolean, setEnable: Boolean => Unit, toJSON: () => Anon_EnableBoolean): SandBoxMode = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), setEnable = js.Any.fromFunction1(setEnable), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[SandBoxMode]
  }
}

