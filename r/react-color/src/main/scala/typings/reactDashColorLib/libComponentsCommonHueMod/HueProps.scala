package typings
package reactDashColorLib.libComponentsCommonHueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HueProps
  extends reactDashColorLib.reactDashColorMod.CustomPickerProps[Hue] {
  var direction: js.UndefOr[
    reactDashColorLib.reactDashColorLibStrings.horizontal | reactDashColorLib.reactDashColorLibStrings.vertical
  ] = js.undefined
}

object HueProps {
  @scala.inline
  def apply(
    onChange: reactDashColorLib.reactDashColorMod.ColorChangeHandler,
    color: reactDashColorLib.reactDashColorMod.Color = null,
    direction: reactDashColorLib.reactDashColorLibStrings.horizontal | reactDashColorLib.reactDashColorLibStrings.vertical = null,
    key: reactLib.reactMod.Key = null,
    pointer: reactLib.reactMod.ReactNode = null,
    ref: reactLib.reactMod.LegacyRef[Hue] = null
  ): HueProps = {
    val __obj = js.Dynamic.literal(onChange = onChange)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[HueProps]
  }
}

