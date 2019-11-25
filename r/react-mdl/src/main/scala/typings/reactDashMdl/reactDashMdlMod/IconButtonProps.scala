package typings.reactDashMdl.reactDashMdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconButtonProps extends ButtonProps {
  var raised: js.UndefOr[Boolean] = js.undefined
}

object IconButtonProps {
  @scala.inline
  def apply(ButtonProps: ButtonProps = null, raised: js.UndefOr[Boolean] = js.undefined): IconButtonProps = {
    val __obj = js.Dynamic.literal()
    if (ButtonProps != null) js.Dynamic.global.Object.assign(__obj, ButtonProps)
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonProps]
  }
}

