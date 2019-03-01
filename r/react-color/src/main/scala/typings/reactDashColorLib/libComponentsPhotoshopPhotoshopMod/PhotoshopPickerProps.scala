package typings
package reactDashColorLib.libComponentsPhotoshopPhotoshopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoshopPickerProps
  extends reactDashColorLib.reactDashColorMod.ColorPickerProps[PhotoshopPicker] {
  var header: js.UndefOr[java.lang.String] = js.undefined
  var onAccept: js.UndefOr[reactDashColorLib.reactDashColorMod.ColorChangeHandler] = js.undefined
  var onCancel: js.UndefOr[reactDashColorLib.reactDashColorMod.ColorChangeHandler] = js.undefined
}

object PhotoshopPickerProps {
  @scala.inline
  def apply(
    color: reactDashColorLib.reactDashColorMod.Color = null,
    header: java.lang.String = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    onAccept: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    onCancel: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    onChange: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    onChangeComplete: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[PhotoshopPicker] = null
  ): PhotoshopPickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onAccept != null) __obj.updateDynamic("onAccept")(onAccept)
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(onChangeComplete)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoshopPickerProps]
  }
}

