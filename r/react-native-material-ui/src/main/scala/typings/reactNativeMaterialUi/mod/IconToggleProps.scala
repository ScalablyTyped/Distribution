package typings.reactNativeMaterialUi.mod

import typings.react.mod._Global_.JSX.Element
import typings.reactNativeMaterialUi.AnonContainerIcon
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
  var style: js.UndefOr[AnonContainerIcon] = js.undefined
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
    style: AnonContainerIcon = null,
    testID: String = null,
    underlayColor: String = null
  ): IconToggleProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (maxOpacity != null) __obj.updateDynamic("maxOpacity")(maxOpacity.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconToggleProps]
  }
}

