package typings.reactSelect.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactSelect.typesMod.SelectOptionActionMeta[Option]
  - typings.reactSelect.typesMod.DeselectOptionActionMeta[Option]
  - typings.reactSelect.typesMod.RemoveValueActionMeta[Option]
  - typings.reactSelect.typesMod.PopValueActionMeta[Option]
  - typings.reactSelect.typesMod.ClearActionMeta[Option]
  - typings.reactSelect.typesMod.CreateOptionActionMeta[Option]
*/
trait ActionMeta[Option] extends StObject
object ActionMeta {
  
  inline def ClearActionMeta[Option](removedValues: Options[Option]): typings.reactSelect.typesMod.ClearActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "clear", removedValues = removedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactSelect.typesMod.ClearActionMeta[Option]]
  }
  
  inline def CreateOptionActionMeta[Option](option: Option): typings.reactSelect.typesMod.CreateOptionActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "create-option", option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactSelect.typesMod.CreateOptionActionMeta[Option]]
  }
  
  inline def DeselectOptionActionMeta[Option](): typings.reactSelect.typesMod.DeselectOptionActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "deselect-option")
    __obj.asInstanceOf[typings.reactSelect.typesMod.DeselectOptionActionMeta[Option]]
  }
  
  inline def PopValueActionMeta[Option](removedValue: Option): typings.reactSelect.typesMod.PopValueActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "pop-value", removedValue = removedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactSelect.typesMod.PopValueActionMeta[Option]]
  }
  
  inline def RemoveValueActionMeta[Option](removedValue: Option): typings.reactSelect.typesMod.RemoveValueActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "remove-value", removedValue = removedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactSelect.typesMod.RemoveValueActionMeta[Option]]
  }
  
  inline def SelectOptionActionMeta[Option](): typings.reactSelect.typesMod.SelectOptionActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "select-option")
    __obj.asInstanceOf[typings.reactSelect.typesMod.SelectOptionActionMeta[Option]]
  }
}
