package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotationGestureHandlerProperties extends GestureHandlerProperties {
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ RotationGestureHandlerGestureEvent, Unit]] = js.native
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ RotationGestureHandlerStateChangeEvent, Unit]] = js.native
}

object RotationGestureHandlerProperties {
  @scala.inline
  def apply(): RotationGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationGestureHandlerProperties]
  }
  @scala.inline
  implicit class RotationGestureHandlerPropertiesOps[Self <: RotationGestureHandlerProperties] (val x: Self) extends AnyVal {
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
    def setOnGestureEvent(value: /* event */ RotationGestureHandlerGestureEvent => Unit): Self = this.set("onGestureEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGestureEvent: Self = this.set("onGestureEvent", js.undefined)
    @scala.inline
    def setOnHandlerStateChange(value: /* event */ RotationGestureHandlerStateChangeEvent => Unit): Self = this.set("onHandlerStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHandlerStateChange: Self = this.set("onHandlerStateChange", js.undefined)
  }
  
}

