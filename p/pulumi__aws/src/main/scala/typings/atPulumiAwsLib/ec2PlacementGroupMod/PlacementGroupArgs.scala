package typings
package atPulumiAwsLib.ec2PlacementGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementGroupArgs extends js.Object {
  /**
    * The name of the placement group.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The placement strategy.
    */
  val strategy: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.ec2PlacementStrategyMod.PlacementStrategy]
}

