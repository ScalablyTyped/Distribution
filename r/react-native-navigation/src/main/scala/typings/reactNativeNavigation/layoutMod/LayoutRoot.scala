package typings.reactNativeNavigation.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutRoot extends js.Object {
  
  var modals: js.UndefOr[js.Any] = js.native
  
  var overlays: js.UndefOr[js.Any] = js.native
  
  /**
    * Set the root
    */
  var root: Layout[js.Object] = js.native
}
object LayoutRoot {
  
  @scala.inline
  def apply(root: Layout[js.Object]): LayoutRoot = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutRoot]
  }
  
  @scala.inline
  implicit class LayoutRootOps[Self <: LayoutRoot] (val x: Self) extends AnyVal {
    
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
    def setRoot(value: Layout[js.Object]): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModals(value: js.Any): Self = this.set("modals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModals: Self = this.set("modals", js.undefined)
    
    @scala.inline
    def setOverlays(value: js.Any): Self = this.set("overlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlays: Self = this.set("overlays", js.undefined)
  }
}
