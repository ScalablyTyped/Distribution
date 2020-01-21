package typings.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableConfig extends js.Object {
  def onSwipeDown(current: Double, initial: Double, callback: js.Function0[Unit]): Unit
  def onSwipeLeft(current: Double, initial: Double, callback: js.Function0[Unit]): Unit
  def onSwipeRight(current: Double, initial: Double, callback: js.Function0[Unit]): Unit
  def onSwipeUp(current: Double, initial: Double, callback: js.Function0[Unit]): Unit
}

object SwipeableConfig {
  @scala.inline
  def apply(
    onSwipeDown: (Double, Double, js.Function0[Unit]) => Unit,
    onSwipeLeft: (Double, Double, js.Function0[Unit]) => Unit,
    onSwipeRight: (Double, Double, js.Function0[Unit]) => Unit,
    onSwipeUp: (Double, Double, js.Function0[Unit]) => Unit
  ): SwipeableConfig = {
    val __obj = js.Dynamic.literal(onSwipeDown = js.Any.fromFunction3(onSwipeDown), onSwipeLeft = js.Any.fromFunction3(onSwipeLeft), onSwipeRight = js.Any.fromFunction3(onSwipeRight), onSwipeUp = js.Any.fromFunction3(onSwipeUp))
  
    __obj.asInstanceOf[SwipeableConfig]
  }
}

