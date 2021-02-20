package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinuousSizeLegendProps extends StObject {
  
  // default: ''
  var circlesTotal: js.UndefOr[Double] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  // default: 10
  var endSize: js.UndefOr[Double] = js.native
  
  // default: 20
  var endTitle: Double | String = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var startSize: js.UndefOr[Double] = js.native
  
  // default: 2
  var startTitle: Double | String = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ContinuousSizeLegendProps {
  
  @scala.inline
  def apply(endTitle: Double | String, startTitle: Double | String): ContinuousSizeLegendProps = {
    val __obj = js.Dynamic.literal(endTitle = endTitle.asInstanceOf[js.Any], startTitle = startTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousSizeLegendProps]
  }
  
  @scala.inline
  implicit class ContinuousSizeLegendPropsMutableBuilder[Self <: ContinuousSizeLegendProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCirclesTotal(value: Double): Self = StObject.set(x, "circlesTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCirclesTotalUndefined: Self = StObject.set(x, "circlesTotal", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setEndSize(value: Double): Self = StObject.set(x, "endSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndSizeUndefined: Self = StObject.set(x, "endSize", js.undefined)
    
    @scala.inline
    def setEndTitle(value: Double | String): Self = StObject.set(x, "endTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setStartSize(value: Double): Self = StObject.set(x, "startSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartSizeUndefined: Self = StObject.set(x, "startSize", js.undefined)
    
    @scala.inline
    def setStartTitle(value: Double | String): Self = StObject.set(x, "startTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
