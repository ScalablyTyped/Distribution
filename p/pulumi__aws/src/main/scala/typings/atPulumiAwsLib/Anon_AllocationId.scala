package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllocationId extends js.Object {
  var allocationId: js.UndefOr[java.lang.String] = js.undefined
  var subnetId: java.lang.String
}

object Anon_AllocationId {
  @scala.inline
  def apply(subnetId: java.lang.String, allocationId: java.lang.String = null): Anon_AllocationId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subnetId")(subnetId)
    if (allocationId != null) __obj.updateDynamic("allocationId")(allocationId)
    __obj.asInstanceOf[Anon_AllocationId]
  }
}

