package typings.reduxForm.anon

import typings.reduxForm.reduxFormMod.WrappedReduxFormContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReduxForm extends js.Object {
  
  var _reduxForm: js.UndefOr[WrappedReduxFormContext] = js.native
}
object ReduxForm {
  
  @scala.inline
  def apply(): ReduxForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReduxForm]
  }
  
  @scala.inline
  implicit class ReduxFormOps[Self <: ReduxForm] (val x: Self) extends AnyVal {
    
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
    def set_reduxForm(value: WrappedReduxFormContext): Self = this.set("_reduxForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_reduxForm: Self = this.set("_reduxForm", js.undefined)
  }
}
