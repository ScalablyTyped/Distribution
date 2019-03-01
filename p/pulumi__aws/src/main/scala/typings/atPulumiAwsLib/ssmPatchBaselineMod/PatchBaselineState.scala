package typings
package atPulumiAwsLib.ssmPatchBaselineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchBaselineState extends js.Object {
  /**
    * A set of rules used to include patches in the baseline. up to 10 approval rules can be specified. Each approval_rule block requires the fields documented below.
    */
  val approvalRules: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ApproveAfterDaysComplianceLevel]
      ]
    ]
  ] = js.undefined
  /**
    * A list of explicitly approved patches for the baseline.
    */
  val approvedPatches: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
    */
  val approvedPatchesComplianceLevel: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The description of the patch baseline.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`.
    */
  val globalFilters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyValuesArray]]]
  ] = js.undefined
  /**
    * The name of the patch baseline.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Defines the operating system the patch baseline applies to. Supported operating systems include `WINDOWS`, `AMAZON_LINUX`, `AMAZON_LINUX_2`, `SUSE`, `UBUNTU`, `CENTOS`, and `REDHAT_ENTERPRISE_LINUX`. The Default value is `WINDOWS`.
    */
  val operatingSystem: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of rejected patches.
    */
  val rejectedPatches: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

object PatchBaselineState {
  @scala.inline
  def apply(
    approvalRules: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ApproveAfterDaysComplianceLevel]
      ]
    ] = null,
    approvedPatches: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    approvedPatchesComplianceLevel: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    globalFilters: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyValuesArray]]] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    operatingSystem: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    rejectedPatches: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): PatchBaselineState = {
    val __obj = js.Dynamic.literal()
    if (approvalRules != null) __obj.updateDynamic("approvalRules")(approvalRules.asInstanceOf[js.Any])
    if (approvedPatches != null) __obj.updateDynamic("approvedPatches")(approvedPatches.asInstanceOf[js.Any])
    if (approvedPatchesComplianceLevel != null) __obj.updateDynamic("approvedPatchesComplianceLevel")(approvedPatchesComplianceLevel.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (globalFilters != null) __obj.updateDynamic("globalFilters")(globalFilters.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem.asInstanceOf[js.Any])
    if (rejectedPatches != null) __obj.updateDynamic("rejectedPatches")(rejectedPatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchBaselineState]
  }
}

