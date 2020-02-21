package typings.socketclusterServer.serversocketMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadAuthTokenData extends js.Object {
  var authError: Error
  var signedAuthToken: String
}

object BadAuthTokenData {
  @scala.inline
  def apply(authError: Error, signedAuthToken: String): BadAuthTokenData = {
    val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BadAuthTokenData]
  }
}

