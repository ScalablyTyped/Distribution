package typings.rcGesture.mod

import typings.rcGesture.rcGestureStrings.all
import typings.rcGesture.rcGestureStrings.horizontal
import typings.rcGesture.rcGestureStrings.vertical
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGesture extends js.Object {
  
  var direction: js.UndefOr[all | vertical | horizontal] = js.native
  
  var enablePinch: js.UndefOr[Boolean] = js.native
  
  var enableRotate: js.UndefOr[Boolean] = js.native
  
  var onPan: js.UndefOr[GestureHandler] = js.native
  
  var onPanCancel: js.UndefOr[GestureHandler] = js.native
  
  var onPanDown: js.UndefOr[GestureHandler] = js.native
  
  var onPanEnd: js.UndefOr[GestureHandler] = js.native
  
  var onPanLeft: js.UndefOr[GestureHandler] = js.native
  
  var onPanMove: js.UndefOr[GestureHandler] = js.native
  
  var onPanRight: js.UndefOr[GestureHandler] = js.native
  
  var onPanStart: js.UndefOr[GestureHandler] = js.native
  
  var onPanUp: js.UndefOr[GestureHandler] = js.native
  
  var onPinch: js.UndefOr[GestureHandler] = js.native
  
  var onPinchCancel: js.UndefOr[GestureHandler] = js.native
  
  var onPinchEnd: js.UndefOr[GestureHandler] = js.native
  
  var onPinchIn: js.UndefOr[GestureHandler] = js.native
  
  var onPinchMove: js.UndefOr[GestureHandler] = js.native
  
  var onPinchOut: js.UndefOr[GestureHandler] = js.native
  
  var onPinchStart: js.UndefOr[GestureHandler] = js.native
  
  var onPress: js.UndefOr[GestureHandler] = js.native
  
  var onPressUp: js.UndefOr[GestureHandler] = js.native
  
  var onRotate: js.UndefOr[GestureHandler] = js.native
  
  var onRotateCancel: js.UndefOr[GestureHandler] = js.native
  
  var onRotateEnd: js.UndefOr[GestureHandler] = js.native
  
  var onRotateMove: js.UndefOr[GestureHandler] = js.native
  
  var onRotateStart: js.UndefOr[GestureHandler] = js.native
  
  var onSwipe: js.UndefOr[GestureHandler] = js.native
  
  var onSwipeDown: js.UndefOr[GestureHandler] = js.native
  
  var onSwipeLeft: js.UndefOr[GestureHandler] = js.native
  
  var onSwipeRight: js.UndefOr[GestureHandler] = js.native
  
  var onSwipeUp: js.UndefOr[GestureHandler] = js.native
  
  var onTap: js.UndefOr[GestureHandler] = js.native
  
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
}
object IGesture {
  
