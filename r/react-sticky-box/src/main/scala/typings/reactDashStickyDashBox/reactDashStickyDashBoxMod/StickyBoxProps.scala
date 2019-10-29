package typings.reactDashStickyDashBox.reactDashStickyDashBoxMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyBoxProps extends js.Object {
  var bottom: js.UndefOr[Boolean] = js.undefined
  var children: ReactNode
  var className: js.UndefOr[String] = js.undefined
  var offsetBottom: js.UndefOr[Double] = js.undefined
  var offsetTop: js.UndefOr[Double] = js.undefined
  var onChangeMode: js.UndefOr[
    js.Function2[/* oldMode */ js.UndefOr[StickyBoxMode], /* newMode */ StickyBoxMode, _]
  ] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object StickyBoxProps {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    offsetBottom: Int | Double = null,
    offsetTop: Int | Double = null,
    onChangeMode: (/* oldMode */ js.UndefOr[StickyBoxMode], /* newMode */ StickyBoxMode) => _ = null,
    style: CSSProperties = null
  ): StickyBoxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onChangeMode != null) __obj.updateDynamic("onChangeMode")(js.Any.fromFunction2(onChangeMode))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[StickyBoxProps]
  }
}

