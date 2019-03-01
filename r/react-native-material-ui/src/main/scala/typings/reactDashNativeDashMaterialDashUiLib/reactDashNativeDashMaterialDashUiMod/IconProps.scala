package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var size: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[ViewStyle | js.Array[ViewStyle]] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    color: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    style: ViewStyle | js.Array[ViewStyle] = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

