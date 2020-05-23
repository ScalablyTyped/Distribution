package typings.reactNativeMaterialUi.mod

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
    size: js.UndefOr[Double] = js.undefined,
    style: js.UndefOr[Null | ViewStyle | js.Array[ViewStyle]] = js.undefined
  ): IconProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

