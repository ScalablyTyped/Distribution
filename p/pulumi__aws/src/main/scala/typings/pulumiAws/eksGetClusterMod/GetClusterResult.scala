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
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Nested attribute containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. For an example using this information to enable IAM Roles for Service Accounts, see the [`aws.eks.Cluster` resource documentation](https://www.terraform.io/docs/providers/aws/r/eks_cluster.html).
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
    * Key-value mapping of resource tags.
    */
  val tags: StringDictionary[js.Any] = js.native
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
    tags: StringDictionary[js.Any],
    version: String,
    vpcConfig: GetClusterVpcConfig
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], certificateAuthority = certificateAuthority.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], enabledClusterLogTypes = enabledClusterLogTypes.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platformVersion = platformVersion.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], vpcConfig = vpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterResult]
  }
}

