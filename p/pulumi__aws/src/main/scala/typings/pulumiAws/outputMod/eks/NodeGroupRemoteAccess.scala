package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeGroupRemoteAccess extends StObject {
  
  /**
    * EC2 Key Pair name that provides access for SSH communication with the worker nodes in the EKS Node Group. If you specify this configuration, but do not specify `sourceSecurityGroupIds` when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
    */
  var ec2SshKey: js.UndefOr[String] = js.undefined
  
  /**
    * Set of EC2 Security Group IDs to allow SSH access (port 22) from on the worker nodes. If you specify `ec2SshKey`, but do not specify this configuration when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
    */
  var sourceSecurityGroupIds: js.UndefOr[js.Array[String]] = js.undefined
}
object NodeGroupRemoteAccess {
  
  inline def apply(): NodeGroupRemoteAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupRemoteAccess]
  }
  
  extension [Self <: NodeGroupRemoteAccess](x: Self) {
    
    inline def setEc2SshKey(value: String): Self = StObject.set(x, "ec2SshKey", value.asInstanceOf[js.Any])
    
    inline def setEc2SshKeyUndefined: Self = StObject.set(x, "ec2SshKey", js.undefined)
    
    inline def setSourceSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "sourceSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSourceSecurityGroupIdsUndefined: Self = StObject.set(x, "sourceSecurityGroupIds", js.undefined)
    
    inline def setSourceSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "sourceSecurityGroupIds", js.Array(value :_*))
  }
}
