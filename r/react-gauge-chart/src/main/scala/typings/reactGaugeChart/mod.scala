package typings.reactGaugeChart

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-gauge-chart", JSImport.Default)
  @js.native
  def default(props: GaugeChartProps): ReactElement = js.native
  
  @js.native
  trait GaugeChartProps extends StObject {
    
    var animDelay: js.UndefOr[Double] = js.native
    
    var animate: js.UndefOr[Boolean] = js.native
    
    var arcPadding: js.UndefOr[Double] = js.native
    
    var arcWidth: js.UndefOr[Double] = js.native
    
    var arcsLength: js.UndefOr[js.Array[Double]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var colors: js.UndefOr[js.Array[String]] = js.native
    
    var cornerRadius: js.UndefOr[Double] = js.native
    
    var fontSize: js.UndefOr[String] = js.native
    
    var formatTextValue: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
    
    var hideText: js.UndefOr[Boolean] = js.native
    
    var id: String = js.native
    
    var marginInPercent: js.UndefOr[Double] = js.native
    
    var needleBaseColor: js.UndefOr[String] = js.native
    
    var needleColor: js.UndefOr[String] = js.native
    
    var nrOfLevels: js.UndefOr[Double] = js.native
    
    var percent: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var textColor: js.UndefOr[String] = js.native
  }
  object GaugeChartProps {
    
    @scala.inline
    def apply(id: String): GaugeChartProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaugeChartProps]
    }
    
    @scala.inline
    implicit class GaugeChartPropsMutableBuilder[Self <: GaugeChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimDelay(value: Double): Self = StObject.set(x, "animDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimDelayUndefined: Self = StObject.set(x, "animDelay", js.undefined)
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setArcPadding(value: Double): Self = StObject.set(x, "arcPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArcPaddingUndefined: Self = StObject.set(x, "arcPadding", js.undefined)
      
      @scala.inline
      def setArcWidth(value: Double): Self = StObject.set(x, "arcWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArcWidthUndefined: Self = StObject.set(x, "arcWidth", js.undefined)
      
      @scala.inline
      def setArcsLength(value: js.Array[Double]): Self = StObject.set(x, "arcsLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArcsLengthUndefined: Self = StObject.set(x, "arcsLength", js.undefined)
      
      @scala.inline
      def setArcsLengthVarargs(value: Double*): Self = StObject.set(x, "arcsLength", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFormatTextValue(value: /* value */ String => String): Self = StObject.set(x, "formatTextValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatTextValueUndefined: Self = StObject.set(x, "formatTextValue", js.undefined)
      
      @scala.inline
      def setHideText(value: Boolean): Self = StObject.set(x, "hideText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideTextUndefined: Self = StObject.set(x, "hideText", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginInPercent(value: Double): Self = StObject.set(x, "marginInPercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginInPercentUndefined: Self = StObject.set(x, "marginInPercent", js.undefined)
      
      @scala.inline
      def setNeedleBaseColor(value: String): Self = StObject.set(x, "needleBaseColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedleBaseColorUndefined: Self = StObject.set(x, "needleBaseColor", js.undefined)
      
      @scala.inline
      def setNeedleColor(value: String): Self = StObject.set(x, "needleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedleColorUndefined: Self = StObject.set(x, "needleColor", js.undefined)
      
      @scala.inline
      def setNrOfLevels(value: Double): Self = StObject.set(x, "nrOfLevels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNrOfLevelsUndefined: Self = StObject.set(x, "nrOfLevels", js.undefined)
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    }
  }
}
