package typings
package reactDashMdlLib.reactDashMdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps
  extends reactLib.reactMod.HTMLProps[js.Any]
     with RippleComponent {
  var align: js.UndefOr[java.lang.String] = js.undefined
  @JSName("target")
  var target_MenuProps: java.lang.String
  var valign: js.UndefOr[java.lang.String] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    target: java.lang.String,
    HTMLProps: reactLib.reactMod.HTMLProps[js.Any] = null,
    RippleComponent: RippleComponent = null,
    align: java.lang.String = null,
    valign: java.lang.String = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal(target = target)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, RippleComponent)
    if (align != null) __obj.updateDynamic("align")(align)
    if (valign != null) __obj.updateDynamic("valign")(valign)
    __obj.asInstanceOf[MenuProps]
  }
}

