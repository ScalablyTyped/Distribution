package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<react-map-gl.react-map-gl.ViewState> */
trait MapboxProps extends StObject {
  
  var altitude: js.UndefOr[Double] = js.undefined
  
  var attributionControl: js.UndefOr[Boolean] = js.undefined
  
  var bearing: js.UndefOr[Double] = js.undefined
  
  var container: js.UndefOr[js.Object] = js.undefined
  
  var gl: js.UndefOr[js.Object] = js.undefined
  
  var height: Double | String
  
  var latitude: js.UndefOr[Double] = js.undefined
  
  var longitude: js.UndefOr[Double] = js.undefined
  
  var mapOptions: js.UndefOr[js.Object] = js.undefined
  
  var mapStyle: js.UndefOr[String | js.Object] = js.undefined
  
  var mapboxApiAccessToken: js.UndefOr[String] = js.undefined
  
  var mapboxApiUrl: js.UndefOr[String] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* e */ MapError, Unit]] = js.undefined
  
  var onLoad: js.UndefOr[js.Function1[/* event */ MapLoadEvent, Unit]] = js.undefined
  
  var pitch: js.UndefOr[Double] = js.undefined
  
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  
  var reuseMap: js.UndefOr[Boolean] = js.undefined
  
  var reuseMaps: js.UndefOr[Boolean] = js.undefined
  
  var transformRequest: js.UndefOr[
    js.Function2[/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String], MapRequest]
  ] = js.undefined
  
  var viewState: js.UndefOr[ViewState] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var width: Double | String
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object MapboxProps {
  
  inline def apply(height: Double | String, width: Double | String): MapboxProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapboxProps] (val x: Self) extends AnyVal {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setAttributionControl(value: Boolean): Self = StObject.set(x, "attributionControl", value.asInstanceOf[js.Any])
    
    inline def setAttributionControlUndefined: Self = StObject.set(x, "attributionControl", js.undefined)
    
    inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    inline def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    inline def setContainer(value: js.Object): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setGl(value: js.Object): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    inline def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setMapOptions(value: js.Object): Self = StObject.set(x, "mapOptions", value.asInstanceOf[js.Any])
    
    inline def setMapOptionsUndefined: Self = StObject.set(x, "mapOptions", js.undefined)
    
    inline def setMapStyle(value: String | js.Object): Self = StObject.set(x, "mapStyle", value.asInstanceOf[js.Any])
    
    inline def setMapStyleUndefined: Self = StObject.set(x, "mapStyle", js.undefined)
    
    inline def setMapboxApiAccessToken(value: String): Self = StObject.set(x, "mapboxApiAccessToken", value.asInstanceOf[js.Any])
    
    inline def setMapboxApiAccessTokenUndefined: Self = StObject.set(x, "mapboxApiAccessToken", js.undefined)
    
    inline def setMapboxApiUrl(value: String): Self = StObject.set(x, "mapboxApiUrl", value.asInstanceOf[js.Any])
    
    inline def setMapboxApiUrlUndefined: Self = StObject.set(x, "mapboxApiUrl", js.undefined)
    
    inline def setOnError(value: /* e */ MapError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnLoad(value: /* event */ MapLoadEvent => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    inline def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
    
    inline def setReuseMap(value: Boolean): Self = StObject.set(x, "reuseMap", value.asInstanceOf[js.Any])
    
    inline def setReuseMapUndefined: Self = StObject.set(x, "reuseMap", js.undefined)
    
    inline def setReuseMaps(value: Boolean): Self = StObject.set(x, "reuseMaps", value.asInstanceOf[js.Any])
    
    inline def setReuseMapsUndefined: Self = StObject.set(x, "reuseMaps", js.undefined)
    
    inline def setTransformRequest(value: (/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String]) => MapRequest): Self = StObject.set(x, "transformRequest", js.Any.fromFunction2(value))
    
    inline def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
    
    inline def setViewState(value: ViewState): Self = StObject.set(x, "viewState", value.asInstanceOf[js.Any])
    
    inline def setViewStateUndefined: Self = StObject.set(x, "viewState", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
