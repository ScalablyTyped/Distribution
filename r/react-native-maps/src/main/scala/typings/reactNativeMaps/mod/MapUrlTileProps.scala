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
  
  @scala.inline
  def apply(urlTemplate: String): MapUrlTileProps = {
    val __obj = js.Dynamic.literal(urlTemplate = urlTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapUrlTileProps]
  }
  
  @scala.inline
  implicit class MapUrlTilePropsMutableBuilder[Self <: MapUrlTileProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumZ(value: Double): Self = StObject.set(x, "maximumZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumZUndefined: Self = StObject.set(x, "maximumZ", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    @scala.inline
    def setUrlTemplate(value: String): Self = StObject.set(x, "urlTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
