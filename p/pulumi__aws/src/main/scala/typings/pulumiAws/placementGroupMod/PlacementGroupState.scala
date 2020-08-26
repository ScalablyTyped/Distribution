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
    * Amazon Resource Name (ARN) of the placement group.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the placement group.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the placement group.
    */
  val placementGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * The placement strategy. Can be `"cluster"`, `"partition"` or `"spread"`.
    */
  val strategy: js.UndefOr[Input[PlacementStrategy]] = js.native
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object PlacementGroupState {
  @scala.inline
  def apply(): PlacementGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementGroupState]
  }
  @scala.inline
  implicit class PlacementGroupStateOps[Self <: PlacementGroupState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPlacementGroupId(value: Input[String]): Self = this.set("placementGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementGroupId: Self = this.set("placementGroupId", js.undefined)
    @scala.inline
    def setStrategy(value: Input[PlacementStrategy]): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

