package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthCredential extends js.Object {
  var providerId: String
  var secret: String
  var token: String
}

object AuthCredential {
  @scala.inline
  def apply(providerId: String, secret: String, token: String): AuthCredential = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthCredential]
  }
}

