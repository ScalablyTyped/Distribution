package typings.pulumiAws.eksClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.eks.ClusterCertificateAuthority
import typings.pulumiAws.inputMod.eks.ClusterEncryptionConfig
import typings.pulumiAws.inputMod.eks.ClusterIdentity
import typings.pulumiAws.inputMod.eks.ClusterVpcConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Nested attribute containing `certificate-authority-data` for your cluster.
    */
  val certificateAuthority: js.UndefOr[Input[ClusterCertificateAuthority]] = js.native
  val createdAt: js.UndefOr[Input[String]] = js.native
  /**
    * A list of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html)
    */
  val enabledClusterLogTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Configuration block with encryption configuration for the cluster. Only available on Kubernetes 1.13 and above clusters created after March 6, 2020. Detailed below.
    */
  val encryptionConfig: js.UndefOr[Input[ClusterEncryptionConfig]] = js.native
  /**
    * The endpoint for your Kubernetes API server.
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  /**
    * Nested attribute containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019.
    */
  val identities: js.UndefOr[Input[js.Array[Input[ClusterIdentity]]]] = js.native
  /**
    * Name of the cluster.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The platform version for the cluster.
    */
  val platformVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf. Ensure the resource configuration includes explicit dependencies on the IAM Role permissions by adding [`dependsOn`](https://www.pulumi.com/docs/intro/concepts/programming-model/#dependson) if using the `aws.iam.RolePolicy` resource) or `aws.iam.RolePolicyAttachment` resource, otherwise EKS cannot delete EKS managed EC2 infrastructure such as Security Groups on EKS Cluster deletion.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
    */
  val version: js.UndefOr[Input[String]] = js.native
  /**
    * Nested argument for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Configuration detailed below.
    */
  val vpcConfig: js.UndefOr[Input[ClusterVpcConfig]] = js.native
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCertificateAuthority(value: Input[ClusterCertificateAuthority]): Self = this.set("certificateAuthority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateAuthority: Self = this.set("certificateAuthority", js.undefined)
    @scala.inline
    def setCreatedAt(value: Input[String]): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setEnabledClusterLogTypesVarargs(value: Input[String]*): Self = this.set("enabledClusterLogTypes", js.Array(value :_*))
    @scala.inline
    def setEnabledClusterLogTypes(value: Input[js.Array[Input[String]]]): Self = this.set("enabledClusterLogTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledClusterLogTypes: Self = this.set("enabledClusterLogTypes", js.undefined)
    @scala.inline
    def setEncryptionConfig(value: Input[ClusterEncryptionConfig]): Self = this.set("encryptionConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionConfig: Self = this.set("encryptionConfig", js.undefined)
    @scala.inline
    def setEndpoint(value: Input[String]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setIdentitiesVarargs(value: Input[ClusterIdentity]*): Self = this.set("identities", js.Array(value :_*))
    @scala.inline
    def setIdentities(value: Input[js.Array[Input[ClusterIdentity]]]): Self = this.set("identities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentities: Self = this.set("identities", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPlatformVersion(value: Input[String]): Self = this.set("platformVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformVersion: Self = this.set("platformVersion", js.undefined)
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVpcConfig(value: Input[ClusterVpcConfig]): Self = this.set("vpcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfig: Self = this.set("vpcConfig", js.undefined)
  }
  
}

