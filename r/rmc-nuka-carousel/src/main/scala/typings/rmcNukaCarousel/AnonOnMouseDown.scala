package typings.rmcNukaCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnMouseDown extends js.Object {
  def onMouseDown(e: js.Any): Unit
  def onMouseLeave(e: js.Any): Unit
  def onMouseMove(e: js.Any): Unit
  def onMouseOut(): Unit
  def onMouseOver(): Unit
  def onMouseUp(e: js.Any): Unit
}

object AnonOnMouseDown {
  @scala.inline
  def apply(
    onMouseDown: js.Any => Unit,
    onMouseLeave: js.Any => Unit,
    onMouseMove: js.Any => Unit,
    onMouseOut: () => Unit,
    onMouseOver: () => Unit,
    onMouseUp: js.Any => Unit
  ): AnonOnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseOut = js.Any.fromFunction0(onMouseOut), onMouseOver = js.Any.fromFunction0(onMouseOver), onMouseUp = js.Any.fromFunction1(onMouseUp))
  
    __obj.asInstanceOf[AnonOnMouseDown]
  }
}

