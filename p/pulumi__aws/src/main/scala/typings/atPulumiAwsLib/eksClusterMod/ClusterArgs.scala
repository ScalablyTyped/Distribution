package typings
package atPulumiAwsLib.eksClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterArgs extends js.Object {
  /**
    * Name of the cluster.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
    */
  val roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
    */
  val version: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Nested argument for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Configuration detailed below.
    */
  val vpcConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_SecurityGroupIdsSubnetIdsVpcId]
}

object ClusterArgs {
  @scala.inline
  def apply(
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vpcConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_SecurityGroupIdsSubnetIdsVpcId],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    version: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ClusterArgs = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], vpcConfig = vpcConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterArgs]
  }
}

