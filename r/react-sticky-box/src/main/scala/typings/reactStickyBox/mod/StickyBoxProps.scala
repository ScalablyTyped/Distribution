package typings.reactStickyBox.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
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
    offsetBottom: js.UndefOr[Double] = js.undefined,
    offsetTop: js.UndefOr[Double] = js.undefined,
    onChangeMode: (/* oldMode */ js.UndefOr[StickyBoxMode], /* newMode */ StickyBoxMode) => _ = null,
    style: CSSProperties = null
  ): StickyBoxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetBottom)) __obj.updateDynamic("offsetBottom")(offsetBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetTop)) __obj.updateDynamic("offsetTop")(offsetTop.get.asInstanceOf[js.Any])
    if (onChangeMode != null) __obj.updateDynamic("onChangeMode")(js.Any.fromFunction2(onChangeMode))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyBoxProps]
  }
}

