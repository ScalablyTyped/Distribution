package typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardImageStyle extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var resizeMode: js.UndefOr[String] = js.undefined
}

object CardImageStyle {
  @scala.inline
  def apply(height: Int | Double = null, resizeMode: String = null): CardImageStyle = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardImageStyle]
  }
}

