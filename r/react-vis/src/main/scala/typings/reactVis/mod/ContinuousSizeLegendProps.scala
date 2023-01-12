package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousSizeLegendProps extends StObject {
  
  // default: ''
  var circlesTotal: js.UndefOr[Double] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  // default: 10
  var endSize: js.UndefOr[Double] = js.undefined
  
  // default: 20
  var endTitle: Double | String
  
  var height: js.UndefOr[Double] = js.undefined
  
  var startSize: js.UndefOr[Double] = js.undefined
  
  // default: 2
  var startTitle: Double | String
  
  var width: js.UndefOr[Double] = js.undefined
}
object ContinuousSizeLegendProps {
  
  inline def apply(endTitle: Double | String, startTitle: Double | String): ContinuousSizeLegendProps = {
    val __obj = js.Dynamic.literal(endTitle = endTitle.asInstanceOf[js.Any], startTitle = startTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousSizeLegendProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinuousSizeLegendProps] (val x: Self) extends AnyVal {
    
    inline def setCirclesTotal(value: Double): Self = StObject.set(x, "circlesTotal", value.asInstanceOf[js.Any])
    
    inline def setCirclesTotalUndefined: Self = StObject.set(x, "circlesTotal", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setEndSize(value: Double): Self = StObject.set(x, "endSize", value.asInstanceOf[js.Any])
    
    inline def setEndSizeUndefined: Self = StObject.set(x, "endSize", js.undefined)
    
    inline def setEndTitle(value: Double | String): Self = StObject.set(x, "endTitle", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setStartSize(value: Double): Self = StObject.set(x, "startSize", value.asInstanceOf[js.Any])
    
    inline def setStartSizeUndefined: Self = StObject.set(x, "startSize", js.undefined)
    
    inline def setStartTitle(value: Double | String): Self = StObject.set(x, "startTitle", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
