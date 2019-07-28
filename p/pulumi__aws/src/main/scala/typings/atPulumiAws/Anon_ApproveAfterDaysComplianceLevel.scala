package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApproveAfterDaysComplianceLevel extends js.Object {
  var approveAfterDays: Input[Double]
  var complianceLevel: js.UndefOr[Input[String]] = js.undefined
  var enableNonSecurity: js.UndefOr[Input[Boolean]] = js.undefined
  var patchFilters: Input[js.Array[Input[Anon_KeyValuesArray]]]
}

object Anon_ApproveAfterDaysComplianceLevel {
  @scala.inline
  def apply(
    approveAfterDays: Input[Double],
    patchFilters: Input[js.Array[Input[Anon_KeyValuesArray]]],
    complianceLevel: Input[String] = null,
    enableNonSecurity: Input[Boolean] = null
  ): Anon_ApproveAfterDaysComplianceLevel = {
    val __obj = js.Dynamic.literal(approveAfterDays = approveAfterDays.asInstanceOf[js.Any], patchFilters = patchFilters.asInstanceOf[js.Any])
    if (complianceLevel != null) __obj.updateDynamic("complianceLevel")(complianceLevel.asInstanceOf[js.Any])
    if (enableNonSecurity != null) __obj.updateDynamic("enableNonSecurity")(enableNonSecurity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ApproveAfterDaysComplianceLevel]
  }
}

