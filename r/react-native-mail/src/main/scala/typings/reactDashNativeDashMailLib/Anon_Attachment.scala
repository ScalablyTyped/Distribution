package typings
package reactDashNativeDashMailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attachment extends js.Object {
  var attachment: js.UndefOr[Anon_Name] = js.undefined
  var bccRecipients: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var body: java.lang.String
  var ccRecipients: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var isHTML: scala.Boolean
  var recipients: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var subject: java.lang.String
}

object Anon_Attachment {
  @scala.inline
  def apply(
    body: java.lang.String,
    isHTML: scala.Boolean,
    subject: java.lang.String,
    attachment: Anon_Name = null,
    bccRecipients: js.Array[java.lang.String] = null,
    ccRecipients: js.Array[java.lang.String] = null,
    recipients: js.Array[java.lang.String] = null
  ): Anon_Attachment = {
    val __obj = js.Dynamic.literal(body = body, isHTML = isHTML, subject = subject)
    if (attachment != null) __obj.updateDynamic("attachment")(attachment)
    if (bccRecipients != null) __obj.updateDynamic("bccRecipients")(bccRecipients)
    if (ccRecipients != null) __obj.updateDynamic("ccRecipients")(ccRecipients)
    if (recipients != null) __obj.updateDynamic("recipients")(recipients)
    __obj.asInstanceOf[Anon_Attachment]
  }
}

