package typings.reactLeaflet.mod

import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.PopupOptions
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.DivOverlayOptions because Already inherited
- typings.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typings.reactLeaflet.mod.DivOverlayProps because var conflicts: className, offset, pane, zoomAnimation. Inlined children, onClose, onOpen */ trait PopupProps
  extends StObject
     with PopupOptions {
  
  var children: Children
  
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var position: js.UndefOr[LatLngExpression] = js.undefined
}
object PopupProps {
  
  @scala.inline
  def apply(): PopupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupProps]
  }
  
  @scala.inline
  implicit class PopupPropsMutableBuilder[Self <: PopupProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    @scala.inline
    def setPosition(value: LatLngExpression): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
