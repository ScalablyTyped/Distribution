package typings.atPulumiAws.typesInputMod.eks

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterVpcConfig extends js.Object {
  /**
    * Indicates whether or not the Amazon EKS private API server endpoint is enabled. Default is `false`.
    */
  var endpointPrivateAccess: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Indicates whether or not the Amazon EKS public API server endpoint is enabled. Default is `true`.
    */
  var endpointPublicAccess: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
    */
  var securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
    */
  var subnetIds: Input[js.Array[Input[String]]]
  /**
    * The VPC associated with your cluster.
    */
  var vpcId: js.UndefOr[Input[String]] = js.undefined
}

object ClusterVpcConfig {
  @scala.inline
  def apply(
    subnetIds: Input[js.Array[Input[String]]],
    endpointPrivateAccess: Input[Boolean] = null,
    endpointPublicAccess: Input[Boolean] = null,
    securityGroupIds: Input[js.Array[Input[String]]] = null,
    vpcId: Input[String] = null
  ): ClusterVpcConfig = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any])
    if (endpointPrivateAccess != null) __obj.updateDynamic("endpointPrivateAccess")(endpointPrivateAccess.asInstanceOf[js.Any])
    if (endpointPublicAccess != null) __obj.updateDynamic("endpointPublicAccess")(endpointPublicAccess.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterVpcConfig]
  }
}

