package typings.pulumiKubernetes.outputMod.meta.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
  */
@js.native
trait ManagedFieldsEntry extends js.Object {
  
  /**
    * APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
    */
  var apiVersion: String = js.native
  
  /**
    * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: "FieldsV1"
    */
  var fieldsType: String = js.native
  
  /**
    * FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
    */
  var fieldsV1: js.Any = js.native
  
  /**
    * Manager is an identifier of the workflow managing these fields.
    */
  var manager: String = js.native
  
  /**
    * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.
    */
  var operation: String = js.native
  
  /**
    * Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply'
    */
  var time: String = js.native
}
object ManagedFieldsEntry {
  
  @scala.inline
  def apply(
    apiVersion: String,
    fieldsType: String,
    fieldsV1: js.Any,
    manager: String,
    operation: String,
    time: String
  ): ManagedFieldsEntry = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], fieldsType = fieldsType.asInstanceOf[js.Any], fieldsV1 = fieldsV1.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedFieldsEntry]
  }
  
  @scala.inline
  implicit class ManagedFieldsEntryOps[Self <: ManagedFieldsEntry] (val x: Self) extends AnyVal {
    
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsType(value: String): Self = this.set("fieldsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsV1(value: js.Any): Self = this.set("fieldsV1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManager(value: String): Self = this.set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
