package typings.atPulumiKubernetes.typesInputMod.meta.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * FieldsType is the discriminator for the different fields format and version. There is
    * currently only one possible value: "FieldsV1"
    */
  var fieldsType: js.UndefOr[Input[String]] = js.undefined
  /**
    * FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
    */
  var fieldsV1: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * Manager is an identifier of the workflow managing these fields.
    */
  var manager: js.UndefOr[Input[String]] = js.undefined
  /**
    * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The
    * only valid values for this field are 'Apply' and 'Update'.
    */
  var operation: js.UndefOr[Input[String]] = js.undefined
  /**
    * Time is timestamp of when these fields were set. It should always be empty if Operation is
    * 'Apply'
    */
  var time: js.UndefOr[Input[String]] = js.undefined
}

object ManagedFieldsEntry {
  @scala.inline
  def apply(
    apiVersion: Input[String] = null,
    fieldsType: Input[String] = null,
    fieldsV1: Input[js.Object] = null,
    manager: Input[String] = null,
    operation: Input[String] = null,
    time: Input[String] = null
  ): ManagedFieldsEntry = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (fieldsType != null) __obj.updateDynamic("fieldsType")(fieldsType.asInstanceOf[js.Any])
    if (fieldsV1 != null) __obj.updateDynamic("fieldsV1")(fieldsV1.asInstanceOf[js.Any])
    if (manager != null) __obj.updateDynamic("manager")(manager.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedFieldsEntry]
  }
}

