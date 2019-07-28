package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllocationStrategyInstanceInterruptionBehaviorInstancePoolsToUseCount extends js.Object {
  var allocationStrategy: js.UndefOr[Input[String]] = js.undefined
  var instanceInterruptionBehavior: js.UndefOr[Input[String]] = js.undefined
  var instancePoolsToUseCount: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_AllocationStrategyInstanceInterruptionBehaviorInstancePoolsToUseCount {
  @scala.inline
  def apply(
    allocationStrategy: Input[String] = null,
    instanceInterruptionBehavior: Input[String] = null,
    instancePoolsToUseCount: Input[Double] = null
  ): Anon_AllocationStrategyInstanceInterruptionBehaviorInstancePoolsToUseCount = {
    val __obj = js.Dynamic.literal()
    if (allocationStrategy != null) __obj.updateDynamic("allocationStrategy")(allocationStrategy.asInstanceOf[js.Any])
    if (instanceInterruptionBehavior != null) __obj.updateDynamic("instanceInterruptionBehavior")(instanceInterruptionBehavior.asInstanceOf[js.Any])
    if (instancePoolsToUseCount != null) __obj.updateDynamic("instancePoolsToUseCount")(instancePoolsToUseCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllocationStrategyInstanceInterruptionBehaviorInstancePoolsToUseCount]
  }
}

