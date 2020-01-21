package typings.pulumiAws.inputMod.eks

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupResource extends js.Object {
  /**
    * List of objects containing information about AutoScaling Groups.
    */
  var autoscalingGroups: js.UndefOr[Input[js.Array[Input[NodeGroupResourceAutoscalingGroup]]]] = js.native
  /**
    * Identifier of the remote access EC2 Security Group.
    */
  var remoteAccessSecurityGroupId: js.UndefOr[Input[String]] = js.native
}

object NodeGroupResource {
  @scala.inline
  def apply(
    autoscalingGroups: Input[js.Array[Input[NodeGroupResourceAutoscalingGroup]]] = null,
    remoteAccessSecurityGroupId: Input[String] = null
  ): NodeGroupResource = {
    val __obj = js.Dynamic.literal()
    if (autoscalingGroups != null) __obj.updateDynamic("autoscalingGroups")(autoscalingGroups.asInstanceOf[js.Any])
    if (remoteAccessSecurityGroupId != null) __obj.updateDynamic("remoteAccessSecurityGroupId")(remoteAccessSecurityGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeGroupResource]
  }
}

