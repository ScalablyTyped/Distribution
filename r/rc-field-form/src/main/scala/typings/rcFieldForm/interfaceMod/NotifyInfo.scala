package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.dependenciesUpdate
import typings.rcFieldForm.rcFieldFormStrings.external
import typings.rcFieldForm.rcFieldFormStrings.internal
import typings.rcFieldForm.rcFieldFormStrings.reset
import typings.rcFieldForm.rcFieldFormStrings.setField
import typings.rcFieldForm.rcFieldFormStrings.validateFinish
import typings.rcFieldForm.rcFieldFormStrings.valueUpdate
import org.scalablytyped.runtime.StObject
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
trait NotifyInfo extends StObject
object NotifyInfo {
  
  @scala.inline
  def DependenciesUpdateInfo(relatedFields: js.Array[InternalNamePath], `type`: dependenciesUpdate): typings.rcFieldForm.interfaceMod.DependenciesUpdateInfo = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rcFieldForm.interfaceMod.DependenciesUpdateInfo]
  }
  
  @scala.inline
  def ResetInfo(`type`: reset): typings.rcFieldForm.interfaceMod.ResetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rcFieldForm.interfaceMod.ResetInfo]
  }
  
  @scala.inline
  def SetFieldInfo(data: FieldData, `type`: setField): typings.rcFieldForm.interfaceMod.SetFieldInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rcFieldForm.interfaceMod.SetFieldInfo]
  }
  
  @scala.inline
  def ValidateFinishInfo(`type`: validateFinish): typings.rcFieldForm.interfaceMod.ValidateFinishInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rcFieldForm.interfaceMod.ValidateFinishInfo]
  }
  
  @scala.inline
  def ValueUpdateInfo(source: internal | external, `type`: valueUpdate): typings.rcFieldForm.interfaceMod.ValueUpdateInfo = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rcFieldForm.interfaceMod.ValueUpdateInfo]
  }
}
