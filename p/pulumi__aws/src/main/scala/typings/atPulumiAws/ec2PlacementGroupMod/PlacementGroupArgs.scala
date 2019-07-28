package typings.atPulumiAws.ec2PlacementGroupMod

import typings.atPulumiAws.ec2PlacementStrategyMod.PlacementStrategy
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementGroupArgs extends js.Object {
  /**
    * The name of the placement group.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The placement strategy.
    */
  val strategy: Input[PlacementStrategy]
}

object PlacementGroupArgs {
  @scala.inline
  def apply(strategy: Input[PlacementStrategy], name: Input[String] = null): PlacementGroupArgs = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementGroupArgs]
  }
}

