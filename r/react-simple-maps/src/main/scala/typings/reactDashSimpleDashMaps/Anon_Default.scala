package typings.reactDashSimpleDashMaps

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var default: js.UndefOr[CSSProperties] = js.undefined
  var hover: js.UndefOr[CSSProperties] = js.undefined
  var pressed: js.UndefOr[CSSProperties] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(default: CSSProperties = null, hover: CSSProperties = null, pressed: CSSProperties = null): Anon_Default = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (pressed != null) __obj.updateDynamic("pressed")(pressed)
    __obj.asInstanceOf[Anon_Default]
  }
}

