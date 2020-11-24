package typings.rbx.columnMod

import typings.rbx.rbxNumbers.`0`
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
import typings.rbx.rbxStrings.`four-fifths`
import typings.rbx.rbxStrings.`one-fifth`
import typings.rbx.rbxStrings.`one-quarter`
import typings.rbx.rbxStrings.`one-third`
import typings.rbx.rbxStrings.`three-fifths`
import typings.rbx.rbxStrings.`three-quarters`
import typings.rbx.rbxStrings.`two-fifths`
import typings.rbx.rbxStrings.`two-thirds`
import typings.rbx.rbxStrings.full
import typings.rbx.rbxStrings.half
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnModifierProps extends js.Object {
  
  var desktop: js.UndefOr[ColumnBreakpointOptions] = js.native
  
  var fullhd: js.UndefOr[ColumnBreakpointOptions] = js.native
  
  var mobile: js.UndefOr[ColumnBreakpointOptions] = js.native
  
  var narrow: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[
    `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
  ] = js.native
  
  var size: js.UndefOr[
    `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
  ] = js.native
  
  var tablet: js.UndefOr[ColumnBreakpointOptions] = js.native
  
  var touch: js.UndefOr[ColumnBreakpointOptions] = js.native
  
  var widescreen: js.UndefOr[ColumnBreakpointOptions] = js.native
}
object ColumnModifierProps {
  
  @scala.inline
  def apply(): ColumnModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnModifierProps]
  }
  
  @scala.inline
  implicit class ColumnModifierPropsOps[Self <: ColumnModifierProps] (val x: Self) extends AnyVal {
    
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
    def setDesktop(value: ColumnBreakpointOptions): Self = this.set("desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesktop: Self = this.set("desktop", js.undefined)
    
    @scala.inline
    def setFullhd(value: ColumnBreakpointOptions): Self = this.set("fullhd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullhd: Self = this.set("fullhd", js.undefined)
    
    @scala.inline
    def setMobile(value: ColumnBreakpointOptions): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
    
    @scala.inline
    def setNarrow(value: Boolean): Self = this.set("narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNarrow: Self = this.set("narrow", js.undefined)
    
    @scala.inline
    def setOffset(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
    ): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setSize(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
    ): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTablet(value: ColumnBreakpointOptions): Self = this.set("tablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTablet: Self = this.set("tablet", js.undefined)
    
    @scala.inline
    def setTouch(value: ColumnBreakpointOptions): Self = this.set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
    
    @scala.inline
    def setWidescreen(value: ColumnBreakpointOptions): Self = this.set("widescreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidescreen: Self = this.set("widescreen", js.undefined)
  }
}
