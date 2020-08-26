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
  def apply(): NodeGroupResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupResource]
  }
  @scala.inline
  implicit class NodeGroupResourceOps[Self <: NodeGroupResource] (val x: Self) extends AnyVal {
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
    def setAutoscalingGroupsVarargs(value: Input[NodeGroupResourceAutoscalingGroup]*): Self = this.set("autoscalingGroups", js.Array(value :_*))
    @scala.inline
    def setAutoscalingGroups(value: Input[js.Array[Input[NodeGroupResourceAutoscalingGroup]]]): Self = this.set("autoscalingGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoscalingGroups: Self = this.set("autoscalingGroups", js.undefined)
    @scala.inline
    def setRemoteAccessSecurityGroupId(value: Input[String]): Self = this.set("remoteAccessSecurityGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteAccessSecurityGroupId: Self = this.set("remoteAccessSecurityGroupId", js.undefined)
  }
  
}

