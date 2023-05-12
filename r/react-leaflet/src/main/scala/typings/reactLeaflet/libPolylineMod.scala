package typings.reactLeaflet

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.PathOptions
import typings.leaflet.mod.PolylineOptions
import typings.leaflet.mod.Polyline_
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactLeafletCore.libEventsMod.EventedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPolylineMod {
  
  @JSImport("react-leaflet/lib/Polyline", "Polyline")
  @js.native
  val Polyline: ForwardRefExoticComponent[PolylineProps & (RefAttributes[Polyline_[LineString | MultiLineString, Any]])] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.leaflet.mod.LayerOptions because Already inherited
  - typings.reactLeafletCore.libLayerMod.LayerProps because var conflicts: attribution, pane. Inlined 
  - typings.reactLeafletCore.libLayerMod.InteractiveLayerProps because var conflicts: attribution, bubblingMouseEvents, interactive, pane. Inlined 
  - typings.reactLeafletCore.libPathMod.PathProps because var conflicts: attribution, bubblingMouseEvents, interactive, pane. Inlined pathOptions */ trait PolylineProps
    extends StObject
       with PolylineOptions
       with EventedProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var pathOptions: js.UndefOr[PathOptions] = js.undefined
    
    var positions: js.Array[js.Array[LatLngExpression] | LatLngExpression]
  }
  object PolylineProps {
    
    inline def apply(positions: js.Array[js.Array[LatLngExpression] | LatLngExpression]): PolylineProps = {
      val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolylineProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PolylineProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPathOptions(value: PathOptions): Self = StObject.set(x, "pathOptions", value.asInstanceOf[js.Any])
      
      inline def setPathOptionsUndefined: Self = StObject.set(x, "pathOptions", js.undefined)
      
      inline def setPositions(value: js.Array[js.Array[LatLngExpression] | LatLngExpression]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsVarargs(value: (js.Array[LatLngExpression] | LatLngExpression)*): Self = StObject.set(x, "positions", js.Array(value*))
    }
  }
}
