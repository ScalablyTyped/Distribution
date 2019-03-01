package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogActionsProps
  extends reactLib.reactMod.ReactNs.HTMLProps[js.Any] {
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
}

object DialogActionsProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[js.Any] = null,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  ): DialogActionsProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    __obj.asInstanceOf[DialogActionsProps]
  }
}

