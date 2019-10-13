package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any]
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
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    RippleComponent: RippleComponent = null,
    align: String = null,
    valign: String = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal(target = target)
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, RippleComponent)
    if (align != null) __obj.updateDynamic("align")(align)
    if (valign != null) __obj.updateDynamic("valign")(valign)
    __obj.asInstanceOf[MenuProps]
  }
}

