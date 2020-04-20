package typings.rcFieldForm.formContextMod

import typings.rcFieldForm.interfaceMod.FieldData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormChangeInfo extends js.Object {
  var changedFields: js.Array[FieldData]
  var forms: Forms
}

object FormChangeInfo {
  @scala.inline
  def apply(changedFields: js.Array[FieldData], forms: Forms): FormChangeInfo = {
    val __obj = js.Dynamic.literal(changedFields = changedFields.asInstanceOf[js.Any], forms = forms.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormChangeInfo]
  }
}

