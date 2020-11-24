package typings.reactMdTransition.useFixedPositioningMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollData extends js.Object {
  
  var element: HTMLElement | Null = js.native
  
  var fixedTo: HTMLElement | Null = js.native
  
  /**
    * Boolean if the `fixedTo` element is visible within the viewport. This is useful
    * if you'd like to hide the element only once the user scrolls these elements
    * out of view.
    */
  var visible: Boolean = js.native
}
object ScrollData {
  
  @scala.inline
  def apply(visible: Boolean): ScrollData = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollData]
  }
  
  @scala.inline
  implicit class ScrollDataOps[Self <: ScrollData] (val x: Self) extends AnyVal {
    
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
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementNull: Self = this.set("element", null)
    
    @scala.inline
    def setFixedTo(value: HTMLElement): Self = this.set("fixedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedToNull: Self = this.set("fixedTo", null)
  }
}
