package typings.reactSelect.distDeclarationsSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactSelect.distDeclarationsSrcTypesMod.SelectOptionActionMeta[Option]
  - typings.reactSelect.distDeclarationsSrcTypesMod.DeselectOptionActionMeta[Option]
  - typings.reactSelect.distDeclarationsSrcTypesMod.RemoveValueActionMeta[Option]
  - typings.reactSelect.distDeclarationsSrcTypesMod.PopValueActionMeta[Option]
  - typings.reactSelect.distDeclarationsSrcTypesMod.ClearActionMeta[Option]
  - typings.reactSelect.distDeclarationsSrcTypesMod.CreateOptionActionMeta[Option]
*/
trait ActionMeta[Option] extends StObject
object ActionMeta {
  
  inline def ClearActionMeta[Option](removedValues: Options[Option]): typings.reactSelect.distDeclarationsSrcTypesMod.ClearActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "clear", removedValues = removedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactSelect.distDeclarationsSrcTypesMod.ClearActionMeta[Option]]
  }
  
  inline def CreateOptionActionMeta[Option](option: Option): typings.reactSelect.distDeclarationsSrcTypesMod.CreateOptionActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "create-option", option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactSelect.distDeclarationsSrcTypesMod.CreateOptionActionMeta[Option]]
  }
  
  inline def DeselectOptionActionMeta[Option](): typings.reactSelect.distDeclarationsSrcTypesMod.DeselectOptionActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "deselect-option")
    __obj.asInstanceOf[typings.reactSelect.distDeclarationsSrcTypesMod.DeselectOptionActionMeta[Option]]
  }
  
  inline def PopValueActionMeta[Option](removedValue: Option): typings.reactSelect.distDeclarationsSrcTypesMod.PopValueActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "pop-value", removedValue = removedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactSelect.distDeclarationsSrcTypesMod.PopValueActionMeta[Option]]
  }
  
  inline def RemoveValueActionMeta[Option](removedValue: Option): typings.reactSelect.distDeclarationsSrcTypesMod.RemoveValueActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "remove-value", removedValue = removedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactSelect.distDeclarationsSrcTypesMod.RemoveValueActionMeta[Option]]
  }
  
  inline def SelectOptionActionMeta[Option](): typings.reactSelect.distDeclarationsSrcTypesMod.SelectOptionActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "select-option")
    __obj.asInstanceOf[typings.reactSelect.distDeclarationsSrcTypesMod.SelectOptionActionMeta[Option]]
  }
}
