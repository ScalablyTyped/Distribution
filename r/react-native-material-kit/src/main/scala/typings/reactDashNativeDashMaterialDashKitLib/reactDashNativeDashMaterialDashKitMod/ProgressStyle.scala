package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressStyle extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var bufferColor: js.UndefOr[java.lang.String] = js.undefined
  var progressColor: js.UndefOr[java.lang.String] = js.undefined
}

object ProgressStyle {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    bufferColor: java.lang.String = null,
    progressColor: java.lang.String = null
  ): ProgressStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (bufferColor != null) __obj.updateDynamic("bufferColor")(bufferColor)
    if (progressColor != null) __obj.updateDynamic("progressColor")(progressColor)
    __obj.asInstanceOf[ProgressStyle]
  }
}

