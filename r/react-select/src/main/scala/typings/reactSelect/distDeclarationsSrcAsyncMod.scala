package typings.reactSelect

import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.reactSelect.distDeclarationsSrcUseAsyncMod.AsyncManagedPropKeys
import typings.reactSelect.distDeclarationsSrcUseAsyncMod.AsyncProps
import typings.reactSelect.distDeclarationsSrcUseStateManagerMod.StateManagerProps
import typings.reactSelect.reactSelectBooleans.`false`
import typings.reactSelect.reactSelectStrings.cacheOptions
import typings.reactSelect.reactSelectStrings.defaultOptions
import typings.reactSelect.reactSelectStrings.isLoading
import typings.reactSelect.reactSelectStrings.loadOptions
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAsyncMod {
  
  @JSImport("react-select/dist/declarations/src/Async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/dist/declarations/src/Async", JSImport.Default)
  @js.native
  val default: AsyncSelect = js.native
  
  inline def useAsync[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */, AdditionalProps](
    hasPropsDefaultOptionsCacheOptionsPropsLoadOptionsPropsOptionsPropsIsLoadingPropsOnInputChangeFilterOptionRestSelectProps: (AsyncProps[Option, IsMulti, Group]) & AdditionalProps
  ): (StateManagerProps[Option, IsMulti, Group]) & (Omit[
    AdditionalProps, 
    defaultOptions | cacheOptions | loadOptions | isLoading | AsyncManagedPropKeys
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsync")(hasPropsDefaultOptionsCacheOptionsPropsLoadOptionsPropsOptionsPropsIsLoadingPropsOnInputChangeFilterOptionRestSelectProps.asInstanceOf[js.Any]).asInstanceOf[(StateManagerProps[Option, IsMulti, Group]) & (Omit[
    AdditionalProps, 
    defaultOptions | cacheOptions | loadOptions | isLoading | AsyncManagedPropKeys
  ])]
  
  type AsyncSelect = js.Function1[
    /* props */ (AsyncProps[Any, `false`, GroupBase[Any]]) & (RefAttributes[
      typings.reactSelect.distDeclarationsSrcSelectMod.default[Any, `false`, GroupBase[Any]]
    ]), 
    ReactElement
  ]
}
