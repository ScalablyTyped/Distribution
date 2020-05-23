package typings.sparkpost.mod

import typings.sparkpost.anon.Email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineContent extends js.Object {
  /** JSON array of attachments. */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
  /** "deals@company.com" or JSON object composed of the “name” and “email” fields “from” : { “name” : “My Company”, “email” : "deals@company.com" } used to compose the email’s “From” header */
  var from: js.UndefOr[String | Email] = js.undefined
  /** JSON dictionary containing headers other than “Subject”, “From”, “To”, and “Reply-To” */
  var headers: js.UndefOr[js.Any] = js.undefined
  /** HTML content for the email’s text/html MIME part  At a minimum, html, text, or push is required. */
  var html: js.UndefOr[String] = js.undefined
  /** JSON array of inline images. */
  var inline_images: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**  Content of push notifications  At a minimum, html, text, or push is required.  SparkPost Enterprise API only. */
  var push: js.UndefOr[PushData] = js.undefined
  /** Email address used to compose the email’s “Reply-To” header */
  var reply_to: js.UndefOr[String] = js.undefined
  /** Email subject line  required for email transmissions  Expected in the UTF-8 charset without RFC2047 encoding. Substitution syntax is supported. */
  var subject: js.UndefOr[String] = js.undefined
  /** Text content for the email’s text/plain MIME part  At a minimum, html, text, or push is required. */
  var text: js.UndefOr[String] = js.undefined
}

object InlineContent {
  @scala.inline
  def apply(
    attachments: js.Array[Attachment] = null,
    from: String | Email = null,
    headers: js.Any = null,
    html: String = null,
    inline_images: js.Array[Attachment] = null,
    push: PushData = null,
    reply_to: String = null,
    subject: String = null,
    text: String = null
  ): InlineContent = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (inline_images != null) __obj.updateDynamic("inline_images")(inline_images.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (reply_to != null) __obj.updateDynamic("reply_to")(reply_to.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineContent]
  }
}

