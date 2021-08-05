package typings.reactLeaflet.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayerProps
  extends StObject
     with MapComponentProps {
  
  var attribution: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[Children] = js.undefined
}
object MapLayerProps {
  
  inline def apply(): MapLayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerProps]
  }
  
  extension [Self <: MapLayerProps](x: Self) {
    
    inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
