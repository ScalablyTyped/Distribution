package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNativeMaterialUi.anon.ContainerIcon
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
  var style: js.UndefOr[ContainerIcon] = js.undefined
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
    maxOpacity: js.UndefOr[Double] = js.undefined,
    onPress: () => Unit = null,
    percent: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    style: ContainerIcon = null,
    testID: String = null,
    underlayColor: String = null
  ): IconToggleProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxOpacity)) __obj.updateDynamic("maxOpacity")(maxOpacity.get.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconToggleProps]
  }
}

