package typings.restartHooks.useBreakpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @restart/hooks.@restart/hooks/cjs/useBreakpoint.BreakpointMap<@restart/hooks.@restart/hooks/cjs/useBreakpoint.DefaultBreakpoints> */
@js.native
trait DefaultBreakpointMap extends js.Object {
  
  var lg: js.UndefOr[BreakpointDirection] = js.native
  
  var md: js.UndefOr[BreakpointDirection] = js.native
  
  var sm: js.UndefOr[BreakpointDirection] = js.native
  
  var xl: js.UndefOr[BreakpointDirection] = js.native
  
  var xs: js.UndefOr[BreakpointDirection] = js.native
}
object DefaultBreakpointMap {
  
  @scala.inline
  def apply(): DefaultBreakpointMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultBreakpointMap]
  }
  
  @scala.inline
  implicit class DefaultBreakpointMapOps[Self <: DefaultBreakpointMap] (val x: Self) extends AnyVal {
    
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
    def setLg(value: BreakpointDirection): Self = this.set("lg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLg: Self = this.set("lg", js.undefined)
    
    @scala.inline
    def setMd(value: BreakpointDirection): Self = this.set("md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd: Self = this.set("md", js.undefined)
    
    @scala.inline
    def setSm(value: BreakpointDirection): Self = this.set("sm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSm: Self = this.set("sm", js.undefined)
    
    @scala.inline
    def setXl(value: BreakpointDirection): Self = this.set("xl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXl: Self = this.set("xl", js.undefined)
    
    @scala.inline
    def setXs(value: BreakpointDirection): Self = this.set("xs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXs: Self = this.set("xs", js.undefined)
  }
}
