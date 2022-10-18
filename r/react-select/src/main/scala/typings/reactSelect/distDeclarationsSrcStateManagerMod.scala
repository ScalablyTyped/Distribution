package typings.reactSelect

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.reactSelect.distDeclarationsSrcUseStateManagerMod.StateManagerProps
import typings.reactSelect.reactSelectBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcStateManagerMod extends Shortcut {
  
  @JSImport("react-select/dist/declarations/src/stateManager", JSImport.Default)
  @js.native
  val default: StateManagedSelect = js.native
  
  type StateManagedSelect = js.Function1[
    /* props */ (StateManagerProps[Any, `false`, GroupBase[Any]]) & (RefAttributes[
      typings.reactSelect.distDeclarationsSrcSelectMod.default[Any, `false`, GroupBase[Any]]
    ]), 
    ReactElement
  ]
  
  type _To = StateManagedSelect
  
  /* This means you don't have to write `default`, but can instead just say `distDeclarationsSrcStateManagerMod.foo` */
  override def _to: StateManagedSelect = default
}
