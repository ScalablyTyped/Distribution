package typings.reactNative.mod

import typings.reactNative.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputScrollEventData extends js.Object {
  var contentOffset: AnonX
}

object TextInputScrollEventData {
  @scala.inline
  def apply(contentOffset: AnonX): TextInputScrollEventData = {
    val __obj = js.Dynamic.literal(contentOffset = contentOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputScrollEventData]
  }
}

