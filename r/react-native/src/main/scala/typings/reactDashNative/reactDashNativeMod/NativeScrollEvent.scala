package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeScrollEvent extends js.Object {
  var contentInset: NativeScrollRectangle
  var contentOffset: NativeScrollPoint
  var contentSize: NativeScrollSize
  var layoutMeasurement: NativeScrollSize
  var velocity: js.UndefOr[NativeScrollVelocity] = js.undefined
  var zoomScale: Double
}

object NativeScrollEvent {
  @scala.inline
  def apply(
    contentInset: NativeScrollRectangle,
    contentOffset: NativeScrollPoint,
    contentSize: NativeScrollSize,
    layoutMeasurement: NativeScrollSize,
    zoomScale: Double,
    velocity: NativeScrollVelocity = null
  ): NativeScrollEvent = {
    val __obj = js.Dynamic.literal(contentInset = contentInset.asInstanceOf[js.Any], contentOffset = contentOffset.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], layoutMeasurement = layoutMeasurement.asInstanceOf[js.Any], zoomScale = zoomScale.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeScrollEvent]
  }
}

