package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApproveAfterDaysComplianceLevel extends js.Object {
  var approveAfterDays: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var complianceLevel: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var enableNonSecurity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var patchFilters: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_KeyValuesArray]]]
}

object Anon_ApproveAfterDaysComplianceLevel {
  @scala.inline
  def apply(
    approveAfterDays: atPulumiPulumiLib.outputMod.Input[scala.Double],
    patchFilters: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_KeyValuesArray]]],
    complianceLevel: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    enableNonSecurity: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_ApproveAfterDaysComplianceLevel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("approveAfterDays")(approveAfterDays.asInstanceOf[js.Any])
    __obj.updateDynamic("patchFilters")(patchFilters.asInstanceOf[js.Any])
    if (complianceLevel != null) __obj.updateDynamic("complianceLevel")(complianceLevel.asInstanceOf[js.Any])
    if (enableNonSecurity != null) __obj.updateDynamic("enableNonSecurity")(enableNonSecurity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ApproveAfterDaysComplianceLevel]
  }
}

