package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent steelseries.steelseries.FrameStruct */
/* Inlined parent std.Omit<steelseries.steelseries.PointKnob, 'knobType' | 'knobStyle'> */
trait ClockParams extends StObject {
  
  var backgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  // Omit<> in Horizon
  var backgroundVisible: js.UndefOr[Boolean] = js.undefined
  
  var customLayer: Any
  
  // Omit<> in Horizon
  var foregroundType: js.UndefOr[ForegroundType] = js.undefined
  
  // Omit<> in Linear*
  var foregroundVisible: js.UndefOr[Boolean] = js.undefined
  
  var frameDesign: js.UndefOr[FrameDesign] = js.undefined
  
  var frameVisible: js.UndefOr[Boolean] = js.undefined
  
  var hour: Double
  
  var isAutomatic: Boolean
  
  var minute: Double
  
  var pointerColor: js.UndefOr[ColorDef] = js.undefined
  
  var pointerType: js.UndefOr[PointerType] = js.undefined
  
  var second: Double
  
  var secondMovesContinuous: Boolean
  
  var secondPointerVisible: Boolean
  
  var size: Double
  
  var timeZoneOffsetHour: Double
  
  var timeZoneOffsetMinute: Double
}
object ClockParams {
  
  inline def apply(
    customLayer: Any,
    hour: Double,
    isAutomatic: Boolean,
    minute: Double,
    second: Double,
    secondMovesContinuous: Boolean,
    secondPointerVisible: Boolean,
    size: Double,
    timeZoneOffsetHour: Double,
    timeZoneOffsetMinute: Double
  ): ClockParams = {
    val __obj = js.Dynamic.literal(customLayer = customLayer.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], isAutomatic = isAutomatic.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], secondMovesContinuous = secondMovesContinuous.asInstanceOf[js.Any], secondPointerVisible = secondPointerVisible.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeZoneOffsetHour = timeZoneOffsetHour.asInstanceOf[js.Any], timeZoneOffsetMinute = timeZoneOffsetMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClockParams]
  }
  
  extension [Self <: ClockParams](x: Self) {
    
    inline def setBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundVisible(value: Boolean): Self = StObject.set(x, "backgroundVisible", value.asInstanceOf[js.Any])
    
    inline def setBackgroundVisibleUndefined: Self = StObject.set(x, "backgroundVisible", js.undefined)
    
    inline def setCustomLayer(value: Any): Self = StObject.set(x, "customLayer", value.asInstanceOf[js.Any])
    
    inline def setForegroundType(value: ForegroundType): Self = StObject.set(x, "foregroundType", value.asInstanceOf[js.Any])
    
    inline def setForegroundTypeUndefined: Self = StObject.set(x, "foregroundType", js.undefined)
    
    inline def setForegroundVisible(value: Boolean): Self = StObject.set(x, "foregroundVisible", value.asInstanceOf[js.Any])
    
    inline def setForegroundVisibleUndefined: Self = StObject.set(x, "foregroundVisible", js.undefined)
    
    inline def setFrameDesign(value: FrameDesign): Self = StObject.set(x, "frameDesign", value.asInstanceOf[js.Any])
    
    inline def setFrameDesignUndefined: Self = StObject.set(x, "frameDesign", js.undefined)
    
    inline def setFrameVisible(value: Boolean): Self = StObject.set(x, "frameVisible", value.asInstanceOf[js.Any])
    
    inline def setFrameVisibleUndefined: Self = StObject.set(x, "frameVisible", js.undefined)
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setIsAutomatic(value: Boolean): Self = StObject.set(x, "isAutomatic", value.asInstanceOf[js.Any])
    
    inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setPointerColor(value: ColorDef): Self = StObject.set(x, "pointerColor", value.asInstanceOf[js.Any])
    
    inline def setPointerColorUndefined: Self = StObject.set(x, "pointerColor", js.undefined)
    
    inline def setPointerType(value: PointerType): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPointerTypeUndefined: Self = StObject.set(x, "pointerType", js.undefined)
    
    inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondMovesContinuous(value: Boolean): Self = StObject.set(x, "secondMovesContinuous", value.asInstanceOf[js.Any])
    
    inline def setSecondPointerVisible(value: Boolean): Self = StObject.set(x, "secondPointerVisible", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneOffsetHour(value: Double): Self = StObject.set(x, "timeZoneOffsetHour", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneOffsetMinute(value: Double): Self = StObject.set(x, "timeZoneOffsetMinute", value.asInstanceOf[js.Any])
  }
}
