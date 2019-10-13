package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any]
     with RippleComponent
     with CustomRenderedComponent {
  var accent: js.UndefOr[Boolean] = js.undefined
  var colored: js.UndefOr[Boolean] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    CustomRenderedComponent: CustomRenderedComponent = null,
    RippleComponent: RippleComponent = null,
    accent: js.UndefOr[Boolean] = js.undefined,
    colored: js.UndefOr[Boolean] = js.undefined,
    primary: js.UndefOr[Boolean] = js.undefined
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, CustomRenderedComponent)
    js.Dynamic.global.Object.assign(__obj, RippleComponent)
    if (!js.isUndefined(accent)) __obj.updateDynamic("accent")(accent)
    if (!js.isUndefined(colored)) __obj.updateDynamic("colored")(colored)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    __obj.asInstanceOf[ButtonProps]
  }
}

