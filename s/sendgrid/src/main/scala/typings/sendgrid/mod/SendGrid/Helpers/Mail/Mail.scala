package typings.sendgrid.mod.SendGrid.Helpers.Mail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mail extends StObject {
  
  def addAttachment(attachment: Attachment): Unit = js.native
  
  def addCategory(category: Category): Unit = js.native
  
  def addContent(content: Content): Unit = js.native
  
  def addCustomArg(customArg: CustomArgs): Unit = js.native
  
  def addHeader(header: Header): Unit = js.native
  
  def addMailSettings(settings: MailSettings): Unit = js.native
  
  def addPersonalization(personalization: Personalization): Unit = js.native
  
  def addSection(section: Section): Unit = js.native
  
  def addTrackingSettings(settings: TrackingSettings): Unit = js.native
  
  def getAsm(): Asm = js.native
  
  def getAttachments(): js.Array[Attachment] = js.native
  
  def getBatchId(): String = js.native
  
  def getCategories(): js.Array[Category] = js.native
  
  def getContents(): js.Array[Content] = js.native
  
  def getCustomArgs(): js.Array[CustomArgs] = js.native
  
  def getFrom(): Email = js.native
  
  def getHeaders(): js.Array[Header] = js.native
  
  def getIpPoolName(): String = js.native
  
  def getMailSettings(): MailSettings = js.native
  
  def getPersonalizations(): js.Array[Personalization] = js.native
  
  def getReplyTo(): Email = js.native
  
  def getSections(): js.Array[Section] = js.native
  
  def getSendAt(): Double = js.native
  
  def getSubject(): String = js.native
  
  def getTemplateId(): String = js.native
  
  def getTrackingSettings(): TrackingSettings = js.native
  
  def setAsm(asm: Asm): Unit = js.native
  
  def setBatchId(batch_id: String): Unit = js.native
  
  def setFrom(email: Email): Unit = js.native
  
  def setIpPoolName(name: String): Unit = js.native
  
  def setReplyTo(email: Email): Unit = js.native
  
  def setSendAt(sendAt: Double): Unit = js.native
  
  def setSubject(subject: String): Unit = js.native
  
  def setTemplateId(templateId: String): Unit = js.native
  
  def toJSON(): typings.sendgrid.anon.Asm = js.native
}
object Mail {
  
