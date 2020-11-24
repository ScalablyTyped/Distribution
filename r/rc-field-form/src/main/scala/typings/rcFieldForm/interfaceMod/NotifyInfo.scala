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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rcFieldForm.interfaceMod.ValueUpdateInfo
  - typings.rcFieldForm.interfaceMod.ValidateFinishInfo
  - typings.rcFieldForm.interfaceMod.ResetInfo
  - typings.rcFieldForm.interfaceMod.SetFieldInfo
  - typings.rcFieldForm.interfaceMod.DependenciesUpdateInfo
*/
trait NotifyInfo extends js.Object
object NotifyInfo {
  
  @scala.inline
  def DependenciesUpdateInfo(relatedFields: js.Array[InternalNamePath], `type`: dependenciesUpdate): NotifyInfo = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
  
  @scala.inline
  def ValueUpdateInfo(source: internal | external, `type`: valueUpdate): NotifyInfo = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
  
  @scala.inline
  def ResetInfo(`type`: reset): NotifyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
  
  @scala.inline
  def SetFieldInfo(data: FieldData, `type`: setField): NotifyInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
  
  @scala.inline
  def ValidateFinishInfo(`type`: validateFinish): NotifyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
}
