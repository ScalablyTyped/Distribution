package typings.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeableConfig extends js.Object {
  
  def onSwipeDown(current: Double, initial: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def onSwipeLeft(current: Double, initial: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def onSwipeRight(current: Double, initial: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def onSwipeUp(current: Double, initial: Double, callback: js.Function0[Unit]): Unit = js.native
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
  
  @scala.inline
  implicit class SwipeableConfigOps[Self <: SwipeableConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnSwipeDown(value: (Double, Double, js.Function0[Unit]) => Unit): Self = this.set("onSwipeDown", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnSwipeLeft(value: (Double, Double, js.Function0[Unit]) => Unit): Self = this.set("onSwipeLeft", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnSwipeRight(value: (Double, Double, js.Function0[Unit]) => Unit): Self = this.set("onSwipeRight", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnSwipeUp(value: (Double, Double, js.Function0[Unit]) => Unit): Self = this.set("onSwipeUp", js.Any.fromFunction3(value))
  }
}
