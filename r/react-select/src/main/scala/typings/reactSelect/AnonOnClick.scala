package typings.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnClick extends js.Object {
  def onClick(event: js.Any): Unit
  def onMouseDown(event: js.Any): Unit
  def onTouchEnd(event: js.Any): Unit
}

object AnonOnClick {
  @scala.inline
  def apply(onClick: js.Any => Unit, onMouseDown: js.Any => Unit, onTouchEnd: js.Any => Unit): AnonOnClick = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchEnd = js.Any.fromFunction1(onTouchEnd))
    __obj.asInstanceOf[AnonOnClick]
  }
}

