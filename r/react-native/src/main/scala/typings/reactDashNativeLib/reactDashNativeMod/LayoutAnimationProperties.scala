package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutAnimationProperties extends js.Object {
  var opacity: java.lang.String
  var scaleXY: java.lang.String
}

object LayoutAnimationProperties {
  @scala.inline
  def apply(opacity: java.lang.String, scaleXY: java.lang.String): LayoutAnimationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("opacity")(opacity)
    __obj.updateDynamic("scaleXY")(scaleXY)
    __obj.asInstanceOf[LayoutAnimationProperties]
  }
}

