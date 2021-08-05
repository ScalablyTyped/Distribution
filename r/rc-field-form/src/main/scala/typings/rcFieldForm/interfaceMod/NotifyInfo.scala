package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.external
import typings.rcFieldForm.rcFieldFormStrings.internal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  inline def DependenciesUpdateInfo(relatedFields: js.Array[InternalNamePath]): typings.rcFieldForm.interfaceMod.DependenciesUpdateInfo = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dependenciesUpdate")
    __obj.asInstanceOf[typings.rcFieldForm.interfaceMod.DependenciesUpdateInfo]
  }
  
  inline def ResetInfo(): typings.rcFieldForm.interfaceMod.ResetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("reset")
    __obj.asInstanceOf[typings.rcFieldForm.interfaceMod.ResetInfo]
  }
  
  inline def SetFieldInfo(data: FieldData): typings.rcFieldForm.interfaceMod.SetFieldInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setField")
    __obj.asInstanceOf[typings.rcFieldForm.interfaceMod.SetFieldInfo]
  }
  
  inline def ValidateFinishInfo(): typings.rcFieldForm.interfaceMod.ValidateFinishInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("validateFinish")
    __obj.asInstanceOf[typings.rcFieldForm.interfaceMod.ValidateFinishInfo]
  }
  
  inline def ValueUpdateInfo(source: internal | external): typings.rcFieldForm.interfaceMod.ValueUpdateInfo = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("valueUpdate")
    __obj.asInstanceOf[typings.rcFieldForm.interfaceMod.ValueUpdateInfo]
  }
}
