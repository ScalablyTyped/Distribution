package typings.rmcCalendar

import typings.react.mod.TouchEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvt extends js.Object {
  def onFinish(): Unit
  def onTouchCancel(): Unit
  def onTouchEnd(): Unit
  def onTouchMove(evt: TouchEvent[HTMLDivElement]): Unit
  def onTouchStart(evt: TouchEvent[HTMLDivElement]): Unit
}

object AnonEvt {
  @scala.inline
  def apply(
    onFinish: () => Unit,
    onTouchCancel: () => Unit,
    onTouchEnd: () => Unit,
    onTouchMove: TouchEvent[HTMLDivElement] => Unit,
    onTouchStart: TouchEvent[HTMLDivElement] => Unit
  ): AnonEvt = {
    val __obj = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), onTouchCancel = js.Any.fromFunction0(onTouchCancel), onTouchEnd = js.Any.fromFunction0(onTouchEnd), onTouchMove = js.Any.fromFunction1(onTouchMove), onTouchStart = js.Any.fromFunction1(onTouchStart))
  
    __obj.asInstanceOf[AnonEvt]
  }
}

