package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTemplateContent extends js.Object {
  /**
    * Address "from" : "deals@company.com" or JSON object composed of the "name" and "email" fields.
    * "from" : { "name" : "My Company", "email" : "deals@company.com" } used to compose the email’s "From" header.
    *
    */
  var from: Address | String
  /**  JSON dictionary containing headers other than “Subject”, “From”, “To”, and “Reply-To”. */
  var headers: js.UndefOr[js.Any] = js.undefined
  /** HTML content for the email’s text/html MIME part */
  var html: js.UndefOr[String] = js.undefined
  /** Email address used to compose the email’s “Reply-To” header. */
  var reply_to: js.UndefOr[String] = js.undefined
  /** Email subject line. */
  var subject: String
  /** Text content for the email’s text/plain MIME part */
  var text: js.UndefOr[String] = js.undefined
}

object CreateTemplateContent {
  @scala.inline
  def apply(
    from: Address | String,
    subject: String,
    headers: js.Any = null,
    html: String = null,
    reply_to: String = null,
    text: String = null
  ): CreateTemplateContent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (reply_to != null) __obj.updateDynamic("reply_to")(reply_to.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateContent]
  }
}

