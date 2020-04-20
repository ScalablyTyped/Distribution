package typings.reactNativePushNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOs extends js.Object {
  var os: String
  var token: String
}

object AnonOs {
  @scala.inline
  def apply(os: String, token: String): AnonOs = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOs]
  }
}

