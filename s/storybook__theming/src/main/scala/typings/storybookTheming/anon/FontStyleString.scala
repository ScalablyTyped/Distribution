package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontStyleString extends StObject {
  
  var fontStyle: String = js.native
}
object FontStyleString {
  
  @scala.inline
  def apply(fontStyle: String): FontStyleString = {
    val __obj = js.Dynamic.literal(fontStyle = fontStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyleString]
  }
  
  @scala.inline
  implicit class FontStyleStringMutableBuilder[Self <: FontStyleString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
  }
}
