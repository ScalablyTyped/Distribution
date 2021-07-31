package typings.sketchapp

import typings.sketchapp.sketchappStrings.stringAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSStringAttribute extends StObject {
  
  var _class: stringAttribute
  
  var attributes: SketchMSAttributes
}
object SketchMSStringAttribute {
  
  @scala.inline
  def apply(attributes: SketchMSAttributes): SketchMSStringAttribute = {
    val __obj = js.Dynamic.literal(_class = "stringAttribute", attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStringAttribute]
  }
  
  @scala.inline
  implicit class SketchMSStringAttributeMutableBuilder[Self <: SketchMSStringAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: SketchMSAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: stringAttribute): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
