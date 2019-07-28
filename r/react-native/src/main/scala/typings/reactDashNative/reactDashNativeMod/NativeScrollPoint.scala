package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeScrollPoint extends js.Object {
  var x: Double
  var y: Double
}

object NativeScrollPoint {
  @scala.inline
  def apply(x: Double, y: Double): NativeScrollPoint = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[NativeScrollPoint]
  }
}

