package typings.sketchapp

import typings.sketchapp.sketchappStrings.stringAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSStringAttribute extends js.Object {
  
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
  implicit class SketchMSStringAttributeOps[Self <: SketchMSStringAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_class(value: stringAttribute): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: SketchMSAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
  }
}
