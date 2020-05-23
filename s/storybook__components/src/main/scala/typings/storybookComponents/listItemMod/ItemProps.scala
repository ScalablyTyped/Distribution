package typings.storybookComponents.listItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
}

object ItemProps {
  @scala.inline
  def apply(disabled: js.UndefOr[Boolean] = js.undefined): ItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemProps]
  }
}

