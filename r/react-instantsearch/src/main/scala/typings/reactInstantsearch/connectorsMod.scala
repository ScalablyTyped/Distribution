package typings.reactInstantsearch

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.StatelessComponent
import typings.reactInstantsearchCore.mod.AutocompleteExposed
import typings.reactInstantsearchCore.mod.AutocompleteProvided
import typings.reactInstantsearchCore.mod.BasicDoc
import typings.reactInstantsearchCore.mod.ConnectedComponentClass
import typings.reactInstantsearchCore.mod.CurrentRefinementsExposed
import typings.reactInstantsearchCore.mod.CurrentRefinementsProvided
import typings.reactInstantsearchCore.mod.GeoSearchExposed
import typings.reactInstantsearchCore.mod.GeoSearchProvided
import typings.reactInstantsearchCore.mod.HighlightPassedThru
import typings.reactInstantsearchCore.mod.HighlightProps
import typings.reactInstantsearchCore.mod.HighlightProvided
import typings.reactInstantsearchCore.mod.HitsProvided
import typings.reactInstantsearchCore.mod.InfiniteHitsProvided
import typings.reactInstantsearchCore.mod.MenuExposed
import typings.reactInstantsearchCore.mod.MenuProvided
import typings.reactInstantsearchCore.mod.NumericMenuExposed
import typings.reactInstantsearchCore.mod.NumericMenuProvided
import typings.reactInstantsearchCore.mod.RefinementListExposed
import typings.reactInstantsearchCore.mod.RefinementListProvided
import typings.reactInstantsearchCore.mod.SearchBoxExposed
import typings.reactInstantsearchCore.mod.SearchBoxProvided
import typings.reactInstantsearchCore.mod.StateResultsProvided
import typings.reactInstantsearchCore.mod.StatsProvided
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch/connectors", JSImport.Namespace)
@js.native
object connectorsMod extends js.Object {
  def connectAutoComplete[TDoc](stateless: StatelessComponent[AutocompleteProvided[TDoc]]): ComponentClass[AutocompleteExposed, ComponentState] = js.native
  def connectAutoComplete[Props /* <: AutocompleteProvided[TDoc] */, TDoc](Composed: ComponentType[Props]): ConnectedComponentClass[Props, AutocompleteProvided[TDoc], AutocompleteExposed] = js.native
  def connectBreadcrumb(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  def connectConfigure(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  def connectCurrentRefinements(stateless: StatelessComponent[CurrentRefinementsProvided]): ComponentClass[CurrentRefinementsExposed, ComponentState] = js.native
  def connectCurrentRefinements[TProps /* <: Partial[CurrentRefinementsProvided] */](Composed: ComponentType[TProps]): ConnectedComponentClass[TProps, CurrentRefinementsProvided, CurrentRefinementsExposed] = js.native
  def connectGeoSearch(stateless: StatelessComponent[GeoSearchProvided[_]]): ComponentClass[GeoSearchExposed, ComponentState] = js.native
  def connectGeoSearch[TProps /* <: Partial[GeoSearchProvided[THit]] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, GeoSearchProvided[THit], GeoSearchExposed] = js.native
  def connectHierarchicalMenu(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  def connectHighlight[TDoc](stateless: StatelessComponent[HighlightProps[TDoc]]): ComponentClass[HighlightPassedThru[TDoc], ComponentState] = js.native
  def connectHighlight[TProps /* <: Partial[HighlightProps[TDoc]] */, TDoc](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, HighlightProvided[TDoc], js.Object] = js.native
  def connectHits[THit](stateless: StatelessComponent[HitsProvided[THit]]): ComponentClass[js.Object, ComponentState] = js.native
  def connectHits[TProps /* <: HitsProvided[THit] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, HitsProvided[THit], js.Object] = js.native
  def connectHitsPerPage(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  def connectInfiniteHits(Composed: ComponentType[InfiniteHitsProvided[_]]): ComponentClass[js.Object, ComponentState] = js.native
  @JSName("connectInfiniteHits")
  def connectInfiniteHits_TProps_PartialInfiniteHitsProvidedTHitTHit_ConnectedComponentClass[TProps /* <: Partial[InfiniteHitsProvided[THit]] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, InfiniteHitsProvided[THit], js.Object] = js.native
  def connectMenu(stateless: StatelessComponent[MenuProvided]): ComponentClass[MenuExposed, ComponentState] = js.native
  def connectMenu[TProps /* <: Partial[MenuProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, MenuProvided, MenuExposed] = js.native
  def connectNumericMenu(stateless: StatelessComponent[NumericMenuProvided]): ComponentClass[NumericMenuExposed, ComponentState] = js.native
  def connectNumericMenu[TProps /* <: Partial[NumericMenuProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, NumericMenuProvided, NumericMenuExposed] = js.native
  def connectPagination(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  def connectPoweredBy(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  def connectRange(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  def connectRefinementList(stateless: StatelessComponent[RefinementListProvided]): ComponentClass[RefinementListExposed, ComponentState] = js.native
  def connectRefinementList[TProps /* <: Partial[RefinementListProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, RefinementListProvided, RefinementListExposed] = js.native
  def connectScrollTo(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  def connectSearchBox(stateless: StatelessComponent[SearchBoxProvided]): ComponentClass[SearchBoxExposed, ComponentState] = js.native
  def connectSearchBox[TProps /* <: Partial[SearchBoxProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, SearchBoxProvided, SearchBoxExposed] = js.native
  def connectSortBy(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  def connectStateResults(stateless: StatelessComponent[StateResultsProvided[BasicDoc]]): ComponentClass[js.Object, ComponentState] = js.native
  def connectStateResults[TProps /* <: Partial[StateResultsProvided[_]] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StateResultsProvided[BasicDoc], js.Object] = js.native
  def connectStats(stateless: StatelessComponent[StatsProvided]): ComponentClass[js.Object, ComponentState] = js.native
  def connectStats[TProps /* <: Partial[StatsProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StatsProvided, js.Object] = js.native
  def connectToggleRefinement(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
}

