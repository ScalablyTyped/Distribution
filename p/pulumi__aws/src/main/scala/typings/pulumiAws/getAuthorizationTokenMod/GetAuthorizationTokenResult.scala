package typings.pulumiAws.getAuthorizationTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAuthorizationTokenResult extends js.Object {
  /**
    * Temporary IAM authentication credentials to access the ECR repository encoded in base64 in the form of `user_name:password`.
    */
  val authorizationToken: String = js.native
  /**
    * The time in UTC RFC3339 format when the authorization token expires.
    */
  val expiresAt: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Password decoded from the authorization token.
    */
  val password: String = js.native
  /**
    * The registry URL to use in the docker login command.
    */
  val proxyEndpoint: String = js.native
  val registryId: js.UndefOr[String] = js.native
  /**
    * User name decoded from the authorization token.
    */
  val userName: String = js.native
}

object GetAuthorizationTokenResult {
  @scala.inline
  def apply(
    authorizationToken: String,
    expiresAt: String,
    id: String,
    password: String,
    proxyEndpoint: String,
    userName: String
  ): GetAuthorizationTokenResult = {
    val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], proxyEndpoint = proxyEndpoint.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAuthorizationTokenResult]
  }
  @scala.inline
  implicit class GetAuthorizationTokenResultOps[Self <: GetAuthorizationTokenResult] (val x: Self) extends AnyVal {
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
    def setAuthorizationToken(value: String): Self = this.set("authorizationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiresAt(value: String): Self = this.set("expiresAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxyEndpoint(value: String): Self = this.set("proxyEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistryId(value: String): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
  }
  
}

