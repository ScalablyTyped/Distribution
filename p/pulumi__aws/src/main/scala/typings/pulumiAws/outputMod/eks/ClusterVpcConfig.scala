package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterVpcConfig extends StObject {
  
  /**
    * The cluster security group that was created by Amazon EKS for the cluster.
    */
  var clusterSecurityGroupId: String
  
  /**
    * Indicates whether or not the Amazon EKS private API server endpoint is enabled. Default is `false`.
    */
  var endpointPrivateAccess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether or not the Amazon EKS public API server endpoint is enabled. Default is `true`.
    */
  var endpointPublicAccess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint when enabled. EKS defaults this to a list with `0.0.0.0/0`. This provider will only perform drift detection of its value when present in a configuration.
    */
  var publicAccessCidrs: js.Array[String]
  
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
  
  inline def apply(
    clusterSecurityGroupId: String,
    publicAccessCidrs: js.Array[String],
    subnetIds: js.Array[String],
    vpcId: String
  ): ClusterVpcConfig = {
    val __obj = js.Dynamic.literal(clusterSecurityGroupId = clusterSecurityGroupId.asInstanceOf[js.Any], publicAccessCidrs = publicAccessCidrs.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterVpcConfig]
  }
  
  extension [Self <: ClusterVpcConfig](x: Self) {
    
    inline def setClusterSecurityGroupId(value: String): Self = StObject.set(x, "clusterSecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setEndpointPrivateAccess(value: Boolean): Self = StObject.set(x, "endpointPrivateAccess", value.asInstanceOf[js.Any])
    
    inline def setEndpointPrivateAccessUndefined: Self = StObject.set(x, "endpointPrivateAccess", js.undefined)
    
    inline def setEndpointPublicAccess(value: Boolean): Self = StObject.set(x, "endpointPublicAccess", value.asInstanceOf[js.Any])
    
    inline def setEndpointPublicAccessUndefined: Self = StObject.set(x, "endpointPublicAccess", js.undefined)
    
    inline def setPublicAccessCidrs(value: js.Array[String]): Self = StObject.set(x, "publicAccessCidrs", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessCidrsVarargs(value: String*): Self = StObject.set(x, "publicAccessCidrs", js.Array(value :_*))
    
    inline def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    inline def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}
