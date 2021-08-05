package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClusterVpcConfig extends StObject {
  
  /**
    * The cluster security group that was created by Amazon EKS for the cluster.
    */
  var clusterSecurityGroupId: String
  
  /**
    * Indicates whether or not the Amazon EKS private API server endpoint is enabled.
    */
  var endpointPrivateAccess: Boolean
  
  /**
    * Indicates whether or not the Amazon EKS public API server endpoint is enabled.
    */
  var endpointPublicAccess: Boolean
  
  /**
    * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint.
    */
  var publicAccessCidrs: js.Array[String]
  
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
  
  inline def apply(
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
  
  extension [Self <: GetClusterVpcConfig](x: Self) {
    
    inline def setClusterSecurityGroupId(value: String): Self = StObject.set(x, "clusterSecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setEndpointPrivateAccess(value: Boolean): Self = StObject.set(x, "endpointPrivateAccess", value.asInstanceOf[js.Any])
    
    inline def setEndpointPublicAccess(value: Boolean): Self = StObject.set(x, "endpointPublicAccess", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessCidrs(value: js.Array[String]): Self = StObject.set(x, "publicAccessCidrs", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessCidrsVarargs(value: String*): Self = StObject.set(x, "publicAccessCidrs", js.Array(value :_*))
    
    inline def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    inline def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}
