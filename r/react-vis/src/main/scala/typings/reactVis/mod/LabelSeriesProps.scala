package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelSeriesProps extends AbstractSeriesProps[LabelSeriesPoint] {
  
  var allowOffsetToBeReversed: js.UndefOr[Boolean] = js.native
  
  // default: 0
  var labelAnchorX: js.UndefOr[String] = js.native
  
  var labelAnchorY: js.UndefOr[String] = js.native
  
  var marginLeft: js.UndefOr[Double] = js.native
  
  var marginTop: js.UndefOr[Double] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
}
object LabelSeriesProps {
  
  @scala.inline
  def apply(): LabelSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSeriesProps]
  }
  
  @scala.inline
  implicit class LabelSeriesPropsMutableBuilder[Self <: LabelSeriesProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowOffsetToBeReversed(value: Boolean): Self = StObject.set(x, "allowOffsetToBeReversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowOffsetToBeReversedUndefined: Self = StObject.set(x, "allowOffsetToBeReversed", js.undefined)
    
    @scala.inline
    def setLabelAnchorX(value: String): Self = StObject.set(x, "labelAnchorX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAnchorXUndefined: Self = StObject.set(x, "labelAnchorX", js.undefined)
    
    @scala.inline
    def setLabelAnchorY(value: String): Self = StObject.set(x, "labelAnchorY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAnchorYUndefined: Self = StObject.set(x, "labelAnchorY", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
  }
}
