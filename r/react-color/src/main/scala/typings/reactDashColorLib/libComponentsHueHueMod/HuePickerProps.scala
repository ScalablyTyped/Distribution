package typings
package reactDashColorLib.libComponentsHueHueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HuePickerProps
  extends reactDashColorLib.reactDashColorMod.ColorPickerProps[HuePicker] {
  var height: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object HuePickerProps {
  @scala.inline
  def apply(
    color: reactDashColorLib.reactDashColorMod.Color = null,
    height: java.lang.String = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    onChange: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    onChangeComplete: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[HuePicker] = null,
    width: java.lang.String = null
  ): HuePickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(onChangeComplete)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[HuePickerProps]
  }
}

