package typings.storybookComponents.listItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeftProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
}

object LeftProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined): LeftProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftProps]
  }
}

