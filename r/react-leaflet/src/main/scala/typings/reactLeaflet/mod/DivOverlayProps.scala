package typings.reactLeaflet.mod

import typings.leaflet.mod.PointExpression
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.DivOverlayOptions because var conflicts: pane. Inlined className, offset, zoomAnimation */ @js.native
trait DivOverlayProps extends MapComponentProps {
  
  var children: Children = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[PointExpression] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var zoomAnimation: js.UndefOr[Boolean] = js.native
}
object DivOverlayProps {
  
  @scala.inline
  def apply(): DivOverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivOverlayProps]
  }
  
  @scala.inline
  implicit class DivOverlayPropsOps[Self <: DivOverlayProps] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: Children): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setOffset(value: PointExpression): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => Unit): Self = this.set("onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setZoomAnimation(value: Boolean): Self = this.set("zoomAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomAnimation: Self = this.set("zoomAnimation", js.undefined)
  }
}
