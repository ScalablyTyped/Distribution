package typings
package reactDashDaumDashPostcodeLib.reactDashDaumDashPostcodeMod.DaumPostcodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var autoResize: js.UndefOr[scala.Boolean] = js.undefined
  var defaultQuery: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var onComplete: js.Any
  var scriptUrl: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var theme: js.UndefOr[js.Any] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    onComplete: js.Any,
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    autoResize: js.UndefOr[scala.Boolean] = js.undefined,
    defaultQuery: java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    scriptUrl: java.lang.String = null,
    style: js.Any = null,
    theme: js.Any = null,
    width: scala.Double | java.lang.String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onComplete")(onComplete)
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize)
    if (defaultQuery != null) __obj.updateDynamic("defaultQuery")(defaultQuery)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (scriptUrl != null) __obj.updateDynamic("scriptUrl")(scriptUrl)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