  @scala.inline
  def apply(): IGesture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGesture]
  }
  
  @scala.inline
  implicit class IGestureOps[Self <: IGesture] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: all | vertical | horizontal): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setEnablePinch(value: Boolean): Self = this.set("enablePinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePinch: Self = this.set("enablePinch", js.undefined)
    
    @scala.inline
    def setEnableRotate(value: Boolean): Self = this.set("enableRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRotate: Self = this.set("enableRotate", js.undefined)
    
    @scala.inline
    def setOnPan(value: /* s */ IGestureStatus => Unit): Self = this.set("onPan", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPan: Self = this.set("onPan", js.undefined)
    
    @scala.inline
    def setOnPanCancel(value: /* s */ IGestureStatus => Unit): Self = this.set("onPanCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPanCancel: Self = this.set("onPanCancel", js.undefined)
    
    @scala.inline
    def setOnPanDown(value: /* s */ IGestureStatus => Unit): Self = this.set("onPanDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPanDown: Self = this.set("onPanDown", js.undefined)
    
    @scala.inline
    def setOnPanEnd(value: /* s */ IGestureStatus => Unit): Self = this.set("onPanEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPanEnd: Self = this.set("onPanEnd", js.undefined)
    
    @scala.inline
    def setOnPanLeft(value: /* s */ IGestureStatus => Unit): Self = this.set("onPanLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPanLeft: Self = this.set("onPanLeft", js.undefined)
    
    @scala.inline
    def setOnPanMove(value: /* s */ IGestureStatus => Unit): Self = this.set("onPanMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPanMove: Self = this.set("onPanMove", js.undefined)
    
    @scala.inline
    def setOnPanRight(value: /* s */ IGestureStatus => Unit): Self = this.set("onPanRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPanRight: Self = this.set("onPanRight", js.undefined)
    
    @scala.inline
    def setOnPanStart(value: /* s */ IGestureStatus => Unit): Self = this.set("onPanStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPanStart: Self = this.set("onPanStart", js.undefined)
    
    @scala.inline
    def setOnPanUp(value: /* s */ IGestureStatus => Unit): Self = this.set("onPanUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPanUp: Self = this.set("onPanUp", js.undefined)
    
    @scala.inline
    def setOnPinch(value: /* s */ IGestureStatus => Unit): Self = this.set("onPinch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPinch: Self = this.set("onPinch", js.undefined)
    
    @scala.inline
    def setOnPinchCancel(value: /* s */ IGestureStatus => Unit): Self = this.set("onPinchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPinchCancel: Self = this.set("onPinchCancel", js.undefined)
    
    @scala.inline
    def setOnPinchEnd(value: /* s */ IGestureStatus => Unit): Self = this.set("onPinchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPinchEnd: Self = this.set("onPinchEnd", js.undefined)
    
    @scala.inline
    def setOnPinchIn(value: /* s */ IGestureStatus => Unit): Self = this.set("onPinchIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPinchIn: Self = this.set("onPinchIn", js.undefined)
    
    @scala.inline
    def setOnPinchMove(value: /* s */ IGestureStatus => Unit): Self = this.set("onPinchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPinchMove: Self = this.set("onPinchMove", js.undefined)
    
    @scala.inline
    def setOnPinchOut(value: /* s */ IGestureStatus => Unit): Self = this.set("onPinchOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPinchOut: Self = this.set("onPinchOut", js.undefined)
    
    @scala.inline
    def setOnPinchStart(value: /* s */ IGestureStatus => Unit): Self = this.set("onPinchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPinchStart: Self = this.set("onPinchStart", js.undefined)
    
    @scala.inline
    def setOnPress(value: /* s */ IGestureStatus => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setOnPressUp(value: /* s */ IGestureStatus => Unit): Self = this.set("onPressUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPressUp: Self = this.set("onPressUp", js.undefined)
    
    @scala.inline
    def setOnRotate(value: /* s */ IGestureStatus => Unit): Self = this.set("onRotate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRotate: Self = this.set("onRotate", js.undefined)
    
    @scala.inline
    def setOnRotateCancel(value: /* s */ IGestureStatus => Unit): Self = this.set("onRotateCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRotateCancel: Self = this.set("onRotateCancel", js.undefined)
    
    @scala.inline
    def setOnRotateEnd(value: /* s */ IGestureStatus => Unit): Self = this.set("onRotateEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRotateEnd: Self = this.set("onRotateEnd", js.undefined)
    
    @scala.inline
    def setOnRotateMove(value: /* s */ IGestureStatus => Unit): Self = this.set("onRotateMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRotateMove: Self = this.set("onRotateMove", js.undefined)
    
    @scala.inline
    def setOnRotateStart(value: /* s */ IGestureStatus => Unit): Self = this.set("onRotateStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRotateStart: Self = this.set("onRotateStart", js.undefined)
    
    @scala.inline
    def setOnSwipe(value: /* s */ IGestureStatus => Unit): Self = this.set("onSwipe", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwipe: Self = this.set("onSwipe", js.undefined)
    
    @scala.inline
    def setOnSwipeDown(value: /* s */ IGestureStatus => Unit): Self = this.set("onSwipeDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwipeDown: Self = this.set("onSwipeDown", js.undefined)
    
    @scala.inline
    def setOnSwipeLeft(value: /* s */ IGestureStatus => Unit): Self = this.set("onSwipeLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwipeLeft: Self = this.set("onSwipeLeft", js.undefined)
    
    @scala.inline
    def setOnSwipeRight(value: /* s */ IGestureStatus => Unit): Self = this.set("onSwipeRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwipeRight: Self = this.set("onSwipeRight", js.undefined)
    
    @scala.inline
    def setOnSwipeUp(value: /* s */ IGestureStatus => Unit): Self = this.set("onSwipeUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwipeUp: Self = this.set("onSwipeUp", js.undefined)
    
    @scala.inline
    def setOnTap(value: /* s */ IGestureStatus => Unit): Self = this.set("onTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTap: Self = this.set("onTap", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: TouchEvent[HTMLElement] => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: TouchEvent[HTMLElement] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: TouchEvent[HTMLElement] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: TouchEvent[HTMLElement] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
  }
}
