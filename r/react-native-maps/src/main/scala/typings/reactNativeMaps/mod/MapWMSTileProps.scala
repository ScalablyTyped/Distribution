package typings.reactNativeMaps.mod

import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapWMSTileProps extends ViewProps {
  
  var maximumZ: js.UndefOr[Double] = js.native
  
  var minimumZ: js.UndefOr[Double] = js.native
  
  var opacity: Double = js.native
  
  var tileSize: Double = js.native
  
  var urlTemplate: String = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object MapWMSTileProps {
  
  @scala.inline
  def apply(opacity: Double, tileSize: Double, urlTemplate: String): MapWMSTileProps = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any], urlTemplate = urlTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapWMSTileProps]
  }
  
  @scala.inline
  implicit class MapWMSTilePropsMutableBuilder[Self <: MapWMSTileProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumZ(value: Double): Self = StObject.set(x, "maximumZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumZUndefined: Self = StObject.set(x, "maximumZ", js.undefined)
    
    @scala.inline
    def setMinimumZ(value: Double): Self = StObject.set(x, "minimumZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumZUndefined: Self = StObject.set(x, "minimumZ", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlTemplate(value: String): Self = StObject.set(x, "urlTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
