package typings.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnTouchEnd extends js.Object {
  var className: String
  def onClick(event: js.Any): Unit
  def onMouseDown(event: js.Any): Unit
  def onTouchEnd(event: js.Any): Unit
}

object AnonOnTouchEnd {
  @scala.inline
  def apply(
    className: String,
    onClick: js.Any => Unit,
    onMouseDown: js.Any => Unit,
    onTouchEnd: js.Any => Unit
  ): AnonOnTouchEnd = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchEnd = js.Any.fromFunction1(onTouchEnd))
  
    __obj.asInstanceOf[AnonOnTouchEnd]
  }
}

