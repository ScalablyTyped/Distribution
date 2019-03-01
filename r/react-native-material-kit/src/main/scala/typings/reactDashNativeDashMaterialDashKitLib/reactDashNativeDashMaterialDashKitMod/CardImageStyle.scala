package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardImageStyle extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var resizeMode: js.UndefOr[java.lang.String] = js.undefined
}

object CardImageStyle {
  @scala.inline
  def apply(height: scala.Int | scala.Double = null, resizeMode: java.lang.String = null): CardImageStyle = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode)
    __obj.asInstanceOf[CardImageStyle]
  }
}

