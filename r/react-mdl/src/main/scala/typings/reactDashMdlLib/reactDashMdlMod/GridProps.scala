package typings
package reactDashMdlLib.reactDashMdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps
  extends reactLib.reactMod.HTMLProps[js.Any]
     with CustomRenderedComponent
     with ShadowedComponent {
  var noSpacing: js.UndefOr[scala.Boolean] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    CustomRenderedComponent: CustomRenderedComponent = null,
    HTMLProps: reactLib.reactMod.HTMLProps[js.Any] = null,
    ShadowedComponent: ShadowedComponent = null,
    noSpacing: js.UndefOr[scala.Boolean] = js.undefined
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, CustomRenderedComponent)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, ShadowedComponent)
    if (!js.isUndefined(noSpacing)) __obj.updateDynamic("noSpacing")(noSpacing)
    __obj.asInstanceOf[GridProps]
  }
}

