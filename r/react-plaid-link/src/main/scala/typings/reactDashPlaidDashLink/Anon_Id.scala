package typings.reactDashPlaidDashLink

import typings.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.manually_verified
import typings.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.pending_automatic_verification
import typings.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.pending_manual_verification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: String
  var mask: String
  var name: String
  var subtype: String
  var `type`: String
  var verification_status: pending_automatic_verification | pending_manual_verification | manually_verified | Null
}

object Anon_Id {
  @scala.inline
  def apply(
    id: String,
    mask: String,
    name: String,
    subtype: String,
    `type`: String,
    verification_status: pending_automatic_verification | pending_manual_verification | manually_verified = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, mask = mask, name = name, subtype = subtype)
    __obj.updateDynamic("type")(`type`)
    if (verification_status != null) __obj.updateDynamic("verification_status")(verification_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Id]
  }
}

