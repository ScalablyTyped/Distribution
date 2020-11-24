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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnGroupBreakpointOptions extends js.Object {
  
  var gapSize: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.native
}
object ColumnGroupBreakpointOptions {
  
  @scala.inline
  def apply(): ColumnGroupBreakpointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnGroupBreakpointOptions]
  }
  
  @scala.inline
  implicit class ColumnGroupBreakpointOptionsOps[Self <: ColumnGroupBreakpointOptions] (val x: Self) extends AnyVal {
    
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
    def setGapSize(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = this.set("gapSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGapSize: Self = this.set("gapSize", js.undefined)
  }
}
