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
    val __obj = js.Dynamic.literal(contentInset = contentInset, contentOffset = contentOffset, contentSize = contentSize, layoutMeasurement = layoutMeasurement, zoomScale = zoomScale)
    if (velocity != null) __obj.updateDynamic("velocity")(velocity)
    __obj.asInstanceOf[NativeScrollEvent]
  }
}

