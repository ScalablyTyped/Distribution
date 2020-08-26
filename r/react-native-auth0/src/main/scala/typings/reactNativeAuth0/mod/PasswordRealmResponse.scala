package typings.reactNativeAuth0.mod

import typings.reactNativeAuth0.reactNativeAuth0Strings.Bearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordRealmResponse extends js.Object {
  var accessToken: String = js.native
  var expiresIn: Double = js.native
  var idToken: String = js.native
  var refreshToken: js.UndefOr[String] = js.native
  var scope: String = js.native
  var tokenType: Bearer = js.native
}

object PasswordRealmResponse {
  @scala.inline
  def apply(accessToken: String, expiresIn: Double, idToken: String, scope: String, tokenType: Bearer): PasswordRealmResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordRealmResponse]
  }
  @scala.inline
  implicit class PasswordRealmResponseOps[Self <: PasswordRealmResponse] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiresIn(value: Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenType(value: Bearer): Self = this.set("tokenType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
  }
  
}

