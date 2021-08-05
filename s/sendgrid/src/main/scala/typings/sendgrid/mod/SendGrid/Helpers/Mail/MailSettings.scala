package typings.sendgrid.mod.SendGrid.Helpers.Mail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailSettings extends StObject {
  
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
  
  def toJSON(): typings.sendgrid.anon.Bcc
}
object MailSettings {
  
  inline def apply(
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
  
  extension [Self <: MailSettings](x: Self) {
    
    inline def setGetBcc(value: () => Bcc): Self = StObject.set(x, "getBcc", js.Any.fromFunction0(value))
    
    inline def setGetBypassListManagement(value: () => BypassListManagement): Self = StObject.set(x, "getBypassListManagement", js.Any.fromFunction0(value))
    
    inline def setGetFooter(value: () => Footer): Self = StObject.set(x, "getFooter", js.Any.fromFunction0(value))
    
    inline def setGetSandBoxMode(value: () => SandBoxMode): Self = StObject.set(x, "getSandBoxMode", js.Any.fromFunction0(value))
    
    inline def setGetSpamCheck(value: () => SpamCheck): Self = StObject.set(x, "getSpamCheck", js.Any.fromFunction0(value))
    
    inline def setSetBcc(value: Bcc => Unit): Self = StObject.set(x, "setBcc", js.Any.fromFunction1(value))
    
    inline def setSetBypassListManagement(value: BypassListManagement => Unit): Self = StObject.set(x, "setBypassListManagement", js.Any.fromFunction1(value))
    
    inline def setSetFooter(value: Footer => Unit): Self = StObject.set(x, "setFooter", js.Any.fromFunction1(value))
    
    inline def setSetSandBoxMode(value: SandBoxMode => Unit): Self = StObject.set(x, "setSandBoxMode", js.Any.fromFunction1(value))
    
    inline def setSetSpamCheck(value: SpamCheck => Unit): Self = StObject.set(x, "setSpamCheck", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => typings.sendgrid.anon.Bcc): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
