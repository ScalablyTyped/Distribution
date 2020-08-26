package typings.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendOptions extends js.Object {
  var api_key: js.UndefOr[String] = js.native
  var api_user: js.UndefOr[String] = js.native
  var bcc: js.UndefOr[String] = js.native
  var cc: js.UndefOr[String] = js.native
  var files: js.UndefOr[String] = js.native
  var from: js.UndefOr[String] = js.native
  var fromname: js.UndefOr[String] = js.native
  var gzip_compress: js.UndefOr[String] = js.native
  var headers: js.UndefOr[String] = js.native
  var html: js.UndefOr[String] = js.native
  var label: js.UndefOr[Double] = js.native
  var replyto: js.UndefOr[String] = js.native
  var resp_email_id: js.UndefOr[String] = js.native
  var subject: js.UndefOr[String] = js.native
  var to: js.UndefOr[String] = js.native
  var use_maillist: js.UndefOr[String] = js.native
  var x_smtpapi: js.UndefOr[String] = js.native
}

object SendOptions {
  @scala.inline
  def apply(): SendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendOptions]
  }
  @scala.inline
  implicit class SendOptionsOps[Self <: SendOptions] (val x: Self) extends AnyVal {
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
    def setBcc(value: String): Self = this.set("bcc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBcc: Self = this.set("bcc", js.undefined)
    @scala.inline
    def setCc(value: String): Self = this.set("cc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCc: Self = this.set("cc", js.undefined)
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
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setLabel(value: Double): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setReplyto(value: String): Self = this.set("replyto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyto: Self = this.set("replyto", js.undefined)
    @scala.inline
    def setResp_email_id(value: String): Self = this.set("resp_email_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResp_email_id: Self = this.set("resp_email_id", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setUse_maillist(value: String): Self = this.set("use_maillist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse_maillist: Self = this.set("use_maillist", js.undefined)
    @scala.inline
    def setX_smtpapi(value: String): Self = this.set("x_smtpapi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX_smtpapi: Self = this.set("x_smtpapi", js.undefined)
  }
  
}

