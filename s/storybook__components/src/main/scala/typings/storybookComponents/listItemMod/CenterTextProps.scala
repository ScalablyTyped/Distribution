package typings.storybookComponents.listItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CenterTextProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
}

object CenterTextProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined, disabled: js.UndefOr[Boolean] = js.undefined): CenterTextProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterTextProps]
  }
}

