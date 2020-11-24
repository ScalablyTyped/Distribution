package typings.reduxForm.actionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitializeOptions extends js.Object {
  
  var keepDirty: Boolean = js.native
  
  var keepSubmitSucceeded: Boolean = js.native
  
  var keepValues: Boolean = js.native
  
  var updateUnregisteredFields: Boolean = js.native
}
object InitializeOptions {
  
  @scala.inline
  def apply(
    keepDirty: Boolean,
    keepSubmitSucceeded: Boolean,
    keepValues: Boolean,
    updateUnregisteredFields: Boolean
  ): InitializeOptions = {
    val __obj = js.Dynamic.literal(keepDirty = keepDirty.asInstanceOf[js.Any], keepSubmitSucceeded = keepSubmitSucceeded.asInstanceOf[js.Any], keepValues = keepValues.asInstanceOf[js.Any], updateUnregisteredFields = updateUnregisteredFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeOptions]
  }
  
  @scala.inline
  implicit class InitializeOptionsOps[Self <: InitializeOptions] (val x: Self) extends AnyVal {
    
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
    def setKeepSubmitSucceeded(value: Boolean): Self = this.set("keepSubmitSucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepValues(value: Boolean): Self = this.set("keepValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUnregisteredFields(value: Boolean): Self = this.set("updateUnregisteredFields", value.asInstanceOf[js.Any])
  }
}
