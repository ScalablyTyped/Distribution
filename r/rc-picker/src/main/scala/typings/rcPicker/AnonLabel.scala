package typings.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: String
  def onClick(): Unit
  def onMouseEnter(): Unit
  def onMouseLeave(): Unit
}

object AnonLabel {
  @scala.inline
  def apply(label: String, onClick: () => Unit, onMouseEnter: () => Unit, onMouseLeave: () => Unit): AnonLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave))
    __obj.asInstanceOf[AnonLabel]
  }
}

