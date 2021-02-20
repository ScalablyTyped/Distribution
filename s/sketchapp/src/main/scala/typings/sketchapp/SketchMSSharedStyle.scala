package typings.sketchapp

import typings.sketchapp.sketchappStrings.sharedStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSSharedStyle extends StObject {
  
  var _class: sharedStyle = js.native
  
  var name: String = js.native
  
  var value: SketchMSStyle = js.native
}
object SketchMSSharedStyle {
  
  @scala.inline
  def apply(_class: sharedStyle, name: String, value: SketchMSStyle): SketchMSSharedStyle = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSSharedStyle]
  }
  
  @scala.inline
  implicit class SketchMSSharedStyleMutableBuilder[Self <: SketchMSSharedStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: SketchMSStyle): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: sharedStyle): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
