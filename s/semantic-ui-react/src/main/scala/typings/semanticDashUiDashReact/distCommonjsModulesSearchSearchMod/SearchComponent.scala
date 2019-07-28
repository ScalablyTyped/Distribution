package typings.semanticDashUiDashReact.distCommonjsModulesSearchSearchMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import typings.semanticDashUiDashReact.distCommonjsModulesSearchSearchCategoryMod.SearchCategoryProps
import typings.semanticDashUiDashReact.distCommonjsModulesSearchSearchResultMod.SearchResultProps
import typings.semanticDashUiDashReact.distCommonjsModulesSearchSearchResultsMod.SearchResultsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchComponent extends ComponentClass[SearchProps, ComponentState] {
  var Category: StatelessComponent[SearchCategoryProps] = js.native
  var Result: ComponentClass[SearchResultProps, ComponentState] = js.native
  var Results: StatelessComponent[SearchResultsProps] = js.native
}

