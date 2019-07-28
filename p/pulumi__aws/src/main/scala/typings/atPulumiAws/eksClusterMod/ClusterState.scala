package typings.atPulumiAws.eksClusterMod

import typings.atPulumiAws.Anon_DataInput
import typings.atPulumiAws.Anon_EndpointPrivateAccessEndpointPublicAccess
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Nested attribute containing `certificate-authority-data` for your cluster.
    */
  val certificateAuthority: js.UndefOr[Input[Anon_DataInput]] = js.undefined
  val createdAt: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html)
    */
  val enabledClusterLogTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The endpoint for your Kubernetes API server.
    */
  val endpoint: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the cluster.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The platform version for the cluster.
    */
  val platformVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
    */
  val roleArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
    */
  val version: js.UndefOr[Input[String]] = js.undefined
  /**
    * Nested argument for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Configuration detailed below.
    */
  val vpcConfig: js.UndefOr[Input[Anon_EndpointPrivateAccessEndpointPublicAccess]] = js.undefined
}

object ClusterState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    certificateAuthority: Input[Anon_DataInput] = null,
    createdAt: Input[String] = null,
    enabledClusterLogTypes: Input[js.Array[Input[String]]] = null,
    endpoint: Input[String] = null,
    name: Input[String] = null,
    platformVersion: Input[String] = null,
    roleArn: Input[String] = null,
    version: Input[String] = null,
    vpcConfig: Input[Anon_EndpointPrivateAccessEndpointPublicAccess] = null
  ): ClusterState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (certificateAuthority != null) __obj.updateDynamic("certificateAuthority")(certificateAuthority.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (enabledClusterLogTypes != null) __obj.updateDynamic("enabledClusterLogTypes")(enabledClusterLogTypes.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterState]
  }
}

