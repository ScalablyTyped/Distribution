package typings.reactDragtastic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMouseEnter extends js.Object {
  def onMouseEnter(): Unit
  def onMouseLeave(): Unit
  def onMouseUp(): Unit
}

object OnMouseEnter {
  @scala.inline
  def apply(onMouseEnter: () => Unit, onMouseLeave: () => Unit, onMouseUp: () => Unit): OnMouseEnter = {
    val __obj = js.Dynamic.literal(onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave), onMouseUp = js.Any.fromFunction0(onMouseUp))
    __obj.asInstanceOf[OnMouseEnter]
  }
}

