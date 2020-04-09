package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchBaselineApprovalRule extends js.Object {
  /**
    * The number of days after the release date of each patch matched by the rule the patch is marked as approved in the patch baseline. Valid Range: 0 to 100.
    */
  var approveAfterDays: Double = js.native
  /**
    * Defines the compliance level for patches approved by this rule. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
    */
  var complianceLevel: js.UndefOr[String] = js.native
  /**
    * Boolean enabling the application of non-security updates. The default value is 'false'. Valid for Linux instances only.
    */
  var enableNonSecurity: js.UndefOr[Boolean] = js.native
  /**
    * The patch filter group that defines the criteria for the rule. Up to 5 patch filters can be specified per approval rule using Key/Value pairs. Valid Keys are `PATCH_SET | PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`.
    * * `PATCH_SET` defaults to `OS` if unspecified
    */
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

