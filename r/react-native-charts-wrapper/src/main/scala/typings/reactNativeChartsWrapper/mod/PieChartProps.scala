package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieChartProps
  extends StObject
     with PieRadarChartBase {
  
  var centerText: js.UndefOr[String] = js.undefined
  
  var centerTextRadiusPercent: js.UndefOr[Double] = js.undefined
  
  var data: js.UndefOr[PieData] = js.undefined
  
  var drawEntryLabels: js.UndefOr[Boolean] = js.undefined
  
  var entryLabelColor: js.UndefOr[Color] = js.undefined
  
  var entryLabelTextSize: js.UndefOr[Double] = js.undefined
  
  var holeColor: js.UndefOr[Color] = js.undefined
  
  var holeRadius: js.UndefOr[Double] = js.undefined
  
  var maxAngle: js.UndefOr[Double] = js.undefined
  
  var styledCenterText: js.UndefOr[typings.reactNativeChartsWrapper.anon.Color] = js.undefined
  
  var transparentCircleColor: js.UndefOr[Color] = js.undefined
  
  var transparentCircleRadius: js.UndefOr[Double] = js.undefined
  
  var usePercentValues: js.UndefOr[Boolean] = js.undefined
}
object PieChartProps {
  
  inline def apply(): PieChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartProps]
  }
  
  extension [Self <: PieChartProps](x: Self) {
    
    inline def setCenterText(value: String): Self = StObject.set(x, "centerText", value.asInstanceOf[js.Any])
    
    inline def setCenterTextRadiusPercent(value: Double): Self = StObject.set(x, "centerTextRadiusPercent", value.asInstanceOf[js.Any])
    
    inline def setCenterTextRadiusPercentUndefined: Self = StObject.set(x, "centerTextRadiusPercent", js.undefined)
    
    inline def setCenterTextUndefined: Self = StObject.set(x, "centerText", js.undefined)
    
    inline def setData(value: PieData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDrawEntryLabels(value: Boolean): Self = StObject.set(x, "drawEntryLabels", value.asInstanceOf[js.Any])
    
    inline def setDrawEntryLabelsUndefined: Self = StObject.set(x, "drawEntryLabels", js.undefined)
    
    inline def setEntryLabelColor(value: Color): Self = StObject.set(x, "entryLabelColor", value.asInstanceOf[js.Any])
    
    inline def setEntryLabelColorUndefined: Self = StObject.set(x, "entryLabelColor", js.undefined)
    
    inline def setEntryLabelTextSize(value: Double): Self = StObject.set(x, "entryLabelTextSize", value.asInstanceOf[js.Any])
    
    inline def setEntryLabelTextSizeUndefined: Self = StObject.set(x, "entryLabelTextSize", js.undefined)
    
    inline def setHoleColor(value: Color): Self = StObject.set(x, "holeColor", value.asInstanceOf[js.Any])
    
    inline def setHoleColorUndefined: Self = StObject.set(x, "holeColor", js.undefined)
    
    inline def setHoleRadius(value: Double): Self = StObject.set(x, "holeRadius", value.asInstanceOf[js.Any])
    
    inline def setHoleRadiusUndefined: Self = StObject.set(x, "holeRadius", js.undefined)
    
    inline def setMaxAngle(value: Double): Self = StObject.set(x, "maxAngle", value.asInstanceOf[js.Any])
    
    inline def setMaxAngleUndefined: Self = StObject.set(x, "maxAngle", js.undefined)
    
    inline def setStyledCenterText(value: typings.reactNativeChartsWrapper.anon.Color): Self = StObject.set(x, "styledCenterText", value.asInstanceOf[js.Any])
    
    inline def setStyledCenterTextUndefined: Self = StObject.set(x, "styledCenterText", js.undefined)
    
    inline def setTransparentCircleColor(value: Color): Self = StObject.set(x, "transparentCircleColor", value.asInstanceOf[js.Any])
    
    inline def setTransparentCircleColorUndefined: Self = StObject.set(x, "transparentCircleColor", js.undefined)
    
    inline def setTransparentCircleRadius(value: Double): Self = StObject.set(x, "transparentCircleRadius", value.asInstanceOf[js.Any])
    
    inline def setTransparentCircleRadiusUndefined: Self = StObject.set(x, "transparentCircleRadius", js.undefined)
    
    inline def setUsePercentValues(value: Boolean): Self = StObject.set(x, "usePercentValues", value.asInstanceOf[js.Any])
    
    inline def setUsePercentValuesUndefined: Self = StObject.set(x, "usePercentValues", js.undefined)
  }
}
