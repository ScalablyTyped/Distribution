package typings.reactSpinners.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderHeightWidthRadiusProps extends LoaderHeightWidthProps {
  var margin: js.UndefOr[LengthType] = js.undefined
  var radius: js.UndefOr[LengthType] = js.undefined
}

object LoaderHeightWidthRadiusProps {
  @scala.inline
  def apply(
    color: String = null,
    css: String | PrecompiledCss = null,
    height: LengthType = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    margin: LengthType = null,
    radius: LengthType = null,
    width: LengthType = null
  ): LoaderHeightWidthRadiusProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderHeightWidthRadiusProps]
  }
}

