package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelSeriesProps
  extends StObject
     with AbstractSeriesProps[LabelSeriesPoint] {
  
  var allowOffsetToBeReversed: js.UndefOr[Boolean] = js.undefined
  
  // default: 0
  var labelAnchorX: js.UndefOr[String] = js.undefined
  
  var labelAnchorY: js.UndefOr[String] = js.undefined
  
  var marginLeft: js.UndefOr[Double] = js.undefined
  
  var marginTop: js.UndefOr[Double] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
}
object LabelSeriesProps {
  
  inline def apply(): LabelSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSeriesProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelSeriesProps] (val x: Self) extends AnyVal {
    
    inline def setAllowOffsetToBeReversed(value: Boolean): Self = StObject.set(x, "allowOffsetToBeReversed", value.asInstanceOf[js.Any])
    
    inline def setAllowOffsetToBeReversedUndefined: Self = StObject.set(x, "allowOffsetToBeReversed", js.undefined)
    
    inline def setLabelAnchorX(value: String): Self = StObject.set(x, "labelAnchorX", value.asInstanceOf[js.Any])
    
    inline def setLabelAnchorXUndefined: Self = StObject.set(x, "labelAnchorX", js.undefined)
    
    inline def setLabelAnchorY(value: String): Self = StObject.set(x, "labelAnchorY", value.asInstanceOf[js.Any])
    
    inline def setLabelAnchorYUndefined: Self = StObject.set(x, "labelAnchorY", js.undefined)
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
  }
}
