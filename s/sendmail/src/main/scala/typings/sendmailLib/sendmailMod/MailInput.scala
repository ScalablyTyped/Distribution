package typings
package sendmailLib.sendmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailInput extends js.Object {
  var attachments: js.UndefOr[js.Array[sendmailLib.Anon_Content]] = js.undefined
  var bcc: js.UndefOr[java.lang.String] = js.undefined
  var cc: js.UndefOr[java.lang.String] = js.undefined
  var charset: js.UndefOr[java.lang.String] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var from: java.lang.String
  var headers: js.UndefOr[js.Object] = js.undefined
  var html: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var replyTo: js.UndefOr[java.lang.String] = js.undefined
  var returnTo: js.UndefOr[java.lang.String] = js.undefined
  var subject: java.lang.String
  var to: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object MailInput {
  @scala.inline
  def apply(
    from: java.lang.String,
    subject: java.lang.String,
    to: java.lang.String,
    attachments: js.Array[sendmailLib.Anon_Content] = null,
    bcc: java.lang.String = null,
    cc: java.lang.String = null,
    charset: java.lang.String = null,
    content: java.lang.String = null,
    encoding: java.lang.String = null,
    headers: js.Object = null,
    html: java.lang.String = null,
    id: java.lang.String = null,
    replyTo: java.lang.String = null,
    returnTo: java.lang.String = null,
    `type`: java.lang.String = null
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

