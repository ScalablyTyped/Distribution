package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TapGestureHandlerProperties extends GestureHandlerProperties {
  var maxDelayMs: js.UndefOr[Double] = js.native
  var maxDeltaX: js.UndefOr[Double] = js.native
  var maxDeltaY: js.UndefOr[Double] = js.native
  var maxDist: js.UndefOr[Double] = js.native
  var maxDurationMs: js.UndefOr[Double] = js.native
  var minPointers: js.UndefOr[Double] = js.native
  var numberOfTaps: js.UndefOr[Double] = js.native
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ TapGestureHandlerGestureEvent, Unit]] = js.native
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ TapGestureHandlerStateChangeEvent, Unit]] = js.native
}

object TapGestureHandlerProperties {
  @scala.inline
  def apply(): TapGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapGestureHandlerProperties]
  }
  @scala.inline
  implicit class TapGestureHandlerPropertiesOps[Self <: TapGestureHandlerProperties] (val x: Self) extends AnyVal {
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
    def setMaxDelayMs(value: Double): Self = this.set("maxDelayMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDelayMs: Self = this.set("maxDelayMs", js.undefined)
    @scala.inline
    def setMaxDeltaX(value: Double): Self = this.set("maxDeltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDeltaX: Self = this.set("maxDeltaX", js.undefined)
    @scala.inline
    def setMaxDeltaY(value: Double): Self = this.set("maxDeltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDeltaY: Self = this.set("maxDeltaY", js.undefined)
    @scala.inline
    def setMaxDist(value: Double): Self = this.set("maxDist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDist: Self = this.set("maxDist", js.undefined)
    @scala.inline
    def setMaxDurationMs(value: Double): Self = this.set("maxDurationMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDurationMs: Self = this.set("maxDurationMs", js.undefined)
    @scala.inline
    def setMinPointers(value: Double): Self = this.set("minPointers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPointers: Self = this.set("minPointers", js.undefined)
    @scala.inline
    def setNumberOfTaps(value: Double): Self = this.set("numberOfTaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfTaps: Self = this.set("numberOfTaps", js.undefined)
    @scala.inline
    def setOnGestureEvent(value: /* event */ TapGestureHandlerGestureEvent => Unit): Self = this.set("onGestureEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGestureEvent: Self = this.set("onGestureEvent", js.undefined)
    @scala.inline
    def setOnHandlerStateChange(value: /* event */ TapGestureHandlerStateChangeEvent => Unit): Self = this.set("onHandlerStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHandlerStateChange: Self = this.set("onHandlerStateChange", js.undefined)
  }
  
}

