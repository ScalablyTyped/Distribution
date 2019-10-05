package typings.atPulumiAws.typesOutputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterVpcConfig extends js.Object {
  /**
    * Indicates whether or not the Amazon EKS private API server endpoint is enabled.
    */
  var endpointPrivateAccess: Boolean
  /**
    * Indicates whether or not the Amazon EKS public API server endpoint is enabled.
    */
  var endpointPublicAccess: Boolean
  /**
    * List of security group IDs
    */
  var securityGroupIds: js.Array[String]
  /**
    * List of subnet IDs
    */
  var subnetIds: js.Array[String]
  /**
    * The VPC associated with your cluster.
    */
  var vpcId: String
}

object GetClusterVpcConfig {
  @scala.inline
  def apply(
    endpointPrivateAccess: Boolean,
    endpointPublicAccess: Boolean,
    securityGroupIds: js.Array[String],
    subnetIds: js.Array[String],
    vpcId: String
  ): GetClusterVpcConfig = {
    val __obj = js.Dynamic.literal(endpointPrivateAccess = endpointPrivateAccess, endpointPublicAccess = endpointPublicAccess, securityGroupIds = securityGroupIds, subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[GetClusterVpcConfig]
  }
}

