package typings.atPulumiAws.eksClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.eks.ClusterVpcConfig
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterArgs extends js.Object {
  /**
    * A list of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html)
    */
  val enabledClusterLogTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Name of the cluster.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
    */
  val roleArn: Input[String]
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
    */
  val version: js.UndefOr[Input[String]] = js.undefined
  /**
    * Nested argument for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Configuration detailed below.
    */
  val vpcConfig: Input[ClusterVpcConfig]
}

object ClusterArgs {
  @scala.inline
  def apply(
    roleArn: Input[String],
    vpcConfig: Input[ClusterVpcConfig],
    enabledClusterLogTypes: Input[js.Array[Input[String]]] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    version: Input[String] = null
  ): ClusterArgs = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], vpcConfig = vpcConfig.asInstanceOf[js.Any])
    if (enabledClusterLogTypes != null) __obj.updateDynamic("enabledClusterLogTypes")(enabledClusterLogTypes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterArgs]
  }
}

