package typings
package atPulumiAwsLib.ecrGetCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCredentialsResult extends js.Object {
  val authorizationToken: java.lang.String
  val expiresAt: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val proxyEndpoint: java.lang.String
}

object GetCredentialsResult {
  @scala.inline
  def apply(
    authorizationToken: java.lang.String,
    expiresAt: java.lang.String,
    id: java.lang.String,
    proxyEndpoint: java.lang.String
  ): GetCredentialsResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authorizationToken")(authorizationToken)
    __obj.updateDynamic("expiresAt")(expiresAt)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("proxyEndpoint")(proxyEndpoint)
    __obj.asInstanceOf[GetCredentialsResult]
  }
}

