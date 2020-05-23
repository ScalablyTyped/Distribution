package typings.storybookComponents.buttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconButtonProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
}

object IconButtonProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined): IconButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonProps]
  }
}

