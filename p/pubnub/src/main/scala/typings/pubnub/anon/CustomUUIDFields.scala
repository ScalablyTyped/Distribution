package typings.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomUUIDFields extends js.Object {
  
  var UUIDFields: js.UndefOr[Boolean] = js.native
  
  var customFields: js.UndefOr[Boolean] = js.native
  
  var customUUIDFields: js.UndefOr[Boolean] = js.native
  
  var totalCount: js.UndefOr[Boolean] = js.native
}
object CustomUUIDFields {
  
  @scala.inline
  def apply(): CustomUUIDFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomUUIDFields]
  }
  
  @scala.inline
  implicit class CustomUUIDFieldsOps[Self <: CustomUUIDFields] (val x: Self) extends AnyVal {
    
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
    def setUUIDFields(value: Boolean): Self = this.set("UUIDFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUUIDFields: Self = this.set("UUIDFields", js.undefined)
    
    @scala.inline
    def setCustomFields(value: Boolean): Self = this.set("customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFields: Self = this.set("customFields", js.undefined)
    
    @scala.inline
    def setCustomUUIDFields(value: Boolean): Self = this.set("customUUIDFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomUUIDFields: Self = this.set("customUUIDFields", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Boolean): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
  }
}
