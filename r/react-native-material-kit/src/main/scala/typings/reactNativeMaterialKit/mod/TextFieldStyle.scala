package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFieldStyle extends js.Object {
  
  var highlightColor: js.UndefOr[String] = js.native
  
  var textInputStyle: js.UndefOr[Color] = js.native
  
  var tintColor: js.UndefOr[String] = js.native
}
object TextFieldStyle {
  
  @scala.inline
  def apply(): TextFieldStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFieldStyle]
  }
  
  @scala.inline
  implicit class TextFieldStyleOps[Self <: TextFieldStyle] (val x: Self) extends AnyVal {
    
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
    def setHighlightColor(value: String): Self = this.set("highlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightColor: Self = this.set("highlightColor", js.undefined)
    
    @scala.inline
    def setTextInputStyle(value: Color): Self = this.set("textInputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextInputStyle: Self = this.set("textInputStyle", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
  }
}
