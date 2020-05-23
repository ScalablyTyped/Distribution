package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.FieldData
import typings.rcFieldForm.interfaceMod.NotifyInfo
import typings.rcFieldForm.rcFieldFormStrings.setField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends NotifyInfo {
  var data: FieldData
  var `type`: setField
}

object Data {
  @scala.inline
  def apply(data: FieldData, `type`: setField): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

