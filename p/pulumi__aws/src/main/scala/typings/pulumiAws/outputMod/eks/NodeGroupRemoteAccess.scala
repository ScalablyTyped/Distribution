package typings.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGroupRemoteAccess extends js.Object {
  
  /**
    * EC2 Key Pair name that provides access for SSH communication with the worker nodes in the EKS Node Group. If you specify this configuration, but do not specify `sourceSecurityGroupIds` when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
    */
  var ec2SshKey: js.UndefOr[String] = js.native
  
  /**
    * Set of EC2 Security Group IDs to allow SSH access (port 22) from on the worker nodes. If you specify `ec2SshKey`, but do not specify this configuration when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
    */
  var sourceSecurityGroupIds: js.UndefOr[js.Array[String]] = js.native
}
object NodeGroupRemoteAccess {
  
  @scala.inline
  def apply(): NodeGroupRemoteAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupRemoteAccess]
  }
  
  @scala.inline
  implicit class NodeGroupRemoteAccessOps[Self <: NodeGroupRemoteAccess] (val x: Self) extends AnyVal {
    
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
    def setEc2SshKey(value: String): Self = this.set("ec2SshKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2SshKey: Self = this.set("ec2SshKey", js.undefined)
    
    @scala.inline
    def setSourceSecurityGroupIdsVarargs(value: String*): Self = this.set("sourceSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSourceSecurityGroupIds(value: js.Array[String]): Self = this.set("sourceSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSecurityGroupIds: Self = this.set("sourceSecurityGroupIds", js.undefined)
  }
}
