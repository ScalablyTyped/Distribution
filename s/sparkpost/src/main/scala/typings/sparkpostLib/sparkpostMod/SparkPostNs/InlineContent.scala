package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineContent extends js.Object {
  /** JSON array of attachments. */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
  /** "deals@company.com" or JSON object composed of the “name” and “email” fields “from” : { “name” : “My Company”, “email” : "deals@company.com" } used to compose the email’s “From” header */
  var from: js.UndefOr[java.lang.String | sparkpostLib.Anon_Email] = js.undefined
  /** JSON dictionary containing headers other than “Subject”, “From”, “To”, and “Reply-To” */
  var headers: js.UndefOr[js.Any] = js.undefined
  /** HTML content for the email’s text/html MIME part  At a minimum, html, text, or push is required. */
  var html: js.UndefOr[java.lang.String] = js.undefined
  /** JSON array of inline images. */
  var inline_images: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**  Content of push notifications  At a minimum, html, text, or push is required.  SparkPost Enterprise API only. */
  var push: js.UndefOr[PushData] = js.undefined
  /** Email address used to compose the email’s “Reply-To” header */
  var reply_to: js.UndefOr[java.lang.String] = js.undefined
  /** Email subject line  required for email transmissions  Expected in the UTF-8 charset without RFC2047 encoding. Substitution syntax is supported. */
  var subject: js.UndefOr[java.lang.String] = js.undefined
  /** Text content for the email’s text/plain MIME part  At a minimum, html, text, or push is required. */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

