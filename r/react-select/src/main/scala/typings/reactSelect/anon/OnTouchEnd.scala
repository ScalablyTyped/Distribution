package typings.reactSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnTouchEnd extends js.Object {
  var className: String
  def onClick(event: js.Any): Unit
  def onMouseDown(event: js.Any): Unit
  def onTouchEnd(event: js.Any): Unit
}

object OnTouchEnd {
  @scala.inline
  def apply(
    className: String,
    onClick: js.Any => Unit,
    onMouseDown: js.Any => Unit,
    onTouchEnd: js.Any => Unit
  ): OnTouchEnd = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchEnd = js.Any.fromFunction1(onTouchEnd))
    __obj.asInstanceOf[OnTouchEnd]
  }
}

