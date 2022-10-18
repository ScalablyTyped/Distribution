package typings.rcFieldForm.esInterfaceMod

import typings.rcFieldForm.rcFieldFormStrings.external
import typings.rcFieldForm.rcFieldFormStrings.internal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rcFieldForm.esInterfaceMod.ValueUpdateInfo
  - typings.rcFieldForm.esInterfaceMod.ValidateFinishInfo
  - typings.rcFieldForm.esInterfaceMod.ResetInfo
  - typings.rcFieldForm.esInterfaceMod.RemoveInfo
  - typings.rcFieldForm.esInterfaceMod.SetFieldInfo
  - typings.rcFieldForm.esInterfaceMod.DependenciesUpdateInfo
*/
trait NotifyInfo extends StObject
object NotifyInfo {
  
  inline def DependenciesUpdateInfo(relatedFields: js.Array[InternalNamePath]): typings.rcFieldForm.esInterfaceMod.DependenciesUpdateInfo = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dependenciesUpdate")
    __obj.asInstanceOf[typings.rcFieldForm.esInterfaceMod.DependenciesUpdateInfo]
  }
  
  inline def RemoveInfo(): typings.rcFieldForm.esInterfaceMod.RemoveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("remove")
    __obj.asInstanceOf[typings.rcFieldForm.esInterfaceMod.RemoveInfo]
  }
  
  inline def ResetInfo(): typings.rcFieldForm.esInterfaceMod.ResetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("reset")
    __obj.asInstanceOf[typings.rcFieldForm.esInterfaceMod.ResetInfo]
  }
  
  inline def SetFieldInfo(data: FieldData): typings.rcFieldForm.esInterfaceMod.SetFieldInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setField")
    __obj.asInstanceOf[typings.rcFieldForm.esInterfaceMod.SetFieldInfo]
  }
  
  inline def ValidateFinishInfo(): typings.rcFieldForm.esInterfaceMod.ValidateFinishInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("validateFinish")
    __obj.asInstanceOf[typings.rcFieldForm.esInterfaceMod.ValidateFinishInfo]
  }
  
  inline def ValueUpdateInfo(source: internal | external): typings.rcFieldForm.esInterfaceMod.ValueUpdateInfo = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("valueUpdate")
    __obj.asInstanceOf[typings.rcFieldForm.esInterfaceMod.ValueUpdateInfo]
  }
}
