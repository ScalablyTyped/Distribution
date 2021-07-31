package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarLineScatterCandleBubbleConfig extends StObject {
  
  var highlightColor: js.UndefOr[Color] = js.undefined
}
object BarLineScatterCandleBubbleConfig {
  
  @scala.inline
  def apply(): BarLineScatterCandleBubbleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarLineScatterCandleBubbleConfig]
  }
  
  @scala.inline
  implicit class BarLineScatterCandleBubbleConfigMutableBuilder[Self <: BarLineScatterCandleBubbleConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlightColor(value: Color): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
  }
}
