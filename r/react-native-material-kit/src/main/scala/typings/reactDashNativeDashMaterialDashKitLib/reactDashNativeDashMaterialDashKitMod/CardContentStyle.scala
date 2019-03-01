package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardContentStyle extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
}

object CardContentStyle {
  @scala.inline
  def apply(color: java.lang.String = null, padding: scala.Int | scala.Double = null): CardContentStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardContentStyle]
  }
}

