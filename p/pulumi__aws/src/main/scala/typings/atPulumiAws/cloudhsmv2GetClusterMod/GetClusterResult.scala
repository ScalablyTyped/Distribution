package typings.atPulumiAws.cloudhsmv2GetClusterMod

import typings.atPulumiAws.typesOutputMod.cloudhsmv2Ns.GetClusterClusterCertificates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val clusterCertificates: GetClusterClusterCertificates
  val clusterId: String
  val clusterState: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The ID of the security group associated with the CloudHSM cluster.
    */
  val securityGroupId: String
  /**
    * The IDs of subnets in which cluster operates.
    */
  val subnetIds: js.Array[String]
  /**
    * The id of the VPC that the CloudHSM cluster resides in.
    */
  val vpcId: String
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
    val __obj = js.Dynamic.literal(clusterCertificates = clusterCertificates, clusterId = clusterId, clusterState = clusterState, id = id, securityGroupId = securityGroupId, subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[GetClusterResult]
  }
}

