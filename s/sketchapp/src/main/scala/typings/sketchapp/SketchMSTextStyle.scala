package typings.sketchapp

import typings.sketchapp.sketchappStrings.textStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSTextStyle extends js.Object {
  
  var _class: textStyle = js.native
  
  var encodedAttributes: SketchMSAttributes = js.native
}
object SketchMSTextStyle {
  
  @scala.inline
  def apply(_class: textStyle, encodedAttributes: SketchMSAttributes): SketchMSTextStyle = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], encodedAttributes = encodedAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSTextStyle]
  }
  
  @scala.inline
  implicit class SketchMSTextStyleOps[Self <: SketchMSTextStyle] (val x: Self) extends AnyVal {
    
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
    def set_class(value: textStyle): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedAttributes(value: SketchMSAttributes): Self = this.set("encodedAttributes", value.asInstanceOf[js.Any])
  }
}
