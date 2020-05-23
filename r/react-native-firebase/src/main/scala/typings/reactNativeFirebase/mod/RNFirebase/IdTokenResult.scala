package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdTokenResult extends js.Object {
  var authTime: String
  var claims: StringDictionary[js.Any]
  var expirationTime: String
  var issuedAtTime: String
  var signInProvider: Null | String
  var token: String
}

object IdTokenResult {
  @scala.inline
  def apply(
    authTime: String,
    claims: StringDictionary[js.Any],
    expirationTime: String,
    issuedAtTime: String,
    token: String,
    signInProvider: String = null
  ): IdTokenResult = {
    val __obj = js.Dynamic.literal(authTime = authTime.asInstanceOf[js.Any], claims = claims.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], issuedAtTime = issuedAtTime.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], signInProvider = signInProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTokenResult]
  }
}

