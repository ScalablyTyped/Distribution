package typings.sendgrid.mod.SendGrid.Helpers.Mail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailSettings extends js.Object {
  
  def getBcc(): Bcc = js.native
  
  def getBypassListManagement(): BypassListManagement = js.native
  
  def getFooter(): Footer = js.native
  
  def getSandBoxMode(): SandBoxMode = js.native
  
  def getSpamCheck(): SpamCheck = js.native
  
  def setBcc(bcc: Bcc): Unit = js.native
  
  def setBypassListManagement(bypassListManagement: BypassListManagement): Unit = js.native
  
  def setFooter(footer: Footer): Unit = js.native
  
  def setSandBoxMode(sandBoxMode: SandBoxMode): Unit = js.native
  
  def setSpamCheck(spamCheck: SpamCheck): Unit = js.native
  
  def toJSON(): typings.sendgrid.anon.Bcc = js.native
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
    toJSON: () => typings.sendgrid.anon.Bcc
  ): MailSettings = {
    val __obj = js.Dynamic.literal(getBcc = js.Any.fromFunction0(getBcc), getBypassListManagement = js.Any.fromFunction0(getBypassListManagement), getFooter = js.Any.fromFunction0(getFooter), getSandBoxMode = js.Any.fromFunction0(getSandBoxMode), getSpamCheck = js.Any.fromFunction0(getSpamCheck), setBcc = js.Any.fromFunction1(setBcc), setBypassListManagement = js.Any.fromFunction1(setBypassListManagement), setFooter = js.Any.fromFunction1(setFooter), setSandBoxMode = js.Any.fromFunction1(setSandBoxMode), setSpamCheck = js.Any.fromFunction1(setSpamCheck), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[MailSettings]
  }
  
  @scala.inline
  implicit class MailSettingsOps[Self <: MailSettings] (val x: Self) extends AnyVal {
    
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
    def setGetBcc(value: () => Bcc): Self = this.set("getBcc", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBypassListManagement(value: () => BypassListManagement): Self = this.set("getBypassListManagement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFooter(value: () => Footer): Self = this.set("getFooter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSandBoxMode(value: () => SandBoxMode): Self = this.set("getSandBoxMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSpamCheck(value: () => SpamCheck): Self = this.set("getSpamCheck", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBcc(value: Bcc => Unit): Self = this.set("setBcc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBypassListManagement(value: BypassListManagement => Unit): Self = this.set("setBypassListManagement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFooter(value: Footer => Unit): Self = this.set("setFooter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSandBoxMode(value: SandBoxMode => Unit): Self = this.set("setSandBoxMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSpamCheck(value: SpamCheck => Unit): Self = this.set("setSpamCheck", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => typings.sendgrid.anon.Bcc): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
}
