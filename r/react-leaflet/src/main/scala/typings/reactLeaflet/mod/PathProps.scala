package typings.reactLeaflet.mod

import typings.leaflet.mod.PathOptions
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typings.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ trait PathProps
  extends StObject
     with PathEvents
     with PathOptions {
  
  var children: js.UndefOr[Children] = js.undefined
  
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
}
object PathProps {
  
  inline def apply(): PathProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathProps]
  }
  
  extension [Self <: PathProps](x: Self) {
    
    inline def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    inline def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
  }
}
