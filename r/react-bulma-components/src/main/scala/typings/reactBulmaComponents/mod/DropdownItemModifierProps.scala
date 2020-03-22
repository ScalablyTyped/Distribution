package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/dropdown/components/item.js
trait DropdownItemModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var value: js.Any
}

object DropdownItemModifierProps {
  @scala.inline
  def apply(value: js.Any, active: js.UndefOr[Boolean] = js.undefined): DropdownItemModifierProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownItemModifierProps]
  }
}

