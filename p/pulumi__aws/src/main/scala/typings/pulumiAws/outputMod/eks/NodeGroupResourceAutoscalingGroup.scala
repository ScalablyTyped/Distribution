package typings.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupResourceAutoscalingGroup extends js.Object {
  /**
    * Name of the AutoScaling Group.
    */
  var name: String = js.native
}

object NodeGroupResourceAutoscalingGroup {
  @scala.inline
  def apply(name: String): NodeGroupResourceAutoscalingGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeGroupResourceAutoscalingGroup]
  }
}

