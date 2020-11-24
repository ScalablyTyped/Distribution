package typings.reactForm.mod

import typings.react.mod.SelectHTMLAttributes
import typings.reactForm.anon.Label
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectProps
  extends SelectHTMLAttributes[HTMLSelectElement]
     with FieldProps {
  
  var options: SelectOptions = js.native
}
object SelectProps {
  
  @scala.inline
  def apply(options: SelectOptions): SelectProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps]
  }
  
  @scala.inline
  implicit class SelectPropsOps[Self <: SelectProps] (val x: Self) extends AnyVal {
    
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
    def setOptionsVarargs(value: Label*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: SelectOptions): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
