package typings.sendmail.sendmailMod

import typings.sendmail.Anon_Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailInput extends js.Object {
  var attachments: js.UndefOr[js.Array[Anon_Content]] = js.undefined
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
    attachments: js.Array[Anon_Content] = null,
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
    val __obj = js.Dynamic.literal(from = from, subject = subject, to = to)
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (bcc != null) __obj.updateDynamic("bcc")(bcc)
    if (cc != null) __obj.updateDynamic("cc")(cc)
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (content != null) __obj.updateDynamic("content")(content)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (html != null) __obj.updateDynamic("html")(html)
    if (id != null) __obj.updateDynamic("id")(id)
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo)
    if (returnTo != null) __obj.updateDynamic("returnTo")(returnTo)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MailInput]
  }
}

