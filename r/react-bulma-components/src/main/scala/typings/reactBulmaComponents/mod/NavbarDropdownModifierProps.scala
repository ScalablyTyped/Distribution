package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/navbar/components/container.js
trait NavbarDropdownModifierProps extends js.Object {
  var boxed: js.UndefOr[Boolean] = js.undefined
  var right: js.UndefOr[Boolean] = js.undefined
}

object NavbarDropdownModifierProps {
  @scala.inline
  def apply(boxed: js.UndefOr[Boolean] = js.undefined, right: js.UndefOr[Boolean] = js.undefined): NavbarDropdownModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boxed)) __obj.updateDynamic("boxed")(boxed.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarDropdownModifierProps]
  }
}

