package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonDatasetConfig extends StObject {
  
  var axisDependency: js.UndefOr[AxisDependency] = js.undefined
  
  var color: js.UndefOr[Color] = js.undefined
  
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  
  var drawValues: js.UndefOr[Boolean] = js.undefined
  
  var highlightEnabled: js.UndefOr[Boolean] = js.undefined
  
  var valueFormatter: js.UndefOr[ValueFormatter] = js.undefined
  
  var valueTextColor: js.UndefOr[Color] = js.undefined
  
  var valueTextSize: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object CommonDatasetConfig {
  
  inline def apply(): CommonDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonDatasetConfig]
  }
  
  extension [Self <: CommonDatasetConfig](x: Self) {
    
    inline def setAxisDependency(value: AxisDependency): Self = StObject.set(x, "axisDependency", value.asInstanceOf[js.Any])
    
    inline def setAxisDependencyUndefined: Self = StObject.set(x, "axisDependency", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setDrawValues(value: Boolean): Self = StObject.set(x, "drawValues", value.asInstanceOf[js.Any])
    
    inline def setDrawValuesUndefined: Self = StObject.set(x, "drawValues", js.undefined)
    
    inline def setHighlightEnabled(value: Boolean): Self = StObject.set(x, "highlightEnabled", value.asInstanceOf[js.Any])
    
    inline def setHighlightEnabledUndefined: Self = StObject.set(x, "highlightEnabled", js.undefined)
    
    inline def setValueFormatter(value: ValueFormatter): Self = StObject.set(x, "valueFormatter", value.asInstanceOf[js.Any])
    
    inline def setValueFormatterUndefined: Self = StObject.set(x, "valueFormatter", js.undefined)
    
    inline def setValueFormatterVarargs(value: String*): Self = StObject.set(x, "valueFormatter", js.Array(value*))
    
    inline def setValueTextColor(value: Color): Self = StObject.set(x, "valueTextColor", value.asInstanceOf[js.Any])
    
    inline def setValueTextColorUndefined: Self = StObject.set(x, "valueTextColor", js.undefined)
    
    inline def setValueTextSize(value: Double): Self = StObject.set(x, "valueTextSize", value.asInstanceOf[js.Any])
    
    inline def setValueTextSizeUndefined: Self = StObject.set(x, "valueTextSize", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
