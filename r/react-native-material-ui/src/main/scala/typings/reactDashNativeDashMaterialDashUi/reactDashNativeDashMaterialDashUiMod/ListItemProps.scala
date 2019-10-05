package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod.Global.JSX.Element
import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiNumbers.`1`
import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiNumbers.`2`
import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiNumbers.`3`
import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiStrings.dynamic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps extends js.Object {
  var centerElement: Element | String | ListItemCenterElement
  var dense: js.UndefOr[Boolean] = js.undefined
  var divider: js.UndefOr[Boolean] = js.undefined
  var leftElement: js.UndefOr[Element | String] = js.undefined
  var numberOfLines: js.UndefOr[`1` | `2` | `3` | dynamic] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressValue: js.UndefOr[js.Any] = js.undefined
  var onRightElementPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var rightElement: js.UndefOr[Element | String] = js.undefined
  var style: js.UndefOr[ListItemStyle] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    centerElement: Element | String | ListItemCenterElement,
    dense: js.UndefOr[Boolean] = js.undefined,
    divider: js.UndefOr[Boolean] = js.undefined,
    leftElement: Element | String = null,
    numberOfLines: `1` | `2` | `3` | dynamic = null,
    onPress: () => Unit = null,
    onPressValue: js.Any = null,
    onRightElementPress: () => Unit = null,
    rightElement: Element | String = null,
    style: ListItemStyle = null,
    testID: String = null
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
    if (testID != null) __obj.updateDynamic("testID")(testID)
    __obj.asInstanceOf[ListItemProps]
  }
}

