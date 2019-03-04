package typings
package socketclusterDashServerLib.scserverMod.SCServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait badAuthStatus extends js.Object {
  var authError: nodeLib.Error
  var signedAuthToken: java.lang.String
}

object badAuthStatus {
  @scala.inline
  def apply(authError: nodeLib.Error, signedAuthToken: java.lang.String): badAuthStatus = {
    val __obj = js.Dynamic.literal(authError = authError, signedAuthToken = signedAuthToken)
  
    __obj.asInstanceOf[badAuthStatus]
  }
}

