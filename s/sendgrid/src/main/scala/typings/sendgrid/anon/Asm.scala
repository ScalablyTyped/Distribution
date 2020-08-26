package typings.sendgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Asm extends js.Object {
  var asm: js.Any = js.native
  var attachments: js.Array[_] = js.native
  var batch_id: String = js.native
  var categories: js.Array[_] = js.native
  var content: String = js.native
  var custom_args: js.Array[_] = js.native
  var from: js.Any = js.native
  var headers: js.Array[_] = js.native
  var ip_pool_name: String = js.native
  var mail_settings: js.Any = js.native
  var personalizations: js.Array[_] = js.native
  var reply_to: js.Any = js.native
  var sections: js.Array[_] = js.native
  var send_at: Double = js.native
  var subject: String = js.native
  var template_id: String = js.native
  var tracking_settings: js.Any = js.native
}

object Asm {
  @scala.inline
  def apply(
    asm: js.Any,
    attachments: js.Array[_],
    batch_id: String,
    categories: js.Array[_],
    content: String,
    custom_args: js.Array[_],
    from: js.Any,
    headers: js.Array[_],
    ip_pool_name: String,
    mail_settings: js.Any,
    personalizations: js.Array[_],
    reply_to: js.Any,
    sections: js.Array[_],
    send_at: Double,
    subject: String,
    template_id: String,
    tracking_settings: js.Any
  ): Asm = {
    val __obj = js.Dynamic.literal(asm = asm.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], batch_id = batch_id.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], custom_args = custom_args.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip_pool_name = ip_pool_name.asInstanceOf[js.Any], mail_settings = mail_settings.asInstanceOf[js.Any], personalizations = personalizations.asInstanceOf[js.Any], reply_to = reply_to.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], send_at = send_at.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any], tracking_settings = tracking_settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asm]
  }
  @scala.inline
  implicit class AsmOps[Self <: Asm] (val x: Self) extends AnyVal {
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
    def setAsm(value: js.Any): Self = this.set("asm", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachmentsVarargs(value: js.Any*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[_]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatch_id(value: String): Self = this.set("batch_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoriesVarargs(value: js.Any*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[_]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom_argsVarargs(value: js.Any*): Self = this.set("custom_args", js.Array(value :_*))
    @scala.inline
    def setCustom_args(value: js.Array[_]): Self = this.set("custom_args", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: js.Any): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadersVarargs(value: js.Any*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[_]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setIp_pool_name(value: String): Self = this.set("ip_pool_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setMail_settings(value: js.Any): Self = this.set("mail_settings", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersonalizationsVarargs(value: js.Any*): Self = this.set("personalizations", js.Array(value :_*))
    @scala.inline
    def setPersonalizations(value: js.Array[_]): Self = this.set("personalizations", value.asInstanceOf[js.Any])
    @scala.inline
    def setReply_to(value: js.Any): Self = this.set("reply_to", value.asInstanceOf[js.Any])
    @scala.inline
    def setSectionsVarargs(value: js.Any*): Self = this.set("sections", js.Array(value :_*))
    @scala.inline
    def setSections(value: js.Array[_]): Self = this.set("sections", value.asInstanceOf[js.Any])
    @scala.inline
    def setSend_at(value: Double): Self = this.set("send_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate_id(value: String): Self = this.set("template_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracking_settings(value: js.Any): Self = this.set("tracking_settings", value.asInstanceOf[js.Any])
  }
  
}

