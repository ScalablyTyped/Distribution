package typings
package rmcDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Evt extends js.Object {
  def onFinish(): scala.Unit
  def onTouchCancel(): scala.Unit
  def onTouchEnd(): scala.Unit
  def onTouchMove(evt: reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLDivElement]): scala.Unit
  def onTouchStart(evt: reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLDivElement]): scala.Unit
}

object Anon_Evt {
  @scala.inline
  def apply(
    onFinish: js.Function0[scala.Unit],
    onTouchCancel: js.Function0[scala.Unit],
    onTouchEnd: js.Function0[scala.Unit],
    onTouchMove: js.Function1[reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLDivElement], scala.Unit],
    onTouchStart: js.Function1[reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLDivElement], scala.Unit]
  ): Anon_Evt = {
    val __obj = js.Dynamic.literal(onFinish = onFinish, onTouchCancel = onTouchCancel, onTouchEnd = onTouchEnd, onTouchMove = onTouchMove, onTouchStart = onTouchStart)
  
    __obj.asInstanceOf[Anon_Evt]
  }
}

