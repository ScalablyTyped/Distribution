package typings.reactBootstrap.controlLabelMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
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
    srOnly: js.UndefOr[Boolean] = js.undefined
  ): ControlLabelProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (!js.isUndefined(srOnly)) __obj.updateDynamic("srOnly")(srOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlLabelProps]
  }
}

