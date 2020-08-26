package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlingGestureHandlerProperties extends GestureHandlerProperties {
  var direction: js.UndefOr[Double] = js.native
  var numberOfPointers: js.UndefOr[Double] = js.native
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ FlingGestureHandlerGestureEvent, Unit]] = js.native
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ FlingGestureHandlerStateChangeEvent, Unit]] = js.native
}

object FlingGestureHandlerProperties {
  @scala.inline
  def apply(): FlingGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlingGestureHandlerProperties]
  }
  @scala.inline
  implicit class FlingGestureHandlerPropertiesOps[Self <: FlingGestureHandlerProperties] (val x: Self) extends AnyVal {
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
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setNumberOfPointers(value: Double): Self = this.set("numberOfPointers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfPointers: Self = this.set("numberOfPointers", js.undefined)
    @scala.inline
    def setOnGestureEvent(value: /* event */ FlingGestureHandlerGestureEvent => Unit): Self = this.set("onGestureEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGestureEvent: Self = this.set("onGestureEvent", js.undefined)
    @scala.inline
    def setOnHandlerStateChange(value: /* event */ FlingGestureHandlerStateChangeEvent => Unit): Self = this.set("onHandlerStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHandlerStateChange: Self = this.set("onHandlerStateChange", js.undefined)
  }
  
}

