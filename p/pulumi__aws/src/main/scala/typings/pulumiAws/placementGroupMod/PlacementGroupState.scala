package typings.pulumiAws.placementGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.placementStrategyMod.PlacementStrategy
import typings.pulumiPulumi.outputMod.Input
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
    * The ID of the placement group.
    */
  val placementGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * The placement strategy.
    */
  val strategy: js.UndefOr[Input[PlacementStrategy]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object PlacementGroupState {
  @scala.inline
  def apply(
    name: Input[String] = null,
    placementGroupId: Input[String] = null,
    strategy: Input[PlacementStrategy] = null,
    tags: Input[StringDictionary[_]] = null
  ): PlacementGroupState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placementGroupId != null) __obj.updateDynamic("placementGroupId")(placementGroupId.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementGroupState]
  }
}

