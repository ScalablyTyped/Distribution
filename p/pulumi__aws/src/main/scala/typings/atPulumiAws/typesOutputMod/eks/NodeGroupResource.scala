package typings.atPulumiAws.typesOutputMod.eks

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
}

