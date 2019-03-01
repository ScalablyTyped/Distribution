package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardActionProps
  extends reactLib.reactMod.ReactNs.HTMLProps[js.Any] {
  var border: js.UndefOr[scala.Boolean] = js.undefined
}

object CardActionProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[js.Any] = null,
    border: js.UndefOr[scala.Boolean] = js.undefined
  ): CardActionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border)
    __obj.asInstanceOf[CardActionProps]
  }
}

