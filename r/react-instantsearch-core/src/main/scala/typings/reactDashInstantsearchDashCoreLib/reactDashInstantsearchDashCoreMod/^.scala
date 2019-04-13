package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: java.lang.String = js.native
  def connectAutoComplete[TDoc](stateless: reactLib.reactMod.StatelessComponent[AutocompleteProvided[TDoc]]): reactLib.reactMod.ComponentClass[AutocompleteExposed, reactLib.reactMod.ComponentState] = js.native
  def connectAutoComplete[Props /* <: AutocompleteProvided[TDoc] */, TDoc](Composed: reactLib.reactMod.ComponentType[Props]): ConnectedComponentClass[Props, AutocompleteProvided[TDoc], AutocompleteExposed] = js.native
  def connectBreadcrumb(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectConfigure(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectCurrentRefinements(stateless: reactLib.reactMod.StatelessComponent[CurrentRefinementsProvided]): reactLib.reactMod.ComponentClass[CurrentRefinementsExposed, reactLib.reactMod.ComponentState] = js.native
  def connectCurrentRefinements[TProps /* <: stdLib.Partial[CurrentRefinementsProvided] */](Composed: reactLib.reactMod.ComponentType[TProps]): ConnectedComponentClass[TProps, CurrentRefinementsProvided, CurrentRefinementsExposed] = js.native
  def connectGeoSearch(stateless: reactLib.reactMod.StatelessComponent[GeoSearchProvided[_]]): reactLib.reactMod.ComponentClass[GeoSearchExposed, reactLib.reactMod.ComponentState] = js.native
  def connectGeoSearch[TProps /* <: stdLib.Partial[GeoSearchProvided[THit]] */, THit](ctor: reactLib.reactMod.ComponentType[TProps]): ConnectedComponentClass[TProps, GeoSearchProvided[THit], GeoSearchExposed] = js.native
  def connectHierarchicalMenu(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectHighlight[TDoc](stateless: reactLib.reactMod.StatelessComponent[HighlightProps[TDoc]]): reactLib.reactMod.ComponentClass[HighlightPassedThru[TDoc], reactLib.reactMod.ComponentState] = js.native
  def connectHighlight[TProps /* <: stdLib.Partial[HighlightProps[TDoc]] */, TDoc](ctor: reactLib.reactMod.ComponentType[TProps]): ConnectedComponentClass[TProps, HighlightProvided[TDoc], js.Object] = js.native
  def connectHits[THit](stateless: reactLib.reactMod.StatelessComponent[HitsProvided[THit]]): reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState] = js.native
  def connectHits[TProps /* <: HitsProvided[THit] */, THit](ctor: reactLib.reactMod.ComponentType[TProps]): ConnectedComponentClass[TProps, HitsProvided[THit], js.Object] = js.native
  def connectHitsPerPage(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectInfiniteHits(Composed: reactLib.reactMod.ComponentType[InfiniteHitsProvided[_]]): reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState] = js.native
  @JSName("connectInfiniteHits")
  def connectInfiniteHits_TPropsPartialTHitConnectedComponentClass[TProps /* <: stdLib.Partial[InfiniteHitsProvided[THit]] */, THit](ctor: reactLib.reactMod.ComponentType[TProps]): ConnectedComponentClass[TProps, InfiniteHitsProvided[THit], js.Object] = js.native
  def connectMenu(stateless: reactLib.reactMod.StatelessComponent[MenuProvided]): reactLib.reactMod.ComponentClass[MenuExposed, reactLib.reactMod.ComponentState] = js.native
  def connectMenu[TProps /* <: stdLib.Partial[MenuProvided] */](ctor: reactLib.reactMod.ComponentType[TProps]): ConnectedComponentClass[TProps, MenuProvided, MenuExposed] = js.native
  def connectNumericMenu(stateless: reactLib.reactMod.StatelessComponent[NumericMenuProvided]): reactLib.reactMod.ComponentClass[NumericMenuExposed, reactLib.reactMod.ComponentState] = js.native
  def connectNumericMenu[TProps /* <: stdLib.Partial[NumericMenuProvided] */](ctor: reactLib.reactMod.ComponentType[TProps]): ConnectedComponentClass[TProps, NumericMenuProvided, NumericMenuExposed] = js.native
  def connectPagination(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectPoweredBy(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectRange(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectRefinementList(stateless: reactLib.reactMod.StatelessComponent[RefinementListProvided]): reactLib.reactMod.ComponentClass[RefinementListExposed, reactLib.reactMod.ComponentState] = js.native
  def connectRefinementList[TProps /* <: stdLib.Partial[RefinementListProvided] */](ctor: reactLib.reactMod.ComponentType[TProps]): ConnectedComponentClass[TProps, RefinementListProvided, RefinementListExposed] = js.native
  def connectScrollTo(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectSearchBox(stateless: reactLib.reactMod.StatelessComponent[SearchBoxProvided]): reactLib.reactMod.ComponentClass[SearchBoxExposed, reactLib.reactMod.ComponentState] = js.native
  def connectSearchBox[TProps /* <: stdLib.Partial[SearchBoxProvided] */](ctor: reactLib.reactMod.ComponentType[TProps]): ConnectedComponentClass[TProps, SearchBoxProvided, SearchBoxExposed] = js.native
  def connectSortBy(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectStateResults(stateless: reactLib.reactMod.StatelessComponent[StateResultsProvided[BasicDoc]]): reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState] = js.native
  def connectStateResults[TProps /* <: stdLib.Partial[StateResultsProvided[_]] */](ctor: reactLib.reactMod.ComponentType[TProps]): ConnectedComponentClass[TProps, StateResultsProvided[BasicDoc], js.Object] = js.native
  def connectStats(stateless: reactLib.reactMod.StatelessComponent[StatsProvided]): reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState] = js.native
  def connectStats[TProps /* <: stdLib.Partial[StatsProvided] */](ctor: reactLib.reactMod.ComponentType[TProps]): ConnectedComponentClass[TProps, StatsProvided, js.Object] = js.native
  def connectToggleRefinement(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def createConnector[TProvided, TExposed](connectorDesc: ConnectorDescription[TProvided, TExposed]): (js.Function1[
    /* stateless */ reactLib.reactMod.StatelessComponent[ConnectorProvided[TProvided]], 
    reactLib.reactMod.ComponentClass[TExposed, reactLib.reactMod.ComponentState]
  ]) with (js.Function1[
    /* Composed */ reactLib.reactMod.ComponentType[stdLib.Partial[ConnectorProvided[TProvided]]], 
    ConnectedComponentClass[stdLib.Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided], TExposed]
  ]) = js.native
  def createIndex(defaultRoot: js.Object): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def createInstantSearch(
    defaultAlgoliaClient: js.Function3[
      /* appId */ java.lang.String, 
      /* apiKey */ java.lang.String, 
      /* options */ reactDashInstantsearchDashCoreLib.Anon_UseRequestCache, 
      js.Object
    ],
    root: js.Object
  ): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def translatable(
    defaultTranslations: org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Function1[/* repeated */ js.Any, java.lang.String])]
  ): js.Function1[
    /* ctor */ reactLib.reactMod.ComponentType[TranslatableProvided], 
    ConnectedComponentClass[TranslatableProvided, TranslatableProvided, TranslatableExposed]
  ] = js.native
}

