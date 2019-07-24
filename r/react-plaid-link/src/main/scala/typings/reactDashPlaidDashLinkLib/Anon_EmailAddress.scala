package typings
package reactDashPlaidDashLinkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmailAddress extends js.Object {
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  var legalName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EmailAddress {
  @scala.inline
  def apply(emailAddress: java.lang.String = null, legalName: java.lang.String = null): Anon_EmailAddress = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (legalName != null) __obj.updateDynamic("legalName")(legalName)
    __obj.asInstanceOf[Anon_EmailAddress]
  }
}

