package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var accent: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var raised: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_ContainerText] = js.undefined
  var text: java.lang.String
  var upperCase: js.UndefOr[scala.Boolean] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    text: java.lang.String,
    accent: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null,
    onLongPress: js.Function0[scala.Unit] = null,
    onPress: js.Function0[scala.Unit] = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    raised: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeDashMaterialDashUiLib.Anon_ContainerText = null,
    upperCase: js.UndefOr[scala.Boolean] = js.undefined
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    if (!js.isUndefined(accent)) __obj.updateDynamic("accent")(accent)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(onLongPress)
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(upperCase)) __obj.updateDynamic("upperCase")(upperCase)
    __obj.asInstanceOf[ButtonProps]
  }
}

