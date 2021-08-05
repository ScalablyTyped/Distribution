package typings.reactLeaflet.mod

import typings.leaflet.mod.ImageOverlayOptions
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet */ trait SVGOverlayProps
  extends StObject
     with ImageOverlayOptions {
  
  var children: js.UndefOr[Children] = js.undefined
  
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
}
object SVGOverlayProps {
  
  inline def apply(): SVGOverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGOverlayProps]
  }
  
  extension [Self <: SVGOverlayProps](x: Self) {
    
    inline def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    inline def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
  }
}
