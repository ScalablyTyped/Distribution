package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTH_SIDED
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM_INSIDE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP_INSIDE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait xAxis
  extends StObject
     with Axis {
  
  var avoidFirstLastClipping: js.UndefOr[Boolean] = js.undefined
  
  var labelRotationAngle: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[TOP | BOTTOM | BOTH_SIDED | TOP_INSIDE | BOTTOM_INSIDE] = js.undefined
  
  var yOffset: js.UndefOr[Double] = js.undefined
}
object xAxis {
  
  inline def apply(): xAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[xAxis]
  }
  
  extension [Self <: xAxis](x: Self) {
    
    inline def setAvoidFirstLastClipping(value: Boolean): Self = StObject.set(x, "avoidFirstLastClipping", value.asInstanceOf[js.Any])
    
    inline def setAvoidFirstLastClippingUndefined: Self = StObject.set(x, "avoidFirstLastClipping", js.undefined)
    
    inline def setLabelRotationAngle(value: Double): Self = StObject.set(x, "labelRotationAngle", value.asInstanceOf[js.Any])
    
    inline def setLabelRotationAngleUndefined: Self = StObject.set(x, "labelRotationAngle", js.undefined)
    
    inline def setPosition(value: TOP | BOTTOM | BOTH_SIDED | TOP_INSIDE | BOTTOM_INSIDE): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    
    inline def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
  }
}
