package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var name: String
  var size: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[ViewStyle | js.Array[ViewStyle]] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    name: String,
    color: String = null,
    size: Int | Double = null,
    style: ViewStyle | js.Array[ViewStyle] = null
  ): IconProps = {
    val __obj = js.Dynamic.literal(name = name)
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

