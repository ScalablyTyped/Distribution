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
    val __obj = js.Dynamic.literal(providerId = providerId, secret = secret, token = token)
  
    __obj.asInstanceOf[AuthCredential]
  }
}

