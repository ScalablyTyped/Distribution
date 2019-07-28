package typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import typings.reactDashInstantsearchDashCore.Anon_UseRequestCache
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
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
  def createConnector[TProvided, TExposed](connectorDesc: ConnectorDescription[TProvided, TExposed]): (js.Function1[
    /* stateless */ StatelessComponent[ConnectorProvided[TProvided]], 
    ComponentClass[TExposed, ComponentState]
  ]) with (js.Function1[
    /* Composed */ ComponentType[Partial[ConnectorProvided[TProvided]]], 
    ConnectedComponentClass[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided], TExposed]
  ]) = js.native
  def createIndex(defaultRoot: js.Object): ComponentClass[_, ComponentState] = js.native
  def createInstantSearch(
    defaultAlgoliaClient: js.Function3[/* appId */ String, /* apiKey */ String, /* options */ Anon_UseRequestCache, js.Object],
    root: js.Object
  ): ComponentClass[_, ComponentState] = js.native
  def translatable(defaultTranslations: StringDictionary[String | (js.Function1[/* repeated */ js.Any, String])]): js.Function1[
    /* ctor */ ComponentType[TranslatableProvided], 
    ConnectedComponentClass[TranslatableProvided, TranslatableProvided, TranslatableExposed]
  ] = js.native
}

