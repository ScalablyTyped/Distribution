package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconToggleProps
  extends reactLib.reactMod.ReactNs.HTMLProps[js.Any]
     with RippleComponent {
  @JSName("name")
  var name_IconToggleProps: java.lang.String
}

object IconToggleProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[js.Any] = null,
    RippleComponent: RippleComponent = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): IconToggleProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, RippleComponent)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[IconToggleProps]
  }
}

