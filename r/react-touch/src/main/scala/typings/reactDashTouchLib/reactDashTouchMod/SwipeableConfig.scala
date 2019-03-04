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
    onSwipeDown: js.Function3[scala.Double, scala.Double, js.Function0[scala.Unit], scala.Unit],
    onSwipeLeft: js.Function3[scala.Double, scala.Double, js.Function0[scala.Unit], scala.Unit],
    onSwipeRight: js.Function3[scala.Double, scala.Double, js.Function0[scala.Unit], scala.Unit],
    onSwipeUp: js.Function3[scala.Double, scala.Double, js.Function0[scala.Unit], scala.Unit]
  ): SwipeableConfig = {
    val __obj = js.Dynamic.literal(onSwipeDown = onSwipeDown, onSwipeLeft = onSwipeLeft, onSwipeRight = onSwipeRight, onSwipeUp = onSwipeUp)
  
    __obj.asInstanceOf[SwipeableConfig]
  }
}

