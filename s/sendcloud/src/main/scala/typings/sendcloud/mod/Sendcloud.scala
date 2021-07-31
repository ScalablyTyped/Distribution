package typings.sendcloud.mod

import typings.nodemailer.mod.SentMessageInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sendcloud extends StObject {
  
  val EmailList: typings.sendcloud.mod.EmailList = js.native
  
  val ListMember: typings.sendcloud.mod.ListMember = js.native
  
  def send(to: String, subject: String, html: String): js.Promise[SuccessResp | ErrorResp] = js.native
  def send(to: String, subject: String, html: String, options: SendOptions): js.Promise[SuccessResp | ErrorResp] = js.native
  
  def sendByMailList(to: String, subject: String, templateName: String, options: TemplateSendOptions): js.Promise[TemplateSendResponse] = js.native
  
  def sendByTemplate(
    to: js.Array[String],
    subject: String,
    templateName: String,
    sub: js.Object,
    options: TemplateSendOptions
  ): js.Promise[TemplateSendResponse] = js.native
  
  def sendEmailSmtp(to: String, subject: String, data: String): js.Promise[SentMessageInfo] = js.native
  
  def templateToOne(to: String, subject: String, templateName: String, sub: js.Object, options: TemplateSendOptions): js.Promise[TemplateSendResponse] = js.native
}
