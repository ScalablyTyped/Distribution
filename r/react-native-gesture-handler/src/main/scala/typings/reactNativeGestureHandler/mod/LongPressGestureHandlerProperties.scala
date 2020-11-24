package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongPressGestureHandlerProperties extends GestureHandlerProperties {
  
  var maxDist: js.UndefOr[Double] = js.native
  
  var minDurationMs: js.UndefOr[Double] = js.native
  
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ LongPressGestureHandlerGestureEvent, Unit]] = js.native
  
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ LongPressGestureHandlerStateChangeEvent, Unit]] = js.native
}
object LongPressGestureHandlerProperties {
  
  @scala.inline
  def apply(): LongPressGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongPressGestureHandlerProperties]
  }
  
  @scala.inline
  implicit class LongPressGestureHandlerPropertiesOps[Self <: LongPressGestureHandlerProperties] (val x: Self) extends AnyVal {
    
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
    def setMaxDist(value: Double): Self = this.set("maxDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDist: Self = this.set("maxDist", js.undefined)
    
    @scala.inline
    def setMinDurationMs(value: Double): Self = this.set("minDurationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDurationMs: Self = this.set("minDurationMs", js.undefined)
    
    @scala.inline
    def setOnGestureEvent(value: /* event */ LongPressGestureHandlerGestureEvent => Unit): Self = this.set("onGestureEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGestureEvent: Self = this.set("onGestureEvent", js.undefined)
    
    @scala.inline
    def setOnHandlerStateChange(value: /* event */ LongPressGestureHandlerStateChangeEvent => Unit): Self = this.set("onHandlerStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHandlerStateChange: Self = this.set("onHandlerStateChange", js.undefined)
  }
}
