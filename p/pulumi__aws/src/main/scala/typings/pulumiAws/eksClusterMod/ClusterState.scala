package typings.pulumiAws.eksClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.eks.ClusterCertificateAuthority
import typings.pulumiAws.inputMod.eks.ClusterIdentity
import typings.pulumiAws.inputMod.eks.ClusterVpcConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Nested attribute containing `certificate-authority-data` for your cluster.
    */
  val certificateAuthority: js.UndefOr[Input[ClusterCertificateAuthority]] = js.native
  val createdAt: js.UndefOr[Input[String]] = js.native
  /**
    * A list of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html)
    */
  val enabledClusterLogTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The endpoint for your Kubernetes API server.
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  /**
    * Nested attribute containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019.
    */
  val identities: js.UndefOr[Input[js.Array[Input[ClusterIdentity]]]] = js.native
  /**
    * Name of the cluster.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The platform version for the cluster.
    */
  val platformVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf. Ensure the resource configuration includes explicit dependencies on the IAM Role permissions by adding [`dependsOn`](https://www.terraform.io/docs/configuration/resources.html#depends_on-explicit-resource-dependencies) if using the [`aws.iam.RolePolicy` resource](https://www.terraform.io/docs/providers/aws/r/iam_role_policy.html) or [`aws.iam.RolePolicyAttachment` resource](https://www.terraform.io/docs/providers/aws/r/iam_role_policy_attachment.html), otherwise EKS cannot delete EKS managed EC2 infrastructure such as Security Groups on EKS Cluster deletion.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
    */
  val version: js.UndefOr[Input[String]] = js.native
  /**
    * Nested argument for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Configuration detailed below.
    */
  val vpcConfig: js.UndefOr[Input[ClusterVpcConfig]] = js.native
}

object ClusterState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    certificateAuthority: Input[ClusterCertificateAuthority] = null,
    createdAt: Input[String] = null,
    enabledClusterLogTypes: Input[js.Array[Input[String]]] = null,
    endpoint: Input[String] = null,
    identities: Input[js.Array[Input[ClusterIdentity]]] = null,
    name: Input[String] = null,
    platformVersion: Input[String] = null,
    roleArn: Input[String] = null,
    status: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    version: Input[String] = null,
    vpcConfig: Input[ClusterVpcConfig] = null
  ): ClusterState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (certificateAuthority != null) __obj.updateDynamic("certificateAuthority")(certificateAuthority.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (enabledClusterLogTypes != null) __obj.updateDynamic("enabledClusterLogTypes")(enabledClusterLogTypes.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (identities != null) __obj.updateDynamic("identities")(identities.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterState]
  }
}

