package typings.reactDashColor.libComponentsChromeChromeMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.reactDashColor.reactDashColorMod.Color
import typings.reactDashColor.reactDashColorMod.ColorChangeHandler
import typings.reactDashColor.reactDashColorMod.ColorPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromePickerProps extends ColorPickerProps[ChromePicker] {
  var disableAlpha: js.UndefOr[Boolean] = js.undefined
  var styles: js.UndefOr[ChromePickerStyles] = js.undefined
}

object ChromePickerProps {
  @scala.inline
  def apply(
    color: Color = null,
    disableAlpha: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onChange: ColorChangeHandler = null,
    onChangeComplete: ColorChangeHandler = null,
    ref: LegacyRef[ChromePicker] = null,
    styles: ChromePickerStyles = null
  ): ChromePickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAlpha)) __obj.updateDynamic("disableAlpha")(disableAlpha)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(onChangeComplete)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[ChromePickerProps]
  }
}

