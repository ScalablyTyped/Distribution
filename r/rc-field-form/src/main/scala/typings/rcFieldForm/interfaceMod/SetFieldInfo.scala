package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.setField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetFieldInfo extends NotifyInfo {
  var data: FieldData
  var `type`: setField
}

object SetFieldInfo {
  @scala.inline
  def apply(data: FieldData, `type`: setField): SetFieldInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFieldInfo]
  }
}

