package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Gauge Params Interfaces */
// Frame, Background and Foreground
trait FrameStruct extends StObject {
  
  var backgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  // Omit<> in Horizon
  var backgroundVisible: js.UndefOr[Boolean] = js.undefined
  
  // Omit<> in Horizon
  var foregroundType: js.UndefOr[ForegroundType] = js.undefined
  
  // Omit<> in Linear*
  var foregroundVisible: js.UndefOr[Boolean] = js.undefined
  
  var frameDesign: js.UndefOr[FrameDesign] = js.undefined
  
  var frameVisible: js.UndefOr[Boolean] = js.undefined
}
object FrameStruct {
  
  inline def apply(): FrameStruct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameStruct]
  }
  
  extension [Self <: FrameStruct](x: Self) {
    
    inline def setBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundVisible(value: Boolean): Self = StObject.set(x, "backgroundVisible", value.asInstanceOf[js.Any])
    
    inline def setBackgroundVisibleUndefined: Self = StObject.set(x, "backgroundVisible", js.undefined)
    
    inline def setForegroundType(value: ForegroundType): Self = StObject.set(x, "foregroundType", value.asInstanceOf[js.Any])
    
    inline def setForegroundTypeUndefined: Self = StObject.set(x, "foregroundType", js.undefined)
    
    inline def setForegroundVisible(value: Boolean): Self = StObject.set(x, "foregroundVisible", value.asInstanceOf[js.Any])
    
    inline def setForegroundVisibleUndefined: Self = StObject.set(x, "foregroundVisible", js.undefined)
    
    inline def setFrameDesign(value: FrameDesign): Self = StObject.set(x, "frameDesign", value.asInstanceOf[js.Any])
    
    inline def setFrameDesignUndefined: Self = StObject.set(x, "frameDesign", js.undefined)
    
    inline def setFrameVisible(value: Boolean): Self = StObject.set(x, "frameVisible", value.asInstanceOf[js.Any])
    
    inline def setFrameVisibleUndefined: Self = StObject.set(x, "frameVisible", js.undefined)
  }
}
