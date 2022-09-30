package typings.reactGoogleMapsLoader

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactGoogleMapsLoader.anon.Typeofgeometry
import typings.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-google-maps-loader", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  
  object ReactGoogleMapsLoader {
    
    trait GoogleMaps extends StObject {
      
      val Data: Any
      
      val LatLngBounds: Any
      
      val Map: Any
      
      val Marker: Any
      
      val OverlayView: Any
      
      val Settings: Any
      
      val drawing: Any
      
      val event: Any
      
      val geometry: Typeofgeometry
      
      val journeySharing: Any
      
      val localContext: Any
      
      val places: Any
      
      val visualization: Any
    }
    object GoogleMaps {
      
      inline def apply(
        Data: Any,
        LatLngBounds: Any,
        Map: Any,
        Marker: Any,
        OverlayView: Any,
        Settings: Any,
        drawing: Any,
        event: Any,
        geometry: Typeofgeometry,
        journeySharing: Any,
        localContext: Any,
        places: Any,
        visualization: Any
      ): GoogleMaps = {
        val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], LatLngBounds = LatLngBounds.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], OverlayView = OverlayView.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any], drawing = drawing.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], journeySharing = journeySharing.asInstanceOf[js.Any], localContext = localContext.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any])
        __obj.asInstanceOf[GoogleMaps]
      }
      
      extension [Self <: GoogleMaps](x: Self) {
        
        inline def setData(value: Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
        
        inline def setDrawing(value: Any): Self = StObject.set(x, "drawing", value.asInstanceOf[js.Any])
        
        inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
        
        inline def setGeometry(value: Typeofgeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
        
        inline def setJourneySharing(value: Any): Self = StObject.set(x, "journeySharing", value.asInstanceOf[js.Any])
        
        inline def setLatLngBounds(value: Any): Self = StObject.set(x, "LatLngBounds", value.asInstanceOf[js.Any])
        
        inline def setLocalContext(value: Any): Self = StObject.set(x, "localContext", value.asInstanceOf[js.Any])
        
        inline def setMap(value: Any): Self = StObject.set(x, "Map", value.asInstanceOf[js.Any])
        
        inline def setMarker(value: Any): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
        
        inline def setOverlayView(value: Any): Self = StObject.set(x, "OverlayView", value.asInstanceOf[js.Any])
        
        inline def setPlaces(value: Any): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
        
        inline def setSettings(value: Any): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
        
        inline def setVisualization(value: Any): Self = StObject.set(x, "visualization", value.asInstanceOf[js.Any])
      }
    }
    
    trait Params extends StObject {
      
      var key: String
      
      var libraries: js.UndefOr[String] = js.undefined
    }
    object Params {
      
      inline def apply(key: String): Params = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
        __obj.asInstanceOf[Params]
      }
      
      extension [Self <: Params](x: Self) {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setLibraries(value: String): Self = StObject.set(x, "libraries", value.asInstanceOf[js.Any])
        
        inline def setLibrariesUndefined: Self = StObject.set(x, "libraries", js.undefined)
      }
    }
    
    @js.native
    trait Props extends StObject {
      
      var params: Params = js.native
      
      def render(googleMaps: GoogleMaps): ReactNode = js.native
      def render(googleMaps: GoogleMaps, error: String): ReactNode = js.native
    }
  }
  type ReactGoogleMapsLoader = Component[Props, js.Object, Any]
}
