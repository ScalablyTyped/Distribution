package typings.reactInstantsearch

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.reactInstantsearchCore.anon.PartialCurrentRefinements
import typings.reactInstantsearchCore.anon.PartialMenuProvided
import typings.reactInstantsearchCore.anon.PartialNumericMenuProvide
import typings.reactInstantsearchCore.anon.PartialRefinementListProv
import typings.reactInstantsearchCore.anon.PartialSearchBoxProvided
import typings.reactInstantsearchCore.anon.PartialStateResultsProvid
import typings.reactInstantsearchCore.anon.PartialStatsProvided
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectorsMod {
  
  @JSImport("react-instantsearch/connectors", "connectAutoComplete")
  @js.native
  def connectAutoComplete[TDoc](stateless: FunctionComponent[AutocompleteProvided[TDoc]]): ComponentClass[AutocompleteExposed, ComponentState] = js.native
  @JSImport("react-instantsearch/connectors", "connectAutoComplete")
  @js.native
  def connectAutoComplete[Props /* <: AutocompleteProvided[TDoc] */, TDoc](Composed: ComponentType[Props]): ConnectedComponentClass[Props, AutocompleteProvided[TDoc], AutocompleteExposed] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectBreadcrumb")
  @js.native
  def connectBreadcrumb(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectConfigure")
  @js.native
  def connectConfigure(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectCurrentRefinements")
  @js.native
  def connectCurrentRefinements(stateless: FunctionComponent[CurrentRefinementsProvided]): ComponentClass[CurrentRefinementsExposed, ComponentState] = js.native
  @JSImport("react-instantsearch/connectors", "connectCurrentRefinements")
  @js.native
  def connectCurrentRefinements[TProps /* <: PartialCurrentRefinements */](Composed: ComponentType[TProps]): ConnectedComponentClass[TProps, CurrentRefinementsProvided, CurrentRefinementsExposed] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectGeoSearch")
  @js.native
  def connectGeoSearch(stateless: FunctionComponent[GeoSearchProvided[_]]): ComponentClass[GeoSearchExposed, ComponentState] = js.native
  @JSImport("react-instantsearch/connectors", "connectGeoSearch")
  @js.native
  def connectGeoSearch[TProps /* <: Partial[GeoSearchProvided[THit]] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, GeoSearchProvided[THit], GeoSearchExposed] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectHierarchicalMenu")
  @js.native
  def connectHierarchicalMenu(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectHighlight")
  @js.native
  def connectHighlight[TDoc](stateless: FunctionComponent[HighlightProps[TDoc]]): ComponentClass[HighlightPassedThru[TDoc], ComponentState] = js.native
  @JSImport("react-instantsearch/connectors", "connectHighlight")
  @js.native
  def connectHighlight[TProps /* <: Partial[HighlightProps[TDoc]] */, TDoc](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, HighlightProvided[TDoc], js.Object] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectHits")
  @js.native
  def connectHits[THit](stateless: FunctionComponent[HitsProvided[THit]]): ComponentClass[js.Object, ComponentState] = js.native
  @JSImport("react-instantsearch/connectors", "connectHits")
  @js.native
  def connectHits[TProps /* <: HitsProvided[THit] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, HitsProvided[THit], js.Object] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectHitsPerPage")
  @js.native
  def connectHitsPerPage(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectInfiniteHits")
  @js.native
  def connectInfiniteHits(Composed: ComponentType[InfiniteHitsProvided[_]]): ComponentClass[js.Object, ComponentState] = js.native
  @JSImport("react-instantsearch/connectors", "connectInfiniteHits")
  @js.native
  def connectInfiniteHits_TProps_PartialInfiniteHitsProvidedTHitTHit_ConnectedComponentClass[TProps /* <: Partial[InfiniteHitsProvided[THit]] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, InfiniteHitsProvided[THit], js.Object] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectMenu")
  @js.native
  def connectMenu(stateless: FunctionComponent[MenuProvided]): ComponentClass[MenuExposed, ComponentState] = js.native
  @JSImport("react-instantsearch/connectors", "connectMenu")
  @js.native
  def connectMenu[TProps /* <: PartialMenuProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, MenuProvided, MenuExposed] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectNumericMenu")
  @js.native
  def connectNumericMenu(stateless: FunctionComponent[NumericMenuProvided]): ComponentClass[NumericMenuExposed, ComponentState] = js.native
  @JSImport("react-instantsearch/connectors", "connectNumericMenu")
  @js.native
  def connectNumericMenu[TProps /* <: PartialNumericMenuProvide */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, NumericMenuProvided, NumericMenuExposed] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectPagination")
  @js.native
  def connectPagination(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectPoweredBy")
  @js.native
  def connectPoweredBy(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectRange")
  @js.native
  def connectRange(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectRefinementList")
  @js.native
  def connectRefinementList(stateless: FunctionComponent[RefinementListProvided]): ComponentClass[RefinementListExposed, ComponentState] = js.native
  @JSImport("react-instantsearch/connectors", "connectRefinementList")
  @js.native
  def connectRefinementList[TProps /* <: PartialRefinementListProv */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, RefinementListProvided, RefinementListExposed] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectScrollTo")
  @js.native
  def connectScrollTo(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectSearchBox")
  @js.native
  def connectSearchBox(stateless: FunctionComponent[SearchBoxProvided]): ComponentClass[SearchBoxExposed, ComponentState] = js.native
  @JSImport("react-instantsearch/connectors", "connectSearchBox")
  @js.native
  def connectSearchBox[TProps /* <: PartialSearchBoxProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, SearchBoxProvided, SearchBoxExposed] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectSortBy")
  @js.native
  def connectSortBy(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectStateResults")
  @js.native
  def connectStateResults(stateless: FunctionComponent[StateResultsProvided[BasicDoc]]): ComponentClass[js.Object, ComponentState] = js.native
  @JSImport("react-instantsearch/connectors", "connectStateResults")
  @js.native
  def connectStateResults[TProps /* <: PartialStateResultsProvid */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StateResultsProvided[BasicDoc], js.Object] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectStats")
  @js.native
  def connectStats(stateless: FunctionComponent[StatsProvided]): ComponentClass[js.Object, ComponentState] = js.native
  @JSImport("react-instantsearch/connectors", "connectStats")
  @js.native
  def connectStats[TProps /* <: PartialStatsProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StatsProvided, js.Object] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectToggleRefinement")
  @js.native
  def connectToggleRefinement(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
}
