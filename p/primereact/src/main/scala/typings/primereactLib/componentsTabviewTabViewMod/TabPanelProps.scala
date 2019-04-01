package typings
package primereactLib.componentsTabviewTabViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabPanelProps extends js.Object {
  var contentClassName: js.UndefOr[java.lang.String] = js.undefined
  var contentStyle: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  var headerClassName: js.UndefOr[java.lang.String] = js.undefined
  var headerStyle: js.UndefOr[js.Any] = js.undefined
  var leftIcon: js.UndefOr[java.lang.String] = js.undefined
  var rightIcon: js.UndefOr[java.lang.String] = js.undefined
}

object TabPanelProps {
  @scala.inline
  def apply(
    contentClassName: java.lang.String = null,
    contentStyle: js.Any = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    header: java.lang.String = null,
    headerClassName: java.lang.String = null,
    headerStyle: js.Any = null,
    leftIcon: java.lang.String = null,
    rightIcon: java.lang.String = null
  ): TabPanelProps = {
    val __obj = js.Dynamic.literal()
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (header != null) __obj.updateDynamic("header")(header)
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName)
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle)
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon)
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon)
    __obj.asInstanceOf[TabPanelProps]
  }
}

