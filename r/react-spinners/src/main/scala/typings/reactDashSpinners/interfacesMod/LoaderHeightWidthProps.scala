package typings.reactDashSpinners.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderHeightWidthProps extends CommonProps {
  var height: js.UndefOr[Double] = js.undefined
  var heightUnit: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var widthUnit: js.UndefOr[String] = js.undefined
}

object LoaderHeightWidthProps {
  @scala.inline
  def apply(
    color: String = null,
    css: String | PrecompiledCss = null,
    height: Int | Double = null,
    heightUnit: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    widthUnit: String = null
  ): LoaderHeightWidthProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightUnit != null) __obj.updateDynamic("heightUnit")(heightUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (widthUnit != null) __obj.updateDynamic("widthUnit")(widthUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderHeightWidthProps]
  }
}

