package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTH_SIDED
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM_INSIDE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP_INSIDE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait xAxis extends Axis {
  
  var avoidFirstLastClipping: js.UndefOr[Boolean] = js.native
  
  var labelRotationAngle: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[TOP | BOTTOM | BOTH_SIDED | TOP_INSIDE | BOTTOM_INSIDE] = js.native
  
  var yOffset: js.UndefOr[Double] = js.native
}
object xAxis {
  
  @scala.inline
  def apply(): xAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[xAxis]
  }
  
  @scala.inline
  implicit class xAxisMutableBuilder[Self <: xAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvoidFirstLastClipping(value: Boolean): Self = StObject.set(x, "avoidFirstLastClipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidFirstLastClippingUndefined: Self = StObject.set(x, "avoidFirstLastClipping", js.undefined)
    
    @scala.inline
    def setLabelRotationAngle(value: Double): Self = StObject.set(x, "labelRotationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelRotationAngleUndefined: Self = StObject.set(x, "labelRotationAngle", js.undefined)
    
    @scala.inline
    def setPosition(value: TOP | BOTTOM | BOTH_SIDED | TOP_INSIDE | BOTTOM_INSIDE): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
  }
}
