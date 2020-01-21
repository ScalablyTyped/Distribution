package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputEndEditingEventData extends js.Object {
  var text: String
}

object TextInputEndEditingEventData {
  @scala.inline
  def apply(text: String): TextInputEndEditingEventData = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextInputEndEditingEventData]
  }
}

