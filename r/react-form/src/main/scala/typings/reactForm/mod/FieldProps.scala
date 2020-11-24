package typings.reactForm.mod

import typings.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldProps extends js.Object {
  
  var errorBefore: js.UndefOr[Boolean] = js.native
  
  var field: js.UndefOr[String | (js.Array[js.Array[ReactText] | ReactText | String])] = js.native
  
  var isForm: js.UndefOr[Boolean] = js.native
  
  var showErrors: js.UndefOr[Boolean] = js.native
}
object FieldProps {
  
  @scala.inline
  def apply(): FieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldProps]
  }
  
  @scala.inline
  implicit class FieldPropsOps[Self <: FieldProps] (val x: Self) extends AnyVal {
    
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
    def setErrorBefore(value: Boolean): Self = this.set("errorBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorBefore: Self = this.set("errorBefore", js.undefined)
    
    @scala.inline
    def setFieldVarargs(value: (js.Array[ReactText] | ReactText | String)*): Self = this.set("field", js.Array(value :_*))
    
    @scala.inline
    def setField(value: String | (js.Array[js.Array[ReactText] | ReactText | String])): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setIsForm(value: Boolean): Self = this.set("isForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsForm: Self = this.set("isForm", js.undefined)
    
    @scala.inline
    def setShowErrors(value: Boolean): Self = this.set("showErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowErrors: Self = this.set("showErrors", js.undefined)
  }
}
