package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// All Linear and Radial common parameters
trait LinearRadialCommon extends StObject {
  
  var alarmSound: js.UndefOr[String] = js.undefined
  
  var fullScaleDeflectionTime: js.UndefOr[Double] = js.undefined
  
  var labelNumberFormat: js.UndefOr[LabelNumberFormat] = js.undefined
  
  var ledColor: js.UndefOr[LedColor] = js.undefined
  
  var ledVisible: js.UndefOr[Boolean] = js.undefined
  
  // Omit<> in RadialBargraph
  var maxMeasuredValueVisible: js.UndefOr[Boolean] = js.undefined
  
  var maxValue: js.UndefOr[Double] = js.undefined
  
  var minMeasuredValueVisible: js.UndefOr[Boolean] = js.undefined
  
  var minValue: js.UndefOr[Double] = js.undefined
  
  // Omit<> in RadialBargraph
  var niceScale: js.UndefOr[Boolean] = js.undefined
  
  // & WindDir
  var playAlarm: js.UndefOr[Boolean] = js.undefined
  
  var threshold: js.UndefOr[Double] = js.undefined
  
  var thresholdRising: js.UndefOr[Boolean] = js.undefined
  
  var thresholdVisible: js.UndefOr[Boolean] = js.undefined
  
  var titleString: js.UndefOr[String] = js.undefined
  
  var unitString: js.UndefOr[String] = js.undefined
}
object LinearRadialCommon {
  
  inline def apply(): LinearRadialCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearRadialCommon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinearRadialCommon] (val x: Self) extends AnyVal {
    
    inline def setAlarmSound(value: String): Self = StObject.set(x, "alarmSound", value.asInstanceOf[js.Any])
    
    inline def setAlarmSoundUndefined: Self = StObject.set(x, "alarmSound", js.undefined)
    
    inline def setFullScaleDeflectionTime(value: Double): Self = StObject.set(x, "fullScaleDeflectionTime", value.asInstanceOf[js.Any])
    
    inline def setFullScaleDeflectionTimeUndefined: Self = StObject.set(x, "fullScaleDeflectionTime", js.undefined)
    
    inline def setLabelNumberFormat(value: LabelNumberFormat): Self = StObject.set(x, "labelNumberFormat", value.asInstanceOf[js.Any])
    
    inline def setLabelNumberFormatUndefined: Self = StObject.set(x, "labelNumberFormat", js.undefined)
    
    inline def setLedColor(value: LedColor): Self = StObject.set(x, "ledColor", value.asInstanceOf[js.Any])
    
    inline def setLedColorUndefined: Self = StObject.set(x, "ledColor", js.undefined)
    
    inline def setLedVisible(value: Boolean): Self = StObject.set(x, "ledVisible", value.asInstanceOf[js.Any])
    
    inline def setLedVisibleUndefined: Self = StObject.set(x, "ledVisible", js.undefined)
    
    inline def setMaxMeasuredValueVisible(value: Boolean): Self = StObject.set(x, "maxMeasuredValueVisible", value.asInstanceOf[js.Any])
    
    inline def setMaxMeasuredValueVisibleUndefined: Self = StObject.set(x, "maxMeasuredValueVisible", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinMeasuredValueVisible(value: Boolean): Self = StObject.set(x, "minMeasuredValueVisible", value.asInstanceOf[js.Any])
    
    inline def setMinMeasuredValueVisibleUndefined: Self = StObject.set(x, "minMeasuredValueVisible", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setNiceScale(value: Boolean): Self = StObject.set(x, "niceScale", value.asInstanceOf[js.Any])
    
    inline def setNiceScaleUndefined: Self = StObject.set(x, "niceScale", js.undefined)
    
    inline def setPlayAlarm(value: Boolean): Self = StObject.set(x, "playAlarm", value.asInstanceOf[js.Any])
    
    inline def setPlayAlarmUndefined: Self = StObject.set(x, "playAlarm", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdRising(value: Boolean): Self = StObject.set(x, "thresholdRising", value.asInstanceOf[js.Any])
    
    inline def setThresholdRisingUndefined: Self = StObject.set(x, "thresholdRising", js.undefined)
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setThresholdVisible(value: Boolean): Self = StObject.set(x, "thresholdVisible", value.asInstanceOf[js.Any])
    
    inline def setThresholdVisibleUndefined: Self = StObject.set(x, "thresholdVisible", js.undefined)
    
    inline def setTitleString(value: String): Self = StObject.set(x, "titleString", value.asInstanceOf[js.Any])
    
    inline def setTitleStringUndefined: Self = StObject.set(x, "titleString", js.undefined)
    
    inline def setUnitString(value: String): Self = StObject.set(x, "unitString", value.asInstanceOf[js.Any])
    
    inline def setUnitStringUndefined: Self = StObject.set(x, "unitString", js.undefined)
  }
}
