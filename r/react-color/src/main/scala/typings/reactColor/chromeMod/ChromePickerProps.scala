package typings.reactColor.chromeMod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.reactColor.mod.Color
import typings.reactColor.mod.ColorPickerProps
import typings.reactColor.mod.ColorResult
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
    onChange: /* color */ ColorResult => Unit = null,
    onChangeComplete: /* color */ ColorResult => Unit = null,
    ref: js.UndefOr[Null | LegacyRef[ChromePicker]] = js.undefined,
    styles: ChromePickerStyles = null
  ): ChromePickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAlpha)) __obj.updateDynamic("disableAlpha")(disableAlpha.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1(onChangeComplete))
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromePickerProps]
  }
}

