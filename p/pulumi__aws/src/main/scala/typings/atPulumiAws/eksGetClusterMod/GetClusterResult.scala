package typings.atPulumiAws.eksGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.eks.GetClusterCertificateAuthority
import typings.atPulumiAws.typesOutputMod.eks.GetClusterIdentity
import typings.atPulumiAws.typesOutputMod.eks.GetClusterVpcConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  val arn: String
  /**
    * Nested attribute containing `certificate-authority-data` for your cluster.
    */
  val certificateAuthority: GetClusterCertificateAuthority
  /**
    * The Unix epoch time stamp in seconds for when the cluster was created.
    */
  val createdAt: String
  /**
    * The enabled control plane logs.
    */
  val enabledClusterLogTypes: js.Array[String]
  /**
    * The endpoint for your Kubernetes API server.
    */
  val endpoint: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * Nested attribute containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. For an example using this information to enable IAM Roles for Service Accounts, see the [`aws.eks.Cluster` resource documentation](https://www.terraform.io/docs/providers/aws/r/eks_cluster.html).
    */
  val identities: js.Array[GetClusterIdentity]
  val name: String
  /**
    * The platform version for the cluster.
    */
  val platformVersion: String
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
    */
  val roleArn: String
  /**
    * The status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
    */
  val status: String
  /**
    * Key-value mapping of resource tags.
    */
  val tags: StringDictionary[js.Any]
  /**
    * The Kubernetes server version for the cluster.
    */
  val version: String
  /**
    * Nested attribute containing VPC configuration for the cluster.
    */
  val vpcConfig: GetClusterVpcConfig
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
    val __obj = js.Dynamic.literal(arn = arn, certificateAuthority = certificateAuthority, createdAt = createdAt, enabledClusterLogTypes = enabledClusterLogTypes, endpoint = endpoint, id = id, identities = identities, name = name, platformVersion = platformVersion, roleArn = roleArn, status = status, tags = tags, version = version, vpcConfig = vpcConfig)
  
    __obj.asInstanceOf[GetClusterResult]
  }
}

