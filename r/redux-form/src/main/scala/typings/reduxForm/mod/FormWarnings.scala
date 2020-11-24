package typings.reduxForm.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof FormData ]:? react.react.ReactElement | string | redux-form.redux-form.WarningOther<T>} */
@js.native
trait FormWarnings[FormData, T] extends js.Object {
  
  var append: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  
  var delete: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  
  var entries: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  
  var forEach: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  
  var get: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  
  var getAll: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  
  var has: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  
  var keys: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  
  var set: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  
  var values: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
}
object FormWarnings {
  
  @scala.inline
  def apply[FormData, T](): FormWarnings[FormData, T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormWarnings[FormData, T]]
  }
  
  @scala.inline
  implicit class FormWarningsOps[Self <: FormWarnings[_, _], FormData, T] (val x: Self with (FormWarnings[FormData, T])) extends AnyVal {
    
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
    def setAppend(value: ReactElement | String | WarningOther[T]): Self = this.set("append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    
    @scala.inline
    def setDelete(value: ReactElement | String | WarningOther[T]): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    
    @scala.inline
    def setEntries(value: ReactElement | String | WarningOther[T]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setForEach(value: ReactElement | String | WarningOther[T]): Self = this.set("forEach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForEach: Self = this.set("forEach", js.undefined)
    
    @scala.inline
    def setGet(value: ReactElement | String | WarningOther[T]): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setGetAll(value: ReactElement | String | WarningOther[T]): Self = this.set("getAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetAll: Self = this.set("getAll", js.undefined)
    
    @scala.inline
    def setHas(value: ReactElement | String | WarningOther[T]): Self = this.set("has", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas: Self = this.set("has", js.undefined)
    
    @scala.inline
    def setKeys(value: ReactElement | String | WarningOther[T]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    
    @scala.inline
    def setSet(value: ReactElement | String | WarningOther[T]): Self = this.set("set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    
    @scala.inline
    def setValues(value: ReactElement | String | WarningOther[T]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
