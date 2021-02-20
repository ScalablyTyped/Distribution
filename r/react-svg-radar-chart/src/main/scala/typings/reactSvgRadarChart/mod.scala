package typings.reactSvgRadarChart

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactSvgRadarChart.anon.ClassName
import typings.reactSvgRadarChart.anon.Color
import typings.reactSvgRadarChart.anon.Fill
import typings.reactSvgRadarChart.anon.FontFamily
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-svg-radar-chart", JSImport.Default)
  @js.native
  class default ()
    extends Component[ChartProps, js.Object, js.Any]
  
  @js.native
  trait ChartData extends StObject {
    
    var data: StringDictionary[Double] = js.native
    
    var meta: Color = js.native
  }
  object ChartData {
    
    @scala.inline
    def apply(data: StringDictionary[Double], meta: Color): ChartData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartData]
    }
    
    @scala.inline
    implicit class ChartDataMutableBuilder[Self <: ChartData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: StringDictionary[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: Color): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ChartOptionsProps extends StObject {
    
    /**
      * show axes
      * @default true
      */
    var axes: js.UndefOr[Boolean] = js.native
    
    /** custom axis props */
    var axisProps: js.UndefOr[js.Function0[ClassName]] = js.native
    
    /**
      * set caption margin
      * @default 10
      */
    var captionMargin: js.UndefOr[Double] = js.native
    
    /** custom captions props */
    var captionProps: js.UndefOr[js.Function0[FontFamily]] = js.native
    
    /**
      * show captions
      * @default true
      */
    var captions: js.UndefOr[Boolean] = js.native
    
    /** custom dot props */
    var dotProps: js.UndefOr[js.Function0[ClassName]] = js.native
    
    /**
      * show dots
      * @default false
      */
    var dots: js.UndefOr[Boolean] = js.native
    
    /** custom scale props */
    var scaleProps: js.UndefOr[js.Function0[Fill]] = js.native
    
    /**
      * show scale circles
      * @default 3
      */
    var scales: js.UndefOr[Double] = js.native
    
    /** custom viewBox */
    var setViewBox: js.UndefOr[js.Function1[/* options */ this.type, Double]] = js.native
    
    /** custom shape props */
    var shapeProps: js.UndefOr[js.Function0[ClassName]] = js.native
    
    /**
      * set size
      *
      * overwritten by size prop on component
      * @default 300
      */
    var size: js.UndefOr[Double] = js.native
    
    /** custom smoothing fn */
    var smoothing: js.UndefOr[js.Function1[/* points */ js.Array[js.Array[js.Any]], String]] = js.native
    
    /**
      * where on the axes are the captions
      * @default 1.2
      */
    var zoomDistance: js.UndefOr[Double] = js.native
  }
  object ChartOptionsProps {
    
    @scala.inline
    def apply(): ChartOptionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartOptionsProps]
    }
    
    @scala.inline
    implicit class ChartOptionsPropsMutableBuilder[Self <: ChartOptionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxes(value: Boolean): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      @scala.inline
      def setAxisProps(value: () => ClassName): Self = StObject.set(x, "axisProps", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAxisPropsUndefined: Self = StObject.set(x, "axisProps", js.undefined)
      
      @scala.inline
      def setCaptionMargin(value: Double): Self = StObject.set(x, "captionMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionMarginUndefined: Self = StObject.set(x, "captionMargin", js.undefined)
      
      @scala.inline
      def setCaptionProps(value: () => FontFamily): Self = StObject.set(x, "captionProps", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCaptionPropsUndefined: Self = StObject.set(x, "captionProps", js.undefined)
      
      @scala.inline
      def setCaptions(value: Boolean): Self = StObject.set(x, "captions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionsUndefined: Self = StObject.set(x, "captions", js.undefined)
      
      @scala.inline
      def setDotProps(value: () => ClassName): Self = StObject.set(x, "dotProps", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDotPropsUndefined: Self = StObject.set(x, "dotProps", js.undefined)
      
      @scala.inline
      def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      @scala.inline
      def setScaleProps(value: () => Fill): Self = StObject.set(x, "scaleProps", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScalePropsUndefined: Self = StObject.set(x, "scaleProps", js.undefined)
      
      @scala.inline
      def setScales(value: Double): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
      
      @scala.inline
      def setSetViewBox(value: ChartOptionsProps => Double): Self = StObject.set(x, "setViewBox", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetViewBoxUndefined: Self = StObject.set(x, "setViewBox", js.undefined)
      
      @scala.inline
      def setShapeProps(value: () => ClassName): Self = StObject.set(x, "shapeProps", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShapePropsUndefined: Self = StObject.set(x, "shapeProps", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSmoothing(value: /* points */ js.Array[js.Array[js.Any]] => String): Self = StObject.set(x, "smoothing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSmoothingUndefined: Self = StObject.set(x, "smoothing", js.undefined)
      
      @scala.inline
      def setZoomDistance(value: Double): Self = StObject.set(x, "zoomDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomDistanceUndefined: Self = StObject.set(x, "zoomDistance", js.undefined)
    }
  }
  
  @js.native
  trait ChartProps extends StObject {
    
    var captions: StringDictionary[String] = js.native
    
    var data: js.Array[ChartData] = js.native
    
    var options: js.UndefOr[ChartOptionsProps] = js.native
    
    var size: Double = js.native
  }
  object ChartProps {
    
    @scala.inline
    def apply(captions: StringDictionary[String], data: js.Array[ChartData], size: Double): ChartProps = {
      val __obj = js.Dynamic.literal(captions = captions.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartProps]
    }
    
    @scala.inline
    implicit class ChartPropsMutableBuilder[Self <: ChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptions(value: StringDictionary[String]): Self = StObject.set(x, "captions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Array[ChartData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: ChartData*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: ChartOptionsProps): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type RadarChart = Component[ChartProps, js.Object, js.Any]
}
