package typings
package reactDashSimpleDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var default: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var hover: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var pressed: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(
    default: reactLib.reactMod.CSSProperties = null,
    hover: reactLib.reactMod.CSSProperties = null,
    pressed: reactLib.reactMod.CSSProperties = null
  ): Anon_Default = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (pressed != null) __obj.updateDynamic("pressed")(pressed)
    __obj.asInstanceOf[Anon_Default]
  }
}

