package typings.sendgrid.sendgridMod.SendGridNs.HelpersNs.MailNs

import typings.sendgrid.Anon_Asm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mail extends js.Object {
  def addAttachment(attachment: Attachment): Unit
  def addCategory(category: Category): Unit
  def addContent(content: Content): Unit
  def addCustomArg(customArg: CustomArgs): Unit
  def addHeader(header: Header): Unit
  def addMailSettings(settings: MailSettings): Unit
  def addPersonalization(personalization: Personalization): Unit
  def addSection(section: Section): Unit
  def addTrackingSettings(settings: TrackingSettings): Unit
  def getAsm(): Asm
  def getAttachments(): js.Array[Attachment]
  def getBatchId(): String
  def getCategories(): js.Array[Category]
  def getContents(): js.Array[Content]
  def getCustomArgs(): js.Array[CustomArgs]
  def getFrom(): Email
  def getHeaders(): js.Array[Header]
  def getIpPoolName(): String
  def getMailSettings(): MailSettings
  def getPersonalizations(): js.Array[Personalization]
  def getReplyTo(): Email
  def getSections(): js.Array[Section]
  def getSendAt(): Double
  def getSubject(): String
  def getTemplateId(): String
  def getTrackingSettings(): TrackingSettings
  def setAsm(asm: Asm): Unit
  def setBatchId(batch_id: String): Unit
  def setFrom(email: Email): Unit
  def setIpPoolName(name: String): Unit
  def setReplyTo(email: Email): Unit
  def setSendAt(sendAt: Double): Unit
  def setSubject(subject: String): Unit
  def setTemplateId(templateId: String): Unit
  def toJSON(): Anon_Asm
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
    toJSON: () => Anon_Asm
  ): Mail = {
    val __obj = js.Dynamic.literal(addAttachment = js.Any.fromFunction1(addAttachment), addCategory = js.Any.fromFunction1(addCategory), addContent = js.Any.fromFunction1(addContent), addCustomArg = js.Any.fromFunction1(addCustomArg), addHeader = js.Any.fromFunction1(addHeader), addMailSettings = js.Any.fromFunction1(addMailSettings), addPersonalization = js.Any.fromFunction1(addPersonalization), addSection = js.Any.fromFunction1(addSection), addTrackingSettings = js.Any.fromFunction1(addTrackingSettings), getAsm = js.Any.fromFunction0(getAsm), getAttachments = js.Any.fromFunction0(getAttachments), getBatchId = js.Any.fromFunction0(getBatchId), getCategories = js.Any.fromFunction0(getCategories), getContents = js.Any.fromFunction0(getContents), getCustomArgs = js.Any.fromFunction0(getCustomArgs), getFrom = js.Any.fromFunction0(getFrom), getHeaders = js.Any.fromFunction0(getHeaders), getIpPoolName = js.Any.fromFunction0(getIpPoolName), getMailSettings = js.Any.fromFunction0(getMailSettings), getPersonalizations = js.Any.fromFunction0(getPersonalizations), getReplyTo = js.Any.fromFunction0(getReplyTo), getSections = js.Any.fromFunction0(getSections), getSendAt = js.Any.fromFunction0(getSendAt), getSubject = js.Any.fromFunction0(getSubject), getTemplateId = js.Any.fromFunction0(getTemplateId), getTrackingSettings = js.Any.fromFunction0(getTrackingSettings), setAsm = js.Any.fromFunction1(setAsm), setBatchId = js.Any.fromFunction1(setBatchId), setFrom = js.Any.fromFunction1(setFrom), setIpPoolName = js.Any.fromFunction1(setIpPoolName), setReplyTo = js.Any.fromFunction1(setReplyTo), setSendAt = js.Any.fromFunction1(setSendAt), setSubject = js.Any.fromFunction1(setSubject), setTemplateId = js.Any.fromFunction1(setTemplateId), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Mail]
  }
}

