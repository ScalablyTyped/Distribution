package typings
package shopifyDashPrimeLib.distModelsCustomerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerInvite extends js.Object {
  var bcc: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var custom_message: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object CustomerInvite {
  @scala.inline
  def apply(
    bcc: js.Array[java.lang.String] = null,
    custom_message: java.lang.String = null,
    from: java.lang.String = null,
    subject: java.lang.String = null,
    to: java.lang.String = null
  ): CustomerInvite = {
    val __obj = js.Dynamic.literal()
    if (bcc != null) __obj.updateDynamic("bcc")(bcc)
    if (custom_message != null) __obj.updateDynamic("custom_message")(custom_message)
    if (from != null) __obj.updateDynamic("from")(from)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[CustomerInvite]
  }
}

