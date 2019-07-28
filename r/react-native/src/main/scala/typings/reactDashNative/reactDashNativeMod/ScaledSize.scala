package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaledSize extends js.Object {
  var fontScale: Double
  var height: Double
  var scale: Double
  var width: Double
}

object ScaledSize {
  @scala.inline
  def apply(fontScale: Double, height: Double, scale: Double, width: Double): ScaledSize = {
    val __obj = js.Dynamic.literal(fontScale = fontScale, height = height, scale = scale, width = width)
  
    __obj.asInstanceOf[ScaledSize]
  }
}

