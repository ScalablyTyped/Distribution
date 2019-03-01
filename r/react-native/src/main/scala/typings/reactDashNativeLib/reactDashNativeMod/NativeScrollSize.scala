package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeScrollSize extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object NativeScrollSize {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): NativeScrollSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[NativeScrollSize]
  }
}

