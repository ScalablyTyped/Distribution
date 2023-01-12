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
  
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  
  var viewBox: js.UndefOr[String] = js.undefined
}
object SVGOverlayProps {
  
  inline def apply(): SVGOverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGOverlayProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGOverlayProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    inline def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
    
    inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
    inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
  }
}
