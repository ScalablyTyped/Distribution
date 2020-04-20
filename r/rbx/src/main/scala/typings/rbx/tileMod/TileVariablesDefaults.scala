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

trait TileVariablesDefaults extends js.Object {
  var kinds: ancestor | parent | child
  var sizes: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`
}

object TileVariablesDefaults {
  @scala.inline
  def apply(
    kinds: ancestor | parent | child,
    sizes: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`
  ): TileVariablesDefaults = {
    val __obj = js.Dynamic.literal(kinds = kinds.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileVariablesDefaults]
  }
}

