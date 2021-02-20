package typings.reactLeaflet.mod

import typings.leaflet.mod.CrossOrigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.GridLayerOptions because Already inherited
- typings.leaflet.mod.TileLayerOptions because var conflicts: attribution, bounds, className, keepBuffer, maxZoom, minZoom, noWrap, opacity, pane, tileSize, updateInterval, updateWhenIdle, updateWhenZooming, zIndex. Inlined minNativeZoom, zoomOffset, errorTileUrl, maxNativeZoom, zoomReverse, subdomains, id, tms, accessToken, crossOrigin, detectRetina */ @js.native
trait TileLayerProps
  extends GridLayerProps
     with TileLayerEvents {
  
  var accessToken: js.UndefOr[String] = js.native
  
  var crossOrigin: js.UndefOr[CrossOrigin] = js.native
  
  var detectRetina: js.UndefOr[Boolean] = js.native
  
  var errorTileUrl: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var maxNativeZoom: js.UndefOr[Double] = js.native
  
  var minNativeZoom: js.UndefOr[Double] = js.native
  
  var subdomains: js.UndefOr[String | js.Array[String]] = js.native
  
  var tms: js.UndefOr[Boolean] = js.native
  
  var url: String = js.native
  
  var zoomOffset: js.UndefOr[Double] = js.native
  
  var zoomReverse: js.UndefOr[Boolean] = js.native
}
object TileLayerProps {
  
  @scala.inline
  def apply(url: String): TileLayerProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayerProps]
  }
  
  @scala.inline
  implicit class TileLayerPropsMutableBuilder[Self <: TileLayerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: CrossOrigin): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setDetectRetina(value: Boolean): Self = StObject.set(x, "detectRetina", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectRetinaUndefined: Self = StObject.set(x, "detectRetina", js.undefined)
    
    @scala.inline
    def setErrorTileUrl(value: String): Self = StObject.set(x, "errorTileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTileUrlUndefined: Self = StObject.set(x, "errorTileUrl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMaxNativeZoom(value: Double): Self = StObject.set(x, "maxNativeZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNativeZoomUndefined: Self = StObject.set(x, "maxNativeZoom", js.undefined)
    
    @scala.inline
    def setMinNativeZoom(value: Double): Self = StObject.set(x, "minNativeZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNativeZoomUndefined: Self = StObject.set(x, "minNativeZoom", js.undefined)
    
    @scala.inline
    def setSubdomains(value: String | js.Array[String]): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
    
    @scala.inline
    def setSubdomainsVarargs(value: String*): Self = StObject.set(x, "subdomains", js.Array(value :_*))
    
    @scala.inline
    def setTms(value: Boolean): Self = StObject.set(x, "tms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmsUndefined: Self = StObject.set(x, "tms", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOffset(value: Double): Self = StObject.set(x, "zoomOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOffsetUndefined: Self = StObject.set(x, "zoomOffset", js.undefined)
    
    @scala.inline
    def setZoomReverse(value: Boolean): Self = StObject.set(x, "zoomReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomReverseUndefined: Self = StObject.set(x, "zoomReverse", js.undefined)
  }
}
