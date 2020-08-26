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

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/grid/tiles/tile.TileVariablesOverrides, rbx.rbx/grid/tiles/tile.TileVariablesDefaults> */
@js.native
trait TileVariables extends js.Object {
  var kinds: ancestor | parent | child = js.native
  var sizes: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` = js.native
}

object TileVariables {
  @scala.inline
  def apply(
    kinds: ancestor | parent | child,
    sizes: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`
  ): TileVariables = {
    val __obj = js.Dynamic.literal(kinds = kinds.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileVariables]
  }
  @scala.inline
  implicit class TileVariablesOps[Self <: TileVariables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKinds(value: ancestor | parent | child): Self = this.set("kinds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizes(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`): Self = this.set("sizes", value.asInstanceOf[js.Any])
  }
  
}

