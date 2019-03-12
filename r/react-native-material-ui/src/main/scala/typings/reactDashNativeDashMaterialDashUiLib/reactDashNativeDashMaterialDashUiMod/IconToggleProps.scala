package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconToggleProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var maxOpacity: js.UndefOr[scala.Double] = js.undefined
  var name: java.lang.String
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var percent: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_ContainerIconViewStyle] = js.undefined
  var underlayColor: js.UndefOr[java.lang.String] = js.undefined
}

object IconToggleProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    children: reactLib.reactMod.Global.JSXNs.Element = null,
    color: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    maxOpacity: scala.Int | scala.Double = null,
    onPress: () => scala.Unit = null,
    percent: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    style: reactDashNativeDashMaterialDashUiLib.Anon_ContainerIconViewStyle = null,
    underlayColor: java.lang.String = null
  ): IconToggleProps = {
    val __obj = js.Dynamic.literal(name = name)
    if (children != null) __obj.updateDynamic("children")(children)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (maxOpacity != null) __obj.updateDynamic("maxOpacity")(maxOpacity.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor)
    __obj.asInstanceOf[IconToggleProps]
  }
}

