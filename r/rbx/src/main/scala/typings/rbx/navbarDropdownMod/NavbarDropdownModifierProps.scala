package typings.rbx.navbarDropdownMod

import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarDropdownModifierProps extends js.Object {
  var align: js.UndefOr[right] = js.undefined
  var boxed: js.UndefOr[Boolean] = js.undefined
}

object NavbarDropdownModifierProps {
  @scala.inline
  def apply(align: right = null, boxed: js.UndefOr[Boolean] = js.undefined): NavbarDropdownModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(boxed)) __obj.updateDynamic("boxed")(boxed.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarDropdownModifierProps]
  }
}

