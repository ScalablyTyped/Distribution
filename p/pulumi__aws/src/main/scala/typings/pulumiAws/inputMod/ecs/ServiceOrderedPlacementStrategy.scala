package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceOrderedPlacementStrategy extends js.Object {
  /**
    * For the `spread` placement strategy, valid values are `instanceId` (or `host`,
    * which has the same effect), or any platform or custom attribute that is applied to a container instance.
    * For the `binpack` type, valid values are `memory` and `cpu`. For the `random` type, this attribute is not
    * needed. For more information, see [Placement Strategy](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PlacementStrategy.html).
    */
  var field: js.UndefOr[Input[String]] = js.native
  /**
    * The type of placement strategy. Must be one of: `binpack`, `random`, or `spread`
    */
  var `type`: Input[String] = js.native
}

object ServiceOrderedPlacementStrategy {
  @scala.inline
  def apply(`type`: Input[String]): ServiceOrderedPlacementStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceOrderedPlacementStrategy]
  }
  @scala.inline
  implicit class ServiceOrderedPlacementStrategyOps[Self <: ServiceOrderedPlacementStrategy] (val x: Self) extends AnyVal {
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
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: Input[String]): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
  }
  
}

