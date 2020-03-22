package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`10`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`11`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`12`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`1`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`2`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`3`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`4`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`5`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`6`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`7`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`8`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`9`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.ancestor
import typings.reactBulmaComponents.reactBulmaComponentsStrings.child
import typings.reactBulmaComponents.reactBulmaComponentsStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Tile ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/tile/tile.js
trait TileModifierProps extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var kind: js.UndefOr[ancestor | parent | child] = js.undefined
  var notification: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object TileModifierProps {
  @scala.inline
  def apply(
    color: Color = null,
    kind: ancestor | parent | child = null,
    notification: js.UndefOr[Boolean] = js.undefined,
    size: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): TileModifierProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileModifierProps]
  }
}

