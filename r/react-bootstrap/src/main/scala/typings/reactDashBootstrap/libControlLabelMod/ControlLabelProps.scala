package typings.reactDashBootstrap.libControlLabelMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlLabelProps
  extends AllHTMLAttributes[ControlLabel]
     with ClassAttributes[ControlLabel] {
  var bsClass: js.UndefOr[String] = js.undefined
  var srOnly: js.UndefOr[Boolean] = js.undefined
}

object ControlLabelProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[ControlLabel] = null,
    ClassAttributes: ClassAttributes[ControlLabel] = null,
    bsClass: String = null,
    htmlFor: String = null,
    srOnly: js.UndefOr[Boolean] = js.undefined
  ): ControlLabelProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor)
    if (!js.isUndefined(srOnly)) __obj.updateDynamic("srOnly")(srOnly)
    __obj.asInstanceOf[ControlLabelProps]
  }
}

