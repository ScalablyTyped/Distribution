package typings.reactBootstrap.tabPaneMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactBootstrap.mod.TransitionCallbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabPaneProps
  extends AllHTMLAttributes[TabPane]
     with TransitionCallbacks
     with ClassAttributes[TabPane] {
  
  var animation: js.UndefOr[Boolean | (ComponentClass[_, ComponentState])] = js.native
  
  var bsClass: js.UndefOr[String] = js.native
  
  var eventKey: js.UndefOr[js.Any] = js.native
  
  var mountOnEnter: js.UndefOr[Boolean] = js.native
  
  var unmountOnExit: js.UndefOr[Boolean] = js.native
}
object TabPaneProps {
  
  @scala.inline
  def apply(): TabPaneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabPaneProps]
  }
  
  @scala.inline
  implicit class TabPanePropsOps[Self <: TabPaneProps] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: Boolean | (ComponentClass[_, ComponentState])): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
    
    @scala.inline
    def setEventKey(value: js.Any): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
    
    @scala.inline
    def setMountOnEnter(value: Boolean): Self = this.set("mountOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountOnEnter: Self = this.set("mountOnEnter", js.undefined)
    
    @scala.inline
    def setUnmountOnExit(value: Boolean): Self = this.set("unmountOnExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmountOnExit: Self = this.set("unmountOnExit", js.undefined)
  }
}
