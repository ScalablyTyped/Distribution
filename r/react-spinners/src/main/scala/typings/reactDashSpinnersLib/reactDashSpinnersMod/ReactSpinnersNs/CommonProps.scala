package typings
package reactDashSpinnersLib.reactDashSpinnersMod.ReactSpinnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonProps extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var css: js.UndefOr[java.lang.String | PrecompiledCss] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
}

object CommonProps {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    css: java.lang.String | PrecompiledCss = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined
  ): CommonProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    __obj.asInstanceOf[CommonProps]
  }
}

