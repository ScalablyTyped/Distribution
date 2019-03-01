package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllocationStrategyInstanceInterruptionBehavior extends js.Object {
  var allocationStrategy: js.UndefOr[java.lang.String] = js.undefined
  var instanceInterruptionBehavior: js.UndefOr[java.lang.String] = js.undefined
  var instancePoolsToUseCount: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AllocationStrategyInstanceInterruptionBehavior {
  @scala.inline
  def apply(
    allocationStrategy: java.lang.String = null,
    instanceInterruptionBehavior: java.lang.String = null,
    instancePoolsToUseCount: scala.Int | scala.Double = null
  ): Anon_AllocationStrategyInstanceInterruptionBehavior = {
    val __obj = js.Dynamic.literal()
    if (allocationStrategy != null) __obj.updateDynamic("allocationStrategy")(allocationStrategy)
    if (instanceInterruptionBehavior != null) __obj.updateDynamic("instanceInterruptionBehavior")(instanceInterruptionBehavior)
    if (instancePoolsToUseCount != null) __obj.updateDynamic("instancePoolsToUseCount")(instancePoolsToUseCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllocationStrategyInstanceInterruptionBehavior]
  }
}

