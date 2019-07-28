package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeScrollRectangle extends js.Object {
  var bottom: Double
  var left: Double
  var right: Double
  var top: Double
}

object NativeScrollRectangle {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): NativeScrollRectangle = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[NativeScrollRectangle]
  }
}

