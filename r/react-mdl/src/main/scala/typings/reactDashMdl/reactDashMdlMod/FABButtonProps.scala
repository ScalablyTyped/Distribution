package typings.reactDashMdl.reactDashMdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FABButtonProps extends ButtonProps {
  var mini: js.UndefOr[Boolean] = js.undefined
}

object FABButtonProps {
  @scala.inline
  def apply(ButtonProps: ButtonProps = null, mini: js.UndefOr[Boolean] = js.undefined): FABButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ButtonProps)
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini)
    __obj.asInstanceOf[FABButtonProps]
  }
}

