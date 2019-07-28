package typings.reactDashBootstrap.libControlLabelMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlLabelProps extends HTMLProps[ControlLabel] {
  var bsClass: js.UndefOr[String] = js.undefined
  var srOnly: js.UndefOr[Boolean] = js.undefined
}

object ControlLabelProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[ControlLabel] = null,
    bsClass: String = null,
    htmlFor: String = null,
    srOnly: js.UndefOr[Boolean] = js.undefined
  ): ControlLabelProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor)
    if (!js.isUndefined(srOnly)) __obj.updateDynamic("srOnly")(srOnly)
    __obj.asInstanceOf[ControlLabelProps]
  }
}

