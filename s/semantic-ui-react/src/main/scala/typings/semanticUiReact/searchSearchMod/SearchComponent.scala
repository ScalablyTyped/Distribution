package typings.semanticUiReact.searchSearchMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.searchCategoryMod.SearchCategoryProps
import typings.semanticUiReact.searchResultMod.SearchResultProps
import typings.semanticUiReact.searchResultsMod.SearchResultsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchComponent extends ComponentClass[SearchProps, ComponentState] {
  
  var Category: StatelessComponent[SearchCategoryProps] = js.native
  
  var Result: ComponentClass[SearchResultProps, ComponentState] = js.native
  
  var Results: StatelessComponent[SearchResultsProps] = js.native
}
