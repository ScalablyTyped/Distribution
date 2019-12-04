package typings.reactDashColor.libComponentsCommonHueMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.ReactNode
import typings.reactDashColor.reactDashColorMod.Color
import typings.reactDashColor.reactDashColorMod.ColorResult
import typings.reactDashColor.reactDashColorMod.CustomPickerProps
import typings.reactDashColor.reactDashColorStrings.horizontal
import typings.reactDashColor.reactDashColorStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HueProps extends CustomPickerProps[Hue] {
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
}

object HueProps {
  @scala.inline
  def apply(
    onChange: /* color */ ColorResult => Unit,
    color: Color = null,
    direction: horizontal | vertical = null,
    key: Key = null,
    pointer: ReactNode = null,
    ref: LegacyRef[Hue] = null
  ): HueProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[HueProps]
  }
}

