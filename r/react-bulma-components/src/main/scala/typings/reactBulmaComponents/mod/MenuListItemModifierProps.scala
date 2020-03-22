package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/menu/components/list/components/item.js
trait MenuListItemModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
}

object MenuListItemModifierProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined): MenuListItemModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuListItemModifierProps]
  }
}

