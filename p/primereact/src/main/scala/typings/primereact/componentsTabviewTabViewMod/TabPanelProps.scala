package typings.primereact.componentsTabviewTabViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabPanelProps extends js.Object {
  var contentClassName: js.UndefOr[String] = js.undefined
  var contentStyle: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var headerClassName: js.UndefOr[String] = js.undefined
  var headerStyle: js.UndefOr[js.Any] = js.undefined
  var leftIcon: js.UndefOr[String] = js.undefined
  var rightIcon: js.UndefOr[String] = js.undefined
}

object TabPanelProps {
  @scala.inline
  def apply(
    contentClassName: String = null,
    contentStyle: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    header: String = null,
    headerClassName: String = null,
    headerStyle: js.Any = null,
    leftIcon: String = null,
    rightIcon: String = null
  ): TabPanelProps = {
    val __obj = js.Dynamic.literal()
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabPanelProps]
  }
}

