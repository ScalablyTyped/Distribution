package typings.atPulumiAws.transferGetServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServerResult extends js.Object {
  /**
    * Amazon Resource Name (ARN) of Transfer Server
    */
  val arn: String = js.native
  /**
    * The endpoint of the Transfer Server (e.g. `s-12345678.server.transfer.REGION.amazonaws.com`)
    */
  val endpoint: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice.
    */
  val identityProviderType: String = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM role used to authenticate the user account with an `identityProviderType` of `API_GATEWAY`.
    */
  val invocationRole: String = js.native
  /**
    * Amazon Resource Name (ARN) of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
    */
  val loggingRole: String = js.native
  val serverId: String = js.native
  /**
    * URL of the service endpoint used to authenticate users with an `identityProviderType` of `API_GATEWAY`.
    */
  val url: String = js.native
}

object GetServerResult {
  @scala.inline
  def apply(
    arn: String,
    endpoint: String,
    id: String,
    identityProviderType: String,
    invocationRole: String,
    loggingRole: String,
    serverId: String,
    url: String
  ): GetServerResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identityProviderType = identityProviderType.asInstanceOf[js.Any], invocationRole = invocationRole.asInstanceOf[js.Any], loggingRole = loggingRole.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetServerResult]
  }
}

