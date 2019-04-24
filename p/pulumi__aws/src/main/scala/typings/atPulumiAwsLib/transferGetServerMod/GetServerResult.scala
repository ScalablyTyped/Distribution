package typings
package atPulumiAwsLib.transferGetServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServerResult extends js.Object {
  /**
    * Amazon Resource Name (ARN) of Transfer Server
    */
  val arn: java.lang.String
  /**
    * The endpoint of the Transfer Server (e.g. `s-12345678.server.transfer.REGION.amazonaws.com`)
    */
  val endpoint: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice.
    */
  val identityProviderType: java.lang.String
  /**
    * Amazon Resource Name (ARN) of the IAM role used to authenticate the user account with an `identity_provider_type` of `API_GATEWAY`.
    */
  val invocationRole: java.lang.String
  /**
    * Amazon Resource Name (ARN) of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
    */
  val loggingRole: java.lang.String
  val serverId: java.lang.String
  /**
    * URL of the service endpoint used to authenticate users with an `identity_provider_type` of `API_GATEWAY`.
    */
  val url: java.lang.String
}

object GetServerResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    endpoint: java.lang.String,
    id: java.lang.String,
    identityProviderType: java.lang.String,
    invocationRole: java.lang.String,
    loggingRole: java.lang.String,
    serverId: java.lang.String,
    url: java.lang.String
  ): GetServerResult = {
    val __obj = js.Dynamic.literal(arn = arn, endpoint = endpoint, id = id, identityProviderType = identityProviderType, invocationRole = invocationRole, loggingRole = loggingRole, serverId = serverId, url = url)
  
    __obj.asInstanceOf[GetServerResult]
  }
}

