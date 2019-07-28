package typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns

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
    * Fields identifies a set of fields.
    */
  val fields: js.Object
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
  def apply(apiVersion: String, fields: js.Object, manager: String, operation: String, time: String): ManagedFieldsEntry = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, fields = fields, manager = manager, operation = operation, time = time)
  
    __obj.asInstanceOf[ManagedFieldsEntry]
  }
}

