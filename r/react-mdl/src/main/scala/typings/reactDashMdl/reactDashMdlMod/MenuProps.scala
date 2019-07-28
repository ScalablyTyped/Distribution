package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps
  extends HTMLProps[js.Any]
     with RippleComponent {
  var align: js.UndefOr[String] = js.undefined
  @JSName("target")
  var target_MenuProps: String
  var valign: js.UndefOr[String] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    target: String,
    HTMLProps: HTMLProps[js.Any] = null,
    RippleComponent: RippleComponent = null,
    align: String = null,
    valign: String = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal(target = target)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, RippleComponent)
    if (align != null) __obj.updateDynamic("align")(align)
    if (valign != null) __obj.updateDynamic("valign")(valign)
    __obj.asInstanceOf[MenuProps]
  }
}

