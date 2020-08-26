package typings.pulumiAws.clusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.cloudhsmv2.ClusterClusterCertificate
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends js.Object {
  /**
    * The list of cluster certificates.
    * * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
    * * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in UNINITIALIZED state after an hsm instance is added to the cluster.
    * * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
    * * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
    * * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
    */
  val clusterCertificates: js.UndefOr[Input[js.Array[Input[ClusterClusterCertificate]]]] = js.native
  /**
    * The id of the CloudHSM cluster.
    */
  val clusterId: js.UndefOr[Input[String]] = js.native
  /**
    * The state of the cluster.
    */
  val clusterState: js.UndefOr[Input[String]] = js.native
  /**
    * The type of HSM module in the cluster. Currently, only hsm1.medium is supported.
    */
  val hsmType: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the security group associated with the CloudHSM cluster.
    */
  val securityGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * The id of Cloud HSM v2 cluster backup to be restored.
    */
  val sourceBackupIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * The IDs of subnets in which cluster will operate.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The id of the VPC that the CloudHSM cluster resides in.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object ClusterState {
  @scala.inline
  def apply(): ClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterState]
  }
  @scala.inline
  implicit class ClusterStateOps[Self <: ClusterState] (val x: Self) extends AnyVal {
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
    def setClusterCertificatesVarargs(value: Input[ClusterClusterCertificate]*): Self = this.set("clusterCertificates", js.Array(value :_*))
    @scala.inline
    def setClusterCertificates(value: Input[js.Array[Input[ClusterClusterCertificate]]]): Self = this.set("clusterCertificates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterCertificates: Self = this.set("clusterCertificates", js.undefined)
    @scala.inline
    def setClusterId(value: Input[String]): Self = this.set("clusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterId: Self = this.set("clusterId", js.undefined)
    @scala.inline
    def setClusterState(value: Input[String]): Self = this.set("clusterState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterState: Self = this.set("clusterState", js.undefined)
    @scala.inline
    def setHsmType(value: Input[String]): Self = this.set("hsmType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsmType: Self = this.set("hsmType", js.undefined)
    @scala.inline
    def setSecurityGroupId(value: Input[String]): Self = this.set("securityGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupId: Self = this.set("securityGroupId", js.undefined)
    @scala.inline
    def setSourceBackupIdentifier(value: Input[String]): Self = this.set("sourceBackupIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceBackupIdentifier: Self = this.set("sourceBackupIdentifier", js.undefined)
    @scala.inline
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
  
}

