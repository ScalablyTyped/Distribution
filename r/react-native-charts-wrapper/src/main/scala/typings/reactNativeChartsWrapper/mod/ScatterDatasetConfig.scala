package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CIRCLE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CROSS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SQUARE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TRIANGLE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScatterDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig
     with LineScatterCandleRadarConfig {
  
  var scatterShape: js.UndefOr[SQUARE | CIRCLE | TRIANGLE | CROSS | X] = js.native
  
  var scatterShapeHoleColor: js.UndefOr[Color] = js.native
  
  var scatterShapeHoleRadius: js.UndefOr[Double] = js.native
  
  var scatterShapeSize: js.UndefOr[Double] = js.native
}
object ScatterDatasetConfig {
  
  @scala.inline
  def apply(): ScatterDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScatterDatasetConfig]
  }
  
  @scala.inline
  implicit class ScatterDatasetConfigMutableBuilder[Self <: ScatterDatasetConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScatterShape(value: SQUARE | CIRCLE | TRIANGLE | CROSS | X): Self = StObject.set(x, "scatterShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScatterShapeHoleColor(value: Color): Self = StObject.set(x, "scatterShapeHoleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScatterShapeHoleColorUndefined: Self = StObject.set(x, "scatterShapeHoleColor", js.undefined)
    
    @scala.inline
    def setScatterShapeHoleRadius(value: Double): Self = StObject.set(x, "scatterShapeHoleRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScatterShapeHoleRadiusUndefined: Self = StObject.set(x, "scatterShapeHoleRadius", js.undefined)
    
    @scala.inline
    def setScatterShapeSize(value: Double): Self = StObject.set(x, "scatterShapeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScatterShapeSizeUndefined: Self = StObject.set(x, "scatterShapeSize", js.undefined)
    
    @scala.inline
    def setScatterShapeUndefined: Self = StObject.set(x, "scatterShape", js.undefined)
  }
}
