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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-instantsearch-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def connectAutoComplete[TDoc](stateless: FunctionComponent[AutocompleteProvided[TDoc]]): ComponentClass[AutocompleteExposed, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectAutoComplete")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[AutocompleteExposed, ComponentState]]
  @scala.inline
  def connectAutoComplete[Props /* <: AutocompleteProvided[TDoc] */, TDoc](Composed: ComponentType[Props]): ConnectedComponentClass[Props, AutocompleteProvided[TDoc], AutocompleteExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectAutoComplete")(Composed.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[Props, AutocompleteProvided[TDoc], AutocompleteExposed]]
  
  @scala.inline
  def connectBreadcrumb(Composed: ComponentType[js.Any]): ComponentClass[js.Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectBreadcrumb")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Any, ComponentState]]
  
  @scala.inline
  def connectConfigure(Composed: ComponentType[js.Any]): ComponentClass[js.Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectConfigure")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Any, ComponentState]]
  
  @scala.inline
  def connectCurrentRefinements(stateless: FunctionComponent[CurrentRefinementsProvided]): ComponentClass[CurrentRefinementsExposed, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectCurrentRefinements")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[CurrentRefinementsExposed, ComponentState]]
  @scala.inline
  def connectCurrentRefinements[TProps /* <: PartialCurrentRefinements */](Composed: ComponentType[TProps]): ConnectedComponentClass[TProps, CurrentRefinementsProvided, CurrentRefinementsExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectCurrentRefinements")(Composed.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, CurrentRefinementsProvided, CurrentRefinementsExposed]]
  
  @scala.inline
  def connectGeoSearch(stateless: FunctionComponent[GeoSearchProvided[js.Any]]): ComponentClass[GeoSearchExposed, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectGeoSearch")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[GeoSearchExposed, ComponentState]]
  @scala.inline
  def connectGeoSearch[TProps /* <: Partial[GeoSearchProvided[THit]] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, GeoSearchProvided[THit], GeoSearchExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectGeoSearch")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, GeoSearchProvided[THit], GeoSearchExposed]]
  
  @scala.inline
  def connectHierarchicalMenu(Composed: ComponentType[js.Any]): ComponentClass[js.Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHierarchicalMenu")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Any, ComponentState]]
  
  @scala.inline
  def connectHighlight[TDoc](stateless: FunctionComponent[HighlightProps[TDoc]]): ComponentClass[HighlightPassedThru[TDoc], ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHighlight")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[HighlightPassedThru[TDoc], ComponentState]]
  @scala.inline
  def connectHighlight[TProps /* <: Partial[HighlightProps[TDoc]] */, TDoc](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, HighlightProvided[TDoc], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHighlight")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, HighlightProvided[TDoc], js.Object]]
  
  @scala.inline
  def connectHits[THit](stateless: FunctionComponent[HitsProvided[THit]]): ComponentClass[js.Object, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHits")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Object, ComponentState]]
  @scala.inline
  def connectHits[TProps /* <: HitsProvided[THit] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, HitsProvided[THit], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHits")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, HitsProvided[THit], js.Object]]
  
  @scala.inline
  def connectHitsPerPage(Composed: ComponentType[js.Any]): ComponentClass[js.Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHitsPerPage")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Any, ComponentState]]
  
  @scala.inline
  def connectInfiniteHits(Composed: ComponentType[InfiniteHitsProvided[js.Any]]): ComponentClass[js.Object, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectInfiniteHits")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Object, ComponentState]]
  
  @scala.inline
  def connectInfiniteHits_TProps_PartialInfiniteHitsProvidedTHitTHit_ConnectedComponentClass[TProps /* <: Partial[InfiniteHitsProvided[THit]] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, InfiniteHitsProvided[THit], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectInfiniteHits")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, InfiniteHitsProvided[THit], js.Object]]
  
  @scala.inline
  def connectMenu(stateless: FunctionComponent[MenuProvided]): ComponentClass[MenuExposed, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectMenu")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[MenuExposed, ComponentState]]
  @scala.inline
  def connectMenu[TProps /* <: PartialMenuProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, MenuProvided, MenuExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectMenu")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, MenuProvided, MenuExposed]]
  
  @scala.inline
  def connectNumericMenu(stateless: FunctionComponent[NumericMenuProvided]): ComponentClass[NumericMenuExposed, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectNumericMenu")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[NumericMenuExposed, ComponentState]]
  @scala.inline
  def connectNumericMenu[TProps /* <: PartialNumericMenuProvide */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, NumericMenuProvided, NumericMenuExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectNumericMenu")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, NumericMenuProvided, NumericMenuExposed]]
  
  @scala.inline
  def connectPagination(Composed: ComponentType[js.Any]): ComponentClass[js.Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectPagination")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Any, ComponentState]]
  
  @scala.inline
  def connectPoweredBy(Composed: ComponentType[js.Any]): ComponentClass[js.Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectPoweredBy")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Any, ComponentState]]
  
  @scala.inline
  def connectRange(Composed: ComponentType[js.Any]): ComponentClass[js.Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectRange")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Any, ComponentState]]
  
  @scala.inline
  def connectRefinementList(stateless: FunctionComponent[RefinementListProvided]): ComponentClass[RefinementListExposed, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectRefinementList")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[RefinementListExposed, ComponentState]]
  @scala.inline
  def connectRefinementList[TProps /* <: PartialRefinementListProv */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, RefinementListProvided, RefinementListExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectRefinementList")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, RefinementListProvided, RefinementListExposed]]
  
  @scala.inline
  def connectScrollTo(Composed: ComponentType[js.Any]): ComponentClass[js.Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectScrollTo")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Any, ComponentState]]
  
  @scala.inline
  def connectSearchBox(stateless: FunctionComponent[SearchBoxProvided]): ComponentClass[SearchBoxExposed, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectSearchBox")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[SearchBoxExposed, ComponentState]]
  @scala.inline
  def connectSearchBox[TProps /* <: PartialSearchBoxProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, SearchBoxProvided, SearchBoxExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectSearchBox")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, SearchBoxProvided, SearchBoxExposed]]
  
  @scala.inline
  def connectSortBy(Composed: ComponentType[js.Any]): ComponentClass[js.Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectSortBy")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Any, ComponentState]]
  
  @scala.inline
  def connectStateResults(stateless: FunctionComponent[StateResultsProvided[BasicDoc]]): ComponentClass[js.Object, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectStateResults")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Object, ComponentState]]
  @scala.inline
  def connectStateResults[TProps /* <: PartialStateResultsProvid */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StateResultsProvided[BasicDoc], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectStateResults")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, StateResultsProvided[BasicDoc], js.Object]]
  
  @scala.inline
  def connectStats(stateless: FunctionComponent[StatsProvided]): ComponentClass[js.Object, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectStats")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Object, ComponentState]]
  @scala.inline
  def connectStats[TProps /* <: PartialStatsProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StatsProvided, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectStats")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, StatsProvided, js.Object]]
  
  @scala.inline
  def connectToggleRefinement(Composed: ComponentType[js.Any]): ComponentClass[js.Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectToggleRefinement")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Any, ComponentState]]
  
  @scala.inline
  def createConnector[TProvided, TExposed](connectorDesc: ConnectorDescription[TProvided, TExposed]): (js.Function1[
    /* stateless */ FunctionComponent[ConnectorProvided[TProvided]], 
    ComponentClass[TExposed, ComponentState]
  ]) & (js.Function1[
    /* Composed */ ComponentType[Partial[ConnectorProvided[TProvided]]], 
    ConnectedComponentClass[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided], TExposed]
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnector")(connectorDesc.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[
    /* stateless */ FunctionComponent[ConnectorProvided[TProvided]], 
    ComponentClass[TExposed, ComponentState]
  ]) & (js.Function1[
    /* Composed */ ComponentType[Partial[ConnectorProvided[TProvided]]], 
    ConnectedComponentClass[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided], TExposed]
  ])]
  
  @scala.inline
  def translatable(defaultTranslations: StringDictionary[String | (js.Function1[/* repeated */ js.Any, String])]): js.Function1[
    /* ctor */ ComponentType[TranslatableProvided], 
    ConnectedComponentClass[TranslatableProvided, TranslatableProvided, TranslatableExposed]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("translatable")(defaultTranslations.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ctor */ ComponentType[TranslatableProvided], 
    ConnectedComponentClass[TranslatableProvided, TranslatableProvided, TranslatableExposed]
  ]]
}
