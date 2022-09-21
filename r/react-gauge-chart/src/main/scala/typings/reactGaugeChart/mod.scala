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
    
    /**
      * Delay in ms before starting the needle animation
      * @default 500
      */
    var animDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether or not to animate the needle when loaded
      * @default true
      */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Duration in ms for the needle animation
      * @default 3000
      */
    var animateDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * The distance between the elements in the arc
      * @default 0.05
      */
    var arcPadding: js.UndefOr[Double] = js.undefined
    
    /**
      * The thickness of the arc
      * @default 0.2
      */
    var arcWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * An array specifying the length of each individual arc. If this prop is set, the nrOfLevels prop will have no effect
      */
    var arcsLength: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Add className to the div container
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * An array of colors in HEX format displayed in the arc
      * @default ["#00FF00", "#FF0000"]
      */
    var colors: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Corner radius for the elements in the chart
      * @default 6
      */
    var cornerRadius: js.UndefOr[Double] = js.undefined
    
    /**
      * The font size of gauge text
      * @default null
      */
    var fontSize: js.UndefOr[String] = js.undefined
    
    /**
      * Format you own text value
      * @example
      * ```
      * (value) => value + '%'
      * ```
      * @default null
      */
    var formatTextValue: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
    
    /**
      * Whether or not to hide the percentage display
      * @default false
      */
    var hideText: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used for the identification of the div surrounding the chart
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Margin for the chart inside the containing SVG element
      * @default 0.05
      */
    var marginInPercent: js.UndefOr[Double] = js.undefined
    
    /**
      * The color of the circle at the base of the needle
      * @default "#464A4F"
      */
    var needleBaseColor: js.UndefOr[String] = js.undefined
    
    /**
      * The color of the needle triangle
      * @default "#464A4F"
      */
    var needleColor: js.UndefOr[String] = js.undefined
    
    /**
      * The number of elements displayed in the arc
      * @default 3
      */
    var nrOfLevels: js.UndefOr[Double] = js.undefined
    
    /**
      * The number where the pointer should point to (between 0 and 1)
      * @default 0.4
      */
    var percent: js.UndefOr[Double] = js.undefined
    
    /**
      * Add style to the div container
      * @default { width: '100%' }
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * The color of the text
      * @default "#FFFFFF"
      */
    var textColor: js.UndefOr[String] = js.undefined
  }
  object GaugeChartProps {
    
    inline def apply(): GaugeChartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GaugeChartProps]
    }
    
    extension [Self <: GaugeChartProps](x: Self) {
      
      inline def setAnimDelay(value: Double): Self = StObject.set(x, "animDelay", value.asInstanceOf[js.Any])
      
      inline def setAnimDelayUndefined: Self = StObject.set(x, "animDelay", js.undefined)
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateDuration(value: Double): Self = StObject.set(x, "animateDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimateDurationUndefined: Self = StObject.set(x, "animateDuration", js.undefined)
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setArcPadding(value: Double): Self = StObject.set(x, "arcPadding", value.asInstanceOf[js.Any])
      
      inline def setArcPaddingUndefined: Self = StObject.set(x, "arcPadding", js.undefined)
      
      inline def setArcWidth(value: Double): Self = StObject.set(x, "arcWidth", value.asInstanceOf[js.Any])
      
      inline def setArcWidthUndefined: Self = StObject.set(x, "arcWidth", js.undefined)
      
      inline def setArcsLength(value: js.Array[Double]): Self = StObject.set(x, "arcsLength", value.asInstanceOf[js.Any])
      
      inline def setArcsLengthUndefined: Self = StObject.set(x, "arcsLength", js.undefined)
      
      inline def setArcsLengthVarargs(value: Double*): Self = StObject.set(x, "arcsLength", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFormatTextValue(value: /* value */ String => String): Self = StObject.set(x, "formatTextValue", js.Any.fromFunction1(value))
      
      inline def setFormatTextValueUndefined: Self = StObject.set(x, "formatTextValue", js.undefined)
      
      inline def setHideText(value: Boolean): Self = StObject.set(x, "hideText", value.asInstanceOf[js.Any])
      
      inline def setHideTextUndefined: Self = StObject.set(x, "hideText", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
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
