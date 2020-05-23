package typings.reactNativePushNotification.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Os extends js.Object {
  var os: String
  var token: String
}

object Os {
  @scala.inline
  def apply(os: String, token: String): Os = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Os]
  }
}

