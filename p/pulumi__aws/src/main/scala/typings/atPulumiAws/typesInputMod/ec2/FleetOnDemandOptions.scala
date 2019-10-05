package typings.atPulumiAws.typesInputMod.ec2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetOnDemandOptions extends js.Object {
  /**
    * How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
    */
  var allocationStrategy: js.UndefOr[Input[String]] = js.undefined
}

object FleetOnDemandOptions {
  @scala.inline
  def apply(allocationStrategy: Input[String] = null): FleetOnDemandOptions = {
    val __obj = js.Dynamic.literal()
    if (allocationStrategy != null) __obj.updateDynamic("allocationStrategy")(allocationStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetOnDemandOptions]
  }
}

