package typings.reactColor.hueMod

import typings.react.mod.ChangeEvent
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import typings.reactColor.anon.PartialClassesany
import typings.reactColor.mod.Color
import typings.reactColor.mod.ColorResult
import typings.reactColor.mod.CustomPickerProps
import typings.reactColor.reactColorStrings.horizontal
import typings.reactColor.reactColorStrings.vertical
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HueProps extends CustomPickerProps[Hue] {
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
}

object HueProps {
  @scala.inline
  def apply(
    onChange: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit,
    className: String = null,
    color: Color = null,
    direction: horizontal | vertical = null,
    key: Key = null,
    pointer: ReactNode = null,
    ref: js.UndefOr[Null | LegacyRef[Hue]] = js.undefined,
    styles: PartialClassesany = null
  ): HueProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[HueProps]
  }
}

