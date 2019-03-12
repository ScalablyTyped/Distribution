package typings
package reactDashInstantsearchDashDomLib.reactDashInstantsearchDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val HIGHLIGHT_TAGS: reactDashInstantsearchDashCoreLib.Anon_HighlightPostTag = js.native
  def connectAutoComplete[TDoc](
    stateless: reactLib.reactMod.ReactNs.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.AutocompleteProvided[TDoc]
    ]
  ): reactLib.reactMod.ReactNs.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.AutocompleteExposed, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  def connectAutoComplete[Props /* <: reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.AutocompleteProvided[TDoc] */, TDoc](Composed: reactLib.reactMod.ReactNs.ComponentType[Props]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    Props, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.AutocompleteProvided[TDoc], 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.AutocompleteExposed
  ] = js.native
  def connectBreadcrumb(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectConfigure(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectCurrentRefinements(
    stateless: reactLib.reactMod.ReactNs.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.CurrentRefinementsProvided
    ]
  ): reactLib.reactMod.ReactNs.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.CurrentRefinementsExposed, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  def connectCurrentRefinements[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.CurrentRefinementsProvided
  ] */](Composed: reactLib.reactMod.ReactNs.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.CurrentRefinementsProvided, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.CurrentRefinementsExposed
  ] = js.native
  def connectGeoSearch(
    stateless: reactLib.reactMod.ReactNs.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.GeoSearchProvided[_]
    ]
  ): reactLib.reactMod.ReactNs.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.GeoSearchExposed, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  def connectGeoSearch[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.GeoSearchProvided[THit]
  ] */, THit](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.GeoSearchProvided[THit], 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.GeoSearchExposed
  ] = js.native
  def connectHierarchicalMenu(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectHighlight[TDoc](
    stateless: reactLib.reactMod.ReactNs.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HighlightProps[TDoc]
    ]
  ): reactLib.reactMod.ReactNs.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HighlightPassedThru[TDoc], 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  def connectHighlight[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HighlightProps[TDoc]
  ] */, TDoc](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HighlightProvided[TDoc], 
    js.Object
  ] = js.native
  def connectHits[THit](
    stateless: reactLib.reactMod.ReactNs.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HitsProvided[THit]
    ]
  ): reactLib.reactMod.ReactNs.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HighlightPassedThru[_], 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  def connectHits[TProps /* <: reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HitsProvided[THit] */, THit](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HitsProvided[THit], 
    js.Object
  ] = js.native
  def connectHitsPerPage(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectInfiniteHits(
    Composed: reactLib.reactMod.ReactNs.ComponentType[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.InfiniteHitsProvided[_]
    ]
  ): reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState] = js.native
  @JSName("connectInfiniteHits")
  def connectInfiniteHits_TPropsPartialTHitConnectedComponentClass[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.InfiniteHitsProvided[THit]
  ] */, THit](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.InfiniteHitsProvided[THit], 
    js.Object
  ] = js.native
  def connectMenu(
    stateless: reactLib.reactMod.ReactNs.StatelessComponent[reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.MenuProvided]
  ): reactLib.reactMod.ReactNs.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.MenuExposed, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  def connectMenu[TProps /* <: stdLib.Partial[reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.MenuProvided] */](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.MenuProvided, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.MenuExposed
  ] = js.native
  def connectNumericMenu(
    stateless: reactLib.reactMod.ReactNs.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.NumericMenuProvided
    ]
  ): reactLib.reactMod.ReactNs.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.NumericMenuExposed, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  def connectNumericMenu[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.NumericMenuProvided
  ] */](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.NumericMenuProvided, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.NumericMenuExposed
  ] = js.native
  def connectPagination(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectPoweredBy(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectRange(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectRefinementList(
    stateless: reactLib.reactMod.ReactNs.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.RefinementListProvided
    ]
  ): reactLib.reactMod.ReactNs.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.RefinementListExposed, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  def connectRefinementList[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.RefinementListProvided
  ] */](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.RefinementListProvided, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.RefinementListExposed
  ] = js.native
  def connectScrollTo(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectSearchBox(
    stateless: reactLib.reactMod.ReactNs.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.SearchBoxProvided
    ]
  ): reactLib.reactMod.ReactNs.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.SearchBoxExposed, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  def connectSearchBox[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.SearchBoxProvided
  ] */](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.SearchBoxProvided, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.SearchBoxExposed
  ] = js.native
  def connectSortBy(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectStateResults(
    stateless: reactLib.reactMod.ReactNs.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.StateResultsProvided[reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.BasicDoc]
    ]
  ): reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectStateResults[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.StateResultsProvided[_]
  ] */](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.StateResultsProvided[reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.BasicDoc], 
    js.Object
  ] = js.native
  def connectStats(
    stateless: reactLib.reactMod.ReactNs.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.StatsProvided
    ]
  ): reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def connectStats[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.StatsProvided
  ] */](ctor: reactLib.reactMod.ReactNs.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.StatsProvided, 
    js.Object
  ] = js.native
  def connectToggleRefinement(Composed: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def createConnector[TProvided, TExposed](
    connectorDesc: reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectorDescription[TProvided, TExposed]
  ): (js.Function1[
    /* stateless */ reactLib.reactMod.ReactNs.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectorProvided[TProvided]
    ], 
    reactLib.reactMod.ReactNs.ComponentClass[TExposed, reactLib.reactMod.ReactNs.ComponentState]
  ]) with (js.Function1[
    /* Composed */ reactLib.reactMod.ReactNs.ComponentType[
      stdLib.Partial[
        reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectorProvided[TProvided]
      ]
    ], 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
      stdLib.Partial[
        reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectorProvided[TProvided]
      ], 
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectorProvided[TProvided], 
      TExposed
    ]
  ]) = js.native
  def translatable(
    defaultTranslations: org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Function1[/* repeated */ js.Any, java.lang.String])]
  ): js.Function1[
    /* ctor */ reactLib.reactMod.ReactNs.ComponentType[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.TranslatableProvided
    ], 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.TranslatableProvided, 
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.TranslatableProvided, 
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.TranslatableExposed
    ]
  ] = js.native
}

