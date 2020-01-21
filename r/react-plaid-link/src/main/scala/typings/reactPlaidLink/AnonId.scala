package typings.reactPlaidLink

import typings.reactPlaidLink.reactPlaidLinkStrings.manually_verified
import typings.reactPlaidLink.reactPlaidLinkStrings.pending_automatic_verification
import typings.reactPlaidLink.reactPlaidLinkStrings.pending_manual_verification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var mask: String
  var name: String
  var subtype: String
  var `type`: String
  var verification_status: pending_automatic_verification | pending_manual_verification | manually_verified | Null
}

object AnonId {
  @scala.inline
  def apply(
    id: String,
    mask: String,
    name: String,
    subtype: String,
    `type`: String,
    verification_status: pending_automatic_verification | pending_manual_verification | manually_verified = null
  ): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verification_status != null) __obj.updateDynamic("verification_status")(verification_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

