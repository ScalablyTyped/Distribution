package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/navbar/components/item.js
trait NavbarItemModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var dropdown: js.UndefOr[Boolean] = js.undefined
  var dropdownUp: js.UndefOr[Boolean] = js.undefined
  var hoverable: js.UndefOr[Boolean] = js.undefined
}

object NavbarItemModifierProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    dropdown: js.UndefOr[Boolean] = js.undefined,
    dropdownUp: js.UndefOr[Boolean] = js.undefined,
    hoverable: js.UndefOr[Boolean] = js.undefined
  ): NavbarItemModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdown)) __obj.updateDynamic("dropdown")(dropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownUp)) __obj.updateDynamic("dropdownUp")(dropdownUp.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarItemModifierProps]
  }
}

