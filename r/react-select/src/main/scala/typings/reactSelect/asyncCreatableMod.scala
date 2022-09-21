package typings.reactSelect

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactSelect.reactSelectBooleans.`false`
import typings.reactSelect.typesMod.GroupBase
import typings.reactSelect.useAsyncMod.AsyncAdditionalProps
import typings.reactSelect.useCreatableMod.CreatableAdditionalProps
import typings.reactSelect.useStateManagerMod.StateManagerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncCreatableMod extends Shortcut {
  
  @JSImport("react-select/dist/declarations/src/AsyncCreatable", JSImport.Default)
  @js.native
  val default: AsyncCreatableSelect = js.native
  
  type AsyncCreatableProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = (StateManagerProps[Option, IsMulti, Group]) & (CreatableAdditionalProps[Option, Group]) & (AsyncAdditionalProps[Option, Group])
  
  type AsyncCreatableSelect = js.Function1[
    /* props */ (AsyncCreatableProps[Any, `false`, GroupBase[Any]]) & (RefAttributes[typings.reactSelect.selectMod.default[Any, `false`, GroupBase[Any]]]), 
    ReactElement
  ]
  
  type _To = AsyncCreatableSelect
  
  /* This means you don't have to write `default`, but can instead just say `asyncCreatableMod.foo` */
  override def _to: AsyncCreatableSelect = default
}
