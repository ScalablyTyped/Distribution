package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashNativeDashMaterialDashUi.Anon_ContainerIconViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconToggleProps extends js.Object {
  var children: js.UndefOr[Element] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var maxOpacity: js.UndefOr[Double] = js.undefined
  var name: String
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[Anon_ContainerIconViewStyle] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var underlayColor: js.UndefOr[String] = js.undefined
}

object IconToggleProps {
  @scala.inline
  def apply(
    name: String,
    children: Element = null,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    maxOpacity: Int | Double = null,
    onPress: () => Unit = null,
    percent: Int | Double = null,
    size: Int | Double = null,
    style: Anon_ContainerIconViewStyle = null,
    testID: String = null,
    underlayColor: String = null
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
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor)
    __obj.asInstanceOf[IconToggleProps]
  }
}

