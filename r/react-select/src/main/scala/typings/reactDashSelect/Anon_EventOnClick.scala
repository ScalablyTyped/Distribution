package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventOnClick extends js.Object {
  def onClick(event: js.Any): Unit
  def onMouseDown(event: js.Any): Unit
  def onTouchEnd(event: js.Any): Unit
}

object Anon_EventOnClick {
  @scala.inline
  def apply(onClick: js.Any => Unit, onMouseDown: js.Any => Unit, onTouchEnd: js.Any => Unit): Anon_EventOnClick = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchEnd = js.Any.fromFunction1(onTouchEnd))
  
    __obj.asInstanceOf[Anon_EventOnClick]
  }
}

