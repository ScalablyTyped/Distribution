package typings
package reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthCredential extends js.Object {
  var providerId: java.lang.String
  var secret: java.lang.String
  var token: java.lang.String
}

object AuthCredential {
  @scala.inline
  def apply(providerId: java.lang.String, secret: java.lang.String, token: java.lang.String): AuthCredential = {
    val __obj = js.Dynamic.literal(providerId = providerId, secret = secret, token = token)
  
    __obj.asInstanceOf[AuthCredential]
  }
}

