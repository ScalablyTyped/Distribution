package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllocationIdSubnetId extends js.Object {
  var allocationId: js.UndefOr[Input[String]] = js.undefined
  var subnetId: Input[String]
}

object Anon_AllocationIdSubnetId {
  @scala.inline
  def apply(subnetId: Input[String], allocationId: Input[String] = null): Anon_AllocationIdSubnetId = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    if (allocationId != null) __obj.updateDynamic("allocationId")(allocationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllocationIdSubnetId]
  }
}

