package typings.reactInteractive.anon

import typings.react.mod.CSSProperties
import typings.reactInteractive.mod.FocusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusFromMouse extends FocusProps {
  
  var focusFromMouse: js.UndefOr[CSSProperties] = js.native
  
  var focusFromTab: js.UndefOr[CSSProperties] = js.native
  
  var focusFromTouch: js.UndefOr[CSSProperties] = js.native
}
object FocusFromMouse {
  
  @scala.inline
  def apply(): FocusFromMouse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusFromMouse]
  }
  
  @scala.inline
  implicit class FocusFromMouseOps[Self <: FocusFromMouse] (val x: Self) extends AnyVal {
    
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
    def setFocusFromMouse(value: CSSProperties): Self = this.set("focusFromMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusFromMouse: Self = this.set("focusFromMouse", js.undefined)
    
    @scala.inline
    def setFocusFromTab(value: CSSProperties): Self = this.set("focusFromTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusFromTab: Self = this.set("focusFromTab", js.undefined)
    
    @scala.inline
    def setFocusFromTouch(value: CSSProperties): Self = this.set("focusFromTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusFromTouch: Self = this.set("focusFromTouch", js.undefined)
  }
}
