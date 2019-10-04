package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetSpotOptions extends js.Object {
  /**
    * How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
    */
  var allocationStrategy: js.UndefOr[String] = js.undefined
  /**
    * Behavior when a Spot Instance is interrupted. Valid values: `hibernate`, `stop`, `terminate`. Default: `terminate`.
    */
  var instanceInterruptionBehavior: js.UndefOr[String] = js.undefined
  /**
    * Number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot `allocationStrategy` is set to `lowestPrice`. Default: `1`.
    */
  var instancePoolsToUseCount: js.UndefOr[Double] = js.undefined
}

object FleetSpotOptions {
  @scala.inline
  def apply(
    allocationStrategy: String = null,
    instanceInterruptionBehavior: String = null,
    instancePoolsToUseCount: Int | Double = null
  ): FleetSpotOptions = {
    val __obj = js.Dynamic.literal()
    if (allocationStrategy != null) __obj.updateDynamic("allocationStrategy")(allocationStrategy)
    if (instanceInterruptionBehavior != null) __obj.updateDynamic("instanceInterruptionBehavior")(instanceInterruptionBehavior)
    if (instancePoolsToUseCount != null) __obj.updateDynamic("instancePoolsToUseCount")(instancePoolsToUseCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetSpotOptions]
  }
}

