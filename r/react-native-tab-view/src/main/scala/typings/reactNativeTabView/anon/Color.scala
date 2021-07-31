package typings.reactNativeTabView.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var color: String
  
  var focused: Boolean
}
object Color {
  
  @scala.inline
  def apply(color: String, focused: Boolean): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
  }
}
