package typings.rbx.columnGroupMod

import typings.rbx.rbxNumbers.`0`
import typings.rbx.rbxNumbers.`1`
import typings.rbx.rbxNumbers.`2`
import typings.rbx.rbxNumbers.`3`
import typings.rbx.rbxNumbers.`4`
import typings.rbx.rbxNumbers.`5`
import typings.rbx.rbxNumbers.`6`
import typings.rbx.rbxNumbers.`7`
import typings.rbx.rbxNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnGroupBreakpointOptions extends js.Object {
  var gapSize: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
}

object ColumnGroupBreakpointOptions {
  @scala.inline
  def apply(gapSize: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` = null): ColumnGroupBreakpointOptions = {
    val __obj = js.Dynamic.literal()
    if (gapSize != null) __obj.updateDynamic("gapSize")(gapSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupBreakpointOptions]
  }
}

