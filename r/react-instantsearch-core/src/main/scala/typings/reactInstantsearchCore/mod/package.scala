package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.reactInstantsearchCore.anon.CreateURL
import typings.reactInstantsearchCore.anon.OmitConnectHitInsightsPro
import typings.reactInstantsearchCore.anon.PartialCurrentRefinements
import typings.reactInstantsearchCore.anon.PartialDynamicWidgetsProv
import typings.reactInstantsearchCore.anon.PartialInsightsClientPayl
import typings.reactInstantsearchCore.anon.PartialMenuProvided
import typings.reactInstantsearchCore.anon.PartialNumericMenuProvide
import typings.reactInstantsearchCore.anon.PartialRefinementListProv
import typings.reactInstantsearchCore.anon.PartialSearchBoxProvided
import typings.reactInstantsearchCore.anon.PartialStateResultsProvid
import typings.reactInstantsearchCore.anon.PartialStatsProvided
import typings.reactInstantsearchCore.mod.^
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def EXPERIMENTALConnectConfigureRelatedItems(Composed: ComponentType[Any]): ComponentClass[Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("EXPERIMENTAL_connectConfigureRelatedItems")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Any, ComponentState]]

inline def connectAutoComplete[TDoc](
  // eslint-disable-next-line no-unnecessary-generics
stateless: FunctionComponent[AutocompleteProvided[TDoc]]
): ComponentClass[AutocompleteExposed, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectAutoComplete")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[AutocompleteExposed, ComponentState]]
inline def connectAutoComplete[Props /* <: AutocompleteProvided[TDoc] */, TDoc](Composed: ComponentType[Props]): ConnectedComponentClass[Props, AutocompleteProvided[TDoc], AutocompleteExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectAutoComplete")(Composed.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[Props, AutocompleteProvided[TDoc], AutocompleteExposed]]

inline def connectBreadcrumb(Composed: ComponentType[Any]): ComponentClass[Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectBreadcrumb")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Any, ComponentState]]

inline def connectConfigure(Composed: ComponentType[Any]): ComponentClass[Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectConfigure")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Any, ComponentState]]

inline def connectCurrentRefinements(stateless: FunctionComponent[CurrentRefinementsProvided]): ComponentClass[CurrentRefinementsExposed, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectCurrentRefinements")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[CurrentRefinementsExposed, ComponentState]]
inline def connectCurrentRefinements[TProps /* <: PartialCurrentRefinements */](Composed: ComponentType[TProps]): ConnectedComponentClass[TProps, CurrentRefinementsProvided, CurrentRefinementsExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectCurrentRefinements")(Composed.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, CurrentRefinementsProvided, CurrentRefinementsExposed]]

inline def connectDynamicWidgets(stateless: FunctionComponent[DynamicWidgetsProvided]): ComponentClass[DynamicWidgetsExposed, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectDynamicWidgets")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[DynamicWidgetsExposed, ComponentState]]
inline def connectDynamicWidgets[TProps /* <: PartialDynamicWidgetsProv */](Composed: ComponentType[TProps]): ConnectedComponentClass[TProps, DynamicWidgetsProvided, DynamicWidgetsExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectDynamicWidgets")(Composed.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, DynamicWidgetsProvided, DynamicWidgetsExposed]]

inline def connectGeoSearch(stateless: FunctionComponent[GeoSearchProvided[Any]]): ComponentClass[GeoSearchExposed, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectGeoSearch")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[GeoSearchExposed, ComponentState]]
inline def connectGeoSearch[TProps /* <: Partial[GeoSearchProvided[THit]] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, GeoSearchProvided[THit], GeoSearchExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectGeoSearch")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, GeoSearchProvided[THit], GeoSearchExposed]]

inline def connectHierarchicalMenu(Composed: ComponentType[Any]): ComponentClass[Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHierarchicalMenu")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Any, ComponentState]]

inline def connectHighlight[TDoc](stateless: FunctionComponent[HighlightProps[TDoc]]): ComponentClass[HighlightPassedThru[TDoc], ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHighlight")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[HighlightPassedThru[TDoc], ComponentState]]
inline def connectHighlight[TProps /* <: Partial[HighlightProps[TDoc]] */, TDoc](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, HighlightProvided[TDoc], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHighlight")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, HighlightProvided[TDoc], js.Object]]

inline def connectHitInsights(insightsClient: InsightsClient): js.Function1[/* hitComponent */ ComponentType[Any], ComponentType[OmitConnectHitInsightsPro]] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHitInsights")(insightsClient.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* hitComponent */ ComponentType[Any], ComponentType[OmitConnectHitInsightsPro]]]

inline def connectHits[THit](
  // eslint-disable-next-line no-unnecessary-generics
stateless: FunctionComponent[HitsProvided[THit]]
): ComponentClass[js.Object, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHits")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Object, ComponentState]]
inline def connectHits[TProps /* <: HitsProvided[THit] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, HitsProvided[THit], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHits")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, HitsProvided[THit], js.Object]]

inline def connectHitsPerPage(Composed: ComponentType[Any]): ComponentClass[Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHitsPerPage")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Any, ComponentState]]

inline def connectInfiniteHits(Composed: ComponentType[InfiniteHitsProvided[Any]]): ComponentClass[js.Object, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectInfiniteHits")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Object, ComponentState]]

inline def connectInfiniteHits_TPropsTHit_ConnectedComponentClass[TProps /* <: Partial[InfiniteHitsProvided[THit]] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, InfiniteHitsProvided[THit], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectInfiniteHits")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, InfiniteHitsProvided[THit], js.Object]]

inline def connectMenu(stateless: FunctionComponent[MenuProvided]): ComponentClass[MenuExposed, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectMenu")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[MenuExposed, ComponentState]]
inline def connectMenu[TProps /* <: PartialMenuProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, MenuProvided, MenuExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectMenu")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, MenuProvided, MenuExposed]]

inline def connectNumericMenu(stateless: FunctionComponent[NumericMenuProvided]): ComponentClass[NumericMenuExposed, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectNumericMenu")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[NumericMenuExposed, ComponentState]]
inline def connectNumericMenu[TProps /* <: PartialNumericMenuProvide */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, NumericMenuProvided, NumericMenuExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectNumericMenu")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, NumericMenuProvided, NumericMenuExposed]]

inline def connectPagination(Composed: ComponentType[Any]): ComponentClass[Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectPagination")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Any, ComponentState]]

inline def connectPoweredBy(Composed: ComponentType[Any]): ComponentClass[Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectPoweredBy")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Any, ComponentState]]

inline def connectQueryRules(Composed: ComponentType[Any]): ComponentClass[Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectQueryRules")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Any, ComponentState]]

inline def connectRange(Composed: ComponentType[Any]): ComponentClass[Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectRange")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Any, ComponentState]]

inline def connectRefinementList(stateless: FunctionComponent[RefinementListProvided]): ComponentClass[RefinementListExposed, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectRefinementList")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[RefinementListExposed, ComponentState]]
inline def connectRefinementList[TProps /* <: PartialRefinementListProv */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, RefinementListProvided, RefinementListExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectRefinementList")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, RefinementListProvided, RefinementListExposed]]

inline def connectRelevantSort(Composed: ComponentType[Any]): ComponentClass[Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectRelevantSort")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Any, ComponentState]]

inline def connectScrollTo(Composed: ComponentType[Any]): ComponentClass[Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectScrollTo")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Any, ComponentState]]

inline def connectSearchBox(stateless: FunctionComponent[SearchBoxProvided]): ComponentClass[SearchBoxExposed, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectSearchBox")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[SearchBoxExposed, ComponentState]]
inline def connectSearchBox[TProps /* <: PartialSearchBoxProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, SearchBoxProvided, SearchBoxExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectSearchBox")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, SearchBoxProvided, SearchBoxExposed]]

inline def connectSortBy(Composed: ComponentType[Any]): ComponentClass[Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectSortBy")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Any, ComponentState]]

inline def connectStateResults(stateless: FunctionComponent[StateResultsProvided[BasicDoc]]): ComponentClass[js.Object, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectStateResults")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Object, ComponentState]]
inline def connectStateResults[TProps /* <: PartialStateResultsProvid */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StateResultsProvided[BasicDoc], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectStateResults")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, StateResultsProvided[BasicDoc], js.Object]]

inline def connectStats(stateless: FunctionComponent[StatsProvided]): ComponentClass[js.Object, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectStats")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Object, ComponentState]]
inline def connectStats[TProps /* <: PartialStatsProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StatsProvided, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectStats")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, StatsProvided, js.Object]]

inline def connectToggleRefinement(Composed: ComponentType[Any]): ComponentClass[Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectToggleRefinement")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Any, ComponentState]]

inline def connectVoiceSearch(Composed: ComponentType[Any]): ComponentClass[Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectVoiceSearch")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Any, ComponentState]]

inline def createConnector[TProvided, TExposed](connectorDesc: ConnectorDescription[TProvided, TExposed]): (js.Function2[
/* stateless */ FunctionComponent[ConnectorProvided[TProvided]], 
/* additionalWidgetProperties */ js.UndefOr[AdditionalWidgetProperties], 
ComponentClass[TExposed, ComponentState]]) & (js.Function2[
/* Composed */ ComponentType[Partial[ConnectorProvided[TProvided]]], 
/* additionalWidgetProperties */ js.UndefOr[AdditionalWidgetProperties], 
ConnectedComponentClass[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided], TExposed]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnector")(connectorDesc.asInstanceOf[js.Any]).asInstanceOf[(js.Function2[
/* stateless */ FunctionComponent[ConnectorProvided[TProvided]], 
/* additionalWidgetProperties */ js.UndefOr[AdditionalWidgetProperties], 
ComponentClass[TExposed, ComponentState]]) & (js.Function2[
/* Composed */ ComponentType[Partial[ConnectorProvided[TProvided]]], 
/* additionalWidgetProperties */ js.UndefOr[AdditionalWidgetProperties], 
ConnectedComponentClass[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided], TExposed]])]

inline def translatable(defaultTranslations: StringDictionary[String | (js.Function1[/* repeated */ Any, String])]): js.Function1[
/* ctor */ ComponentType[TranslatableProvided], 
ConnectedComponentClass[TranslatableProvided, TranslatableProvided, TranslatableExposed]] = ^.asInstanceOf[js.Dynamic].applyDynamic("translatable")(defaultTranslations.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* ctor */ ComponentType[TranslatableProvided], 
ConnectedComponentClass[TranslatableProvided, TranslatableProvided, TranslatableExposed]]]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type BasicDoc = StringDictionary[String]

type ConnectedComponentClass[TProps, TProvidedProps, TExposedProps] = ComponentClass[(Omit[TProps, TProvidedProps]) & TExposedProps, ComponentState]

type ConnectorProvided[TProvided] = CreateURL & TProvided

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  TItem extends string ? std.Array<react-instantsearch-core.react-instantsearch-core.HighlightResultPrimitive> : std.Array<react-instantsearch-core.react-instantsearch-core.HighlightResult<TItem>>
  }}}
  */
type HighlightResultArray[TItem] = js.Array[HighlightResultPrimitive]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  TField extends std.Array<infer TItem> ? react-instantsearch-core.react-instantsearch-core.HighlightResultArray<TItem> : TField extends string ? react-instantsearch-core.react-instantsearch-core.HighlightResultPrimitive : react-instantsearch-core.react-instantsearch-core.HighlightResult<TField>
  }}}
  */
type HighlightResultField[TField] = js.Array[HighlightResultPrimitive]

type Hit[TDoc] = TDoc & typings.reactInstantsearchCore.anon.HighlightResult[TDoc]

type InsightsClient = js.Function2[/* method */ InsightsClientMethod, /* payload */ InsightsClientPayload, Unit]

type Omit[T1, T2] = Pick[T1, Exclude[/* keyof T1 */ String, /* keyof T2 */ String]]

type RefinementValue = js.Function1[/* searchState */ SearchState, SearchState]

type WrappedInsightsClient = js.Function2[/* method */ InsightsClientMethod, /* payload */ PartialInsightsClientPayl, Unit]
