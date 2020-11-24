package typings.reactForm.anon

import typings.react.mod.ReactText
import typings.reactForm.mod.FieldApi
import typings.reactForm.mod.RenderReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-form.react-form.FieldProps & {  children :(props : react-form.react-form.FieldApi): react-form.react-form.RenderReturn | react-form.react-form.RenderReturn | undefined} */
@js.native
trait FieldPropschildrenpropsFi extends js.Object {
  
  var children: js.UndefOr[(js.Function1[/* props */ FieldApi, RenderReturn]) | RenderReturn] = js.native
  
  var errorBefore: js.UndefOr[Boolean] = js.native
  
  var field: js.UndefOr[String | (js.Array[js.Array[ReactText] | ReactText | String])] = js.native
  
  var isForm: js.UndefOr[Boolean] = js.native
  
  var showErrors: js.UndefOr[Boolean] = js.native
}
object FieldPropschildrenpropsFi {
  
  @scala.inline
  def apply(): FieldPropschildrenpropsFi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldPropschildrenpropsFi]
  }
  
  @scala.inline
  implicit class FieldPropschildrenpropsFiOps[Self <: FieldPropschildrenpropsFi] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: scala.Nothing*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildrenFunction1(value: /* props */ FieldApi => RenderReturn): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: (js.Function1[/* props */ FieldApi, RenderReturn]) | RenderReturn): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
    
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
