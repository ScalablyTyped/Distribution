package typings.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(ec2SshKey: String = null, sourceSecurityGroupIds: js.Array[String] = null): NodeGroupRemoteAccess = {
    val __obj = js.Dynamic.literal()
    if (ec2SshKey != null) __obj.updateDynamic("ec2SshKey")(ec2SshKey.asInstanceOf[js.Any])
    if (sourceSecurityGroupIds != null) __obj.updateDynamic("sourceSecurityGroupIds")(sourceSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeGroupRemoteAccess]
  }
}

