package typings
package reactDashSpinnersLib.reactDashSpinnersMod.ReactSpinnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarLoaderProps extends CommonProps {
  var height: js.UndefOr[scala.Double] = js.undefined
  var heightUnit: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var widthUnit: js.UndefOr[java.lang.String] = js.undefined
}

object BarLoaderProps {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    css: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    heightUnit: java.lang.String = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    widthUnit: java.lang.String = null
  ): BarLoaderProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (css != null) __obj.updateDynamic("css")(css)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightUnit != null) __obj.updateDynamic("heightUnit")(heightUnit)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (widthUnit != null) __obj.updateDynamic("widthUnit")(widthUnit)
    __obj.asInstanceOf[BarLoaderProps]
  }
}

