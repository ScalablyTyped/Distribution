package typings.shopifyDashPrime.distModelsCustomerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerInvite extends js.Object {
  var bcc: js.UndefOr[js.Array[String]] = js.undefined
  var custom_message: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object CustomerInvite {
  @scala.inline
  def apply(
    bcc: js.Array[String] = null,
    custom_message: String = null,
    from: String = null,
    subject: String = null,
    to: String = null
  ): CustomerInvite = {
    val __obj = js.Dynamic.literal()
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (custom_message != null) __obj.updateDynamic("custom_message")(custom_message.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerInvite]
  }
}

