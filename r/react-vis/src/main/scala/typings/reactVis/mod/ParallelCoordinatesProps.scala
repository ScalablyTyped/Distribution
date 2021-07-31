package typings.reactVis.mod

import typings.reactVis.anon.Domain
import typings.reactVis.anon.Labels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParallelCoordinatesProps extends StObject {
  
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  // default: 'category'
  var colorRange: js.UndefOr[js.Array[String]] = js.undefined
  
  // default: ''
  var colorType: js.UndefOr[String] = js.undefined
  
  // default: ['#12939A','#79C7E3','#1A3177','#FF9833','#EF5D28']
  var data: js.Array[ParallelCoordinatesPoint]
  
  var domains: js.Array[Domain]
  
  var height: Double
  
  var margin: js.UndefOr[Margin | Double] = js.undefined
  
  // default: {'axes':{'line':{},'ticks':{},'text':{}},'labels':{'fontSize':10,'textAnchor':'middle'},'lines':{'strokeWidth':1,'strokeOpacity':1}}
  var showMarks: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[Labels] = js.undefined
  
  var tickFormat: js.UndefOr[RVTickFormat] = js.undefined
  
  var width: Double
}
object ParallelCoordinatesProps {
  
  @scala.inline
  def apply(data: js.Array[ParallelCoordinatesPoint], domains: js.Array[Domain], height: Double, width: Double): ParallelCoordinatesProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelCoordinatesProps]
  }
  
  @scala.inline
  implicit class ParallelCoordinatesPropsMutableBuilder[Self <: ParallelCoordinatesProps] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Array[ParallelCoordinatesPoint]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: ParallelCoordinatesPoint*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDomains(value: js.Array[Domain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "domains", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: Margin | Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setShowMarks(value: Boolean): Self = StObject.set(x, "showMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMarksUndefined: Self = StObject.set(x, "showMarks", js.undefined)
    
    @scala.inline
    def setStyle(value: Labels): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
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
