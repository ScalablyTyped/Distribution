package typings.reactOverlays.esmDropdownMenuMod

import typings.reactOverlays.anon.OmitUsePopperOptionsenabl
import typings.reactOverlays.anon.Popper
import typings.reactOverlays.esmUsePopperMod.Offset
import typings.reactOverlays.esmUsePopperMod.OffsetValue
import typings.reactOverlays.esmUseRootCloseMod.MouseEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseDropdownMenuOptions extends js.Object {
  
  var alignEnd: js.UndefOr[Boolean] = js.native
  
  var flip: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Offset] = js.native
  
  var popperConfig: js.UndefOr[OmitUsePopperOptionsenabl] = js.native
  
  var rootCloseEvent: js.UndefOr[MouseEvents] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var usePopper: js.UndefOr[Boolean] = js.native
}
object UseDropdownMenuOptions {
  
  @scala.inline
  def apply(): UseDropdownMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseDropdownMenuOptions]
  }
  
  @scala.inline
  implicit class UseDropdownMenuOptionsOps[Self <: UseDropdownMenuOptions] (val x: Self) extends AnyVal {
    
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
    def setAlignEnd(value: Boolean): Self = this.set("alignEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignEnd: Self = this.set("alignEnd", js.undefined)
    
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    
    @scala.inline
    def setOffsetFunction1(value: /* details */ Popper => OffsetValue): Self = this.set("offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffset(value: Offset): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPopperConfig(value: OmitUsePopperOptionsenabl): Self = this.set("popperConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopperConfig: Self = this.set("popperConfig", js.undefined)
    
    @scala.inline
    def setRootCloseEvent(value: MouseEvents): Self = this.set("rootCloseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootCloseEvent: Self = this.set("rootCloseEvent", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setUsePopper(value: Boolean): Self = this.set("usePopper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePopper: Self = this.set("usePopper", js.undefined)
  }
}
