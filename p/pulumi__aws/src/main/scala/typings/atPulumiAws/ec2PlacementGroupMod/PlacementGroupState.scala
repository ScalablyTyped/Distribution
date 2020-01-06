package typings.atPulumiAws.ec2PlacementGroupMod

import typings.atPulumiAws.ec2PlacementStrategyMod.PlacementStrategy
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementGroupState extends js.Object {
  /**
    * The name of the placement group.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The placement strategy.
    */
  val strategy: js.UndefOr[Input[PlacementStrategy]] = js.native
}

object PlacementGroupState {
  @scala.inline
  def apply(name: Input[String] = null, strategy: Input[PlacementStrategy] = null): PlacementGroupState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementGroupState]
  }
}

