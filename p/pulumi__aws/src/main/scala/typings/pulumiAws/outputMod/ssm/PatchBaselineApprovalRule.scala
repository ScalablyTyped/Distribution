package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchBaselineApprovalRule extends js.Object {
  var approveAfterDays: Double = js.native
  var complianceLevel: js.UndefOr[String] = js.native
  var enableNonSecurity: js.UndefOr[Boolean] = js.native
  var patchFilters: js.Array[PatchBaselineApprovalRulePatchFilter] = js.native
}

object PatchBaselineApprovalRule {
  @scala.inline
  def apply(
    approveAfterDays: Double,
    patchFilters: js.Array[PatchBaselineApprovalRulePatchFilter],
    complianceLevel: String = null,
    enableNonSecurity: js.UndefOr[Boolean] = js.undefined
  ): PatchBaselineApprovalRule = {
    val __obj = js.Dynamic.literal(approveAfterDays = approveAfterDays.asInstanceOf[js.Any], patchFilters = patchFilters.asInstanceOf[js.Any])
    if (complianceLevel != null) __obj.updateDynamic("complianceLevel")(complianceLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNonSecurity)) __obj.updateDynamic("enableNonSecurity")(enableNonSecurity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchBaselineApprovalRule]
  }
}

