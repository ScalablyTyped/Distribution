package typings.reactLeaflet.mod

import typings.leaflet.mod.PointExpression
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.DivOverlayOptions because var conflicts: pane. Inlined zoomAnimation, className, offset */ @js.native
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
  implicit class DivOverlayPropsMutableBuilder[Self <: DivOverlayProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setOffset(value: PointExpression): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    @scala.inline
    def setZoomAnimation(value: Boolean): Self = StObject.set(x, "zoomAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAnimationUndefined: Self = StObject.set(x, "zoomAnimation", js.undefined)
  }
}
