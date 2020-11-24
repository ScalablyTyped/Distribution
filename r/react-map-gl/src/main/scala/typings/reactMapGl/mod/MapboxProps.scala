package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<react-map-gl.react-map-gl.ViewState> */
@js.native
trait MapboxProps extends js.Object {
  
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
  implicit class MapboxPropsOps[Self <: MapboxProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    
    @scala.inline
    def setAttributionControl(value: Boolean): Self = this.set("attributionControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributionControl: Self = this.set("attributionControl", js.undefined)
    
    @scala.inline
    def setBearing(value: Double): Self = this.set("bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBearing: Self = this.set("bearing", js.undefined)
    
    @scala.inline
    def setContainer(value: js.Object): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setGl(value: js.Object): Self = this.set("gl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGl: Self = this.set("gl", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    
    @scala.inline
    def setMapOptions(value: js.Object): Self = this.set("mapOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapOptions: Self = this.set("mapOptions", js.undefined)
    
    @scala.inline
    def setMapStyle(value: String | js.Object): Self = this.set("mapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapStyle: Self = this.set("mapStyle", js.undefined)
    
    @scala.inline
    def setMapboxApiAccessToken(value: String): Self = this.set("mapboxApiAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapboxApiAccessToken: Self = this.set("mapboxApiAccessToken", js.undefined)
    
    @scala.inline
    def setMapboxApiUrl(value: String): Self = this.set("mapboxApiUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapboxApiUrl: Self = this.set("mapboxApiUrl", js.undefined)
    
    @scala.inline
    def setOnError(value: /* e */ MapError => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* event */ MapLoadEvent => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    
    @scala.inline
    def setPreserveDrawingBuffer(value: Boolean): Self = this.set("preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveDrawingBuffer: Self = this.set("preserveDrawingBuffer", js.undefined)
    
    @scala.inline
    def setReuseMap(value: Boolean): Self = this.set("reuseMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReuseMap: Self = this.set("reuseMap", js.undefined)
    
    @scala.inline
    def setReuseMaps(value: Boolean): Self = this.set("reuseMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReuseMaps: Self = this.set("reuseMaps", js.undefined)
    
    @scala.inline
    def setTransformRequest(value: (/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String]) => MapRequest): Self = this.set("transformRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTransformRequest: Self = this.set("transformRequest", js.undefined)
    
    @scala.inline
    def setViewState(value: ViewState): Self = this.set("viewState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewState: Self = this.set("viewState", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
