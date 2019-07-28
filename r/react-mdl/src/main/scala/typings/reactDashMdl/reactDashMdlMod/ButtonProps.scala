package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps
  extends HTMLProps[js.Any]
     with RippleComponent
     with CustomRenderedComponent {
  var accent: js.UndefOr[Boolean] = js.undefined
  var colored: js.UndefOr[Boolean] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    CustomRenderedComponent: CustomRenderedComponent = null,
    HTMLProps: HTMLProps[js.Any] = null,
    RippleComponent: RippleComponent = null,
    accent: js.UndefOr[Boolean] = js.undefined,
    colored: js.UndefOr[Boolean] = js.undefined,
    primary: js.UndefOr[Boolean] = js.undefined
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

