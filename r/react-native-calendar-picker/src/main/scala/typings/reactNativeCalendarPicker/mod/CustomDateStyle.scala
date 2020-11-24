package typings.reactNativeCalendarPicker.mod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDateStyle extends js.Object {
  
  var containerStyle: js.UndefOr[ViewStyle] = js.native
  
  var date: MomentParsable = js.native
  
  var style: js.UndefOr[ViewStyle] = js.native
  
  var textStyle: js.UndefOr[TextStyle] = js.native
}
object CustomDateStyle {
  
  @scala.inline
  def apply(date: MomentParsable): CustomDateStyle = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDateStyle]
  }
  
  @scala.inline
  implicit class CustomDateStyleOps[Self <: CustomDateStyle] (val x: Self) extends AnyVal {
    
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
    def setDateVarargs(value: (Double | String)*): Self = this.set("date", js.Array(value :_*))
    
    @scala.inline
    def setDate(value: MomentParsable): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyle(value: ViewStyle): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setStyle(value: ViewStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTextStyle(value: TextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
}
