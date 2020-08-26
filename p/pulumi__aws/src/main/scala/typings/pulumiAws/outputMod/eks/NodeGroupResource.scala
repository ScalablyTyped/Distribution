package typings.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupResource extends js.Object {
  /**
    * List of objects containing information about AutoScaling Groups.
    */
  var autoscalingGroups: js.Array[NodeGroupResourceAutoscalingGroup] = js.native
  /**
    * Identifier of the remote access EC2 Security Group.
    */
  var remoteAccessSecurityGroupId: String = js.native
}

object NodeGroupResource {
  @scala.inline
  def apply(
    autoscalingGroups: js.Array[NodeGroupResourceAutoscalingGroup],
    remoteAccessSecurityGroupId: String
  ): NodeGroupResource = {
    val __obj = js.Dynamic.literal(autoscalingGroups = autoscalingGroups.asInstanceOf[js.Any], remoteAccessSecurityGroupId = remoteAccessSecurityGroupId.asInstanceOf[js.Any])
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
    def setAutoscalingGroupsVarargs(value: NodeGroupResourceAutoscalingGroup*): Self = this.set("autoscalingGroups", js.Array(value :_*))
    @scala.inline
    def setAutoscalingGroups(value: js.Array[NodeGroupResourceAutoscalingGroup]): Self = this.set("autoscalingGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteAccessSecurityGroupId(value: String): Self = this.set("remoteAccessSecurityGroupId", value.asInstanceOf[js.Any])
  }
  
}

