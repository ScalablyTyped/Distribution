package typings.reactSwipeable.typesMod

import typings.reactSwipeable.anon.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-swipeable.react-swipeable/dist/types.SwipeableCallbacks & react-swipeable.react-swipeable/dist/types.ConfigurationOptions> */
@js.native
trait SwipeableProps extends js.Object {
  
  var delta: js.UndefOr[Double] = js.native
  
  var onSwiped: js.UndefOr[SwipeCallback] = js.native
  
  var onSwipedDown: js.UndefOr[SwipeCallback] = js.native
  
  var onSwipedLeft: js.UndefOr[SwipeCallback] = js.native
  
  var onSwipedRight: js.UndefOr[SwipeCallback] = js.native
  
  var onSwipedUp: js.UndefOr[SwipeCallback] = js.native
  
  var onSwiping: js.UndefOr[SwipeCallback] = js.native
  
  var onTap: js.UndefOr[TapCallback] = js.native
  
  var preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.native
  
  var rotationAngle: js.UndefOr[Double] = js.native
  
  var trackMouse: js.UndefOr[Boolean] = js.native
  
  var trackTouch: js.UndefOr[Boolean] = js.native
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
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelta: Self = this.set("delta", js.undefined)
    
    @scala.inline
    def setOnSwiped(value: /* eventData */ SwipeEventData => Unit): Self = this.set("onSwiped", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwiped: Self = this.set("onSwiped", js.undefined)
    
    @scala.inline
    def setOnSwipedDown(value: /* eventData */ SwipeEventData => Unit): Self = this.set("onSwipedDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwipedDown: Self = this.set("onSwipedDown", js.undefined)
    
    @scala.inline
    def setOnSwipedLeft(value: /* eventData */ SwipeEventData => Unit): Self = this.set("onSwipedLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwipedLeft: Self = this.set("onSwipedLeft", js.undefined)
    
    @scala.inline
    def setOnSwipedRight(value: /* eventData */ SwipeEventData => Unit): Self = this.set("onSwipedRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwipedRight: Self = this.set("onSwipedRight", js.undefined)
    
    @scala.inline
    def setOnSwipedUp(value: /* eventData */ SwipeEventData => Unit): Self = this.set("onSwipedUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwipedUp: Self = this.set("onSwipedUp", js.undefined)
    
    @scala.inline
    def setOnSwiping(value: /* eventData */ SwipeEventData => Unit): Self = this.set("onSwiping", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwiping: Self = this.set("onSwiping", js.undefined)
    
    @scala.inline
    def setOnTap(value: /* hasEvent */ Event => Unit): Self = this.set("onTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTap: Self = this.set("onTap", js.undefined)
    
    @scala.inline
    def setPreventDefaultTouchmoveEvent(value: Boolean): Self = this.set("preventDefaultTouchmoveEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDefaultTouchmoveEvent: Self = this.set("preventDefaultTouchmoveEvent", js.undefined)
    
    @scala.inline
    def setRotationAngle(value: Double): Self = this.set("rotationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationAngle: Self = this.set("rotationAngle", js.undefined)
    
    @scala.inline
    def setTrackMouse(value: Boolean): Self = this.set("trackMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackMouse: Self = this.set("trackMouse", js.undefined)
    
    @scala.inline
    def setTrackTouch(value: Boolean): Self = this.set("trackTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackTouch: Self = this.set("trackTouch", js.undefined)
  }
}
