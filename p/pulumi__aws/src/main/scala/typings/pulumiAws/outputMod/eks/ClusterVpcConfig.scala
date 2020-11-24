package typings.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    vpcId: String
  ): ClusterVpcConfig = {
    val __obj = js.Dynamic.literal(clusterSecurityGroupId = clusterSecurityGroupId.asInstanceOf[js.Any], publicAccessCidrs = publicAccessCidrs.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterVpcConfig]
  }
  
  @scala.inline
  implicit class ClusterVpcConfigOps[Self <: ClusterVpcConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterSecurityGroupId(value: String): Self = this.set("clusterSecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicAccessCidrsVarargs(value: String*): Self = this.set("publicAccessCidrs", js.Array(value :_*))
    
    @scala.inline
    def setPublicAccessCidrs(value: js.Array[String]): Self = this.set("publicAccessCidrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: js.Array[String]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointPrivateAccess(value: Boolean): Self = this.set("endpointPrivateAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointPrivateAccess: Self = this.set("endpointPrivateAccess", js.undefined)
    
    @scala.inline
    def setEndpointPublicAccess(value: Boolean): Self = this.set("endpointPublicAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointPublicAccess: Self = this.set("endpointPublicAccess", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: js.Array[String]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
  }
}
