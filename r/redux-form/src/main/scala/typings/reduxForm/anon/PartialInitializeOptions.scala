package typings.reduxForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<redux-form.redux-form/lib/actions.InitializeOptions> */
@js.native
trait PartialInitializeOptions extends js.Object {
  
  var keepDirty: js.UndefOr[Boolean] = js.native
  
  var keepSubmitSucceeded: js.UndefOr[Boolean] = js.native
  
  var keepValues: js.UndefOr[Boolean] = js.native
  
  var updateUnregisteredFields: js.UndefOr[Boolean] = js.native
}
object PartialInitializeOptions {
  
  @scala.inline
  def apply(): PartialInitializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInitializeOptions]
  }
  
  @scala.inline
  implicit class PartialInitializeOptionsOps[Self <: PartialInitializeOptions] (val x: Self) extends AnyVal {
    
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
    def setKeepDirty(value: Boolean): Self = this.set("keepDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepDirty: Self = this.set("keepDirty", js.undefined)
    
    @scala.inline
    def setKeepSubmitSucceeded(value: Boolean): Self = this.set("keepSubmitSucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepSubmitSucceeded: Self = this.set("keepSubmitSucceeded", js.undefined)
    
    @scala.inline
    def setKeepValues(value: Boolean): Self = this.set("keepValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepValues: Self = this.set("keepValues", js.undefined)
    
    @scala.inline
    def setUpdateUnregisteredFields(value: Boolean): Self = this.set("updateUnregisteredFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateUnregisteredFields: Self = this.set("updateUnregisteredFields", js.undefined)
  }
}
