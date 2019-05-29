package typings
package sendgridLib.sendgridMod.SendGridNs.HelpersNs.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mail extends js.Object {
  def addAttachment(attachment: Attachment): scala.Unit
  def addCategory(category: Category): scala.Unit
  def addContent(content: Content): scala.Unit
  def addCustomArg(customArg: CustomArgs): scala.Unit
  def addHeader(header: Header): scala.Unit
  def addMailSettings(settings: MailSettings): scala.Unit
  def addPersonalization(personalization: Personalization): scala.Unit
  def addSection(section: Section): scala.Unit
  def addTrackingSettings(settings: TrackingSettings): scala.Unit
  def getAsm(): Asm
  def getAttachments(): js.Array[Attachment]
  def getBatchId(): java.lang.String
  def getCategories(): js.Array[Category]
  def getContents(): js.Array[Content]
  def getCustomArgs(): js.Array[CustomArgs]
  def getFrom(): Email
  def getHeaders(): js.Array[Header]
  def getIpPoolName(): java.lang.String
  def getMailSettings(): MailSettings
  def getPersonalizations(): js.Array[Personalization]
  def getReplyTo(): Email
  def getSections(): js.Array[Section]
  def getSendAt(): scala.Double
  def getSubject(): java.lang.String
  def getTemplateId(): java.lang.String
  def getTrackingSettings(): TrackingSettings
  def setAsm(asm: Asm): scala.Unit
  def setBatchId(batch_id: java.lang.String): scala.Unit
  def setFrom(email: Email): scala.Unit
  def setIpPoolName(name: java.lang.String): scala.Unit
  def setReplyTo(email: Email): scala.Unit
  def setSendAt(sendAt: scala.Double): scala.Unit
  def setSubject(subject: java.lang.String): scala.Unit
  def setTemplateId(templateId: java.lang.String): scala.Unit
  def toJSON(): sendgridLib.Anon_Asm
}

object Mail {
  @scala.inline
  def apply(
    addAttachment: Attachment => scala.Unit,
    addCategory: Category => scala.Unit,
    addContent: Content => scala.Unit,
    addCustomArg: CustomArgs => scala.Unit,
    addHeader: Header => scala.Unit,
    addMailSettings: MailSettings => scala.Unit,
    addPersonalization: Personalization => scala.Unit,
    addSection: Section => scala.Unit,
    addTrackingSettings: TrackingSettings => scala.Unit,
    getAsm: () => Asm,
    getAttachments: () => js.Array[Attachment],
    getBatchId: () => java.lang.String,
    getCategories: () => js.Array[Category],
    getContents: () => js.Array[Content],
    getCustomArgs: () => js.Array[CustomArgs],
    getFrom: () => Email,
    getHeaders: () => js.Array[Header],
    getIpPoolName: () => java.lang.String,
    getMailSettings: () => MailSettings,
    getPersonalizations: () => js.Array[Personalization],
    getReplyTo: () => Email,
    getSections: () => js.Array[Section],
    getSendAt: () => scala.Double,
    getSubject: () => java.lang.String,
    getTemplateId: () => java.lang.String,
    getTrackingSettings: () => TrackingSettings,
    setAsm: Asm => scala.Unit,
    setBatchId: java.lang.String => scala.Unit,
    setFrom: Email => scala.Unit,
    setIpPoolName: java.lang.String => scala.Unit,
    setReplyTo: Email => scala.Unit,
    setSendAt: scala.Double => scala.Unit,
    setSubject: java.lang.String => scala.Unit,
    setTemplateId: java.lang.String => scala.Unit,
    toJSON: () => sendgridLib.Anon_Asm
  ): Mail = {
    val __obj = js.Dynamic.literal(addAttachment = js.Any.fromFunction1(addAttachment), addCategory = js.Any.fromFunction1(addCategory), addContent = js.Any.fromFunction1(addContent), addCustomArg = js.Any.fromFunction1(addCustomArg), addHeader = js.Any.fromFunction1(addHeader), addMailSettings = js.Any.fromFunction1(addMailSettings), addPersonalization = js.Any.fromFunction1(addPersonalization), addSection = js.Any.fromFunction1(addSection), addTrackingSettings = js.Any.fromFunction1(addTrackingSettings), getAsm = js.Any.fromFunction0(getAsm), getAttachments = js.Any.fromFunction0(getAttachments), getBatchId = js.Any.fromFunction0(getBatchId), getCategories = js.Any.fromFunction0(getCategories), getContents = js.Any.fromFunction0(getContents), getCustomArgs = js.Any.fromFunction0(getCustomArgs), getFrom = js.Any.fromFunction0(getFrom), getHeaders = js.Any.fromFunction0(getHeaders), getIpPoolName = js.Any.fromFunction0(getIpPoolName), getMailSettings = js.Any.fromFunction0(getMailSettings), getPersonalizations = js.Any.fromFunction0(getPersonalizations), getReplyTo = js.Any.fromFunction0(getReplyTo), getSections = js.Any.fromFunction0(getSections), getSendAt = js.Any.fromFunction0(getSendAt), getSubject = js.Any.fromFunction0(getSubject), getTemplateId = js.Any.fromFunction0(getTemplateId), getTrackingSettings = js.Any.fromFunction0(getTrackingSettings), setAsm = js.Any.fromFunction1(setAsm), setBatchId = js.Any.fromFunction1(setBatchId), setFrom = js.Any.fromFunction1(setFrom), setIpPoolName = js.Any.fromFunction1(setIpPoolName), setReplyTo = js.Any.fromFunction1(setReplyTo), setSendAt = js.Any.fromFunction1(setSendAt), setSubject = js.Any.fromFunction1(setSubject), setTemplateId = js.Any.fromFunction1(setTemplateId), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Mail]
  }
}

