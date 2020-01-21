package typings.sendmail.mod

import typings.sendmail.AnonContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailInput extends js.Object {
  var attachments: js.UndefOr[js.Array[AnonContent]] = js.undefined
  var bcc: js.UndefOr[String] = js.undefined
  var cc: js.UndefOr[String] = js.undefined
  var charset: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var from: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var replyTo: js.UndefOr[String] = js.undefined
  var returnTo: js.UndefOr[String] = js.undefined
  var subject: String
  var to: String
  var `type`: js.UndefOr[String] = js.undefined
}

object MailInput {
  @scala.inline
  def apply(
    from: String,
    subject: String,
    to: String,
    attachments: js.Array[AnonContent] = null,
    bcc: String = null,
    cc: String = null,
    charset: String = null,
    content: String = null,
    encoding: String = null,
    headers: js.Object = null,
    html: String = null,
    id: String = null,
    replyTo: String = null,
    returnTo: String = null,
    `type`: String = null
  ): MailInput = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (returnTo != null) __obj.updateDynamic("returnTo")(returnTo.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailInput]
  }
}

