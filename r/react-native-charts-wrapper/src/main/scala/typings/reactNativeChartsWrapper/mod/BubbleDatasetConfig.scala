package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BubbleDatasetConfig
  extends StObject
     with CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig {
  
  var highlightCircleWidth: js.UndefOr[Double] = js.undefined
}
object BubbleDatasetConfig {
  
  inline def apply(): BubbleDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BubbleDatasetConfig]
  }
  
  extension [Self <: BubbleDatasetConfig](x: Self) {
    
    inline def setHighlightCircleWidth(value: Double): Self = StObject.set(x, "highlightCircleWidth", value.asInstanceOf[js.Any])
    
    inline def setHighlightCircleWidthUndefined: Self = StObject.set(x, "highlightCircleWidth", js.undefined)
  }
}
