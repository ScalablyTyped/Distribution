package typings
package atPulumiAwsLib.ec2PlacementGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementGroupArgs extends js.Object {
  /**
    * The name of the placement group.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The placement strategy.
    */
  val strategy: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.ec2PlacementStrategyMod.PlacementStrategy]
}

object PlacementGroupArgs {
  @scala.inline
  def apply(
    strategy: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.ec2PlacementStrategyMod.PlacementStrategy],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): PlacementGroupArgs = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementGroupArgs]
  }
}

