package typings.reactDashSpinners.reactDashSpinnersMod.ReactSpinnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RingLoaderProps extends CommonProps {
  var margin: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var sizeUnit: js.UndefOr[String] = js.undefined
}

object RingLoaderProps {
  @scala.inline
  def apply(
    color: String = null,
    css: String | PrecompiledCss = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    margin: String = null,
    size: Int | Double = null,
    sizeUnit: String = null
  ): RingLoaderProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizeUnit != null) __obj.updateDynamic("sizeUnit")(sizeUnit)
    __obj.asInstanceOf[RingLoaderProps]
  }
}

