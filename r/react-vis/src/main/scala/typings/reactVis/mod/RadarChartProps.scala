package typings.reactVis.mod

import typings.reactVis.anon.Axes
import typings.reactVis.anon.Domain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadarChartProps extends StObject {
  
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  // default: 'category'
  var colorRange: js.UndefOr[js.Array[String]] = js.undefined
  
  // default: ''
  var colorType: js.UndefOr[String] = js.undefined
  
  // default: ['#12939A','#79C7E3','#1A3177','#FF9833','#EF5D28']
  var data: js.Array[RadarChartPoint]
  
  var domains: js.Array[Domain]
  
  var height: Double
  
  var hideInnerMostValues: js.UndefOr[Boolean] = js.undefined
  
  // default: true
  var margin: js.UndefOr[Margin | Double] = js.undefined
  
  var startingAngle: js.UndefOr[Double] = js.undefined
  
  // default: 1.5707963267948966
  var style: js.UndefOr[Axes] = js.undefined
  
  // default: {'axes':{'line':{},'ticks':{},'text':{}},'labels':{'fontSize':10,'textAnchor':'middle'},'polygons':{'strokeWidth':0.5,'strokeOpacity':1,'fillOpacity':0.1}}
  var tickFormat: js.UndefOr[RVTickFormat] = js.undefined
  
  var width: Double
}
object RadarChartProps {
  
  inline def apply(data: js.Array[RadarChartPoint], domains: js.Array[Domain], height: Double, width: Double): RadarChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadarChartProps]
  }
  
  extension [Self <: RadarChartProps](x: Self) {
    
    inline def setAnimation(value: String | AnimationParam | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColorRange(value: js.Array[String]): Self = StObject.set(x, "colorRange", value.asInstanceOf[js.Any])
    
    inline def setColorRangeUndefined: Self = StObject.set(x, "colorRange", js.undefined)
    
    inline def setColorRangeVarargs(value: String*): Self = StObject.set(x, "colorRange", js.Array(value :_*))
    
    inline def setColorType(value: String): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
    
    inline def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
    
    inline def setData(value: js.Array[RadarChartPoint]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: RadarChartPoint*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setDomains(value: js.Array[Domain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "domains", js.Array(value :_*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHideInnerMostValues(value: Boolean): Self = StObject.set(x, "hideInnerMostValues", value.asInstanceOf[js.Any])
    
    inline def setHideInnerMostValuesUndefined: Self = StObject.set(x, "hideInnerMostValues", js.undefined)
    
    inline def setMargin(value: Margin | Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setStartingAngle(value: Double): Self = StObject.set(x, "startingAngle", value.asInstanceOf[js.Any])
    
    inline def setStartingAngleUndefined: Self = StObject.set(x, "startingAngle", js.undefined)
    
    inline def setStyle(value: Axes): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTickFormat(value: /* tick */ js.Any => String): Self = StObject.set(x, "tickFormat", js.Any.fromFunction1(value))
    
    inline def setTickFormatUndefined: Self = StObject.set(x, "tickFormat", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
