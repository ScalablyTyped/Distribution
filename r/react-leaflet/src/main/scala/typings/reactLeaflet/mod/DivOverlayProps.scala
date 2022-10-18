package typings.reactLeaflet.mod

import typings.leaflet.mod.Layer
import typings.leaflet.mod.PointExpression
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.DivOverlayOptions because var conflicts: pane. Inlined interactive, content, className, offset */ trait DivOverlayProps
  extends StObject
     with MapComponentProps {
  
  var children: Children
  
  var className: js.UndefOr[String] = js.undefined
  
  var content: js.UndefOr[String | HTMLElement | (js.Function1[/* layer */ Layer, HTMLElement | String])] = js.undefined
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[PointExpression] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object DivOverlayProps {
  
  inline def apply(): DivOverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivOverlayProps]
  }
  
  extension [Self <: DivOverlayProps](x: Self) {
    
    inline def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContent(value: String | HTMLElement | (js.Function1[/* layer */ Layer, HTMLElement | String])): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction1(value: /* layer */ Layer => HTMLElement | String): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setOffset(value: PointExpression): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
  }
}
