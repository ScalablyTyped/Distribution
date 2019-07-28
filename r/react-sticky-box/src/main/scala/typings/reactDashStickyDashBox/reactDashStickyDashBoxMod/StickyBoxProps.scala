package typings.reactDashStickyDashBox.reactDashStickyDashBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyBoxProps extends js.Object {
  var bottom: js.UndefOr[Boolean] = js.undefined
  var offsetBottom: js.UndefOr[Double] = js.undefined
  var offsetTop: js.UndefOr[Double] = js.undefined
  var onChangeMode: js.UndefOr[js.Function2[/* oldMode */ StickyBoxMode, /* newMode */ StickyBoxMode, Unit]] = js.undefined
}

object StickyBoxProps {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Boolean] = js.undefined,
    offsetBottom: Int | Double = null,
    offsetTop: Int | Double = null,
    onChangeMode: (/* oldMode */ StickyBoxMode, /* newMode */ StickyBoxMode) => Unit = null
  ): StickyBoxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom)
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onChangeMode != null) __obj.updateDynamic("onChangeMode")(js.Any.fromFunction2(onChangeMode))
    __obj.asInstanceOf[StickyBoxProps]
  }
}

