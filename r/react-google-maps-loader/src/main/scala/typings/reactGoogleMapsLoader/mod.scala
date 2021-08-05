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
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  object ReactGoogleMapsLoader {
    
    trait GoogleMaps extends StObject {
      
      val Data: js.Any
      
      val Marker: js.Any
      
      val OverlayView: js.Any
      
      // TODO find source documentation
      val adsense: js.Any
      
      val drawing: js.Any
      
      val event: js.Any
      
      val geometry: Typeofgeometry
      
      val places: js.Any
      
      val visualization: js.Any
    }
    object GoogleMaps {
      
      inline def apply(
        Data: js.Any,
        Marker: js.Any,
        OverlayView: js.Any,
        adsense: js.Any,
        drawing: js.Any,
        event: js.Any,
        geometry: Typeofgeometry,
        places: js.Any,
        visualization: js.Any
      ): GoogleMaps = {
        val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], OverlayView = OverlayView.asInstanceOf[js.Any], adsense = adsense.asInstanceOf[js.Any], drawing = drawing.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any])
        __obj.asInstanceOf[GoogleMaps]
      }
      
      extension [Self <: GoogleMaps](x: Self) {
        
        inline def setAdsense(value: js.Any): Self = StObject.set(x, "adsense", value.asInstanceOf[js.Any])
        
        inline def setData(value: js.Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
        
        inline def setDrawing(value: js.Any): Self = StObject.set(x, "drawing", value.asInstanceOf[js.Any])
        
        inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
        
        inline def setGeometry(value: Typeofgeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
        
        inline def setMarker(value: js.Any): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
        
        inline def setOverlayView(value: js.Any): Self = StObject.set(x, "OverlayView", value.asInstanceOf[js.Any])
        
        inline def setPlaces(value: js.Any): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
        
        inline def setVisualization(value: js.Any): Self = StObject.set(x, "visualization", value.asInstanceOf[js.Any])
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
  type ReactGoogleMapsLoader = Component[Props, js.Object, js.Any]
}
