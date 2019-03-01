package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateContent extends js.Object {
  /**
    * Address "from" : "deals@company.com" or JSON object composed of the "name" and "email" fields.
    * "from" : { "name" : "My Company", "email" : "deals@company.com" } used to compose the email’s "From" header.
    *
    */
  var from: Address | java.lang.String
  /**  JSON dictionary containing headers other than “Subject”, “From”, “To”, and “Reply-To”. */
  var headers: js.UndefOr[js.Any] = js.undefined
  /** HTML content for the email’s text/html MIME part */
  var html: java.lang.String
  /** Email address used to compose the email’s “Reply-To” header. */
  var reply_to: js.UndefOr[java.lang.String] = js.undefined
  /** Email subject line. */
  var subject: java.lang.String
  /** Text content for the email’s text/plain MIME part */
  var text: java.lang.String
}

object TemplateContent {
  @scala.inline
  def apply(
    from: Address | java.lang.String,
    html: java.lang.String,
    subject: java.lang.String,
    text: java.lang.String,
    headers: js.Any = null,
    reply_to: java.lang.String = null
  ): TemplateContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.updateDynamic("html")(html)
    __obj.updateDynamic("subject")(subject)
    __obj.updateDynamic("text")(text)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (reply_to != null) __obj.updateDynamic("reply_to")(reply_to)
    __obj.asInstanceOf[TemplateContent]
  }
}

