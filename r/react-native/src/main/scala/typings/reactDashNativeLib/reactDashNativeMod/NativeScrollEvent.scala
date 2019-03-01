package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeScrollEvent extends js.Object {
  var contentInset: NativeScrollRectangle
  var contentOffset: NativeScrollPoint
  var contentSize: NativeScrollSize
  var layoutMeasurement: NativeScrollSize
  var velocity: js.UndefOr[NativeScrollVelocity] = js.undefined
  var zoomScale: scala.Double
}

object NativeScrollEvent {
  @scala.inline
  def apply(
    contentInset: NativeScrollRectangle,
    contentOffset: NativeScrollPoint,
    contentSize: NativeScrollSize,
    layoutMeasurement: NativeScrollSize,
    zoomScale: scala.Double,
    velocity: NativeScrollVelocity = null
  ): NativeScrollEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentInset")(contentInset)
    __obj.updateDynamic("contentOffset")(contentOffset)
    __obj.updateDynamic("contentSize")(contentSize)
    __obj.updateDynamic("layoutMeasurement")(layoutMeasurement)
    __obj.updateDynamic("zoomScale")(zoomScale)
    if (velocity != null) __obj.updateDynamic("velocity")(velocity)
    __obj.asInstanceOf[NativeScrollEvent]
  }
}

