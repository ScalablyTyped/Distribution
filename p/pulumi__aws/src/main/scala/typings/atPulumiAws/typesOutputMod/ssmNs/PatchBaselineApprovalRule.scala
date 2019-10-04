package typings.atPulumiAws.typesOutputMod.ssmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchBaselineApprovalRule extends js.Object {
  var approveAfterDays: Double
  var complianceLevel: js.UndefOr[String] = js.undefined
  var enableNonSecurity: js.UndefOr[Boolean] = js.undefined
  var patchFilters: js.Array[PatchBaselineApprovalRulePatchFilter]
}

object PatchBaselineApprovalRule {
  @scala.inline
  def apply(
    approveAfterDays: Double,
    patchFilters: js.Array[PatchBaselineApprovalRulePatchFilter],
    complianceLevel: String = null,
    enableNonSecurity: js.UndefOr[Boolean] = js.undefined
  ): PatchBaselineApprovalRule = {
    val __obj = js.Dynamic.literal(approveAfterDays = approveAfterDays, patchFilters = patchFilters)
    if (complianceLevel != null) __obj.updateDynamic("complianceLevel")(complianceLevel)
    if (!js.isUndefined(enableNonSecurity)) __obj.updateDynamic("enableNonSecurity")(enableNonSecurity)
    __obj.asInstanceOf[PatchBaselineApprovalRule]
  }
}

