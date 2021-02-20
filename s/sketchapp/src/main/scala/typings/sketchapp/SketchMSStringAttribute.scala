package typings.sketchapp

import typings.sketchapp.sketchappStrings.stringAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSStringAttribute extends StObject {
  
  var _class: stringAttribute = js.native
  
  var attributes: SketchMSAttributes = js.native
}
object SketchMSStringAttribute {
  
  @scala.inline
  def apply(_class: stringAttribute, attributes: SketchMSAttributes): SketchMSStringAttribute = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any])
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
