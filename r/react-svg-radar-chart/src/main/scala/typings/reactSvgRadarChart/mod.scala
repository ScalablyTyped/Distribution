package typings.reactSvgRadarChart

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactSvgRadarChart.anon.ClassName
import typings.reactSvgRadarChart.anon.Color
import typings.reactSvgRadarChart.anon.Fill
import typings.reactSvgRadarChart.anon.FontFamily
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-svg-radar-chart", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ChartProps, js.Object, Any]
  
  trait ChartData extends StObject {
    
    var data: StringDictionary[Double]
    
    var meta: Color
  }
  object ChartData {
    
    inline def apply(data: StringDictionary[Double], meta: Color): ChartData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartData]
    }
    
    extension [Self <: ChartData](x: Self) {
      
      inline def setData(value: StringDictionary[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Color): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChartOptionsProps extends StObject {
    
    /**
      * show axes
      * @default true
      */
    var axes: js.UndefOr[Boolean] = js.undefined
    
    /** custom axis props */
    var axisProps: js.UndefOr[js.Function0[ClassName]] = js.undefined
    
    /**
      * set caption margin
      * @default 10
      */
    var captionMargin: js.UndefOr[Double] = js.undefined
    
    /** custom captions props */
    var captionProps: js.UndefOr[js.Function0[FontFamily]] = js.undefined
    
    /**
      * show captions
      * @default true
      */
    var captions: js.UndefOr[Boolean] = js.undefined
    
    /** custom dot props */
    var dotProps: js.UndefOr[js.Function0[ClassName]] = js.undefined
    
    /**
      * show dots
      * @default false
      */
    var dots: js.UndefOr[Boolean] = js.undefined
    
    /** custom scale props */
    var scaleProps: js.UndefOr[js.Function0[Fill]] = js.undefined
    
    /**
      * show scale circles
      * @default 3
      */
    var scales: js.UndefOr[Double] = js.undefined
    
    /** custom viewBox */
    var setViewBox: js.UndefOr[js.Function1[/* options */ this.type, Double]] = js.undefined
    
    /** custom shape props */
    var shapeProps: js.UndefOr[js.Function0[ClassName]] = js.undefined
    
    /**
      * set size
      *
      * overwritten by size prop on component
      * @default 300
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /** custom smoothing fn */
    var smoothing: js.UndefOr[js.Function1[/* points */ js.Array[js.Array[Any]], String]] = js.undefined
    
    /**
      * where on the axes are the captions
      * @default 1.2
      */
    var zoomDistance: js.UndefOr[Double] = js.undefined
  }
  object ChartOptionsProps {
    
    inline def apply(): ChartOptionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartOptionsProps]
    }
    
    extension [Self <: ChartOptionsProps](x: Self) {
      
      inline def setAxes(value: Boolean): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      inline def setAxisProps(value: () => ClassName): Self = StObject.set(x, "axisProps", js.Any.fromFunction0(value))
      
      inline def setAxisPropsUndefined: Self = StObject.set(x, "axisProps", js.undefined)
      
      inline def setCaptionMargin(value: Double): Self = StObject.set(x, "captionMargin", value.asInstanceOf[js.Any])
      
      inline def setCaptionMarginUndefined: Self = StObject.set(x, "captionMargin", js.undefined)
      
      inline def setCaptionProps(value: () => FontFamily): Self = StObject.set(x, "captionProps", js.Any.fromFunction0(value))
      
      inline def setCaptionPropsUndefined: Self = StObject.set(x, "captionProps", js.undefined)
      
      inline def setCaptions(value: Boolean): Self = StObject.set(x, "captions", value.asInstanceOf[js.Any])
      
      inline def setCaptionsUndefined: Self = StObject.set(x, "captions", js.undefined)
      
      inline def setDotProps(value: () => ClassName): Self = StObject.set(x, "dotProps", js.Any.fromFunction0(value))
      
      inline def setDotPropsUndefined: Self = StObject.set(x, "dotProps", js.undefined)
      
      inline def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      inline def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      inline def setScaleProps(value: () => Fill): Self = StObject.set(x, "scaleProps", js.Any.fromFunction0(value))
      
      inline def setScalePropsUndefined: Self = StObject.set(x, "scaleProps", js.undefined)
      
      inline def setScales(value: Double): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      inline def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
      
      inline def setSetViewBox(value: ChartOptionsProps => Double): Self = StObject.set(x, "setViewBox", js.Any.fromFunction1(value))
      
      inline def setSetViewBoxUndefined: Self = StObject.set(x, "setViewBox", js.undefined)
      
      inline def setShapeProps(value: () => ClassName): Self = StObject.set(x, "shapeProps", js.Any.fromFunction0(value))
      
      inline def setShapePropsUndefined: Self = StObject.set(x, "shapeProps", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSmoothing(value: /* points */ js.Array[js.Array[Any]] => String): Self = StObject.set(x, "smoothing", js.Any.fromFunction1(value))
      
      inline def setSmoothingUndefined: Self = StObject.set(x, "smoothing", js.undefined)
      
      inline def setZoomDistance(value: Double): Self = StObject.set(x, "zoomDistance", value.asInstanceOf[js.Any])
      
      inline def setZoomDistanceUndefined: Self = StObject.set(x, "zoomDistance", js.undefined)
    }
  }
  
  trait ChartProps extends StObject {
    
    var captions: StringDictionary[String]
    
    var data: js.Array[ChartData]
    
    var options: js.UndefOr[ChartOptionsProps] = js.undefined
    
    var size: Double
  }
  object ChartProps {
    
    inline def apply(captions: StringDictionary[String], data: js.Array[ChartData], size: Double): ChartProps = {
      val __obj = js.Dynamic.literal(captions = captions.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartProps]
    }
    
    extension [Self <: ChartProps](x: Self) {
      
      inline def setCaptions(value: StringDictionary[String]): Self = StObject.set(x, "captions", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[ChartData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: ChartData*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setOptions(value: ChartOptionsProps): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type RadarChart = Component[ChartProps, js.Object, Any]
}
