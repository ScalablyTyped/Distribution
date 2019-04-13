package typings
package reactDashMdlLib.reactDashMdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconButtonProps extends ButtonProps {
  var raised: js.UndefOr[scala.Boolean] = js.undefined
}

object IconButtonProps {
  @scala.inline
  def apply(
    ButtonProps: ButtonProps = null,
    name: java.lang.String = null,
    raised: js.UndefOr[scala.Boolean] = js.undefined
  ): IconButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ButtonProps)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised)
    __obj.asInstanceOf[IconButtonProps]
  }
}

