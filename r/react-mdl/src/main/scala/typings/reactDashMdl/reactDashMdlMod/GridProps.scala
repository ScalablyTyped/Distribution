package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any]
     with CustomRenderedComponent
     with ShadowedComponent {
  var noSpacing: js.UndefOr[Boolean] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    CustomRenderedComponent: CustomRenderedComponent = null,
    ShadowedComponent: ShadowedComponent = null,
    noSpacing: js.UndefOr[Boolean] = js.undefined
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, CustomRenderedComponent)
    js.Dynamic.global.Object.assign(__obj, ShadowedComponent)
    if (!js.isUndefined(noSpacing)) __obj.updateDynamic("noSpacing")(noSpacing)
    __obj.asInstanceOf[GridProps]
  }
}

