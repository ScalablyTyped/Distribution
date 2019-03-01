package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps
  extends reactLib.reactMod.ReactNs.HTMLProps[js.Any]
     with RippleComponent
     with CustomRenderedComponent {
  var accent: js.UndefOr[scala.Boolean] = js.undefined
  var colored: js.UndefOr[scala.Boolean] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    CustomRenderedComponent: CustomRenderedComponent = null,
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[js.Any] = null,
    RippleComponent: RippleComponent = null,
    accent: js.UndefOr[scala.Boolean] = js.undefined,
    colored: js.UndefOr[scala.Boolean] = js.undefined,
    primary: js.UndefOr[scala.Boolean] = js.undefined
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, CustomRenderedComponent)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, RippleComponent)
    if (!js.isUndefined(accent)) __obj.updateDynamic("accent")(accent)
    if (!js.isUndefined(colored)) __obj.updateDynamic("colored")(colored)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    __obj.asInstanceOf[ButtonProps]
  }
}

