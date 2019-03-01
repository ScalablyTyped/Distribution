package typings
package atPulumiAwsLib.ec2PlacementGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementGroupState extends js.Object {
  /**
    * The name of the placement group.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The placement strategy.
    */
  val strategy: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.ec2PlacementStrategyMod.PlacementStrategy]
  ] = js.undefined
}

object PlacementGroupState {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    strategy: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.ec2PlacementStrategyMod.PlacementStrategy] = null
  ): PlacementGroupState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementGroupState]
  }
}

