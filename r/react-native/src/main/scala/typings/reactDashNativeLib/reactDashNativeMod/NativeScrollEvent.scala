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

