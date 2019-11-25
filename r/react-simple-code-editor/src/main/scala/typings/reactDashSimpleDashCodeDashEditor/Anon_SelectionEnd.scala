package typings.reactDashSimpleDashCodeDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SelectionEnd extends js.Object {
  var selectionEnd: Double
  var selectionStart: Double
  var timestamp: Double
  var value: String
}

object Anon_SelectionEnd {
  @scala.inline
  def apply(selectionEnd: Double, selectionStart: Double, timestamp: Double, value: String): Anon_SelectionEnd = {
    val __obj = js.Dynamic.literal(selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SelectionEnd]
  }
}

