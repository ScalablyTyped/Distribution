package typings.reactNativeMaps.mod

import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLocalTileProps extends ViewProps {
  
  var pathTemplate: String = js.native
  
  var tileSize: js.UndefOr[Double] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object MapLocalTileProps {
  
  @scala.inline
  def apply(pathTemplate: String): MapLocalTileProps = {
    val __obj = js.Dynamic.literal(pathTemplate = pathTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLocalTileProps]
  }
  
  @scala.inline
  implicit class MapLocalTilePropsMutableBuilder[Self <: MapLocalTileProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPathTemplate(value: String): Self = StObject.set(x, "pathTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
