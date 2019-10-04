package typings.atPulumiAws.typesOutputMod.eksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterVpcConfig extends js.Object {
  /**
    * Indicates whether or not the Amazon EKS private API server endpoint is enabled. Default is `false`.
    */
  var endpointPrivateAccess: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether or not the Amazon EKS public API server endpoint is enabled. Default is `true`.
    */
  var endpointPublicAccess: js.UndefOr[Boolean] = js.undefined
  /**
    * List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
    */
  var securityGroupIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
    */
  var subnetIds: js.Array[String]
  /**
    * The VPC associated with your cluster.
    */
  var vpcId: String
}

object ClusterVpcConfig {
  @scala.inline
  def apply(
    subnetIds: js.Array[String],
    vpcId: String,
    endpointPrivateAccess: js.UndefOr[Boolean] = js.undefined,
    endpointPublicAccess: js.UndefOr[Boolean] = js.undefined,
    securityGroupIds: js.Array[String] = null
  ): ClusterVpcConfig = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds, vpcId = vpcId)
    if (!js.isUndefined(endpointPrivateAccess)) __obj.updateDynamic("endpointPrivateAccess")(endpointPrivateAccess)
    if (!js.isUndefined(endpointPublicAccess)) __obj.updateDynamic("endpointPublicAccess")(endpointPublicAccess)
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds)
    __obj.asInstanceOf[ClusterVpcConfig]
  }
}

