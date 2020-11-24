package typings.reactSwipeable.typesMod

import typings.reactSwipeable.anon.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeableCallbacks extends js.Object {
  
  var onSwiped: SwipeCallback = js.native
  
  var onSwipedDown: SwipeCallback = js.native
  
  var onSwipedLeft: SwipeCallback = js.native
  
  var onSwipedRight: SwipeCallback = js.native
  
  var onSwipedUp: SwipeCallback = js.native
  
  var onSwiping: SwipeCallback = js.native
  
  var onTap: TapCallback = js.native
}
object SwipeableCallbacks {
  
  @scala.inline
  def apply(
    onSwiped: /* eventData */ SwipeEventData => Unit,
    onSwipedDown: /* eventData */ SwipeEventData => Unit,
    onSwipedLeft: /* eventData */ SwipeEventData => Unit,
    onSwipedRight: /* eventData */ SwipeEventData => Unit,
    onSwipedUp: /* eventData */ SwipeEventData => Unit,
    onSwiping: /* eventData */ SwipeEventData => Unit,
    onTap: /* hasEvent */ Event => Unit
  ): SwipeableCallbacks = {
    val __obj = js.Dynamic.literal(onSwiped = js.Any.fromFunction1(onSwiped), onSwipedDown = js.Any.fromFunction1(onSwipedDown), onSwipedLeft = js.Any.fromFunction1(onSwipedLeft), onSwipedRight = js.Any.fromFunction1(onSwipedRight), onSwipedUp = js.Any.fromFunction1(onSwipedUp), onSwiping = js.Any.fromFunction1(onSwiping), onTap = js.Any.fromFunction1(onTap))
    __obj.asInstanceOf[SwipeableCallbacks]
  }
  
  @scala.inline
  implicit class SwipeableCallbacksOps[Self <: SwipeableCallbacks] (val x: Self) extends AnyVal {
    
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
    def setOnSwiped(value: /* eventData */ SwipeEventData => Unit): Self = this.set("onSwiped", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSwipedDown(value: /* eventData */ SwipeEventData => Unit): Self = this.set("onSwipedDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSwipedLeft(value: /* eventData */ SwipeEventData => Unit): Self = this.set("onSwipedLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSwipedRight(value: /* eventData */ SwipeEventData => Unit): Self = this.set("onSwipedRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSwipedUp(value: /* eventData */ SwipeEventData => Unit): Self = this.set("onSwipedUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSwiping(value: /* eventData */ SwipeEventData => Unit): Self = this.set("onSwiping", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTap(value: /* hasEvent */ Event => Unit): Self = this.set("onTap", js.Any.fromFunction1(value))
  }
}
