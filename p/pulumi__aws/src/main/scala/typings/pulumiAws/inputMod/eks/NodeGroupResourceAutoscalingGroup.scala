package typings.pulumiAws.inputMod.eks

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupResourceAutoscalingGroup extends js.Object {
  /**
    * Name of the AutoScaling Group.
    */
  var name: js.UndefOr[Input[String]] = js.native
}

object NodeGroupResourceAutoscalingGroup {
  @scala.inline
  def apply(name: Input[String] = null): NodeGroupResourceAutoscalingGroup = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeGroupResourceAutoscalingGroup]
  }
}

