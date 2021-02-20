package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BubbleDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig {
  
  var highlightCircleWidth: js.UndefOr[Double] = js.native
}
object BubbleDatasetConfig {
  
  @scala.inline
  def apply(): BubbleDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BubbleDatasetConfig]
  }
  
  @scala.inline
  implicit class BubbleDatasetConfigMutableBuilder[Self <: BubbleDatasetConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlightCircleWidth(value: Double): Self = StObject.set(x, "highlightCircleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightCircleWidthUndefined: Self = StObject.set(x, "highlightCircleWidth", js.undefined)
  }
}
