package typings.reactPlaidLink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmailAddress extends js.Object {
  var emailAddress: js.UndefOr[String] = js.undefined
  var legalName: js.UndefOr[String] = js.undefined
}

object AnonEmailAddress {
  @scala.inline
  def apply(emailAddress: String = null, legalName: String = null): AnonEmailAddress = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (legalName != null) __obj.updateDynamic("legalName")(legalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmailAddress]
  }
}

