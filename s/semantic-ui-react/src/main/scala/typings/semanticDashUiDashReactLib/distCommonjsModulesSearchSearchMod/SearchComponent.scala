package typings
package semanticDashUiDashReactLib.distCommonjsModulesSearchSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchComponent
  extends reactLib.reactMod.ReactNs.ComponentClass[SearchProps, reactLib.reactMod.ReactNs.ComponentState] {
  @JSName("Category")
  var Category_Original: reactLib.reactMod.ReactNs.StatelessComponent[
    semanticDashUiDashReactLib.distCommonjsModulesSearchSearchCategoryMod.SearchCategoryProps
  ] = js.native
  var Result: reactLib.reactMod.ReactNs.ComponentClass[
    semanticDashUiDashReactLib.distCommonjsModulesSearchSearchResultMod.SearchResultProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  @JSName("Results")
  var Results_Original: reactLib.reactMod.ReactNs.StatelessComponent[
    semanticDashUiDashReactLib.distCommonjsModulesSearchSearchResultsMod.SearchResultsProps
  ] = js.native
  def Category(
    props: reactLib.reactMod.ReactNs.PropsWithChildren[
      semanticDashUiDashReactLib.distCommonjsModulesSearchSearchCategoryMod.SearchCategoryProps
    ]
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def Category(
    props: reactLib.reactMod.ReactNs.PropsWithChildren[
      semanticDashUiDashReactLib.distCommonjsModulesSearchSearchCategoryMod.SearchCategoryProps
    ],
    context: js.Any
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def Results(
    props: reactLib.reactMod.ReactNs.PropsWithChildren[
      semanticDashUiDashReactLib.distCommonjsModulesSearchSearchResultsMod.SearchResultsProps
    ]
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def Results(
    props: reactLib.reactMod.ReactNs.PropsWithChildren[
      semanticDashUiDashReactLib.distCommonjsModulesSearchSearchResultsMod.SearchResultsProps
    ],
    context: js.Any
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
}

