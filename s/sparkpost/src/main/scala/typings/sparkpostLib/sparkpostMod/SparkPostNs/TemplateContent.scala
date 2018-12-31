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

