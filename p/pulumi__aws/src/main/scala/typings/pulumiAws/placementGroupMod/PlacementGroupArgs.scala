package typings.pulumiAws.placementGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.placementStrategyMod.PlacementStrategy
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementGroupArgs extends js.Object {
  /**
    * The name of the placement group.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The placement strategy.
    */
  val strategy: Input[PlacementStrategy] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object PlacementGroupArgs {
  @scala.inline
  def apply(
    strategy: Input[PlacementStrategy],
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): PlacementGroupArgs = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementGroupArgs]
  }
}

