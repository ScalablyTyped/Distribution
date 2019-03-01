package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllocationStrategyInput extends js.Object {
  var allocationStrategy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_AllocationStrategyInput {
  @scala.inline
  def apply(allocationStrategy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): Anon_AllocationStrategyInput = {
    val __obj = js.Dynamic.literal()
    if (allocationStrategy != null) __obj.updateDynamic("allocationStrategy")(allocationStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllocationStrategyInput]
  }
}

