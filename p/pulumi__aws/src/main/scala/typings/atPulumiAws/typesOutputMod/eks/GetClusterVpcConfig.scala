package typings.atPulumiAws.typesOutputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterVpcConfig extends js.Object {
  /**
    * The cluster security group that was created by Amazon EKS for the cluster.
    */
  var clusterSecurityGroupId: String = js.native
  /**
    * Indicates whether or not the Amazon EKS private API server endpoint is enabled.
    */
  var endpointPrivateAccess: Boolean = js.native
  /**
    * Indicates whether or not the Amazon EKS public API server endpoint is enabled.
    */
  var endpointPublicAccess: Boolean = js.native
  /**
    * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint.
    */
  var publicAccessCidrs: js.Array[String] = js.native
  /**
    * List of security group IDs
    */
  var securityGroupIds: js.Array[String] = js.native
  /**
    * List of subnet IDs
    */
  var subnetIds: js.Array[String] = js.native
  /**
    * The VPC associated with your cluster.
    */
  var vpcId: String = js.native
}

object GetClusterVpcConfig {
  @scala.inline
  def apply(
    clusterSecurityGroupId: String,
    endpointPrivateAccess: Boolean,
    endpointPublicAccess: Boolean,
    publicAccessCidrs: js.Array[String],
    securityGroupIds: js.Array[String],
    subnetIds: js.Array[String],
    vpcId: String
  ): GetClusterVpcConfig = {
    val __obj = js.Dynamic.literal(clusterSecurityGroupId = clusterSecurityGroupId.asInstanceOf[js.Any], endpointPrivateAccess = endpointPrivateAccess.asInstanceOf[js.Any], endpointPublicAccess = endpointPublicAccess.asInstanceOf[js.Any], publicAccessCidrs = publicAccessCidrs.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetClusterVpcConfig]
  }
}

