package typings.pulumiAws.eksGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.eks.GetClusterCertificateAuthority
import typings.pulumiAws.outputMod.eks.GetClusterIdentity
import typings.pulumiAws.outputMod.eks.GetClusterVpcConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  val arn: String = js.native
  /**
    * Nested attribute containing `certificate-authority-data` for your cluster.
    */
  val certificateAuthority: GetClusterCertificateAuthority = js.native
  /**
    * The Unix epoch time stamp in seconds for when the cluster was created.
    */
  val createdAt: String = js.native
  /**
    * The enabled control plane logs.
    */
  val enabledClusterLogTypes: js.Array[String] = js.native
  /**
    * The endpoint for your Kubernetes API server.
    */
  val endpoint: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Nested attribute containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. For an example using this information to enable IAM Roles for Service Accounts, see the `aws.eks.Cluster` resource documentation.
    */
  val identities: js.Array[GetClusterIdentity] = js.native
  val name: String = js.native
  /**
    * The platform version for the cluster.
    */
  val platformVersion: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
    */
  val roleArn: String = js.native
  /**
    * The status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
    */
  val status: String = js.native
  /**
    * Key-value map of resource tags.
    */
  val tags: StringDictionary[String] = js.native
  /**
    * The Kubernetes server version for the cluster.
    */
  val version: String = js.native
  /**
    * Nested list containing VPC configuration for the cluster.
    */
  val vpcConfig: GetClusterVpcConfig = js.native
}

object GetClusterResult {
  @scala.inline
  def apply(
    arn: String,
    certificateAuthority: GetClusterCertificateAuthority,
    createdAt: String,
    enabledClusterLogTypes: js.Array[String],
    endpoint: String,
    id: String,
    identities: js.Array[GetClusterIdentity],
    name: String,
    platformVersion: String,
    roleArn: String,
    status: String,
    tags: StringDictionary[String],
    version: String,
    vpcConfig: GetClusterVpcConfig
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], certificateAuthority = certificateAuthority.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], enabledClusterLogTypes = enabledClusterLogTypes.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platformVersion = platformVersion.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], vpcConfig = vpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterResult]
  }
  @scala.inline
  implicit class GetClusterResultOps[Self <: GetClusterResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateAuthority(value: GetClusterCertificateAuthority): Self = this.set("certificateAuthority", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedAt(value: String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabledClusterLogTypesVarargs(value: String*): Self = this.set("enabledClusterLogTypes", js.Array(value :_*))
    @scala.inline
    def setEnabledClusterLogTypes(value: js.Array[String]): Self = this.set("enabledClusterLogTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentitiesVarargs(value: GetClusterIdentity*): Self = this.set("identities", js.Array(value :_*))
    @scala.inline
    def setIdentities(value: js.Array[GetClusterIdentity]): Self = this.set("identities", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatformVersion(value: String): Self = this.set("platformVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcConfig(value: GetClusterVpcConfig): Self = this.set("vpcConfig", value.asInstanceOf[js.Any])
  }
  
}

