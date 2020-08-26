package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicePlacementConstraint extends js.Object {
  /**
    * Cluster Query Language expression to apply to the constraint. Does not need to be specified
    * for the `distinctInstance` type.
    * For more information, see [Cluster Query Language in the Amazon EC2 Container
    * Service Developer
    * Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
    */
  var expression: js.UndefOr[Input[String]] = js.native
  /**
    * The type of constraint. The only valid values at this time are `memberOf` and `distinctInstance`.
    */
  var `type`: Input[String] = js.native
}

object ServicePlacementConstraint {
  @scala.inline
  def apply(`type`: Input[String]): ServicePlacementConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicePlacementConstraint]
  }
  @scala.inline
  implicit class ServicePlacementConstraintOps[Self <: ServicePlacementConstraint] (val x: Self) extends AnyVal {
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
    def setExpression(value: Input[String]): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
  }
  
}

