package typings.reactSelect

import typings.reactSelect.distDeclarationsSrcAsyncMod_.AsyncSelect
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.reactSelect.distDeclarationsSrcUseAsyncMod.AsyncManagedPropKeys
import typings.reactSelect.distDeclarationsSrcUseAsyncMod.AsyncProps
import typings.reactSelect.distDeclarationsSrcUseStateManagerMod.StateManagerProps
import typings.reactSelect.reactSelectStrings.cacheOptions
import typings.reactSelect.reactSelectStrings.defaultOptions
import typings.reactSelect.reactSelectStrings.isLoading
import typings.reactSelect.reactSelectStrings.loadOptions
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAsyncMod {
  
  @JSImport("react-select/dist/declarations/src/async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/dist/declarations/src/async", JSImport.Default)
  @js.native
  val default: AsyncSelect = js.native
  
  inline def useAsync[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */, AdditionalProps](param0: (AsyncProps[Option, IsMulti, Group]) & AdditionalProps): (StateManagerProps[Option, IsMulti, Group]) & (Omit[
    AdditionalProps, 
    defaultOptions | cacheOptions | loadOptions | isLoading | AsyncManagedPropKeys
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsync")(param0.asInstanceOf[js.Any]).asInstanceOf[(StateManagerProps[Option, IsMulti, Group]) & (Omit[
    AdditionalProps, 
    defaultOptions | cacheOptions | loadOptions | isLoading | AsyncManagedPropKeys
  ])]
}
