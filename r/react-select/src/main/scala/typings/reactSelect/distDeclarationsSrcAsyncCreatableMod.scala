package typings.reactSelect

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.reactSelect.distDeclarationsSrcUseAsyncMod.AsyncAdditionalProps
import typings.reactSelect.distDeclarationsSrcUseCreatableMod.CreatableAdditionalProps
import typings.reactSelect.distDeclarationsSrcUseStateManagerMod.StateManagerProps
import typings.reactSelect.reactSelectBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAsyncCreatableMod extends Shortcut {
  
  @JSImport("react-select/dist/declarations/src/AsyncCreatable", JSImport.Default)
  @js.native
  val default: AsyncCreatableSelect = js.native
  
  type AsyncCreatableProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = (StateManagerProps[Option, IsMulti, Group]) & (CreatableAdditionalProps[Option, Group]) & (AsyncAdditionalProps[Option, Group])
  
  type AsyncCreatableSelect = js.Function1[
    /* props */ (AsyncCreatableProps[Any, `false`, GroupBase[Any]]) & (RefAttributes[
      typings.reactSelect.distDeclarationsSrcSelectMod.default[Any, `false`, GroupBase[Any]]
    ]), 
    ReactElement
  ]
  
  type _To = AsyncCreatableSelect
  
  /* This means you don't have to write `default`, but can instead just say `distDeclarationsSrcAsyncCreatableMod.foo` */
  override def _to: AsyncCreatableSelect = default
}
