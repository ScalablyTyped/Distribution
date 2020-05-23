package typings.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateSendOptions extends js.Object {
  var api_key: js.UndefOr[String] = js.undefined
  var api_user: js.UndefOr[String] = js.undefined
  var files: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var fromname: js.UndefOr[String] = js.undefined
  var gzip_compress: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[Double] = js.undefined
  var replyTo: js.UndefOr[String] = js.undefined
  var resp_email_id: js.UndefOr[String] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var substitution_vars: js.UndefOr[String] = js.undefined
  var template_invoke_name: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String] = js.undefined
  var use_maillist: js.UndefOr[String] = js.undefined
}

object TemplateSendOptions {
  @scala.inline
  def apply(
    api_key: String = null,
    api_user: String = null,
    files: String = null,
    from: String = null,
    fromname: String = null,
    gzip_compress: String = null,
    headers: String = null,
    label: js.UndefOr[Double] = js.undefined,
    replyTo: String = null,
    resp_email_id: String = null,
    subject: String = null,
    substitution_vars: String = null,
    template_invoke_name: String = null,
    to: String = null,
    use_maillist: String = null
  ): TemplateSendOptions = {
    val __obj = js.Dynamic.literal()
    if (api_key != null) __obj.updateDynamic("api_key")(api_key.asInstanceOf[js.Any])
    if (api_user != null) __obj.updateDynamic("api_user")(api_user.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (fromname != null) __obj.updateDynamic("fromname")(fromname.asInstanceOf[js.Any])
    if (gzip_compress != null) __obj.updateDynamic("gzip_compress")(gzip_compress.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.get.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (resp_email_id != null) __obj.updateDynamic("resp_email_id")(resp_email_id.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (substitution_vars != null) __obj.updateDynamic("substitution_vars")(substitution_vars.asInstanceOf[js.Any])
    if (template_invoke_name != null) __obj.updateDynamic("template_invoke_name")(template_invoke_name.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (use_maillist != null) __obj.updateDynamic("use_maillist")(use_maillist.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateSendOptions]
  }
}

