package typings.atPulumiAws.typesInputMod.eks

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterVpcConfig extends js.Object {
  /**
    * The cluster security group that was created by Amazon EKS for the cluster.
    */
  var clusterSecurityGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether or not the Amazon EKS private API server endpoint is enabled. Default is `false`.
    */
  var endpointPrivateAccess: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates whether or not the Amazon EKS public API server endpoint is enabled. Default is `true`.
    */
  var endpointPublicAccess: js.UndefOr[Input[Boolean]] = js.native
  /**
    * List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
    */
  var securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
    */
  var subnetIds: Input[js.Array[Input[String]]] = js.native
  /**
    * The VPC associated with your cluster.
    */
  var vpcId: js.UndefOr[Input[String]] = js.native
}

object ClusterVpcConfig {
  @scala.inline
  def apply(
    subnetIds: Input[js.Array[Input[String]]],
    clusterSecurityGroupId: Input[String] = null,
    endpointPrivateAccess: Input[Boolean] = null,
    endpointPublicAccess: Input[Boolean] = null,
    securityGroupIds: Input[js.Array[Input[String]]] = null,
    vpcId: Input[String] = null
  ): ClusterVpcConfig = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any])
    if (clusterSecurityGroupId != null) __obj.updateDynamic("clusterSecurityGroupId")(clusterSecurityGroupId.asInstanceOf[js.Any])
    if (endpointPrivateAccess != null) __obj.updateDynamic("endpointPrivateAccess")(endpointPrivateAccess.asInstanceOf[js.Any])
    if (endpointPublicAccess != null) __obj.updateDynamic("endpointPublicAccess")(endpointPublicAccess.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterVpcConfig]
  }
}

