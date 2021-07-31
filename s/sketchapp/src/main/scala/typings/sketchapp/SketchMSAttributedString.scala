package typings.sketchapp

import typings.sketchapp.anon.Archive
import typings.sketchapp.sketchappStrings.attributedString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSAttributedString extends StObject {
  
  var _class: attributedString
  
  var archivedAttributedString: js.UndefOr[Archive] = js.undefined
  
  var attributes: js.Array[SketchMSStringAttribute]
  
  var string: String
}
object SketchMSAttributedString {
  
  @scala.inline
  def apply(attributes: js.Array[SketchMSStringAttribute], string: String): SketchMSAttributedString = {
    val __obj = js.Dynamic.literal(_class = "attributedString", attributes = attributes.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSAttributedString]
  }
  
  @scala.inline
  implicit class SketchMSAttributedStringMutableBuilder[Self <: SketchMSAttributedString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchivedAttributedString(value: Archive): Self = StObject.set(x, "archivedAttributedString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedAttributedStringUndefined: Self = StObject.set(x, "archivedAttributedString", js.undefined)
    
    @scala.inline
    def setAttributes(value: js.Array[SketchMSStringAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: SketchMSStringAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: attributedString): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