  @scala.inline
  def apply(
    addAttachment: Attachment => Unit,
    addCategory: Category => Unit,
    addContent: Content => Unit,
    addCustomArg: CustomArgs => Unit,
    addHeader: Header => Unit,
    addMailSettings: MailSettings => Unit,
    addPersonalization: Personalization => Unit,
    addSection: Section => Unit,
    addTrackingSettings: TrackingSettings => Unit,
    getAsm: () => Asm,
    getAttachments: () => js.Array[Attachment],
    getBatchId: () => String,
    getCategories: () => js.Array[Category],
    getContents: () => js.Array[Content],
    getCustomArgs: () => js.Array[CustomArgs],
    getFrom: () => Email,
    getHeaders: () => js.Array[Header],
    getIpPoolName: () => String,
    getMailSettings: () => MailSettings,
    getPersonalizations: () => js.Array[Personalization],
    getReplyTo: () => Email,
    getSections: () => js.Array[Section],
    getSendAt: () => Double,
    getSubject: () => String,
    getTemplateId: () => String,
    getTrackingSettings: () => TrackingSettings,
    setAsm: Asm => Unit,
    setBatchId: String => Unit,
    setFrom: Email => Unit,
    setIpPoolName: String => Unit,
    setReplyTo: Email => Unit,
    setSendAt: Double => Unit,
    setSubject: String => Unit,
    setTemplateId: String => Unit,
    toJSON: () => typings.sendgrid.anon.Asm
  ): typings.sendgrid.mod.SendGrid.Helpers.Mail.Mail = {
    val __obj = js.Dynamic.literal(addAttachment = js.Any.fromFunction1(addAttachment), addCategory = js.Any.fromFunction1(addCategory), addContent = js.Any.fromFunction1(addContent), addCustomArg = js.Any.fromFunction1(addCustomArg), addHeader = js.Any.fromFunction1(addHeader), addMailSettings = js.Any.fromFunction1(addMailSettings), addPersonalization = js.Any.fromFunction1(addPersonalization), addSection = js.Any.fromFunction1(addSection), addTrackingSettings = js.Any.fromFunction1(addTrackingSettings), getAsm = js.Any.fromFunction0(getAsm), getAttachments = js.Any.fromFunction0(getAttachments), getBatchId = js.Any.fromFunction0(getBatchId), getCategories = js.Any.fromFunction0(getCategories), getContents = js.Any.fromFunction0(getContents), getCustomArgs = js.Any.fromFunction0(getCustomArgs), getFrom = js.Any.fromFunction0(getFrom), getHeaders = js.Any.fromFunction0(getHeaders), getIpPoolName = js.Any.fromFunction0(getIpPoolName), getMailSettings = js.Any.fromFunction0(getMailSettings), getPersonalizations = js.Any.fromFunction0(getPersonalizations), getReplyTo = js.Any.fromFunction0(getReplyTo), getSections = js.Any.fromFunction0(getSections), getSendAt = js.Any.fromFunction0(getSendAt), getSubject = js.Any.fromFunction0(getSubject), getTemplateId = js.Any.fromFunction0(getTemplateId), getTrackingSettings = js.Any.fromFunction0(getTrackingSettings), setAsm = js.Any.fromFunction1(setAsm), setBatchId = js.Any.fromFunction1(setBatchId), setFrom = js.Any.fromFunction1(setFrom), setIpPoolName = js.Any.fromFunction1(setIpPoolName), setReplyTo = js.Any.fromFunction1(setReplyTo), setSendAt = js.Any.fromFunction1(setSendAt), setSubject = js.Any.fromFunction1(setSubject), setTemplateId = js.Any.fromFunction1(setTemplateId), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[typings.sendgrid.mod.SendGrid.Helpers.Mail.Mail]
  }
  
  @scala.inline
  implicit class MailMutableBuilder[Self <: typings.sendgrid.mod.SendGrid.Helpers.Mail.Mail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAttachment(value: Attachment => Unit): Self = StObject.set(x, "addAttachment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddCategory(value: Category => Unit): Self = StObject.set(x, "addCategory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddContent(value: Content => Unit): Self = StObject.set(x, "addContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddCustomArg(value: CustomArgs => Unit): Self = StObject.set(x, "addCustomArg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddHeader(value: Header => Unit): Self = StObject.set(x, "addHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddMailSettings(value: MailSettings => Unit): Self = StObject.set(x, "addMailSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddPersonalization(value: Personalization => Unit): Self = StObject.set(x, "addPersonalization", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddSection(value: Section => Unit): Self = StObject.set(x, "addSection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddTrackingSettings(value: TrackingSettings => Unit): Self = StObject.set(x, "addTrackingSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAsm(value: () => Asm): Self = StObject.set(x, "getAsm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAttachments(value: () => js.Array[Attachment]): Self = StObject.set(x, "getAttachments", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBatchId(value: () => String): Self = StObject.set(x, "getBatchId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCategories(value: () => js.Array[Category]): Self = StObject.set(x, "getCategories", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContents(value: () => js.Array[Content]): Self = StObject.set(x, "getContents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCustomArgs(value: () => js.Array[CustomArgs]): Self = StObject.set(x, "getCustomArgs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFrom(value: () => Email): Self = StObject.set(x, "getFrom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeaders(value: () => js.Array[Header]): Self = StObject.set(x, "getHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIpPoolName(value: () => String): Self = StObject.set(x, "getIpPoolName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMailSettings(value: () => MailSettings): Self = StObject.set(x, "getMailSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPersonalizations(value: () => js.Array[Personalization]): Self = StObject.set(x, "getPersonalizations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReplyTo(value: () => Email): Self = StObject.set(x, "getReplyTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSections(value: () => js.Array[Section]): Self = StObject.set(x, "getSections", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSendAt(value: () => Double): Self = StObject.set(x, "getSendAt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubject(value: () => String): Self = StObject.set(x, "getSubject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTemplateId(value: () => String): Self = StObject.set(x, "getTemplateId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTrackingSettings(value: () => TrackingSettings): Self = StObject.set(x, "getTrackingSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAsm(value: Asm => Unit): Self = StObject.set(x, "setAsm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBatchId(value: String => Unit): Self = StObject.set(x, "setBatchId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFrom(value: Email => Unit): Self = StObject.set(x, "setFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIpPoolName(value: String => Unit): Self = StObject.set(x, "setIpPoolName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetReplyTo(value: Email => Unit): Self = StObject.set(x, "setReplyTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSendAt(value: Double => Unit): Self = StObject.set(x, "setSendAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSubject(value: String => Unit): Self = StObject.set(x, "setSubject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTemplateId(value: String => Unit): Self = StObject.set(x, "setTemplateId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => typings.sendgrid.anon.Asm): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
