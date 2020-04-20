package typings.reactNativeAppsflyer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailOptions extends js.Object {
  var emails: js.Array[String]
  var emailsCryptType: EmailCryptType
}

object EmailOptions {
  @scala.inline
  def apply(emails: js.Array[String], emailsCryptType: EmailCryptType): EmailOptions = {
    val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any], emailsCryptType = emailsCryptType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailOptions]
  }
}

