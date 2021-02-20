package typings.reactInstantsearchNative

import org.scalablytyped.runtime.StringDictionary
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
import typings.reactInstantsearchCore.mod.ConnectorDescription
import typings.reactInstantsearchCore.mod.ConnectorProvided
import typings.reactInstantsearchCore.mod.CurrentRefinementsExposed
import typings.reactInstantsearchCore.mod.CurrentRefinementsProvided
import typings.reactInstantsearchCore.mod.GeoSearchExposed
import typings.reactInstantsearchCore.mod.GeoSearchProvided
import typings.reactInstantsearchCore.mod.HighlightPassedThru
import typings.reactInstantsearchCore.mod.HighlightProps
import typings.reactInstantsearchCore.mod.HighlightProvided
import typings.reactInstantsearchCore.mod.HitsProvided
import typings.reactInstantsearchCore.mod.InfiniteHitsProvided
import typings.reactInstantsearchCore.mod.InstantSearchProps
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
import typings.reactInstantsearchCore.mod.TranslatableExposed
import typings.reactInstantsearchCore.mod.TranslatableProvided
import typings.reactInstantsearchNative.anon.ReadonlyInstantSearchProp
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-instantsearch-native", "Configure")
  @js.native
  class Configure protected ()
    extends typings.reactInstantsearchCore.mod.Configure {
    def this(props: js.Any) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Any, context: js.Any) = this()
  }
  
  object HIGHLIGHT_TAGS {
    
    @JSImport("react-instantsearch-native", "HIGHLIGHT_TAGS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-instantsearch-native", "HIGHLIGHT_TAGS.highlightPostTag")
    @js.native
    def highlightPostTag: String = js.native
    @scala.inline
    def highlightPostTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlightPostTag")(x.asInstanceOf[js.Any])
    
    @JSImport("react-instantsearch-native", "HIGHLIGHT_TAGS.highlightPreTag")
    @js.native
    def highlightPreTag: String = js.native
    @scala.inline
    def highlightPreTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlightPreTag")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-instantsearch-native", "Index")
  @js.native
  class Index protected ()
    extends typings.reactInstantsearchCore.mod.Index {
    def this(props: js.Any) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Any, context: js.Any) = this()
  }
  
  @JSImport("react-instantsearch-native", "InstantSearch")
  @js.native
  class InstantSearch protected ()
    extends typings.reactInstantsearchCore.mod.InstantSearch {
    def this(props: InstantSearchProps) = this()
    def this(props: ReadonlyInstantSearchProp) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InstantSearchProps, context: js.Any) = this()
  }
  
  @JSImport("react-instantsearch-native", "connectAutoComplete")
  @js.native
  def connectAutoComplete[TDoc](stateless: FunctionComponent[AutocompleteProvided[TDoc]]): ComponentClass[AutocompleteExposed, ComponentState] = js.native
  @JSImport("react-instantsearch-native", "connectAutoComplete")
  @js.native
  def connectAutoComplete[Props /* <: AutocompleteProvided[TDoc] */, TDoc](Composed: ComponentType[Props]): ConnectedComponentClass[Props, AutocompleteProvided[TDoc], AutocompleteExposed] = js.native
  
  @JSImport("react-instantsearch-native", "connectBreadcrumb")
  @js.native
  def connectBreadcrumb(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch-native", "connectConfigure")
  @js.native
  def connectConfigure(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch-native", "connectCurrentRefinements")
  @js.native
  def connectCurrentRefinements(stateless: FunctionComponent[CurrentRefinementsProvided]): ComponentClass[CurrentRefinementsExposed, ComponentState] = js.native
  @JSImport("react-instantsearch-native", "connectCurrentRefinements")
  @js.native
  def connectCurrentRefinements[TProps /* <: PartialCurrentRefinements */](Composed: ComponentType[TProps]): ConnectedComponentClass[TProps, CurrentRefinementsProvided, CurrentRefinementsExposed] = js.native
  
  @JSImport("react-instantsearch-native", "connectGeoSearch")
  @js.native
  def connectGeoSearch(stateless: FunctionComponent[GeoSearchProvided[_]]): ComponentClass[GeoSearchExposed, ComponentState] = js.native
  @JSImport("react-instantsearch-native", "connectGeoSearch")
  @js.native
  def connectGeoSearch[TProps /* <: Partial[GeoSearchProvided[THit]] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, GeoSearchProvided[THit], GeoSearchExposed] = js.native
  
  @JSImport("react-instantsearch-native", "connectHierarchicalMenu")
  @js.native
  def connectHierarchicalMenu(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch-native", "connectHighlight")
  @js.native
  def connectHighlight[TDoc](stateless: FunctionComponent[HighlightProps[TDoc]]): ComponentClass[HighlightPassedThru[TDoc], ComponentState] = js.native
  @JSImport("react-instantsearch-native", "connectHighlight")
  @js.native
  def connectHighlight[TProps /* <: Partial[HighlightProps[TDoc]] */, TDoc](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, HighlightProvided[TDoc], js.Object] = js.native
  
  @JSImport("react-instantsearch-native", "connectHits")
  @js.native
  def connectHits[THit](stateless: FunctionComponent[HitsProvided[THit]]): ComponentClass[js.Object, ComponentState] = js.native
  @JSImport("react-instantsearch-native", "connectHits")
  @js.native
  def connectHits[TProps /* <: HitsProvided[THit] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, HitsProvided[THit], js.Object] = js.native
  
  @JSImport("react-instantsearch-native", "connectHitsPerPage")
  @js.native
  def connectHitsPerPage(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch-native", "connectInfiniteHits")
  @js.native
  def connectInfiniteHits(Composed: ComponentType[InfiniteHitsProvided[_]]): ComponentClass[js.Object, ComponentState] = js.native
  @JSImport("react-instantsearch-native", "connectInfiniteHits")
  @js.native
  def connectInfiniteHits_TProps_PartialInfiniteHitsProvidedTHitTHit_ConnectedComponentClass[TProps /* <: Partial[InfiniteHitsProvided[THit]] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, InfiniteHitsProvided[THit], js.Object] = js.native
  
  @JSImport("react-instantsearch-native", "connectMenu")
  @js.native
  def connectMenu(stateless: FunctionComponent[MenuProvided]): ComponentClass[MenuExposed, ComponentState] = js.native
  @JSImport("react-instantsearch-native", "connectMenu")
  @js.native
  def connectMenu[TProps /* <: PartialMenuProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, MenuProvided, MenuExposed] = js.native
  
  @JSImport("react-instantsearch-native", "connectNumericMenu")
  @js.native
  def connectNumericMenu(stateless: FunctionComponent[NumericMenuProvided]): ComponentClass[NumericMenuExposed, ComponentState] = js.native
  @JSImport("react-instantsearch-native", "connectNumericMenu")
  @js.native
  def connectNumericMenu[TProps /* <: PartialNumericMenuProvide */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, NumericMenuProvided, NumericMenuExposed] = js.native
  
  @JSImport("react-instantsearch-native", "connectPagination")
  @js.native
  def connectPagination(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch-native", "connectPoweredBy")
  @js.native
  def connectPoweredBy(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch-native", "connectRange")
  @js.native
  def connectRange(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch-native", "connectRefinementList")
  @js.native
  def connectRefinementList(stateless: FunctionComponent[RefinementListProvided]): ComponentClass[RefinementListExposed, ComponentState] = js.native
  @JSImport("react-instantsearch-native", "connectRefinementList")
  @js.native
  def connectRefinementList[TProps /* <: PartialRefinementListProv */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, RefinementListProvided, RefinementListExposed] = js.native
  
  @JSImport("react-instantsearch-native", "connectScrollTo")
  @js.native
  def connectScrollTo(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch-native", "connectSearchBox")
  @js.native
  def connectSearchBox(stateless: FunctionComponent[SearchBoxProvided]): ComponentClass[SearchBoxExposed, ComponentState] = js.native
  @JSImport("react-instantsearch-native", "connectSearchBox")
  @js.native
  def connectSearchBox[TProps /* <: PartialSearchBoxProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, SearchBoxProvided, SearchBoxExposed] = js.native
  
  @JSImport("react-instantsearch-native", "connectSortBy")
  @js.native
  def connectSortBy(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch-native", "connectStateResults")
  @js.native
  def connectStateResults(stateless: FunctionComponent[StateResultsProvided[BasicDoc]]): ComponentClass[js.Object, ComponentState] = js.native
  @JSImport("react-instantsearch-native", "connectStateResults")
  @js.native
  def connectStateResults[TProps /* <: PartialStateResultsProvid */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StateResultsProvided[BasicDoc], js.Object] = js.native
  
  @JSImport("react-instantsearch-native", "connectStats")
  @js.native
  def connectStats(stateless: FunctionComponent[StatsProvided]): ComponentClass[js.Object, ComponentState] = js.native
  @JSImport("react-instantsearch-native", "connectStats")
  @js.native
  def connectStats[TProps /* <: PartialStatsProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StatsProvided, js.Object] = js.native
  
  @JSImport("react-instantsearch-native", "connectToggleRefinement")
  @js.native
  def connectToggleRefinement(Composed: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("react-instantsearch-native", "createConnector")
  @js.native
  def createConnector[TProvided, TExposed](connectorDesc: ConnectorDescription[TProvided, TExposed]): (js.Function1[
    /* stateless */ FunctionComponent[ConnectorProvided[TProvided]], 
    ComponentClass[TExposed, ComponentState]
  ]) with (js.Function1[
    /* Composed */ ComponentType[Partial[ConnectorProvided[TProvided]]], 
    ConnectedComponentClass[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided], TExposed]
  ]) = js.native
  
  @JSImport("react-instantsearch-native", "translatable")
  @js.native
  def translatable(defaultTranslations: StringDictionary[String | (js.Function1[/* repeated */ js.Any, String])]): js.Function1[
    /* ctor */ ComponentType[TranslatableProvided], 
    ConnectedComponentClass[TranslatableProvided, TranslatableProvided, TranslatableExposed]
  ] = js.native
}
