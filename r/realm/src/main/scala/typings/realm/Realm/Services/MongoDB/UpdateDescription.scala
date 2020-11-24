package typings.realm.Realm.Services.MongoDB

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A detailed description of an update performed on a document.
  */
@js.native
trait UpdateDescription extends js.Object {
  
  /** Names of fields that got removed. */
  var removedFields: js.Array[String] = js.native
  
  /** Names of fields that got updated. */
  var updatedFields: Record[String, _] = js.native
}
object UpdateDescription {
  
  @scala.inline
  def apply(removedFields: js.Array[String], updatedFields: Record[String, _]): UpdateDescription = {
    val __obj = js.Dynamic.literal(removedFields = removedFields.asInstanceOf[js.Any], updatedFields = updatedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDescription]
  }
  
  @scala.inline
  implicit class UpdateDescriptionOps[Self <: UpdateDescription] (val x: Self) extends AnyVal {
    
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
    def setRemovedFieldsVarargs(value: String*): Self = this.set("removedFields", js.Array(value :_*))
    
    @scala.inline
    def setRemovedFields(value: js.Array[String]): Self = this.set("removedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedFields(value: Record[String, _]): Self = this.set("updatedFields", value.asInstanceOf[js.Any])
  }
}
