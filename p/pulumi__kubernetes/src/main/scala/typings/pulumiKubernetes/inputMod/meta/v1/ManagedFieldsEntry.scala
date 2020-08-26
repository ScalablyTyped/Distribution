package typings.pulumiKubernetes.inputMod.meta.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
  */
@js.native
trait ManagedFieldsEntry extends js.Object {
  /**
    * APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
    */
  var apiVersion: js.UndefOr[Input[String]] = js.native
  /**
    * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: "FieldsV1"
    */
  var fieldsType: js.UndefOr[Input[String]] = js.native
  /**
    * FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
    */
  var fieldsV1: js.UndefOr[js.Any] = js.native
  /**
    * Manager is an identifier of the workflow managing these fields.
    */
  var manager: js.UndefOr[Input[String]] = js.native
  /**
    * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.
    */
  var operation: js.UndefOr[Input[String]] = js.native
  /**
    * Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply'
    */
  var time: js.UndefOr[Input[String]] = js.native
}

object ManagedFieldsEntry {
  @scala.inline
  def apply(): ManagedFieldsEntry = {
    val __obj = js.Dynamic.literal()
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
    def setApiVersion(value: Input[String]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setFieldsType(value: Input[String]): Self = this.set("fieldsType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldsType: Self = this.set("fieldsType", js.undefined)
    @scala.inline
    def setFieldsV1(value: js.Any): Self = this.set("fieldsV1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldsV1: Self = this.set("fieldsV1", js.undefined)
    @scala.inline
    def setManager(value: Input[String]): Self = this.set("manager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManager: Self = this.set("manager", js.undefined)
    @scala.inline
    def setOperation(value: Input[String]): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setTime(value: Input[String]): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

