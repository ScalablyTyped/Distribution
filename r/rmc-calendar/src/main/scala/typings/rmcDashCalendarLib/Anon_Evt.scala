package typings
package rmcDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Evt extends js.Object {
  def onFinish(): scala.Unit
  def onTouchCancel(): scala.Unit
  def onTouchEnd(): scala.Unit
  def onTouchMove(evt: reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLDivElement]): scala.Unit
  def onTouchStart(evt: reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLDivElement]): scala.Unit
}

object Anon_Evt {
  @scala.inline
  def apply(
    onFinish: () => scala.Unit,
    onTouchCancel: () => scala.Unit,
    onTouchEnd: () => scala.Unit,
    onTouchMove: reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLDivElement] => scala.Unit,
    onTouchStart: reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLDivElement] => scala.Unit
  ): Anon_Evt = {
    val __obj = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), onTouchCancel = js.Any.fromFunction0(onTouchCancel), onTouchEnd = js.Any.fromFunction0(onTouchEnd), onTouchMove = js.Any.fromFunction1(onTouchMove), onTouchStart = js.Any.fromFunction1(onTouchStart))
  
    __obj.asInstanceOf[Anon_Evt]
  }
}

