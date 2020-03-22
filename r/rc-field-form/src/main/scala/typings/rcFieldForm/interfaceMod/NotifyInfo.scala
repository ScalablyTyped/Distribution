package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.dependenciesUpdate
import typings.rcFieldForm.rcFieldFormStrings.external
import typings.rcFieldForm.rcFieldFormStrings.internal
import typings.rcFieldForm.rcFieldFormStrings.reset
import typings.rcFieldForm.rcFieldFormStrings.setField
import typings.rcFieldForm.rcFieldFormStrings.validateFinish
import typings.rcFieldForm.rcFieldFormStrings.valueUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcFieldForm.interfaceMod.ValueUpdateInfo
  - typings.rcFieldForm.AnonType
  - typings.rcFieldForm.AnonData
  - typings.rcFieldForm.AnonRelatedFields
*/
trait NotifyInfo extends js.Object

object NotifyInfo {
  @scala.inline
  def ValueUpdateInfo(source: internal | external, `type`: valueUpdate): NotifyInfo = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
  @scala.inline
  def AnonType(`type`: validateFinish | reset): NotifyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
  @scala.inline
  def AnonData(data: FieldData, `type`: setField): NotifyInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
  @scala.inline
  def AnonRelatedFields(relatedFields: js.Array[InternalNamePath], `type`: dependenciesUpdate): NotifyInfo = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
}

