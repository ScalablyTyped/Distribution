package typings
package reactDashPlaidDashLinkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: java.lang.String
  var mask: java.lang.String
  var name: java.lang.String
  var subtype: java.lang.String
  var `type`: java.lang.String
  var verification_status: reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.pending_automatic_verification | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.pending_manual_verification | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.manually_verified | scala.Null
}

object Anon_Id {
  @scala.inline
  def apply(
    id: java.lang.String,
    mask: java.lang.String,
    name: java.lang.String,
    subtype: java.lang.String,
    `type`: java.lang.String,
    verification_status: reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.pending_automatic_verification | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.pending_manual_verification | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.manually_verified = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, mask = mask, name = name, subtype = subtype)
    __obj.updateDynamic("type")(`type`)
    if (verification_status != null) __obj.updateDynamic("verification_status")(verification_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Id]
  }
}

