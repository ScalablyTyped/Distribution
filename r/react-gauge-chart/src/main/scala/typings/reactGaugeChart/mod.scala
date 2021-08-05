package typings.reactGaugeChart

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-gauge-chart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: GaugeChartProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait GaugeChartProps extends StObject {
    
    var animDelay: js.UndefOr[Double] = js.undefined
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var arcPadding: js.UndefOr[Double] = js.undefined
    
    var arcWidth: js.UndefOr[Double] = js.undefined
    
    var arcsLength: js.UndefOr[js.Array[Double]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var colors: js.UndefOr[js.Array[String]] = js.undefined
    
    var cornerRadius: js.UndefOr[Double] = js.undefined
    
    var fontSize: js.UndefOr[String] = js.undefined
    
    var formatTextValue: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
    
    var hideText: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var marginInPercent: js.UndefOr[Double] = js.undefined
    
    var needleBaseColor: js.UndefOr[String] = js.undefined
    
    var needleColor: js.UndefOr[String] = js.undefined
    
    var nrOfLevels: js.UndefOr[Double] = js.undefined
    
    var percent: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var textColor: js.UndefOr[String] = js.undefined
  }
  object GaugeChartProps {
    
    inline def apply(id: String): GaugeChartProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaugeChartProps]
    }
    
    extension [Self <: GaugeChartProps](x: Self) {
      
      inline def setAnimDelay(value: Double): Self = StObject.set(x, "animDelay", value.asInstanceOf[js.Any])
      
      inline def setAnimDelayUndefined: Self = StObject.set(x, "animDelay", js.undefined)
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setArcPadding(value: Double): Self = StObject.set(x, "arcPadding", value.asInstanceOf[js.Any])
      
      inline def setArcPaddingUndefined: Self = StObject.set(x, "arcPadding", js.undefined)
      
      inline def setArcWidth(value: Double): Self = StObject.set(x, "arcWidth", value.asInstanceOf[js.Any])
      
      inline def setArcWidthUndefined: Self = StObject.set(x, "arcWidth", js.undefined)
      
      inline def setArcsLength(value: js.Array[Double]): Self = StObject.set(x, "arcsLength", value.asInstanceOf[js.Any])
      
      inline def setArcsLengthUndefined: Self = StObject.set(x, "arcsLength", js.undefined)
      
      inline def setArcsLengthVarargs(value: Double*): Self = StObject.set(x, "arcsLength", js.Array(value :_*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFormatTextValue(value: /* value */ String => String): Self = StObject.set(x, "formatTextValue", js.Any.fromFunction1(value))
      
      inline def setFormatTextValueUndefined: Self = StObject.set(x, "formatTextValue", js.undefined)
      
      inline def setHideText(value: Boolean): Self = StObject.set(x, "hideText", value.asInstanceOf[js.Any])
      
      inline def setHideTextUndefined: Self = StObject.set(x, "hideText", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMarginInPercent(value: Double): Self = StObject.set(x, "marginInPercent", value.asInstanceOf[js.Any])
      
      inline def setMarginInPercentUndefined: Self = StObject.set(x, "marginInPercent", js.undefined)
      
      inline def setNeedleBaseColor(value: String): Self = StObject.set(x, "needleBaseColor", value.asInstanceOf[js.Any])
      
      inline def setNeedleBaseColorUndefined: Self = StObject.set(x, "needleBaseColor", js.undefined)
      
      inline def setNeedleColor(value: String): Self = StObject.set(x, "needleColor", value.asInstanceOf[js.Any])
      
      inline def setNeedleColorUndefined: Self = StObject.set(x, "needleColor", js.undefined)
      
      inline def setNrOfLevels(value: Double): Self = StObject.set(x, "nrOfLevels", value.asInstanceOf[js.Any])
      
      inline def setNrOfLevelsUndefined: Self = StObject.set(x, "nrOfLevels", js.undefined)
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    }
  }
}
