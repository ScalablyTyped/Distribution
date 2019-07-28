package typings.rmcDashNukaDashCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  def onTouchCancel(e: js.Any): Unit
  def onTouchEnd(e: js.Any): Unit
  def onTouchMove(e: js.Any): Unit
  def onTouchStart(e: js.Any): Unit
}

object Anon_E {
  @scala.inline
  def apply(
    onTouchCancel: js.Any => Unit,
    onTouchEnd: js.Any => Unit,
    onTouchMove: js.Any => Unit,
    onTouchStart: js.Any => Unit
  ): Anon_E = {
    val __obj = js.Dynamic.literal(onTouchCancel = js.Any.fromFunction1(onTouchCancel), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchMove = js.Any.fromFunction1(onTouchMove), onTouchStart = js.Any.fromFunction1(onTouchStart))
  
    __obj.asInstanceOf[Anon_E]
  }
}

