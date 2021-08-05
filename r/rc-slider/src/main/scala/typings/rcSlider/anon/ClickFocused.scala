package typings.rcSlider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickFocused extends StObject {
  
  var clickFocused: Boolean
}
object ClickFocused {
  
  inline def apply(clickFocused: Boolean): ClickFocused = {
    val __obj = js.Dynamic.literal(clickFocused = clickFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickFocused]
  }
  
  extension [Self <: ClickFocused](x: Self) {
    
    inline def setClickFocused(value: Boolean): Self = StObject.set(x, "clickFocused", value.asInstanceOf[js.Any])
  }
}
