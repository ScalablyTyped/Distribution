package typings.reactSelect

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactSelect.reactSelectBooleans.`false`
import typings.reactSelect.typesMod.GroupBase
import typings.reactSelect.useStateManagerMod.StateManagerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateManagerMod extends Shortcut {
  
  @JSImport("react-select/dist/declarations/src/stateManager", JSImport.Default)
  @js.native
  val default: StateManagedSelect = js.native
  
  type StateManagedSelect = js.Function1[
    /* props */ (StateManagerProps[Any, `false`, GroupBase[Any]]) & (RefAttributes[typings.reactSelect.selectMod.default[Any, `false`, GroupBase[Any]]]), 
    ReactElement
  ]
  
  type _To = StateManagedSelect
  
  /* This means you don't have to write `default`, but can instead just say `stateManagerMod.foo` */
  override def _to: StateManagedSelect = default
}
