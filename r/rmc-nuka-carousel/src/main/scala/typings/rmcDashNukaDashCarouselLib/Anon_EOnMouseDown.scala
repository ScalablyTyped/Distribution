package typings
package rmcDashNukaDashCarouselLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EOnMouseDown extends js.Object {
  def onMouseDown(e: js.Any): scala.Unit
  def onMouseLeave(e: js.Any): scala.Unit
  def onMouseMove(e: js.Any): scala.Unit
  def onMouseOut(): scala.Unit
  def onMouseOver(): scala.Unit
  def onMouseUp(e: js.Any): scala.Unit
}

object Anon_EOnMouseDown {
  @scala.inline
  def apply(
    onMouseDown: js.Any => scala.Unit,
    onMouseLeave: js.Any => scala.Unit,
    onMouseMove: js.Any => scala.Unit,
    onMouseOut: () => scala.Unit,
    onMouseOver: () => scala.Unit,
    onMouseUp: js.Any => scala.Unit
  ): Anon_EOnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseOut = js.Any.fromFunction0(onMouseOut), onMouseOver = js.Any.fromFunction0(onMouseOver), onMouseUp = js.Any.fromFunction1(onMouseUp))
  
    __obj.asInstanceOf[Anon_EOnMouseDown]
  }
}

