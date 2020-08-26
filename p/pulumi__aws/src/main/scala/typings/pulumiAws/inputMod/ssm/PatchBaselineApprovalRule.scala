package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchBaselineApprovalRule extends js.Object {
  /**
    * The number of days after the release date of each patch matched by the rule the patch is marked as approved in the patch baseline. Valid Range: 0 to 100.
    */
  var approveAfterDays: Input[Double] = js.native
  /**
    * Defines the compliance level for patches approved by this rule. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
    */
  var complianceLevel: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean enabling the application of non-security updates. The default value is 'false'. Valid for Linux instances only.
    */
  var enableNonSecurity: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The patch filter group that defines the criteria for the rule. Up to 5 patch filters can be specified per approval rule using Key/Value pairs. Valid Keys are `PATCH_SET | PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`.
    */
  var patchFilters: Input[js.Array[Input[PatchBaselineApprovalRulePatchFilter]]] = js.native
}

object PatchBaselineApprovalRule {
  @scala.inline
  def apply(
    approveAfterDays: Input[Double],
    patchFilters: Input[js.Array[Input[PatchBaselineApprovalRulePatchFilter]]]
  ): PatchBaselineApprovalRule = {
    val __obj = js.Dynamic.literal(approveAfterDays = approveAfterDays.asInstanceOf[js.Any], patchFilters = patchFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchBaselineApprovalRule]
  }
  @scala.inline
  implicit class PatchBaselineApprovalRuleOps[Self <: PatchBaselineApprovalRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApproveAfterDays(value: Input[Double]): Self = this.set("approveAfterDays", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatchFiltersVarargs(value: Input[PatchBaselineApprovalRulePatchFilter]*): Self = this.set("patchFilters", js.Array(value :_*))
    @scala.inline
    def setPatchFilters(value: Input[js.Array[Input[PatchBaselineApprovalRulePatchFilter]]]): Self = this.set("patchFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplianceLevel(value: Input[String]): Self = this.set("complianceLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceLevel: Self = this.set("complianceLevel", js.undefined)
    @scala.inline
    def setEnableNonSecurity(value: Input[Boolean]): Self = this.set("enableNonSecurity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableNonSecurity: Self = this.set("enableNonSecurity", js.undefined)
  }
  
}

