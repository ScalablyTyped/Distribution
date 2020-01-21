package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputKeyPressEventData extends js.Object {
  var key: String
}

object TextInputKeyPressEventData {
  @scala.inline
  def apply(key: String): TextInputKeyPressEventData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextInputKeyPressEventData]
  }
}

