package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApproveAfterDays extends js.Object {
  var approveAfterDays: Double
  var complianceLevel: js.UndefOr[String] = js.undefined
  var enableNonSecurity: js.UndefOr[Boolean] = js.undefined
  var patchFilters: js.Array[Anon_KeyValues]
}

object Anon_ApproveAfterDays {
  @scala.inline
  def apply(
    approveAfterDays: Double,
    patchFilters: js.Array[Anon_KeyValues],
    complianceLevel: String = null,
    enableNonSecurity: js.UndefOr[Boolean] = js.undefined
  ): Anon_ApproveAfterDays = {
    val __obj = js.Dynamic.literal(approveAfterDays = approveAfterDays, patchFilters = patchFilters)
    if (complianceLevel != null) __obj.updateDynamic("complianceLevel")(complianceLevel)
    if (!js.isUndefined(enableNonSecurity)) __obj.updateDynamic("enableNonSecurity")(enableNonSecurity)
    __obj.asInstanceOf[Anon_ApproveAfterDays]
  }
}

