package typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressStyle extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var bufferColor: js.UndefOr[String] = js.undefined
  var progressColor: js.UndefOr[String] = js.undefined
}

object ProgressStyle {
  @scala.inline
  def apply(backgroundColor: String = null, bufferColor: String = null, progressColor: String = null): ProgressStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bufferColor != null) __obj.updateDynamic("bufferColor")(bufferColor.asInstanceOf[js.Any])
    if (progressColor != null) __obj.updateDynamic("progressColor")(progressColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressStyle]
  }
}

