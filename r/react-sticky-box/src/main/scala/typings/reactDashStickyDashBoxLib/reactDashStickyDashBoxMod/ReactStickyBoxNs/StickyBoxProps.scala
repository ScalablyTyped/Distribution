package typings
package reactDashStickyDashBoxLib.reactDashStickyDashBoxMod.ReactStickyBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyBoxProps extends js.Object {
  var bottom: js.UndefOr[scala.Boolean] = js.undefined
  var offsetBottom: js.UndefOr[scala.Double] = js.undefined
  var offsetTop: js.UndefOr[scala.Double] = js.undefined
  var onChangeMode: js.UndefOr[
    js.Function2[/* oldMode */ StickyBoxMode, /* newMode */ StickyBoxMode, scala.Unit]
  ] = js.undefined
}

object StickyBoxProps {
  @scala.inline
  def apply(
    bottom: js.UndefOr[scala.Boolean] = js.undefined,
    offsetBottom: scala.Int | scala.Double = null,
    offsetTop: scala.Int | scala.Double = null,
    onChangeMode: (/* oldMode */ StickyBoxMode, /* newMode */ StickyBoxMode) => scala.Unit = null
  ): StickyBoxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom)
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onChangeMode != null) __obj.updateDynamic("onChangeMode")(js.Any.fromFunction2(onChangeMode))
    __obj.asInstanceOf[StickyBoxProps]
  }
}

