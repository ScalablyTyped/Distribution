package typings.reactLeaflet.mod

import typings.leaflet.mod.LatLngExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.LayerOptions because Already inherited
- typings.leaflet.mod.InteractiveLayerOptions because Already inherited
- typings.leaflet.mod.PathOptions because Already inherited
- typings.leaflet.mod.CircleMarkerOptions because var conflicts: attribution, bubblingMouseEvents, className, color, dashArray, dashOffset, fill, fillColor, fillOpacity, fillRule, interactive, lineCap, lineJoin, opacity, pane, renderer, stroke, weight. Inlined radius */ trait CircleMarkerProps
  extends StObject
     with PathProps {
  
  var center: LatLngExpression
  
  var radius: js.UndefOr[Double]
}
object CircleMarkerProps {
  
  inline def apply(center: LatLngExpression): CircleMarkerProps = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleMarkerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CircleMarkerProps] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: LatLngExpression): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
