package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialParams
  extends StObject
     with FrameStruct
     with PointKnob
     with Lcd
     with LinearRadialCommon {
  
  var area: js.UndefOr[js.Array[Section]] = js.undefined
  
  var customLayer: js.UndefOr[Any] = js.undefined
  
  var fractionalScaleDecimals: js.UndefOr[Double] = js.undefined
  
  var gaugeType: js.UndefOr[GaugeType] = js.undefined
  
  var odometerParams: js.UndefOr[OdometerParams] = js.undefined
  
  var odometerUseValue: js.UndefOr[Boolean] = js.undefined
  
  var section: js.UndefOr[js.Array[Section]] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var tickLabelOrientation: js.UndefOr[TickLabelOrientation] = js.undefined
  
  var trendColors: js.UndefOr[js.Tuple3[LedColor, LedColor, LedColor]] = js.undefined
  
  var trendVisible: js.UndefOr[Boolean] = js.undefined
  
  var useOdometer: js.UndefOr[Boolean] = js.undefined
  
  var userLedColor: js.UndefOr[LedColor] = js.undefined
  
  var userLedVisible: js.UndefOr[Boolean] = js.undefined
}
object RadialParams {
  
  inline def apply(): RadialParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadialParams] (val x: Self) extends AnyVal {
    
    inline def setArea(value: js.Array[Section]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setAreaVarargs(value: Section*): Self = StObject.set(x, "area", js.Array(value*))
    
    inline def setCustomLayer(value: Any): Self = StObject.set(x, "customLayer", value.asInstanceOf[js.Any])
    
    inline def setCustomLayerUndefined: Self = StObject.set(x, "customLayer", js.undefined)
    
    inline def setFractionalScaleDecimals(value: Double): Self = StObject.set(x, "fractionalScaleDecimals", value.asInstanceOf[js.Any])
    
    inline def setFractionalScaleDecimalsUndefined: Self = StObject.set(x, "fractionalScaleDecimals", js.undefined)
    
    inline def setGaugeType(value: GaugeType): Self = StObject.set(x, "gaugeType", value.asInstanceOf[js.Any])
    
    inline def setGaugeTypeUndefined: Self = StObject.set(x, "gaugeType", js.undefined)
    
    inline def setOdometerParams(value: OdometerParams): Self = StObject.set(x, "odometerParams", value.asInstanceOf[js.Any])
    
    inline def setOdometerParamsUndefined: Self = StObject.set(x, "odometerParams", js.undefined)
    
    inline def setOdometerUseValue(value: Boolean): Self = StObject.set(x, "odometerUseValue", value.asInstanceOf[js.Any])
    
    inline def setOdometerUseValueUndefined: Self = StObject.set(x, "odometerUseValue", js.undefined)
    
    inline def setSection(value: js.Array[Section]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSectionVarargs(value: Section*): Self = StObject.set(x, "section", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTickLabelOrientation(value: TickLabelOrientation): Self = StObject.set(x, "tickLabelOrientation", value.asInstanceOf[js.Any])
    
    inline def setTickLabelOrientationUndefined: Self = StObject.set(x, "tickLabelOrientation", js.undefined)
    
    inline def setTrendColors(value: js.Tuple3[LedColor, LedColor, LedColor]): Self = StObject.set(x, "trendColors", value.asInstanceOf[js.Any])
    
    inline def setTrendColorsUndefined: Self = StObject.set(x, "trendColors", js.undefined)
    
    inline def setTrendVisible(value: Boolean): Self = StObject.set(x, "trendVisible", value.asInstanceOf[js.Any])
    
    inline def setTrendVisibleUndefined: Self = StObject.set(x, "trendVisible", js.undefined)
    
    inline def setUseOdometer(value: Boolean): Self = StObject.set(x, "useOdometer", value.asInstanceOf[js.Any])
    
    inline def setUseOdometerUndefined: Self = StObject.set(x, "useOdometer", js.undefined)
    
    inline def setUserLedColor(value: LedColor): Self = StObject.set(x, "userLedColor", value.asInstanceOf[js.Any])
    
    inline def setUserLedColorUndefined: Self = StObject.set(x, "userLedColor", js.undefined)
    
    inline def setUserLedVisible(value: Boolean): Self = StObject.set(x, "userLedVisible", value.asInstanceOf[js.Any])
    
    inline def setUserLedVisibleUndefined: Self = StObject.set(x, "userLedVisible", js.undefined)
  }
}
