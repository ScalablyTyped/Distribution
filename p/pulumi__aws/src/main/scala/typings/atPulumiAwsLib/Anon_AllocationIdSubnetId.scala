package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllocationIdSubnetId extends js.Object {
  var allocationId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_AllocationIdSubnetId {
  @scala.inline
  def apply(
    subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    allocationId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_AllocationIdSubnetId = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    if (allocationId != null) __obj.updateDynamic("allocationId")(allocationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllocationIdSubnetId]
  }
}

