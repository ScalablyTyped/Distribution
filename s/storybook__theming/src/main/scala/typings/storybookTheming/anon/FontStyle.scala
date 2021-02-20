package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontStyle extends StObject {
  
  var color: String = js.native
  
  var fontStyle: String = js.native
}
object FontStyle {
  
  @scala.inline
  def apply(color: String, fontStyle: String): FontStyle = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyle]
  }
  
  @scala.inline
  implicit class FontStyleMutableBuilder[Self <: FontStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
  }
}
