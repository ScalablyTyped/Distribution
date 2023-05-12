package typings.reactLeaflet

import typings.geojson.mod.GeoJsonObject
import typings.geojson.mod.Geometry
import typings.geojson.mod.GeometryObject
import typings.leaflet.mod.GeoJSONOptions
import typings.leaflet.mod.GeoJSON__
import typings.leaflet.mod.PathOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactLeafletCore.libEventsMod.EventedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeoJSONMod {
  
  @JSImport("react-leaflet/lib/GeoJSON", "GeoJSON")
  @js.native
  val GeoJSON: ForwardRefExoticComponent[GeoJSONProps & (RefAttributes[GeoJSON__[Any, Geometry]])] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.leaflet.mod.LayerOptions because Already inherited
  - typings.reactLeafletCore.libLayerMod.LayerProps because var conflicts: attribution, eventHandlers, pane. Inlined 
  - typings.reactLeafletCore.libLayerMod.InteractiveLayerProps because var conflicts: attribution, bubblingMouseEvents, eventHandlers, interactive, pane. Inlined 
  - typings.leaflet.mod.LayerOptions because Already inherited
  - typings.reactLeafletCore.libPathMod.PathProps because var conflicts: attribution, bubblingMouseEvents, interactive, pane. Inlined pathOptions
  - typings.reactLeaflet.libLayerGroupMod.LayerGroupProps because var conflicts: attribution, pane. Inlined children */ trait GeoJSONProps
    extends StObject
       with GeoJSONOptions[Any, GeometryObject]
       with EventedProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var data: GeoJsonObject
    
    var pathOptions: js.UndefOr[PathOptions] = js.undefined
  }
  object GeoJSONProps {
    
    inline def apply(data: GeoJsonObject): GeoJSONProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoJSONProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeoJSONProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setData(value: GeoJsonObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPathOptions(value: PathOptions): Self = StObject.set(x, "pathOptions", value.asInstanceOf[js.Any])
      
      inline def setPathOptionsUndefined: Self = StObject.set(x, "pathOptions", js.undefined)
    }
  }
}
