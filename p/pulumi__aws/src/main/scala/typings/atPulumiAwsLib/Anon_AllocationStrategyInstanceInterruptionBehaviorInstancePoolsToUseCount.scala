package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllocationStrategyInstanceInterruptionBehaviorInstancePoolsToUseCount extends js.Object {
  var allocationStrategy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var instanceInterruptionBehavior: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var instancePoolsToUseCount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_AllocationStrategyInstanceInterruptionBehaviorInstancePoolsToUseCount {
  @scala.inline
  def apply(
    allocationStrategy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    instanceInterruptionBehavior: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    instancePoolsToUseCount: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_AllocationStrategyInstanceInterruptionBehaviorInstancePoolsToUseCount = {
    val __obj = js.Dynamic.literal()
    if (allocationStrategy != null) __obj.updateDynamic("allocationStrategy")(allocationStrategy.asInstanceOf[js.Any])
    if (instanceInterruptionBehavior != null) __obj.updateDynamic("instanceInterruptionBehavior")(instanceInterruptionBehavior.asInstanceOf[js.Any])
    if (instancePoolsToUseCount != null) __obj.updateDynamic("instancePoolsToUseCount")(instancePoolsToUseCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllocationStrategyInstanceInterruptionBehaviorInstancePoolsToUseCount]
  }
}

