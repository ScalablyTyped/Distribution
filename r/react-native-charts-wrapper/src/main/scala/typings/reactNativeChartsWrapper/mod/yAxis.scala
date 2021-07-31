package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Enabled
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.INSIDE_CHART
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.OUTSIDE_CHART
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait yAxis
  extends StObject
     with Axis {
  
  var inverted: js.UndefOr[Boolean] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[OUTSIDE_CHART | INSIDE_CHART] = js.undefined
  
  var spaceBottom: js.UndefOr[Double] = js.undefined
  
  var spaceTop: js.UndefOr[Double] = js.undefined
  
  var zeroLine: js.UndefOr[Enabled] = js.undefined
}
object yAxis {
  
  @scala.inline
  def apply(): yAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[yAxis]
  }
  
  @scala.inline
  implicit class yAxisMutableBuilder[Self <: yAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setPosition(value: OUTSIDE_CHART | INSIDE_CHART): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSpaceBottom(value: Double): Self = StObject.set(x, "spaceBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBottomUndefined: Self = StObject.set(x, "spaceBottom", js.undefined)
    
    @scala.inline
    def setSpaceTop(value: Double): Self = StObject.set(x, "spaceTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceTopUndefined: Self = StObject.set(x, "spaceTop", js.undefined)
    
    @scala.inline
    def setZeroLine(value: Enabled): Self = StObject.set(x, "zeroLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroLineUndefined: Self = StObject.set(x, "zeroLine", js.undefined)
  }
}
