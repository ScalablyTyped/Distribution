package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetSpotOptions extends js.Object {
  /**
    * How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
    */
  var allocationStrategy: js.UndefOr[String] = js.native
  /**
    * Behavior when a Spot Instance is interrupted. Valid values: `hibernate`, `stop`, `terminate`. Default: `terminate`.
    */
  var instanceInterruptionBehavior: js.UndefOr[String] = js.native
  /**
    * Number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot `allocationStrategy` is set to `lowestPrice`. Default: `1`.
    */
  var instancePoolsToUseCount: js.UndefOr[Double] = js.native
}

object FleetSpotOptions {
  @scala.inline
  def apply(
    allocationStrategy: String = null,
    instanceInterruptionBehavior: String = null,
    instancePoolsToUseCount: js.UndefOr[Double] = js.undefined
  ): FleetSpotOptions = {
    val __obj = js.Dynamic.literal()
    if (allocationStrategy != null) __obj.updateDynamic("allocationStrategy")(allocationStrategy.asInstanceOf[js.Any])
    if (instanceInterruptionBehavior != null) __obj.updateDynamic("instanceInterruptionBehavior")(instanceInterruptionBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(instancePoolsToUseCount)) __obj.updateDynamic("instancePoolsToUseCount")(instancePoolsToUseCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetSpotOptions]
  }
}

