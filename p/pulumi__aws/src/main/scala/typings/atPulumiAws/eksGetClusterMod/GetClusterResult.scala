package typings.atPulumiAws.eksGetClusterMod

import typings.atPulumiAws.Anon_Data
import typings.atPulumiAws.Anon_EndpointPrivateAccessEndpointPublicAccessSecurityGroupIds
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
  val certificateAuthority: Anon_Data
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
    * The Kubernetes server version for the cluster.
    */
  val version: String
  /**
    * Nested attribute containing VPC configuration for the cluster.
    */
  val vpcConfig: Anon_EndpointPrivateAccessEndpointPublicAccessSecurityGroupIds
}

object GetClusterResult {
  @scala.inline
  def apply(
    arn: String,
    certificateAuthority: Anon_Data,
    createdAt: String,
    enabledClusterLogTypes: js.Array[String],
    endpoint: String,
    id: String,
    name: String,
    platformVersion: String,
    roleArn: String,
    status: String,
    version: String,
    vpcConfig: Anon_EndpointPrivateAccessEndpointPublicAccessSecurityGroupIds
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(arn = arn, certificateAuthority = certificateAuthority, createdAt = createdAt, enabledClusterLogTypes = enabledClusterLogTypes, endpoint = endpoint, id = id, name = name, platformVersion = platformVersion, roleArn = roleArn, status = status, version = version, vpcConfig = vpcConfig)
  
    __obj.asInstanceOf[GetClusterResult]
  }
}

