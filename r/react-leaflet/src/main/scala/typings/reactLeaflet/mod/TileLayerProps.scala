package typings.reactLeaflet.mod

import typings.leaflet.mod.CrossOrigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.GridLayerOptions because Already inherited
- typings.leaflet.mod.TileLayerOptions because var conflicts: attribution, bounds, className, keepBuffer, maxZoom, minZoom, noWrap, opacity, pane, tileSize, updateInterval, updateWhenIdle, updateWhenZooming, zIndex. Inlined minNativeZoom, zoomOffset, errorTileUrl, maxNativeZoom, zoomReverse, subdomains, id, tms, accessToken, crossOrigin, detectRetina */ trait TileLayerProps
  extends StObject
     with GridLayerProps
     with TileLayerEvents {
  
  var accessToken: js.UndefOr[String] = js.undefined
  
  var crossOrigin: js.UndefOr[CrossOrigin] = js.undefined
  
  var detectRetina: js.UndefOr[Boolean] = js.undefined
  
  var errorTileUrl: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var maxNativeZoom: js.UndefOr[Double] = js.undefined
  
  var minNativeZoom: js.UndefOr[Double] = js.undefined
  
  var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var tms: js.UndefOr[Boolean] = js.undefined
  
  var url: String
  
  var zoomOffset: js.UndefOr[Double] = js.undefined
  
  var zoomReverse: js.UndefOr[Boolean] = js.undefined
}
object TileLayerProps {
  
  inline def apply(url: String): TileLayerProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayerProps]
  }
  
  extension [Self <: TileLayerProps](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setCrossOrigin(value: CrossOrigin): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDetectRetina(value: Boolean): Self = StObject.set(x, "detectRetina", value.asInstanceOf[js.Any])
    
    inline def setDetectRetinaUndefined: Self = StObject.set(x, "detectRetina", js.undefined)
    
    inline def setErrorTileUrl(value: String): Self = StObject.set(x, "errorTileUrl", value.asInstanceOf[js.Any])
    
    inline def setErrorTileUrlUndefined: Self = StObject.set(x, "errorTileUrl", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMaxNativeZoom(value: Double): Self = StObject.set(x, "maxNativeZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxNativeZoomUndefined: Self = StObject.set(x, "maxNativeZoom", js.undefined)
    
    inline def setMinNativeZoom(value: Double): Self = StObject.set(x, "minNativeZoom", value.asInstanceOf[js.Any])
    
    inline def setMinNativeZoomUndefined: Self = StObject.set(x, "minNativeZoom", js.undefined)
    
    inline def setSubdomains(value: String | js.Array[String]): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
    
    inline def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
    
    inline def setSubdomainsVarargs(value: String*): Self = StObject.set(x, "subdomains", js.Array(value :_*))
    
    inline def setTms(value: Boolean): Self = StObject.set(x, "tms", value.asInstanceOf[js.Any])
    
    inline def setTmsUndefined: Self = StObject.set(x, "tms", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setZoomOffset(value: Double): Self = StObject.set(x, "zoomOffset", value.asInstanceOf[js.Any])
    
    inline def setZoomOffsetUndefined: Self = StObject.set(x, "zoomOffset", js.undefined)
    
    inline def setZoomReverse(value: Boolean): Self = StObject.set(x, "zoomReverse", value.asInstanceOf[js.Any])
    
    inline def setZoomReverseUndefined: Self = StObject.set(x, "zoomReverse", js.undefined)
  }
}
