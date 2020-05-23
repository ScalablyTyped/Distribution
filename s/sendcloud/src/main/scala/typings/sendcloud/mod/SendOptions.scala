package typings.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions extends js.Object {
  var api_key: js.UndefOr[String] = js.undefined
  var api_user: js.UndefOr[String] = js.undefined
  var bcc: js.UndefOr[String] = js.undefined
  var cc: js.UndefOr[String] = js.undefined
  var files: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var fromname: js.UndefOr[String] = js.undefined
  var gzip_compress: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[String] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[Double] = js.undefined
  var replyto: js.UndefOr[String] = js.undefined
  var resp_email_id: js.UndefOr[String] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String] = js.undefined
  var use_maillist: js.UndefOr[String] = js.undefined
  var x_smtpapi: js.UndefOr[String] = js.undefined
}

object SendOptions {
  @scala.inline
  def apply(
    api_key: String = null,
    api_user: String = null,
    bcc: String = null,
    cc: String = null,
    files: String = null,
    from: String = null,
    fromname: String = null,
    gzip_compress: String = null,
    headers: String = null,
    html: String = null,
    label: js.UndefOr[Double] = js.undefined,
    replyto: String = null,
    resp_email_id: String = null,
    subject: String = null,
    to: String = null,
    use_maillist: String = null,
    x_smtpapi: String = null
  ): SendOptions = {
    val __obj = js.Dynamic.literal()
    if (api_key != null) __obj.updateDynamic("api_key")(api_key.asInstanceOf[js.Any])
    if (api_user != null) __obj.updateDynamic("api_user")(api_user.asInstanceOf[js.Any])
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (fromname != null) __obj.updateDynamic("fromname")(fromname.asInstanceOf[js.Any])
    if (gzip_compress != null) __obj.updateDynamic("gzip_compress")(gzip_compress.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.get.asInstanceOf[js.Any])
    if (replyto != null) __obj.updateDynamic("replyto")(replyto.asInstanceOf[js.Any])
    if (resp_email_id != null) __obj.updateDynamic("resp_email_id")(resp_email_id.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (use_maillist != null) __obj.updateDynamic("use_maillist")(use_maillist.asInstanceOf[js.Any])
    if (x_smtpapi != null) __obj.updateDynamic("x_smtpapi")(x_smtpapi.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOptions]
  }
}

