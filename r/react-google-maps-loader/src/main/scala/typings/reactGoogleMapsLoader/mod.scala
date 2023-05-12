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
      
      val drawing: Any
      
      val geometry: Typeofgeometry
      
      val journeySharing: Any
      
      val localContext: Any
      
      val marker: Any
      
      val places: Any
      
      val visualization: Any
    }
    object GoogleMaps {
      
      inline def apply(
        Data: Any,
        drawing: Any,
        geometry: Typeofgeometry,
        journeySharing: Any,
        localContext: Any,
        marker: Any,
        places: Any,
        visualization: Any
      ): GoogleMaps = {
        val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], drawing = drawing.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], journeySharing = journeySharing.asInstanceOf[js.Any], localContext = localContext.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any])
        __obj.asInstanceOf[GoogleMaps]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GoogleMaps] (val x: Self) extends AnyVal {
        
        inline def setData(value: Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
        
        inline def setDrawing(value: Any): Self = StObject.set(x, "drawing", value.asInstanceOf[js.Any])
        
        inline def setGeometry(value: Typeofgeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
        
        inline def setJourneySharing(value: Any): Self = StObject.set(x, "journeySharing", value.asInstanceOf[js.Any])
        
        inline def setLocalContext(value: Any): Self = StObject.set(x, "localContext", value.asInstanceOf[js.Any])
        
        inline def setMarker(value: Any): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
        
        inline def setPlaces(value: Any): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
        
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
        
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
