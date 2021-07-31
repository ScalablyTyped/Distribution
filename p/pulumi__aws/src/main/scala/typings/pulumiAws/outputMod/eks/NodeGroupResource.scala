package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeGroupResource extends StObject {
  
  /**
    * List of objects containing information about AutoScaling Groups.
    */
  var autoscalingGroups: js.Array[NodeGroupResourceAutoscalingGroup]
  
  /**
    * Identifier of the remote access EC2 Security Group.
    */
  var remoteAccessSecurityGroupId: String
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
  implicit class NodeGroupResourceMutableBuilder[Self <: NodeGroupResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscalingGroups(value: js.Array[NodeGroupResourceAutoscalingGroup]): Self = StObject.set(x, "autoscalingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalingGroupsVarargs(value: NodeGroupResourceAutoscalingGroup*): Self = StObject.set(x, "autoscalingGroups", js.Array(value :_*))
    
    @scala.inline
    def setRemoteAccessSecurityGroupId(value: String): Self = StObject.set(x, "remoteAccessSecurityGroupId", value.asInstanceOf[js.Any])
  }
}
