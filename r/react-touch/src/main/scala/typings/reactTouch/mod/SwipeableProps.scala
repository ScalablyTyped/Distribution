package typings.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeableProps extends js.Object {
  
  /** @see defineSwipe */
  var config: js.UndefOr[SwipeableConfig] = js.native
  
  var onMouseDown: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeDown: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeLeft: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeRight: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeUp: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onTouchStart: js.UndefOr[js.Function0[Unit]] = js.native
}
object SwipeableProps {
  
  @scala.inline
  def apply(): SwipeableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeableProps]
  }
  
  @scala.inline
  implicit class SwipeablePropsOps[Self <: SwipeableProps] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: SwipeableConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: () => Unit): Self = this.set("onMouseDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnSwipeDown(value: () => Unit): Self = this.set("onSwipeDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSwipeDown: Self = this.set("onSwipeDown", js.undefined)
    
    @scala.inline
    def setOnSwipeLeft(value: () => Unit): Self = this.set("onSwipeLeft", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSwipeLeft: Self = this.set("onSwipeLeft", js.undefined)
    
    @scala.inline
    def setOnSwipeRight(value: () => Unit): Self = this.set("onSwipeRight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSwipeRight: Self = this.set("onSwipeRight", js.undefined)
    
    @scala.inline
    def setOnSwipeUp(value: () => Unit): Self = this.set("onSwipeUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSwipeUp: Self = this.set("onSwipeUp", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: () => Unit): Self = this.set("onTouchStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
  }
}
