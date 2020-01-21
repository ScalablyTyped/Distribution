package typings.reactNative.mod

import typings.reactNative.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputContentSizeChangeEventData extends js.Object {
  var contentSize: AnonHeight
}

object TextInputContentSizeChangeEventData {
  @scala.inline
  def apply(contentSize: AnonHeight): TextInputContentSizeChangeEventData = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextInputContentSizeChangeEventData]
  }
}

