package typings.socketclusterServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSignedAuthToken extends js.Object {
  var signedAuthToken: String
}

object AnonSignedAuthToken {
  @scala.inline
  def apply(signedAuthToken: String): AnonSignedAuthToken = {
    val __obj = js.Dynamic.literal(signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSignedAuthToken]
  }
}

