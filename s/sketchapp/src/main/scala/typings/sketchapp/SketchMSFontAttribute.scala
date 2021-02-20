package typings.sketchapp

import typings.sketchapp.anon.Name
import typings.sketchapp.sketchappStrings.fontDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSFontAttribute extends StObject {
  
  var _class: fontDescriptor = js.native
  
  var attributes: Name = js.native
}
object SketchMSFontAttribute {
  
  @scala.inline
  def apply(_class: fontDescriptor, attributes: Name): SketchMSFontAttribute = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSFontAttribute]
  }
  
  @scala.inline
  implicit class SketchMSFontAttributeMutableBuilder[Self <: SketchMSFontAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Name): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: fontDescriptor): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
