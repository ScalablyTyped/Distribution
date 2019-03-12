package typings
package reactDashTouchLib.reactDashTouchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableConfig extends js.Object {
  def onSwipeDown(current: scala.Double, initial: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit
  def onSwipeLeft(current: scala.Double, initial: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit
  def onSwipeRight(current: scala.Double, initial: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit
  def onSwipeUp(current: scala.Double, initial: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit
}

object SwipeableConfig {
  @scala.inline
  def apply(
    onSwipeDown: (scala.Double, scala.Double, js.Function0[scala.Unit]) => scala.Unit,
    onSwipeLeft: (scala.Double, scala.Double, js.Function0[scala.Unit]) => scala.Unit,
    onSwipeRight: (scala.Double, scala.Double, js.Function0[scala.Unit]) => scala.Unit,
    onSwipeUp: (scala.Double, scala.Double, js.Function0[scala.Unit]) => scala.Unit
  ): SwipeableConfig = {
    val __obj = js.Dynamic.literal(onSwipeDown = js.Any.fromFunction3(onSwipeDown), onSwipeLeft = js.Any.fromFunction3(onSwipeLeft), onSwipeRight = js.Any.fromFunction3(onSwipeRight), onSwipeUp = js.Any.fromFunction3(onSwipeUp))
  
    __obj.asInstanceOf[SwipeableConfig]
  }
}

