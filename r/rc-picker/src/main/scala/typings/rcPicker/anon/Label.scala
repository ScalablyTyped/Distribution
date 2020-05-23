package typings.rcPicker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var label: String
  def onClick(): Unit
  def onMouseEnter(): Unit
  def onMouseLeave(): Unit
}

object Label {
  @scala.inline
  def apply(label: String, onClick: () => Unit, onMouseEnter: () => Unit, onMouseLeave: () => Unit): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave))
    __obj.asInstanceOf[Label]
  }
}

