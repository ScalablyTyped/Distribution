package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  /** Valid email address */
  var email: java.lang.String
  /** Email address to display in the “To” header instead of address.email (for CC and BCC) */
  var header_to: js.UndefOr[java.lang.String] = js.undefined
  /** User-friendly name for the email address */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Address {
  @scala.inline
  def apply(email: java.lang.String, header_to: java.lang.String = null, name: java.lang.String = null): Address = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("email")(email)
    if (header_to != null) __obj.updateDynamic("header_to")(header_to)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Address]
  }
}

