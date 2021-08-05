package typings.reactNativeMaps.mod

import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapUrlTileProps
  extends StObject
     with ViewProps {
  
  var maximumZ: js.UndefOr[Double] = js.undefined
  
  var tileSize: js.UndefOr[Double] = js.undefined
  
  var urlTemplate: String
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object MapUrlTileProps {
  
  inline def apply(urlTemplate: String): MapUrlTileProps = {
    val __obj = js.Dynamic.literal(urlTemplate = urlTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapUrlTileProps]
  }
  
  extension [Self <: MapUrlTileProps](x: Self) {
    
    inline def setMaximumZ(value: Double): Self = StObject.set(x, "maximumZ", value.asInstanceOf[js.Any])
    
    inline def setMaximumZUndefined: Self = StObject.set(x, "maximumZ", js.undefined)
    
    inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    inline def setUrlTemplate(value: String): Self = StObject.set(x, "urlTemplate", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
