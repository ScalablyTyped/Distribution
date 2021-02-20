package typings.reactVis.mod

import typings.reactVis.anon.Axes
import typings.reactVis.anon.Domain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadarChartProps extends StObject {
  
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  // default: 'category'
  var colorRange: js.UndefOr[js.Array[String]] = js.native
  
  // default: ''
  var colorType: js.UndefOr[String] = js.native
  
  // default: ['#12939A','#79C7E3','#1A3177','#FF9833','#EF5D28']
  var data: js.Array[RadarChartPoint] = js.native
  
  var domains: js.Array[Domain] = js.native
  
  var height: Double = js.native
  
  var hideInnerMostValues: js.UndefOr[Boolean] = js.native
  
  // default: true
  var margin: js.UndefOr[Margin | Double] = js.native
  
  var startingAngle: js.UndefOr[Double] = js.native
  
  // default: 1.5707963267948966
  var style: js.UndefOr[Axes] = js.native
  
  // default: {'axes':{'line':{},'ticks':{},'text':{}},'labels':{'fontSize':10,'textAnchor':'middle'},'polygons':{'strokeWidth':0.5,'strokeOpacity':1,'fillOpacity':0.1}}
  var tickFormat: js.UndefOr[RVTickFormat] = js.native
  
  var width: Double = js.native
}
object RadarChartProps {
  
  @scala.inline
  def apply(data: js.Array[RadarChartPoint], domains: js.Array[Domain], height: Double, width: Double): RadarChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadarChartProps]
  }
  
  @scala.inline
  implicit class RadarChartPropsMutableBuilder[Self <: RadarChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String | AnimationParam | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColorRange(value: js.Array[String]): Self = StObject.set(x, "colorRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRangeUndefined: Self = StObject.set(x, "colorRange", js.undefined)
    
    @scala.inline
    def setColorRangeVarargs(value: String*): Self = StObject.set(x, "colorRange", js.Array(value :_*))
    
    @scala.inline
    def setColorType(value: String): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[RadarChartPoint]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: RadarChartPoint*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDomains(value: js.Array[Domain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "domains", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideInnerMostValues(value: Boolean): Self = StObject.set(x, "hideInnerMostValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideInnerMostValuesUndefined: Self = StObject.set(x, "hideInnerMostValues", js.undefined)
    
    @scala.inline
    def setMargin(value: Margin | Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setStartingAngle(value: Double): Self = StObject.set(x, "startingAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingAngleUndefined: Self = StObject.set(x, "startingAngle", js.undefined)
    
    @scala.inline
    def setStyle(value: Axes): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTickFormat(value: /* tick */ js.Any => String): Self = StObject.set(x, "tickFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTickFormatUndefined: Self = StObject.set(x, "tickFormat", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
