package typings.reactNativeTextInputMask.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentSize extends js.Object {
  var contentSize: Height
  var eventCount: Double
  var target: Double
  var text: String
}

object ContentSize {
  @scala.inline
  def apply(contentSize: Height, eventCount: Double, target: Double, text: String): ContentSize = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any], eventCount = eventCount.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSize]
  }
}

