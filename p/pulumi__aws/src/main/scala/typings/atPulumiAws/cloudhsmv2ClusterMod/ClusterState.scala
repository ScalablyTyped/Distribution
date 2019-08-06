package typings.atPulumiAws.cloudhsmv2ClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AwsHardwareCertificateClusterCertificate
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterState extends js.Object {
  /**
    * The list of cluster certificates.
    * * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
    * * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in UNINITIALIZED state after an hsm instance is added to the cluster.
    * * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
    * * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
    * * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
    */
  val clusterCertificates: js.UndefOr[Input[Anon_AwsHardwareCertificateClusterCertificate]] = js.undefined
  /**
    * The id of the CloudHSM cluster.
    */
  val clusterId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The state of the cluster.
    */
  val clusterState: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of HSM module in the cluster. Currently, only hsm1.medium is supported.
    */
  val hsmType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the security group associated with the CloudHSM cluster.
    */
  val securityGroupId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The id of Cloud HSM v2 cluster backup to be restored.
    */
  val sourceBackupIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * The IDs of subnets in which cluster will operate.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The id of the VPC that the CloudHSM cluster resides in.
    */
  val vpcId: js.UndefOr[Input[String]] = js.undefined
}

object ClusterState {
  @scala.inline
  def apply(
    clusterCertificates: Input[Anon_AwsHardwareCertificateClusterCertificate] = null,
    clusterId: Input[String] = null,
    clusterState: Input[String] = null,
    hsmType: Input[String] = null,
    securityGroupId: Input[String] = null,
    sourceBackupIdentifier: Input[String] = null,
    subnetIds: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcId: Input[String] = null
  ): ClusterState = {
    val __obj = js.Dynamic.literal()
    if (clusterCertificates != null) __obj.updateDynamic("clusterCertificates")(clusterCertificates.asInstanceOf[js.Any])
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    if (clusterState != null) __obj.updateDynamic("clusterState")(clusterState.asInstanceOf[js.Any])
    if (hsmType != null) __obj.updateDynamic("hsmType")(hsmType.asInstanceOf[js.Any])
    if (securityGroupId != null) __obj.updateDynamic("securityGroupId")(securityGroupId.asInstanceOf[js.Any])
    if (sourceBackupIdentifier != null) __obj.updateDynamic("sourceBackupIdentifier")(sourceBackupIdentifier.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterState]
  }
}

