package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanGestureHandlerProperties extends GestureHandlerProperties {
  var activeOffsetX: js.UndefOr[Double | js.Array[Double]] = js.native
  var activeOffsetY: js.UndefOr[Double | js.Array[Double]] = js.native
  var avgTouches: js.UndefOr[Boolean] = js.native
  var failOffsetX: js.UndefOr[Double | js.Array[Double]] = js.native
  var failOffsetY: js.UndefOr[Double | js.Array[Double]] = js.native
  /** @deprecated  use failOffsetX*/
  var maxDeltaX: js.UndefOr[Double] = js.native
  /** @deprecated  use failOffsetY*/
  var maxDeltaY: js.UndefOr[Double] = js.native
  var maxPointers: js.UndefOr[Double] = js.native
  /** @deprecated  use activeOffsetX*/
  var minDeltaX: js.UndefOr[Double] = js.native
  /** @deprecated  use activeOffsetY*/
  var minDeltaY: js.UndefOr[Double] = js.native
  var minDist: js.UndefOr[Double] = js.native
  /** @deprecated  use activeOffsetX*/
  var minOffsetX: js.UndefOr[Double] = js.native
  /** @deprecated  use failOffsetY*/
  var minOffsetY: js.UndefOr[Double] = js.native
  var minPointers: js.UndefOr[Double] = js.native
  var minVelocity: js.UndefOr[Double] = js.native
  var minVelocityX: js.UndefOr[Double] = js.native
  var minVelocityY: js.UndefOr[Double] = js.native
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ PanGestureHandlerGestureEvent, Unit]] = js.native
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ PanGestureHandlerStateChangeEvent, Unit]] = js.native
}

object PanGestureHandlerProperties {
  @scala.inline
  def apply(): PanGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanGestureHandlerProperties]
  }
  @scala.inline
  implicit class PanGestureHandlerPropertiesOps[Self <: PanGestureHandlerProperties] (val x: Self) extends AnyVal {
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
    def setActiveOffsetXVarargs(value: Double*): Self = this.set("activeOffsetX", js.Array(value :_*))
    @scala.inline
    def setActiveOffsetX(value: Double | js.Array[Double]): Self = this.set("activeOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveOffsetX: Self = this.set("activeOffsetX", js.undefined)
    @scala.inline
    def setActiveOffsetYVarargs(value: Double*): Self = this.set("activeOffsetY", js.Array(value :_*))
    @scala.inline
    def setActiveOffsetY(value: Double | js.Array[Double]): Self = this.set("activeOffsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveOffsetY: Self = this.set("activeOffsetY", js.undefined)
    @scala.inline
    def setAvgTouches(value: Boolean): Self = this.set("avgTouches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvgTouches: Self = this.set("avgTouches", js.undefined)
    @scala.inline
    def setFailOffsetXVarargs(value: Double*): Self = this.set("failOffsetX", js.Array(value :_*))
    @scala.inline
    def setFailOffsetX(value: Double | js.Array[Double]): Self = this.set("failOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailOffsetX: Self = this.set("failOffsetX", js.undefined)
    @scala.inline
    def setFailOffsetYVarargs(value: Double*): Self = this.set("failOffsetY", js.Array(value :_*))
    @scala.inline
    def setFailOffsetY(value: Double | js.Array[Double]): Self = this.set("failOffsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailOffsetY: Self = this.set("failOffsetY", js.undefined)
    @scala.inline
    def setMaxDeltaX(value: Double): Self = this.set("maxDeltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDeltaX: Self = this.set("maxDeltaX", js.undefined)
    @scala.inline
    def setMaxDeltaY(value: Double): Self = this.set("maxDeltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDeltaY: Self = this.set("maxDeltaY", js.undefined)
    @scala.inline
    def setMaxPointers(value: Double): Self = this.set("maxPointers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPointers: Self = this.set("maxPointers", js.undefined)
    @scala.inline
    def setMinDeltaX(value: Double): Self = this.set("minDeltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDeltaX: Self = this.set("minDeltaX", js.undefined)
    @scala.inline
    def setMinDeltaY(value: Double): Self = this.set("minDeltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDeltaY: Self = this.set("minDeltaY", js.undefined)
    @scala.inline
    def setMinDist(value: Double): Self = this.set("minDist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDist: Self = this.set("minDist", js.undefined)
    @scala.inline
    def setMinOffsetX(value: Double): Self = this.set("minOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinOffsetX: Self = this.set("minOffsetX", js.undefined)
    @scala.inline
    def setMinOffsetY(value: Double): Self = this.set("minOffsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinOffsetY: Self = this.set("minOffsetY", js.undefined)
    @scala.inline
    def setMinPointers(value: Double): Self = this.set("minPointers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPointers: Self = this.set("minPointers", js.undefined)
    @scala.inline
    def setMinVelocity(value: Double): Self = this.set("minVelocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinVelocity: Self = this.set("minVelocity", js.undefined)
    @scala.inline
    def setMinVelocityX(value: Double): Self = this.set("minVelocityX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinVelocityX: Self = this.set("minVelocityX", js.undefined)
    @scala.inline
    def setMinVelocityY(value: Double): Self = this.set("minVelocityY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinVelocityY: Self = this.set("minVelocityY", js.undefined)
    @scala.inline
    def setOnGestureEvent(value: /* event */ PanGestureHandlerGestureEvent => Unit): Self = this.set("onGestureEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGestureEvent: Self = this.set("onGestureEvent", js.undefined)
    @scala.inline
    def setOnHandlerStateChange(value: /* event */ PanGestureHandlerStateChangeEvent => Unit): Self = this.set("onHandlerStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHandlerStateChange: Self = this.set("onHandlerStateChange", js.undefined)
  }
  
}

