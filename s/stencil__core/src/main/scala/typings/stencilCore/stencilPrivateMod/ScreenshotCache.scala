package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotCache extends StObject {
  
  var items: js.UndefOr[js.Array[Key]] = js.undefined
  
  var lastBuildId: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var timestamp: js.UndefOr[Double] = js.undefined
}
object ScreenshotCache {
  
  inline def apply(): ScreenshotCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenshotCache]
  }
  
  extension [Self <: ScreenshotCache](x: Self) {
    
    inline def setItems(value: js.Array[Key]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Key*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLastBuildId(value: String): Self = StObject.set(x, "lastBuildId", value.asInstanceOf[js.Any])
    
    inline def setLastBuildIdUndefined: Self = StObject.set(x, "lastBuildId", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
