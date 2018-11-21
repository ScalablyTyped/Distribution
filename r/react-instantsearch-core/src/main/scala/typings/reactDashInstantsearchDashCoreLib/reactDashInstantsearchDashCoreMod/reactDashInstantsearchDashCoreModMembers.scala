package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", JSImport.Namespace)
@js.native
object reactDashInstantsearchDashCoreModMembers extends js.Object {
  val HIGHLIGHT_TAGS: reactDashInstantsearchDashCoreLib.Anon_HighlightPostTag = js.native
  val version: java.lang.String = js.native
  def connectAutoComplete(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectBreadcrumb(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectConfigure(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectCurrentRefinements(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectGeoSearch(stateless: reactLib.reactMod.ReactNs.StatelessComponent[GeoSearchProvided[_]]): reactLib.reactMod.ReactNs.ComponentClass[GeoSearchExposed, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectGeoSearch[TProps /* <: stdLib.Partial[GeoSearchProvided[THit]] */, THit](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): ConnectedComponentClass[TProps, GeoSearchProvided[THit], GeoSearchExposed] = js.native
  def connectHierarchicalMenu(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectHighlight(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectHits[TProps /* <: reactDashInstantsearchDashCoreLib.Anon_Hits[THit] */, THit](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): ConnectedComponentClass[TProps, reactDashInstantsearchDashCoreLib.Anon_HitsArray[THit], js.Object] = js.native
  def connectHitsPerPage(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectInfiniteHits(Composed: reactLib.reactMod.ReactNs.ComponentType[InfiniteHitsProvided[_]]): reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState] = js.native
  @JSName("connectInfiniteHits")
  def connectInfiniteHits_TPropsPartialTHitConnectedComponentClass[TProps /* <: stdLib.Partial[InfiniteHitsProvided[THit]] */, THit](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): ConnectedComponentClass[TProps, InfiniteHitsProvided[THit], js.Object] = js.native
  def connectMenu(stateless: reactLib.reactMod.ReactNs.StatelessComponent[MenuProvided]): reactLib.reactMod.ReactNs.ComponentClass[MenuExposed, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectMenu[TProps /* <: stdLib.Partial[MenuProvided] */](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): ConnectedComponentClass[TProps, MenuProvided, MenuExposed] = js.native
  def connectNumericMenu(stateless: reactLib.reactMod.ReactNs.StatelessComponent[NumericMenuProvided]): reactLib.reactMod.ReactNs.ComponentClass[NumericMenuExposed, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectNumericMenu[TProps /* <: stdLib.Partial[NumericMenuProvided] */](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): ConnectedComponentClass[TProps, NumericMenuProvided, NumericMenuExposed] = js.native
  def connectPagination(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectPoweredBy(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectRange(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectRefinementList(stateless: reactLib.reactMod.ReactNs.StatelessComponent[RefinementListProvided]): reactLib.reactMod.ReactNs.ComponentClass[RefinementListExposed, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectRefinementList[TProps /* <: stdLib.Partial[RefinementListProvided] */](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): ConnectedComponentClass[TProps, RefinementListProvided, RefinementListExposed] = js.native
  def connectScrollTo(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectSearchBox(stateless: reactLib.reactMod.ReactNs.StatelessComponent[SearchBoxProvided]): reactLib.reactMod.ReactNs.ComponentClass[SearchBoxExposed, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectSearchBox[TProps /* <: stdLib.Partial[SearchBoxProvided] */](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): ConnectedComponentClass[TProps, SearchBoxProvided, SearchBoxExposed] = js.native
  def connectSortBy(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectStateResults(stateless: reactLib.reactMod.ReactNs.StatelessComponent[StateResultsProvided[BasicDoc]]): reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectStateResults[TProps /* <: stdLib.Partial[StateResultsProvided[TDoc]] */, TDoc](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): ConnectedComponentClass[TProps, StateResultsProvided[TDoc], js.Object] = js.native
  def connectStats(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectToggleRefinement(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def createConnector(connectorDesc: ConnectorDescription): js.Function1[
    /* Composed */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.native
  def createIndex(defaultRoot: js.Object): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def createInstantSearch(
    defaultAlgoliaClient: js.Function3[
      /* appId */ java.lang.String, 
      /* apiKey */ java.lang.String, 
      /* options */ reactDashInstantsearchDashCoreLib.Anon_UseRequestCache, 
      js.Object
    ],
    root: js.Object
  ): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def translatable(defaultTranslations: js.Any): js.Function1[
    /* Composed */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.native
}

