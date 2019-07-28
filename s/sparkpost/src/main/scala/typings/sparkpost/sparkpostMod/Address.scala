package typings.sparkpost.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  /** Valid email address */
  var email: String
  /** Email address to display in the “To” header instead of address.email (for CC and BCC) */
  var header_to: js.UndefOr[String] = js.undefined
  /** User-friendly name for the email address */
  var name: js.UndefOr[String] = js.undefined
}

object Address {
  @scala.inline
  def apply(email: String, header_to: String = null, name: String = null): Address = {
    val __obj = js.Dynamic.literal(email = email)
    if (header_to != null) __obj.updateDynamic("header_to")(header_to)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Address]
  }
}

