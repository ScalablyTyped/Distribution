package typings.atPulumiAws.cloudhsmv2GetClusterMod

import typings.atPulumiAws.typesOutputMod.cloudhsmv2.GetClusterClusterCertificates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterResult extends js.Object {
  /**
    * The list of cluster certificates.
    * * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
    * * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in UNINITIALIZED state.
    * * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
    * * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
    * * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
    * The number of available cluster certificates may vary depending on state of the cluster.
    */
  val clusterCertificates: GetClusterClusterCertificates = js.native
  val clusterId: String = js.native
  val clusterState: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The ID of the security group associated with the CloudHSM cluster.
    */
  val securityGroupId: String = js.native
  /**
    * The IDs of subnets in which cluster operates.
    */
  val subnetIds: js.Array[String] = js.native
  /**
    * The id of the VPC that the CloudHSM cluster resides in.
    */
  val vpcId: String = js.native
}

object GetClusterResult {
  @scala.inline
  def apply(
    clusterCertificates: GetClusterClusterCertificates,
    clusterId: String,
    clusterState: String,
    id: String,
    securityGroupId: String,
    subnetIds: js.Array[String],
    vpcId: String
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(clusterCertificates = clusterCertificates.asInstanceOf[js.Any], clusterId = clusterId.asInstanceOf[js.Any], clusterState = clusterState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetClusterResult]
  }
}

