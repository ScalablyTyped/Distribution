package typings.sketchapp

import typings.sketchapp.sketchappStrings.sharedStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSSharedStyle extends StObject {
  
  var _class: sharedStyle
  
  var name: String
  
  var value: SketchMSStyle
}
object SketchMSSharedStyle {
  
  @scala.inline
  def apply(name: String, value: SketchMSStyle): SketchMSSharedStyle = {
    val __obj = js.Dynamic.literal(_class = "sharedStyle", name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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
