package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchBaselineApprovalRule extends StObject {
  
  /**
    * The number of days after the release date of each patch matched by the rule the patch is marked as approved in the patch baseline. Valid Range: 0 to 100.
    */
  var approveAfterDays: Input[Double]
  
  /**
    * Defines the compliance level for patches approved by this rule. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
    */
  var complianceLevel: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Boolean enabling the application of non-security updates. The default value is 'false'. Valid for Linux instances only.
    */
  var enableNonSecurity: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The patch filter group that defines the criteria for the rule. Up to 5 patch filters can be specified per approval rule using Key/Value pairs. Valid Keys are `PATCH_SET | PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`.
    */
  var patchFilters: Input[js.Array[Input[PatchBaselineApprovalRulePatchFilter]]]
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
  implicit class PatchBaselineApprovalRuleMutableBuilder[Self <: PatchBaselineApprovalRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproveAfterDays(value: Input[Double]): Self = StObject.set(x, "approveAfterDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceLevel(value: Input[String]): Self = StObject.set(x, "complianceLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceLevelUndefined: Self = StObject.set(x, "complianceLevel", js.undefined)
    
    @scala.inline
    def setEnableNonSecurity(value: Input[Boolean]): Self = StObject.set(x, "enableNonSecurity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNonSecurityUndefined: Self = StObject.set(x, "enableNonSecurity", js.undefined)
    
    @scala.inline
    def setPatchFilters(value: Input[js.Array[Input[PatchBaselineApprovalRulePatchFilter]]]): Self = StObject.set(x, "patchFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchFiltersVarargs(value: Input[PatchBaselineApprovalRulePatchFilter]*): Self = StObject.set(x, "patchFilters", js.Array(value :_*))
  }
}
