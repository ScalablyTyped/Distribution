package typings.storybookUi.containerMod

import typings.storybookUi.storybookUiBooleans.`false`
import typings.storybookUi.storybookUiStrings.nav
import typings.storybookUi.storybookUiStrings.panel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutState extends js.Object {
  
  var isDragging: nav | panel | `false` = js.native
  
  var resizerNav: Coordinates = js.native
  
  var resizerPanel: Coordinates = js.native
}
object LayoutState {
  
  @scala.inline
  def apply(isDragging: nav | panel | `false`, resizerNav: Coordinates, resizerPanel: Coordinates): LayoutState = {
    val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any], resizerNav = resizerNav.asInstanceOf[js.Any], resizerPanel = resizerPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutState]
  }
  
  @scala.inline
  implicit class LayoutStateOps[Self <: LayoutState] (val x: Self) extends AnyVal {
    
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
    def setIsDragging(value: nav | panel | `false`): Self = this.set("isDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizerNav(value: Coordinates): Self = this.set("resizerNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizerPanel(value: Coordinates): Self = this.set("resizerPanel", value.asInstanceOf[js.Any])
  }
}
