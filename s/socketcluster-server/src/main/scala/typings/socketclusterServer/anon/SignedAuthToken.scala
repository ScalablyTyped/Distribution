package typings.socketclusterServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedAuthToken extends js.Object {
  var signedAuthToken: String
}

object SignedAuthToken {
  @scala.inline
  def apply(signedAuthToken: String): SignedAuthToken = {
    val __obj = js.Dynamic.literal(signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedAuthToken]
  }
}

