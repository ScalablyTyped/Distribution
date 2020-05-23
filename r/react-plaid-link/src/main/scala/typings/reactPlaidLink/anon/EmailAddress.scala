package typings.reactPlaidLink.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailAddress extends js.Object {
  var emailAddress: js.UndefOr[String] = js.undefined
  var legalName: js.UndefOr[String] = js.undefined
}

object EmailAddress {
  @scala.inline
  def apply(emailAddress: String = null, legalName: String = null): EmailAddress = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (legalName != null) __obj.updateDynamic("legalName")(legalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAddress]
  }
}

