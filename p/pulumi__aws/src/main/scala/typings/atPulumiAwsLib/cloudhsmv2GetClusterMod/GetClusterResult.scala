package typings
package atPulumiAwsLib.cloudhsmv2GetClusterMod

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
  val clusterCertificates: atPulumiAwsLib.Anon_AwsHardwareCertificate
  val clusterState: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The ID of the security group associated with the CloudHSM cluster.
    */
  val securityGroupId: java.lang.String
  /**
    * The IDs of subnets in which cluster operates.
    */
  val subnetIds: js.Array[java.lang.String]
  /**
    * The id of the VPC that the CloudHSM cluster resides in.
    */
  val vpcId: java.lang.String
}

object GetClusterResult {
  @scala.inline
  def apply(
    clusterCertificates: atPulumiAwsLib.Anon_AwsHardwareCertificate,
    clusterState: java.lang.String,
    id: java.lang.String,
    securityGroupId: java.lang.String,
    subnetIds: js.Array[java.lang.String],
    vpcId: java.lang.String
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(clusterCertificates = clusterCertificates, clusterState = clusterState, id = id, securityGroupId = securityGroupId, subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[GetClusterResult]
  }
}

