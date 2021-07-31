package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousColorLegendProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var endColor: js.UndefOr[String] = js.undefined
  
  // default: '#FF9833'
  var endTitle: Double | String
  
  // default: ''
  var height: js.UndefOr[Double] = js.undefined
  
  var midColor: js.UndefOr[String] = js.undefined
  
  var midTitle: js.UndefOr[Double | String] = js.undefined
  
  var startColor: js.UndefOr[String] = js.undefined
  
  // default: '#EF5D28'
  var startTitle: Double | String
  
  var width: js.UndefOr[Double] = js.undefined
}
object ContinuousColorLegendProps {
  
  @scala.inline
  def apply(endTitle: Double | String, startTitle: Double | String): ContinuousColorLegendProps = {
    val __obj = js.Dynamic.literal(endTitle = endTitle.asInstanceOf[js.Any], startTitle = startTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousColorLegendProps]
  }
  
  @scala.inline
  implicit class ContinuousColorLegendPropsMutableBuilder[Self <: ContinuousColorLegendProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setEndColor(value: String): Self = StObject.set(x, "endColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndColorUndefined: Self = StObject.set(x, "endColor", js.undefined)
    
    @scala.inline
    def setEndTitle(value: Double | String): Self = StObject.set(x, "endTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMidColor(value: String): Self = StObject.set(x, "midColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidColorUndefined: Self = StObject.set(x, "midColor", js.undefined)
    
    @scala.inline
    def setMidTitle(value: Double | String): Self = StObject.set(x, "midTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidTitleUndefined: Self = StObject.set(x, "midTitle", js.undefined)
    
    @scala.inline
    def setStartColor(value: String): Self = StObject.set(x, "startColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColorUndefined: Self = StObject.set(x, "startColor", js.undefined)
    
    @scala.inline
    def setStartTitle(value: Double | String): Self = StObject.set(x, "startTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
