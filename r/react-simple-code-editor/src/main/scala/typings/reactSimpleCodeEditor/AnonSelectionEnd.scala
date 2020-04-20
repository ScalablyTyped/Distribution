package typings.reactSimpleCodeEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelectionEnd extends js.Object {
  var selectionEnd: Double
  var selectionStart: Double
  var timestamp: Double
  var value: String
}

object AnonSelectionEnd {
  @scala.inline
  def apply(selectionEnd: Double, selectionStart: Double, timestamp: Double, value: String): AnonSelectionEnd = {
    val __obj = js.Dynamic.literal(selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelectionEnd]
  }
}

