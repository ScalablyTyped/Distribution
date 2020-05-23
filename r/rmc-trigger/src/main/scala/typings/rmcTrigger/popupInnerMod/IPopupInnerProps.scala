package typings.rmcTrigger.popupInnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopupInnerProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var hiddenClassName: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IPopupInnerProps {
  @scala.inline
  def apply(
    className: String = null,
    hiddenClassName: String = null,
    prefixCls: String = null,
    style: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IPopupInnerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (hiddenClassName != null) __obj.updateDynamic("hiddenClassName")(hiddenClassName.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopupInnerProps]
  }
}

