package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetOnDemandOptions extends js.Object {
  /**
    * How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
    */
  var allocationStrategy: js.UndefOr[String] = js.undefined
}

object FleetOnDemandOptions {
  @scala.inline
  def apply(allocationStrategy: String = null): FleetOnDemandOptions = {
    val __obj = js.Dynamic.literal()
    if (allocationStrategy != null) __obj.updateDynamic("allocationStrategy")(allocationStrategy)
    __obj.asInstanceOf[FleetOnDemandOptions]
  }
}

