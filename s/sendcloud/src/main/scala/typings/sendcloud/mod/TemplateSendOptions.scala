package typings.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateSendOptions extends js.Object {
  var api_key: js.UndefOr[String] = js.native
  var api_user: js.UndefOr[String] = js.native
  var files: js.UndefOr[String] = js.native
  var from: js.UndefOr[String] = js.native
  var fromname: js.UndefOr[String] = js.native
  var gzip_compress: js.UndefOr[String] = js.native
  var headers: js.UndefOr[String] = js.native
  var label: js.UndefOr[Double] = js.native
  var replyTo: js.UndefOr[String] = js.native
  var resp_email_id: js.UndefOr[String] = js.native
  var subject: js.UndefOr[String] = js.native
  var substitution_vars: js.UndefOr[String] = js.native
  var template_invoke_name: js.UndefOr[String] = js.native
  var to: js.UndefOr[String] = js.native
  var use_maillist: js.UndefOr[String] = js.native
}

object TemplateSendOptions {
  @scala.inline
  def apply(): TemplateSendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSendOptions]
  }
  @scala.inline
  implicit class TemplateSendOptionsOps[Self <: TemplateSendOptions] (val x: Self) extends AnyVal {
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
    def setApi_key(value: String): Self = this.set("api_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi_key: Self = this.set("api_key", js.undefined)
    @scala.inline
    def setApi_user(value: String): Self = this.set("api_user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi_user: Self = this.set("api_user", js.undefined)
    @scala.inline
    def setFiles(value: String): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setFromname(value: String): Self = this.set("fromname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromname: Self = this.set("fromname", js.undefined)
    @scala.inline
    def setGzip_compress(value: String): Self = this.set("gzip_compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGzip_compress: Self = this.set("gzip_compress", js.undefined)
    @scala.inline
    def setHeaders(value: String): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setLabel(value: Double): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setReplyTo(value: String): Self = this.set("replyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyTo: Self = this.set("replyTo", js.undefined)
    @scala.inline
    def setResp_email_id(value: String): Self = this.set("resp_email_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResp_email_id: Self = this.set("resp_email_id", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setSubstitution_vars(value: String): Self = this.set("substitution_vars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstitution_vars: Self = this.set("substitution_vars", js.undefined)
    @scala.inline
    def setTemplate_invoke_name(value: String): Self = this.set("template_invoke_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate_invoke_name: Self = this.set("template_invoke_name", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setUse_maillist(value: String): Self = this.set("use_maillist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse_maillist: Self = this.set("use_maillist", js.undefined)
  }
  
}

