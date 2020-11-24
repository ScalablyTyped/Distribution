package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeViewGestureHandlerProperties extends GestureHandlerProperties {
  
  var disallowInterruption: js.UndefOr[Boolean] = js.native
  
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ NativeViewGestureHandlerGestureEvent, Unit]] = js.native
  
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ NativeViewGestureHandlerStateChangeEvent, Unit]] = js.native
  
  var shouldActivateOnStart: js.UndefOr[Boolean] = js.native
}
object NativeViewGestureHandlerProperties {
  
  @scala.inline
  def apply(): NativeViewGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeViewGestureHandlerProperties]
  }
  
  @scala.inline
  implicit class NativeViewGestureHandlerPropertiesOps[Self <: NativeViewGestureHandlerProperties] (val x: Self) extends AnyVal {
    
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
    def setDisallowInterruption(value: Boolean): Self = this.set("disallowInterruption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisallowInterruption: Self = this.set("disallowInterruption", js.undefined)
    
    @scala.inline
    def setOnGestureEvent(value: /* event */ NativeViewGestureHandlerGestureEvent => Unit): Self = this.set("onGestureEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGestureEvent: Self = this.set("onGestureEvent", js.undefined)
    
    @scala.inline
    def setOnHandlerStateChange(value: /* event */ NativeViewGestureHandlerStateChangeEvent => Unit): Self = this.set("onHandlerStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHandlerStateChange: Self = this.set("onHandlerStateChange", js.undefined)
    
    @scala.inline
    def setShouldActivateOnStart(value: Boolean): Self = this.set("shouldActivateOnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldActivateOnStart: Self = this.set("shouldActivateOnStart", js.undefined)
  }
}
