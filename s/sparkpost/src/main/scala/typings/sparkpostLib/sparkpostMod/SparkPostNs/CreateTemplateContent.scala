package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTemplateContent extends js.Object {
  /**
    * Address "from" : "deals@company.com" or JSON object composed of the "name" and "email" fields.
    * "from" : { "name" : "My Company", "email" : "deals@company.com" } used to compose the email’s "From" header.
    *
    */
  var from: Address | java.lang.String
  /**  JSON dictionary containing headers other than “Subject”, “From”, “To”, and “Reply-To”. */
  var headers: js.UndefOr[js.Any] = js.undefined
  /** HTML content for the email’s text/html MIME part */
  var html: js.UndefOr[java.lang.String] = js.undefined
  /** Email address used to compose the email’s “Reply-To” header. */
  var reply_to: js.UndefOr[java.lang.String] = js.undefined
  /** Email subject line. */
  var subject: java.lang.String
  /** Text content for the email’s text/plain MIME part */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object CreateTemplateContent {
  @scala.inline
  def apply(
    from: Address | java.lang.String,
    subject: java.lang.String,
    headers: js.Any = null,
    html: java.lang.String = null,
    reply_to: java.lang.String = null,
    text: java.lang.String = null
  ): CreateTemplateContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.updateDynamic("subject")(subject)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (html != null) __obj.updateDynamic("html")(html)
    if (reply_to != null) __obj.updateDynamic("reply_to")(reply_to)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CreateTemplateContent]
  }
}

