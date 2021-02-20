package typings.reactLeaflet.mod

import typings.leaflet.mod.CRS
import typings.leaflet.mod.CrossOrigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.GridLayerOptions because Already inherited
- typings.leaflet.mod.TileLayerOptions because var conflicts: attribution, bounds, className, keepBuffer, maxZoom, minZoom, noWrap, opacity, pane, tileSize, updateInterval, updateWhenIdle, updateWhenZooming, zIndex. Inlined minNativeZoom, zoomOffset, errorTileUrl, maxNativeZoom, zoomReverse, subdomains, id, tms, accessToken, crossOrigin, detectRetina
- typings.leaflet.mod.WMSOptions because var conflicts: attribution, bounds, className, keepBuffer, maxZoom, minZoom, noWrap, opacity, pane, tileSize, updateInterval, updateWhenIdle, updateWhenZooming, zIndex. Inlined layers, transparent, uppercase, format, crs, version, styles */ @js.native
trait WMSTileLayerProps
  extends GridLayerProps
     with TileLayerEvents {
  
  var accessToken: js.UndefOr[String] = js.native
  
  var crossOrigin: js.UndefOr[CrossOrigin] = js.native
  
  var crs: js.UndefOr[CRS] = js.native
  
  var detectRetina: js.UndefOr[Boolean] = js.native
  
  var errorTileUrl: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var layers: js.UndefOr[String] = js.native
  
  var maxNativeZoom: js.UndefOr[Double] = js.native
  
  var minNativeZoom: js.UndefOr[Double] = js.native
  
  var styles: js.UndefOr[String] = js.native
  
  var subdomains: js.UndefOr[String | js.Array[String]] = js.native
  
  var tms: js.UndefOr[Boolean] = js.native
  
  var transparent: js.UndefOr[Boolean] = js.native
  
  var uppercase: js.UndefOr[Boolean] = js.native
  
  var url: String = js.native
  
  var version: js.UndefOr[String] = js.native
  
  var zoomOffset: js.UndefOr[Double] = js.native
  
  var zoomReverse: js.UndefOr[Boolean] = js.native
}
object WMSTileLayerProps {
  
  @scala.inline
  def apply(url: String): WMSTileLayerProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WMSTileLayerProps]
  }
  
  @scala.inline
  implicit class WMSTileLayerPropsMutableBuilder[Self <: WMSTileLayerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: CrossOrigin): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setCrs(value: CRS): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
    
    @scala.inline
    def setDetectRetina(value: Boolean): Self = StObject.set(x, "detectRetina", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectRetinaUndefined: Self = StObject.set(x, "detectRetina", js.undefined)
    
    @scala.inline
    def setErrorTileUrl(value: String): Self = StObject.set(x, "errorTileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTileUrlUndefined: Self = StObject.set(x, "errorTileUrl", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLayers(value: String): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setMaxNativeZoom(value: Double): Self = StObject.set(x, "maxNativeZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNativeZoomUndefined: Self = StObject.set(x, "maxNativeZoom", js.undefined)
    
    @scala.inline
    def setMinNativeZoom(value: Double): Self = StObject.set(x, "minNativeZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNativeZoomUndefined: Self = StObject.set(x, "minNativeZoom", js.undefined)
    
    @scala.inline
    def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
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
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    @scala.inline
    def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
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
