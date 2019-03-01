package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApproveAfterDays extends js.Object {
  var approveAfterDays: scala.Double
  var complianceLevel: js.UndefOr[java.lang.String] = js.undefined
  var enableNonSecurity: js.UndefOr[scala.Boolean] = js.undefined
  var patchFilters: js.Array[Anon_KeyValues]
}

object Anon_ApproveAfterDays {
  @scala.inline
  def apply(
    approveAfterDays: scala.Double,
    patchFilters: js.Array[Anon_KeyValues],
    complianceLevel: java.lang.String = null,
    enableNonSecurity: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ApproveAfterDays = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("approveAfterDays")(approveAfterDays)
    __obj.updateDynamic("patchFilters")(patchFilters)
    if (complianceLevel != null) __obj.updateDynamic("complianceLevel")(complianceLevel)
    if (!js.isUndefined(enableNonSecurity)) __obj.updateDynamic("enableNonSecurity")(enableNonSecurity)
    __obj.asInstanceOf[Anon_ApproveAfterDays]
  }
}

