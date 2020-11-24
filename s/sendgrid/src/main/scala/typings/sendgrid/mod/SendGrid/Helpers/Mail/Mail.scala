package typings.sendgrid.mod.SendGrid.Helpers.Mail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mail extends js.Object {
  
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
  ): Mail = {
    val __obj = js.Dynamic.literal(addAttachment = js.Any.fromFunction1(addAttachment), addCategory = js.Any.fromFunction1(addCategory), addContent = js.Any.fromFunction1(addContent), addCustomArg = js.Any.fromFunction1(addCustomArg), addHeader = js.Any.fromFunction1(addHeader), addMailSettings = js.Any.fromFunction1(addMailSettings), addPersonalization = js.Any.fromFunction1(addPersonalization), addSection = js.Any.fromFunction1(addSection), addTrackingSettings = js.Any.fromFunction1(addTrackingSettings), getAsm = js.Any.fromFunction0(getAsm), getAttachments = js.Any.fromFunction0(getAttachments), getBatchId = js.Any.fromFunction0(getBatchId), getCategories = js.Any.fromFunction0(getCategories), getContents = js.Any.fromFunction0(getContents), getCustomArgs = js.Any.fromFunction0(getCustomArgs), getFrom = js.Any.fromFunction0(getFrom), getHeaders = js.Any.fromFunction0(getHeaders), getIpPoolName = js.Any.fromFunction0(getIpPoolName), getMailSettings = js.Any.fromFunction0(getMailSettings), getPersonalizations = js.Any.fromFunction0(getPersonalizations), getReplyTo = js.Any.fromFunction0(getReplyTo), getSections = js.Any.fromFunction0(getSections), getSendAt = js.Any.fromFunction0(getSendAt), getSubject = js.Any.fromFunction0(getSubject), getTemplateId = js.Any.fromFunction0(getTemplateId), getTrackingSettings = js.Any.fromFunction0(getTrackingSettings), setAsm = js.Any.fromFunction1(setAsm), setBatchId = js.Any.fromFunction1(setBatchId), setFrom = js.Any.fromFunction1(setFrom), setIpPoolName = js.Any.fromFunction1(setIpPoolName), setReplyTo = js.Any.fromFunction1(setReplyTo), setSendAt = js.Any.fromFunction1(setSendAt), setSubject = js.Any.fromFunction1(setSubject), setTemplateId = js.Any.fromFunction1(setTemplateId), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Mail]
  }
  
  @scala.inline
  implicit class MailOps[Self <: typings.sendgrid.mod.SendGrid.Helpers.Mail.Mail] (val x: Self) extends AnyVal {
    
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
    def setAddAttachment(value: Attachment => Unit): Self = this.set("addAttachment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddCategory(value: Category => Unit): Self = this.set("addCategory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddContent(value: Content => Unit): Self = this.set("addContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddCustomArg(value: CustomArgs => Unit): Self = this.set("addCustomArg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddHeader(value: Header => Unit): Self = this.set("addHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddMailSettings(value: MailSettings => Unit): Self = this.set("addMailSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddPersonalization(value: Personalization => Unit): Self = this.set("addPersonalization", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddSection(value: Section => Unit): Self = this.set("addSection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddTrackingSettings(value: TrackingSettings => Unit): Self = this.set("addTrackingSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAsm(value: () => Asm): Self = this.set("getAsm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAttachments(value: () => js.Array[Attachment]): Self = this.set("getAttachments", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBatchId(value: () => String): Self = this.set("getBatchId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCategories(value: () => js.Array[Category]): Self = this.set("getCategories", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContents(value: () => js.Array[Content]): Self = this.set("getContents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCustomArgs(value: () => js.Array[CustomArgs]): Self = this.set("getCustomArgs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFrom(value: () => Email): Self = this.set("getFrom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeaders(value: () => js.Array[Header]): Self = this.set("getHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIpPoolName(value: () => String): Self = this.set("getIpPoolName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMailSettings(value: () => MailSettings): Self = this.set("getMailSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPersonalizations(value: () => js.Array[Personalization]): Self = this.set("getPersonalizations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReplyTo(value: () => Email): Self = this.set("getReplyTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSections(value: () => js.Array[Section]): Self = this.set("getSections", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSendAt(value: () => Double): Self = this.set("getSendAt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubject(value: () => String): Self = this.set("getSubject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTemplateId(value: () => String): Self = this.set("getTemplateId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTrackingSettings(value: () => TrackingSettings): Self = this.set("getTrackingSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAsm(value: Asm => Unit): Self = this.set("setAsm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBatchId(value: String => Unit): Self = this.set("setBatchId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFrom(value: Email => Unit): Self = this.set("setFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIpPoolName(value: String => Unit): Self = this.set("setIpPoolName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetReplyTo(value: Email => Unit): Self = this.set("setReplyTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSendAt(value: Double => Unit): Self = this.set("setSendAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSubject(value: String => Unit): Self = this.set("setSubject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTemplateId(value: String => Unit): Self = this.set("setTemplateId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => typings.sendgrid.anon.Asm): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
}
