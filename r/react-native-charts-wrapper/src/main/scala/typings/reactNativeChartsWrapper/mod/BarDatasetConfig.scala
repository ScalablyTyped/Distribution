package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarDatasetConfig
  extends StObject
     with CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig {
  
  var barShadowColor: js.UndefOr[Color] = js.undefined
  
  var highlightAlpha: js.UndefOr[Double] = js.undefined
  
  var stackLabels: js.UndefOr[js.Array[String]] = js.undefined
}
object BarDatasetConfig {
  
  @scala.inline
  def apply(): BarDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarDatasetConfig]
  }
  
  @scala.inline
  implicit class BarDatasetConfigMutableBuilder[Self <: BarDatasetConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarShadowColor(value: Color): Self = StObject.set(x, "barShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarShadowColorUndefined: Self = StObject.set(x, "barShadowColor", js.undefined)
    
    @scala.inline
    def setHighlightAlpha(value: Double): Self = StObject.set(x, "highlightAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightAlphaUndefined: Self = StObject.set(x, "highlightAlpha", js.undefined)
    
    @scala.inline
    def setStackLabels(value: js.Array[String]): Self = StObject.set(x, "stackLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackLabelsUndefined: Self = StObject.set(x, "stackLabels", js.undefined)
    
    @scala.inline
    def setStackLabelsVarargs(value: String*): Self = StObject.set(x, "stackLabels", js.Array(value :_*))
  }
}
