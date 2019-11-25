package typings.atPulumiKubernetes.typesOutputMod.meta.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that
  * the fieldset applies to.
  */
trait ManagedFieldsEntry extends js.Object {
  /**
    * APIVersion defines the version of this resource that this field set applies to. The format
    * is "group/version" just like the top-level APIVersion field. It is necessary to track the
    * version of a field set because it cannot be automatically converted.
    */
  val apiVersion: String
  /**
    * FieldsType is the discriminator for the different fields format and version. There is
    * currently only one possible value: "FieldsV1"
    */
  val fieldsType: String
  /**
    * FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
    */
  val fieldsV1: js.Object
  /**
    * Manager is an identifier of the workflow managing these fields.
    */
  val manager: String
  /**
    * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The
    * only valid values for this field are 'Apply' and 'Update'.
    */
  val operation: String
  /**
    * Time is timestamp of when these fields were set. It should always be empty if Operation is
    * 'Apply'
    */
  val time: String
}

object ManagedFieldsEntry {
  @scala.inline
  def apply(
    apiVersion: String,
    fieldsType: String,
    fieldsV1: js.Object,
    manager: String,
    operation: String,
    time: String
  ): ManagedFieldsEntry = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], fieldsType = fieldsType.asInstanceOf[js.Any], fieldsV1 = fieldsV1.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ManagedFieldsEntry]
  }
}

