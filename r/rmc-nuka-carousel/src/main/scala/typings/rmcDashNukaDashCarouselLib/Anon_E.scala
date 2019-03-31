package typings
package rmcDashNukaDashCarouselLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  def onTouchCancel(e: js.Any): scala.Unit
  def onTouchEnd(e: js.Any): scala.Unit
  def onTouchMove(e: js.Any): scala.Unit
  def onTouchStart(e: js.Any): scala.Unit
}

object Anon_E {
  @scala.inline
  def apply(
    onTouchCancel: js.Any => scala.Unit,
    onTouchEnd: js.Any => scala.Unit,
    onTouchMove: js.Any => scala.Unit,
    onTouchStart: js.Any => scala.Unit
  ): Anon_E = {
    val __obj = js.Dynamic.literal(onTouchCancel = js.Any.fromFunction1(onTouchCancel), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchMove = js.Any.fromFunction1(onTouchMove), onTouchStart = js.Any.fromFunction1(onTouchStart))
  
    __obj.asInstanceOf[Anon_E]
  }
}

