package typings.reactDashDaumDashPostcode.reactDashDaumDashPostcodeMod.DaumPostcodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var animation: js.UndefOr[Boolean] = js.undefined
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var autoResize: js.UndefOr[Boolean] = js.undefined
  var defaultQuery: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var onComplete: js.Any
  var scriptUrl: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var theme: js.UndefOr[js.Any] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    onComplete: js.Any,
    animation: js.UndefOr[Boolean] = js.undefined,
    autoClose: js.UndefOr[Boolean] = js.undefined,
    autoResize: js.UndefOr[Boolean] = js.undefined,
    defaultQuery: String = null,
    height: Double | String = null,
    scriptUrl: String = null,
    style: js.Any = null,
    theme: js.Any = null,
    width: Double | String = null
  ): Props = {
    val __obj = js.Dynamic.literal(onComplete = onComplete)
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

