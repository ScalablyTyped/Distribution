package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCOAuthCredential extends js.Object {
  var accessToken: java.lang.String
  var macKey: java.lang.String
}

object RTCOAuthCredential {
  @scala.inline
  def apply(accessToken: java.lang.String, macKey: java.lang.String): RTCOAuthCredential = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], macKey = macKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOAuthCredential]
  }
}

