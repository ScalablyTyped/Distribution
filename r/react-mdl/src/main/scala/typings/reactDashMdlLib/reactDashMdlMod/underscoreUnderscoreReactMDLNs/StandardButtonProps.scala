package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardButtonProps extends ButtonProps {
  var raised: js.UndefOr[scala.Boolean] = js.undefined
}

object StandardButtonProps {
  @scala.inline
  def apply(ButtonProps: ButtonProps = null, raised: js.UndefOr[scala.Boolean] = js.undefined): StandardButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ButtonProps)
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised)
    __obj.asInstanceOf[StandardButtonProps]
  }
}

