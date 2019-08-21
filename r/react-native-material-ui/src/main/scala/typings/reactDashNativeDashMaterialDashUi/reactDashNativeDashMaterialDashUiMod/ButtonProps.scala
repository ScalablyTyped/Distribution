package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashNativeDashMaterialDashUi.Anon_ContainerText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var accent: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String | Element] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var raised: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[Anon_ContainerText] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var text: String
  var upperCase: js.UndefOr[Boolean] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    text: String,
    accent: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: String | Element = null,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    raised: js.UndefOr[Boolean] = js.undefined,
    style: Anon_ContainerText = null,
    testID: String = null,
    upperCase: js.UndefOr[Boolean] = js.undefined
  ): ButtonProps = {
    val __obj = js.Dynamic.literal(text = text)
    if (!js.isUndefined(accent)) __obj.updateDynamic("accent")(accent)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised)
    if (style != null) __obj.updateDynamic("style")(style)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (!js.isUndefined(upperCase)) __obj.updateDynamic("upperCase")(upperCase)
    __obj.asInstanceOf[ButtonProps]
  }
}

