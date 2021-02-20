package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<react-map-gl.react-map-gl.ViewState> */
@js.native
trait MapboxProps extends StObject {
  
  var altitude: js.UndefOr[Double] = js.native
  
  var attributionControl: js.UndefOr[Boolean] = js.native
  
  var bearing: js.UndefOr[Double] = js.native
  
  var container: js.UndefOr[js.Object] = js.native
  
  var gl: js.UndefOr[js.Object] = js.native
  
  var height: Double | String = js.native
  
  var latitude: js.UndefOr[Double] = js.native
  
  var longitude: js.UndefOr[Double] = js.native
  
  var mapOptions: js.UndefOr[js.Object] = js.native
  
  var mapStyle: js.UndefOr[String | js.Object] = js.native
  
  var mapboxApiAccessToken: js.UndefOr[String] = js.native
  
  var mapboxApiUrl: js.UndefOr[String] = js.native
  
  var onError: js.UndefOr[js.Function1[/* e */ MapError, Unit]] = js.native
  
  var onLoad: js.UndefOr[js.Function1[/* event */ MapLoadEvent, Unit]] = js.native
  
  var pitch: js.UndefOr[Double] = js.native
  
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.native
  
  var reuseMap: js.UndefOr[Boolean] = js.native
  
  var reuseMaps: js.UndefOr[Boolean] = js.native
  
  var transformRequest: js.UndefOr[
    js.Function2[/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String], MapRequest]
  ] = js.native
  
  var viewState: js.UndefOr[ViewState] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var width: Double | String = js.native
  
  var zoom: js.UndefOr[Double] = js.native
}
object MapboxProps {
  
  @scala.inline
  def apply(height: Double | String, width: Double | String): MapboxProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxProps]
  }
  
  @scala.inline
  implicit class MapboxPropsMutableBuilder[Self <: MapboxProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setAttributionControl(value: Boolean): Self = StObject.set(x, "attributionControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionControlUndefined: Self = StObject.set(x, "attributionControl", js.undefined)
    
    @scala.inline
    def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    @scala.inline
    def setContainer(value: js.Object): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setGl(value: js.Object): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setMapOptions(value: js.Object): Self = StObject.set(x, "mapOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapOptionsUndefined: Self = StObject.set(x, "mapOptions", js.undefined)
    
    @scala.inline
    def setMapStyle(value: String | js.Object): Self = StObject.set(x, "mapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapStyleUndefined: Self = StObject.set(x, "mapStyle", js.undefined)
    
    @scala.inline
    def setMapboxApiAccessToken(value: String): Self = StObject.set(x, "mapboxApiAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapboxApiAccessTokenUndefined: Self = StObject.set(x, "mapboxApiAccessToken", js.undefined)
    
    @scala.inline
    def setMapboxApiUrl(value: String): Self = StObject.set(x, "mapboxApiUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapboxApiUrlUndefined: Self = StObject.set(x, "mapboxApiUrl", js.undefined)
    
    @scala.inline
    def setOnError(value: /* e */ MapError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* event */ MapLoadEvent => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    @scala.inline
    def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
    
    @scala.inline
    def setReuseMap(value: Boolean): Self = StObject.set(x, "reuseMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReuseMapUndefined: Self = StObject.set(x, "reuseMap", js.undefined)
    
    @scala.inline
    def setReuseMaps(value: Boolean): Self = StObject.set(x, "reuseMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReuseMapsUndefined: Self = StObject.set(x, "reuseMaps", js.undefined)
    
    @scala.inline
    def setTransformRequest(value: (/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String]) => MapRequest): Self = StObject.set(x, "transformRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
    
    @scala.inline
    def setViewState(value: ViewState): Self = StObject.set(x, "viewState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewStateUndefined: Self = StObject.set(x, "viewState", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
