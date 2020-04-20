package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.AnonBcc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailSettings extends js.Object {
  def getBcc(): Bcc
  def getBypassListManagement(): BypassListManagement
  def getFooter(): Footer
  def getSandBoxMode(): SandBoxMode
  def getSpamCheck(): SpamCheck
  def setBcc(bcc: Bcc): Unit
  def setBypassListManagement(bypassListManagement: BypassListManagement): Unit
  def setFooter(footer: Footer): Unit
  def setSandBoxMode(sandBoxMode: SandBoxMode): Unit
  def setSpamCheck(spamCheck: SpamCheck): Unit
  def toJSON(): AnonBcc
}

object MailSettings {
  @scala.inline
  def apply(
    getBcc: () => Bcc,
    getBypassListManagement: () => BypassListManagement,
    getFooter: () => Footer,
    getSandBoxMode: () => SandBoxMode,
    getSpamCheck: () => SpamCheck,
    setBcc: Bcc => Unit,
    setBypassListManagement: BypassListManagement => Unit,
    setFooter: Footer => Unit,
    setSandBoxMode: SandBoxMode => Unit,
    setSpamCheck: SpamCheck => Unit,
    toJSON: () => AnonBcc
  ): MailSettings = {
    val __obj = js.Dynamic.literal(getBcc = js.Any.fromFunction0(getBcc), getBypassListManagement = js.Any.fromFunction0(getBypassListManagement), getFooter = js.Any.fromFunction0(getFooter), getSandBoxMode = js.Any.fromFunction0(getSandBoxMode), getSpamCheck = js.Any.fromFunction0(getSpamCheck), setBcc = js.Any.fromFunction1(setBcc), setBypassListManagement = js.Any.fromFunction1(setBypassListManagement), setFooter = js.Any.fromFunction1(setFooter), setSandBoxMode = js.Any.fromFunction1(setSandBoxMode), setSpamCheck = js.Any.fromFunction1(setSpamCheck), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[MailSettings]
  }
}

