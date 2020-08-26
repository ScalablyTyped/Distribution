package typings.pulumiAws.patchBaselineMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ssm.PatchBaselineApprovalRule
import typings.pulumiAws.inputMod.ssm.PatchBaselineGlobalFilter
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchBaselineState extends js.Object {
  /**
    * A set of rules used to include patches in the baseline. up to 10 approval rules can be specified. Each approvalRule block requires the fields documented below.
    */
  val approvalRules: js.UndefOr[Input[js.Array[Input[PatchBaselineApprovalRule]]]] = js.native
  /**
    * A list of explicitly approved patches for the baseline.
    */
  val approvedPatches: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
    */
  val approvedPatchesComplianceLevel: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the patch baseline.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`.
    */
  val globalFilters: js.UndefOr[Input[js.Array[Input[PatchBaselineGlobalFilter]]]] = js.native
  /**
    * The name of the patch baseline.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Defines the operating system the patch baseline applies to. Supported operating systems include `WINDOWS`, `AMAZON_LINUX`, `AMAZON_LINUX_2`, `SUSE`, `UBUNTU`, `CENTOS`, and `REDHAT_ENTERPRISE_LINUX`. The Default value is `WINDOWS`.
    */
  val operatingSystem: js.UndefOr[Input[String]] = js.native
  /**
    * A list of rejected patches.
    */
  val rejectedPatches: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object PatchBaselineState {
  @scala.inline
  def apply(): PatchBaselineState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchBaselineState]
  }
  @scala.inline
  implicit class PatchBaselineStateOps[Self <: PatchBaselineState] (val x: Self) extends AnyVal {
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
    def setApprovalRulesVarargs(value: Input[PatchBaselineApprovalRule]*): Self = this.set("approvalRules", js.Array(value :_*))
    @scala.inline
    def setApprovalRules(value: Input[js.Array[Input[PatchBaselineApprovalRule]]]): Self = this.set("approvalRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRules: Self = this.set("approvalRules", js.undefined)
    @scala.inline
    def setApprovedPatchesVarargs(value: Input[String]*): Self = this.set("approvedPatches", js.Array(value :_*))
    @scala.inline
    def setApprovedPatches(value: Input[js.Array[Input[String]]]): Self = this.set("approvedPatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovedPatches: Self = this.set("approvedPatches", js.undefined)
    @scala.inline
    def setApprovedPatchesComplianceLevel(value: Input[String]): Self = this.set("approvedPatchesComplianceLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovedPatchesComplianceLevel: Self = this.set("approvedPatchesComplianceLevel", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setGlobalFiltersVarargs(value: Input[PatchBaselineGlobalFilter]*): Self = this.set("globalFilters", js.Array(value :_*))
    @scala.inline
    def setGlobalFilters(value: Input[js.Array[Input[PatchBaselineGlobalFilter]]]): Self = this.set("globalFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalFilters: Self = this.set("globalFilters", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOperatingSystem(value: Input[String]): Self = this.set("operatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystem: Self = this.set("operatingSystem", js.undefined)
    @scala.inline
    def setRejectedPatchesVarargs(value: Input[String]*): Self = this.set("rejectedPatches", js.Array(value :_*))
    @scala.inline
    def setRejectedPatches(value: Input[js.Array[Input[String]]]): Self = this.set("rejectedPatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectedPatches: Self = this.set("rejectedPatches", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

