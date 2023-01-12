package typings.reactCartographer

import typings.react.mod.Component
import typings.reactCartographer.reactCartographerStrings.bing
import typings.reactCartographer.reactCartographerStrings.google
import typings.reactCartographer.reactCartographerStrings.yahoo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsMapMod {
  
  @JSImport("react-cartographer/lib/components/Map", JSImport.Default)
  @js.native
  open class default ()
    extends Component[MapProps, js.Object, Any]
  
  @JSImport("react-cartographer/lib/components/Map", "BingMapService")
  @js.native
  open class BingMapService () extends StObject {
    
    def getMap(params: MapProps): MapObject = js.native
    
    def name(): String = js.native
  }
  
  @JSImport("react-cartographer/lib/components/Map", "GoogleMapService")
  @js.native
  open class GoogleMapService () extends StObject {
    
    def getMap(params: MapProps): MapObject = js.native
    
    def name(): String = js.native
  }
  
  @JSImport("react-cartographer/lib/components/Map", "MapLocationFactory")
  @js.native
  open class MapLocationFactory () extends StObject {
    
    def getMap(params: MapProps): MapObject = js.native
  }
  
  @JSImport("react-cartographer/lib/components/Map", "YahooMapService")
  @js.native
  open class YahooMapService () extends StObject {
    
    def getMap(params: MapProps): MapObject = js.native
    
    def name(): String = js.native
  }
  
  type Map = Component[MapProps, js.Object, Any]
  
  trait MapData extends StObject {
    
    var locationLink: Any
    
    var locationText: String
  }
  object MapData {
    
    inline def apply(locationLink: Any, locationText: String): MapData = {
      val __obj = js.Dynamic.literal(locationLink = locationLink.asInstanceOf[js.Any], locationText = locationText.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapData] (val x: Self) extends AnyVal {
      
      inline def setLocationLink(value: Any): Self = StObject.set(x, "locationLink", value.asInstanceOf[js.Any])
      
      inline def setLocationText(value: String): Self = StObject.set(x, "locationText", value.asInstanceOf[js.Any])
    }
  }
  
  trait MapObject extends StObject {
    
    var data: MapData
    
    var mapId: String
  }
  object MapObject {
    
    inline def apply(data: MapData, mapId: String): MapObject = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapObject] (val x: Self) extends AnyVal {
      
      inline def setData(value: MapData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMapId(value: String): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
    }
  }
  
  trait MapProps extends StObject {
    
    var addressLine1: js.UndefOr[String] = js.undefined
    
    var city: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    /** Default: 270 */
    var height: Double
    
    var latitude: js.UndefOr[Double] = js.undefined
    
    var longitude: js.UndefOr[Double] = js.undefined
    
    /** Default: map */
    var mapId: String
    
    /** Default: yahoo */
    var provider: yahoo | google | bing
    
    var providerKey: String
    
    var state: js.UndefOr[String] = js.undefined
    
    /** Default: false */
    var useBackgroundImageStyle: Boolean
    
    /** Default: 580 */
    var width: Double
    
    /** Default: 10 */
    var zoom: Double
  }
  object MapProps {
    
    inline def apply(
      height: Double,
      mapId: String,
      provider: yahoo | google | bing,
      providerKey: String,
      useBackgroundImageStyle: Boolean,
      width: Double,
      zoom: Double
    ): MapProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], providerKey = providerKey.asInstanceOf[js.Any], useBackgroundImageStyle = useBackgroundImageStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapProps] (val x: Self) extends AnyVal {
      
      inline def setAddressLine1(value: String): Self = StObject.set(x, "addressLine1", value.asInstanceOf[js.Any])
      
      inline def setAddressLine1Undefined: Self = StObject.set(x, "addressLine1", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      inline def setMapId(value: String): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: yahoo | google | bing): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderKey(value: String): Self = StObject.set(x, "providerKey", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setUseBackgroundImageStyle(value: Boolean): Self = StObject.set(x, "useBackgroundImageStyle", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
}
