package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdTokenResult extends js.Object {
  var authTime: String = js.native
  var claims: StringDictionary[js.Any] = js.native
  var expirationTime: String = js.native
  var issuedAtTime: String = js.native
  var signInProvider: Null | String = js.native
  var token: String = js.native
}

object IdTokenResult {
  @scala.inline
  def apply(
    authTime: String,
    claims: StringDictionary[js.Any],
    expirationTime: String,
    issuedAtTime: String,
    token: String
  ): IdTokenResult = {
    val __obj = js.Dynamic.literal(authTime = authTime.asInstanceOf[js.Any], claims = claims.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], issuedAtTime = issuedAtTime.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTokenResult]
  }
  @scala.inline
  implicit class IdTokenResultOps[Self <: IdTokenResult] (val x: Self) extends AnyVal {
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
    def setAuthTime(value: String): Self = this.set("authTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setClaims(value: StringDictionary[js.Any]): Self = this.set("claims", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationTime(value: String): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuedAtTime(value: String): Self = this.set("issuedAtTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignInProvider(value: String): Self = this.set("signInProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignInProviderNull: Self = this.set("signInProvider", null)
  }
  
}

