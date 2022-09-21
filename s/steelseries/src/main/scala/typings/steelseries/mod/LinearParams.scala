package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<steelseries.steelseries.FrameStruct, 'foregroundType'> */
/* Inlined parent steelseries.steelseries.Lcd */
/* Inlined parent steelseries.steelseries.LinearRadialCommon */
trait LinearParams extends StObject {
  
  var alarmSound: js.UndefOr[String] = js.undefined
  
  var backgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  var backgroundVisible: js.UndefOr[Boolean] = js.undefined
  
  var digitalFont: js.UndefOr[Boolean] = js.undefined
  
  var foregroundVisible: js.UndefOr[Boolean] = js.undefined
  
  var frameDesign: js.UndefOr[FrameDesign] = js.undefined
  
  var frameVisible: js.UndefOr[Boolean] = js.undefined
  
  var fullScaleDeflectionTime: js.UndefOr[Double] = js.undefined
  
  var gaugeType: js.UndefOr[GaugeType] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var labelNumberFormat: js.UndefOr[LabelNumberFormat] = js.undefined
  
  var lcdColor: js.UndefOr[LcdColor] = js.undefined
  
  // Omit<> in DisplayMulti, DisplaySingle
  var lcdDecimals: js.UndefOr[Double] = js.undefined
  
  var lcdVisible: js.UndefOr[Boolean] = js.undefined
  
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
  
  var valueColor: js.UndefOr[ColorDef] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object LinearParams {
  
  inline def apply(): LinearParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearParams]
  }
  
  extension [Self <: LinearParams](x: Self) {
    
    inline def setAlarmSound(value: String): Self = StObject.set(x, "alarmSound", value.asInstanceOf[js.Any])
    
    inline def setAlarmSoundUndefined: Self = StObject.set(x, "alarmSound", js.undefined)
    
    inline def setBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundVisible(value: Boolean): Self = StObject.set(x, "backgroundVisible", value.asInstanceOf[js.Any])
    
    inline def setBackgroundVisibleUndefined: Self = StObject.set(x, "backgroundVisible", js.undefined)
    
    inline def setDigitalFont(value: Boolean): Self = StObject.set(x, "digitalFont", value.asInstanceOf[js.Any])
    
    inline def setDigitalFontUndefined: Self = StObject.set(x, "digitalFont", js.undefined)
    
    inline def setForegroundVisible(value: Boolean): Self = StObject.set(x, "foregroundVisible", value.asInstanceOf[js.Any])
    
    inline def setForegroundVisibleUndefined: Self = StObject.set(x, "foregroundVisible", js.undefined)
    
    inline def setFrameDesign(value: FrameDesign): Self = StObject.set(x, "frameDesign", value.asInstanceOf[js.Any])
    
    inline def setFrameDesignUndefined: Self = StObject.set(x, "frameDesign", js.undefined)
    
    inline def setFrameVisible(value: Boolean): Self = StObject.set(x, "frameVisible", value.asInstanceOf[js.Any])
    
    inline def setFrameVisibleUndefined: Self = StObject.set(x, "frameVisible", js.undefined)
    
    inline def setFullScaleDeflectionTime(value: Double): Self = StObject.set(x, "fullScaleDeflectionTime", value.asInstanceOf[js.Any])
    
    inline def setFullScaleDeflectionTimeUndefined: Self = StObject.set(x, "fullScaleDeflectionTime", js.undefined)
    
    inline def setGaugeType(value: GaugeType): Self = StObject.set(x, "gaugeType", value.asInstanceOf[js.Any])
    
    inline def setGaugeTypeUndefined: Self = StObject.set(x, "gaugeType", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLabelNumberFormat(value: LabelNumberFormat): Self = StObject.set(x, "labelNumberFormat", value.asInstanceOf[js.Any])
    
    inline def setLabelNumberFormatUndefined: Self = StObject.set(x, "labelNumberFormat", js.undefined)
    
    inline def setLcdColor(value: LcdColor): Self = StObject.set(x, "lcdColor", value.asInstanceOf[js.Any])
    
    inline def setLcdColorUndefined: Self = StObject.set(x, "lcdColor", js.undefined)
    
    inline def setLcdDecimals(value: Double): Self = StObject.set(x, "lcdDecimals", value.asInstanceOf[js.Any])
    
    inline def setLcdDecimalsUndefined: Self = StObject.set(x, "lcdDecimals", js.undefined)
    
    inline def setLcdVisible(value: Boolean): Self = StObject.set(x, "lcdVisible", value.asInstanceOf[js.Any])
    
    inline def setLcdVisibleUndefined: Self = StObject.set(x, "lcdVisible", js.undefined)
    
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
    
    inline def setValueColor(value: ColorDef): Self = StObject.set(x, "valueColor", value.asInstanceOf[js.Any])
    
    inline def setValueColorUndefined: Self = StObject.set(x, "valueColor", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
