package typings.reactNativeMaps.mod

import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLocalTileProps
  extends StObject
     with ViewProps {
  
  var pathTemplate: String
  
  var tileSize: js.UndefOr[Double] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object MapLocalTileProps {
  
  inline def apply(pathTemplate: String): MapLocalTileProps = {
    val __obj = js.Dynamic.literal(pathTemplate = pathTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLocalTileProps]
  }
  
  extension [Self <: MapLocalTileProps](x: Self) {
    
    inline def setPathTemplate(value: String): Self = StObject.set(x, "pathTemplate", value.asInstanceOf[js.Any])
    
    inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
