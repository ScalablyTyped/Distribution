package typings.reactColor.alphaMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlphaPickerStylesProps extends js.Object {
  
  var alpha: CSSProperties = js.native
  
  var picker: CSSProperties = js.native
}
object AlphaPickerStylesProps {
  
  @scala.inline
  def apply(alpha: CSSProperties, picker: CSSProperties): AlphaPickerStylesProps = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaPickerStylesProps]
  }
  
  @scala.inline
  implicit class AlphaPickerStylesPropsOps[Self <: AlphaPickerStylesProps] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: CSSProperties): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicker(value: CSSProperties): Self = this.set("picker", value.asInstanceOf[js.Any])
  }
}
