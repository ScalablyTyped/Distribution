package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllocationId extends js.Object {
  var allocationId: js.UndefOr[String] = js.undefined
  var subnetId: String
}

object Anon_AllocationId {
  @scala.inline
  def apply(subnetId: String, allocationId: String = null): Anon_AllocationId = {
    val __obj = js.Dynamic.literal(subnetId = subnetId)
    if (allocationId != null) __obj.updateDynamic("allocationId")(allocationId)
    __obj.asInstanceOf[Anon_AllocationId]
  }
}

