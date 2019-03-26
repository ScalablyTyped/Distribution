package typings
package reactDashSpinnersLib.reactDashSpinnersMod.ReactSpinnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipLoaderProps extends CommonProps {
  var size: js.UndefOr[scala.Double] = js.undefined
  var sizeUnit: js.UndefOr[java.lang.String] = js.undefined
}

object ClipLoaderProps {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    css: java.lang.String = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    sizeUnit: java.lang.String = null
  ): ClipLoaderProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (css != null) __obj.updateDynamic("css")(css)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizeUnit != null) __obj.updateDynamic("sizeUnit")(sizeUnit)
    __obj.asInstanceOf[ClipLoaderProps]
  }
}

