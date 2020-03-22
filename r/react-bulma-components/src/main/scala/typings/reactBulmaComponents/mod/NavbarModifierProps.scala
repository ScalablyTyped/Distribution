package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.bottom
import typings.reactBulmaComponents.reactBulmaComponentsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Navbar ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/navbar/navbar.js
trait NavbarModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var fixed: js.UndefOr[top | bottom] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
}

object NavbarModifierProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    color: Color = null,
    fixed: top | bottom = null,
    transparent: js.UndefOr[Boolean] = js.undefined
  ): NavbarModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarModifierProps]
  }
}

