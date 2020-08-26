package typings.pulumiAws.inputMod.eks

import typings.pulumiPulumi.outputMod.Input
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
    * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint when enabled. EKS defaults this to a list with `0.0.0.0/0`. This provider will only perform drift detection of its value when present in a configuration.
    */
  var publicAccessCidrs: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
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
  def apply(subnetIds: Input[js.Array[Input[String]]]): ClusterVpcConfig = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any])
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
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setClusterSecurityGroupId(value: Input[String]): Self = this.set("clusterSecurityGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterSecurityGroupId: Self = this.set("clusterSecurityGroupId", js.undefined)
    @scala.inline
    def setEndpointPrivateAccess(value: Input[Boolean]): Self = this.set("endpointPrivateAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointPrivateAccess: Self = this.set("endpointPrivateAccess", js.undefined)
    @scala.inline
    def setEndpointPublicAccess(value: Input[Boolean]): Self = this.set("endpointPublicAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointPublicAccess: Self = this.set("endpointPublicAccess", js.undefined)
    @scala.inline
    def setPublicAccessCidrsVarargs(value: Input[String]*): Self = this.set("publicAccessCidrs", js.Array(value :_*))
    @scala.inline
    def setPublicAccessCidrs(value: Input[js.Array[Input[String]]]): Self = this.set("publicAccessCidrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicAccessCidrs: Self = this.set("publicAccessCidrs", js.undefined)
    @scala.inline
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
  
}

