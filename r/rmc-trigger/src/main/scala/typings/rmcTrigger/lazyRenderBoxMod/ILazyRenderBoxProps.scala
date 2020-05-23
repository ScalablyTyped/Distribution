package typings.rmcTrigger.lazyRenderBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILazyRenderBoxProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var hiddenClassName: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ILazyRenderBoxProps {
  @scala.inline
  def apply(
    className: String = null,
    hiddenClassName: String = null,
    style: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ILazyRenderBoxProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (hiddenClassName != null) __obj.updateDynamic("hiddenClassName")(hiddenClassName.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILazyRenderBoxProps]
  }
}

