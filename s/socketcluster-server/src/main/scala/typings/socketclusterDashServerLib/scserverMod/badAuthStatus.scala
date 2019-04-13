package typings
package socketclusterDashServerLib.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait badAuthStatus extends js.Object {
  var authError: stdLib.Error
  var signedAuthToken: java.lang.String
}

object badAuthStatus {
  @scala.inline
  def apply(authError: stdLib.Error, signedAuthToken: java.lang.String): badAuthStatus = {
    val __obj = js.Dynamic.literal(authError = authError, signedAuthToken = signedAuthToken)
  
    __obj.asInstanceOf[badAuthStatus]
  }
}

