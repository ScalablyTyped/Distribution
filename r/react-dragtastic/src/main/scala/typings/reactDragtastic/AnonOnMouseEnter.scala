package typings.reactDragtastic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnMouseEnter extends js.Object {
  def onMouseEnter(): Unit
  def onMouseLeave(): Unit
  def onMouseUp(): Unit
}

object AnonOnMouseEnter {
  @scala.inline
  def apply(onMouseEnter: () => Unit, onMouseLeave: () => Unit, onMouseUp: () => Unit): AnonOnMouseEnter = {
    val __obj = js.Dynamic.literal(onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave), onMouseUp = js.Any.fromFunction0(onMouseUp))
    __obj.asInstanceOf[AnonOnMouseEnter]
  }
}

