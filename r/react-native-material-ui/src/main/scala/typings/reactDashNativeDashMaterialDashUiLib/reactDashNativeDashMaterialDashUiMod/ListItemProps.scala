package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps extends js.Object {
  var centerElement: reactLib.reactMod.Global.JSXNs.Element | java.lang.String | ListItemCenterElement
  var dense: js.UndefOr[scala.Boolean] = js.undefined
  var divider: js.UndefOr[scala.Boolean] = js.undefined
  var leftElement: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element | java.lang.String] = js.undefined
  var numberOfLines: js.UndefOr[
    reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibNumbers.`1` | reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibNumbers.`2` | reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibNumbers.`3` | reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.dynamic
  ] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPressValue: js.UndefOr[js.Any] = js.undefined
  var onRightElementPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var rightElement: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element | java.lang.String] = js.undefined
  var style: js.UndefOr[ListItemStyle] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    centerElement: reactLib.reactMod.Global.JSXNs.Element | java.lang.String | ListItemCenterElement,
    dense: js.UndefOr[scala.Boolean] = js.undefined,
    divider: js.UndefOr[scala.Boolean] = js.undefined,
    leftElement: reactLib.reactMod.Global.JSXNs.Element | java.lang.String = null,
    numberOfLines: reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibNumbers.`1` | reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibNumbers.`2` | reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibNumbers.`3` | reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.dynamic = null,
    onPress: () => scala.Unit = null,
    onPressValue: js.Any = null,
    onRightElementPress: () => scala.Unit = null,
    rightElement: reactLib.reactMod.Global.JSXNs.Element | java.lang.String = null,
    style: ListItemStyle = null
  ): ListItemProps = {
    val __obj = js.Dynamic.literal(centerElement = centerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(dense)) __obj.updateDynamic("dense")(dense)
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider)
    if (leftElement != null) __obj.updateDynamic("leftElement")(leftElement.asInstanceOf[js.Any])
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (onPressValue != null) __obj.updateDynamic("onPressValue")(onPressValue)
    if (onRightElementPress != null) __obj.updateDynamic("onRightElementPress")(js.Any.fromFunction0(onRightElementPress))
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ListItemProps]
  }
}

