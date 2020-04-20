package typings.rbx.tileMod

import typings.rbx.rbxNumbers.`10`
import typings.rbx.rbxNumbers.`11`
import typings.rbx.rbxNumbers.`12`
import typings.rbx.rbxNumbers.`1`
import typings.rbx.rbxNumbers.`2`
import typings.rbx.rbxNumbers.`3`
import typings.rbx.rbxNumbers.`4`
import typings.rbx.rbxNumbers.`5`
import typings.rbx.rbxNumbers.`6`
import typings.rbx.rbxNumbers.`7`
import typings.rbx.rbxNumbers.`8`
import typings.rbx.rbxNumbers.`9`
import typings.rbx.rbxStrings.ancestor
import typings.rbx.rbxStrings.child
import typings.rbx.rbxStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileModifierProps extends js.Object {
  var kind: js.UndefOr[ancestor | parent | child] = js.undefined
  var size: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object TileModifierProps {
  @scala.inline
  def apply(
    kind: ancestor | parent | child = null,
    size: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): TileModifierProps = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileModifierProps]
  }
}

