package typings
package reactDashSpinnersLib.reactDashSpinnersMod.ReactSpinnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FadeLoaderProps extends CommonProps {
  var height: js.UndefOr[scala.Double] = js.undefined
  var heightUnit: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[java.lang.String] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var widthUnit: js.UndefOr[java.lang.String] = js.undefined
}

object FadeLoaderProps {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    css: java.lang.String | PrecompiledCss = null,
    height: scala.Int | scala.Double = null,
    heightUnit: java.lang.String = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    margin: java.lang.String = null,
    radius: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    widthUnit: java.lang.String = null
  ): FadeLoaderProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightUnit != null) __obj.updateDynamic("heightUnit")(heightUnit)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (widthUnit != null) __obj.updateDynamic("widthUnit")(widthUnit)
    __obj.asInstanceOf[FadeLoaderProps]
  }
}

