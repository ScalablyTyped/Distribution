package typings.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterVpcConfig extends js.Object {
  /**
    * The cluster security group that was created by Amazon EKS for the cluster.
    */
  var clusterSecurityGroupId: String = js.native
  /**
    * Indicates whether or not the Amazon EKS private API server endpoint is enabled. Default is `false`.
    */
  var endpointPrivateAccess: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not the Amazon EKS public API server endpoint is enabled. Default is `true`.
    */
  var endpointPublicAccess: js.UndefOr[Boolean] = js.native
  /**
    * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint when enabled. EKS defaults this to a list with `0.0.0.0/0`. This provider will only perform drift detection of its value when present in a configuration.
    */
  var publicAccessCidrs: js.Array[String] = js.native
  /**
    * List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
    */
  var securityGroupIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
    */
  var subnetIds: js.Array[String] = js.native
  /**
    * The VPC associated with your cluster.
    */
  var vpcId: String = js.native
}

object ClusterVpcConfig {
  @scala.inline
  def apply(
    clusterSecurityGroupId: String,
    publicAccessCidrs: js.Array[String],
    subnetIds: js.Array[String],
    vpcId: String,
    endpointPrivateAccess: js.UndefOr[Boolean] = js.undefined,
    endpointPublicAccess: js.UndefOr[Boolean] = js.undefined,
    securityGroupIds: js.Array[String] = null
  ): ClusterVpcConfig = {
    val __obj = js.Dynamic.literal(clusterSecurityGroupId = clusterSecurityGroupId.asInstanceOf[js.Any], publicAccessCidrs = publicAccessCidrs.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    if (!js.isUndefined(endpointPrivateAccess)) __obj.updateDynamic("endpointPrivateAccess")(endpointPrivateAccess.asInstanceOf[js.Any])
    if (!js.isUndefined(endpointPublicAccess)) __obj.updateDynamic("endpointPublicAccess")(endpointPublicAccess.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterVpcConfig]
  }
}

