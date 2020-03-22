package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.centered
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/button/components/button-group.js
trait ButtonGroupModifierProps extends js.Object {
  var hasAddons: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[centered | right] = js.undefined
}

object ButtonGroupModifierProps {
  @scala.inline
  def apply(hasAddons: js.UndefOr[Boolean] = js.undefined, position: centered | right = null): ButtonGroupModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasAddons)) __obj.updateDynamic("hasAddons")(hasAddons.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupModifierProps]
  }
}

