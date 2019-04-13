package typings
package reactDashInstantsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch/connectors", JSImport.Namespace)
@js.native
object connectorsMod extends js.Object {
  def connectAutoComplete[TDoc](
    stateless: reactLib.reactMod.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.AutocompleteProvided[TDoc]
    ]
  ): reactLib.reactMod.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.AutocompleteExposed, 
    reactLib.reactMod.ComponentState
  ] = js.native
  def connectAutoComplete[Props /* <: reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.AutocompleteProvided[TDoc] */, TDoc](Composed: reactLib.reactMod.ComponentType[Props]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    Props, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.AutocompleteProvided[TDoc], 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.AutocompleteExposed
  ] = js.native
  def connectBreadcrumb(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectConfigure(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectCurrentRefinements(
    stateless: reactLib.reactMod.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.CurrentRefinementsProvided
    ]
  ): reactLib.reactMod.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.CurrentRefinementsExposed, 
    reactLib.reactMod.ComponentState
  ] = js.native
  def connectCurrentRefinements[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.CurrentRefinementsProvided
  ] */](Composed: reactLib.reactMod.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.CurrentRefinementsProvided, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.CurrentRefinementsExposed
  ] = js.native
  def connectGeoSearch(
    stateless: reactLib.reactMod.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.GeoSearchProvided[_]
    ]
  ): reactLib.reactMod.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.GeoSearchExposed, 
    reactLib.reactMod.ComponentState
  ] = js.native
  def connectGeoSearch[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.GeoSearchProvided[THit]
  ] */, THit](ctor: reactLib.reactMod.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.GeoSearchProvided[THit], 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.GeoSearchExposed
  ] = js.native
  def connectHierarchicalMenu(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectHighlight[TDoc](
    stateless: reactLib.reactMod.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HighlightProps[TDoc]
    ]
  ): reactLib.reactMod.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HighlightPassedThru[TDoc], 
    reactLib.reactMod.ComponentState
  ] = js.native
  def connectHighlight[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HighlightProps[TDoc]
  ] */, TDoc](ctor: reactLib.reactMod.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HighlightProvided[TDoc], 
    js.Object
  ] = js.native
  def connectHits[THit](
    stateless: reactLib.reactMod.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HitsProvided[THit]
    ]
  ): reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState] = js.native
  def connectHits[TProps /* <: reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HitsProvided[THit] */, THit](ctor: reactLib.reactMod.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HitsProvided[THit], 
    js.Object
  ] = js.native
  def connectHitsPerPage(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectInfiniteHits(
    Composed: reactLib.reactMod.ComponentType[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.InfiniteHitsProvided[_]
    ]
  ): reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState] = js.native
  @JSName("connectInfiniteHits")
  def connectInfiniteHits_TPropsPartialTHitConnectedComponentClass[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.InfiniteHitsProvided[THit]
  ] */, THit](ctor: reactLib.reactMod.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.InfiniteHitsProvided[THit], 
    js.Object
  ] = js.native
  def connectMenu(
    stateless: reactLib.reactMod.StatelessComponent[reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.MenuProvided]
  ): reactLib.reactMod.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.MenuExposed, 
    reactLib.reactMod.ComponentState
  ] = js.native
  def connectMenu[TProps /* <: stdLib.Partial[reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.MenuProvided] */](ctor: reactLib.reactMod.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.MenuProvided, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.MenuExposed
  ] = js.native
  def connectNumericMenu(
    stateless: reactLib.reactMod.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.NumericMenuProvided
    ]
  ): reactLib.reactMod.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.NumericMenuExposed, 
    reactLib.reactMod.ComponentState
  ] = js.native
  def connectNumericMenu[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.NumericMenuProvided
  ] */](ctor: reactLib.reactMod.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.NumericMenuProvided, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.NumericMenuExposed
  ] = js.native
  def connectPagination(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectPoweredBy(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectRange(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectRefinementList(
    stateless: reactLib.reactMod.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.RefinementListProvided
    ]
  ): reactLib.reactMod.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.RefinementListExposed, 
    reactLib.reactMod.ComponentState
  ] = js.native
  def connectRefinementList[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.RefinementListProvided
  ] */](ctor: reactLib.reactMod.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.RefinementListProvided, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.RefinementListExposed
  ] = js.native
  def connectScrollTo(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectSearchBox(
    stateless: reactLib.reactMod.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.SearchBoxProvided
    ]
  ): reactLib.reactMod.ComponentClass[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.SearchBoxExposed, 
    reactLib.reactMod.ComponentState
  ] = js.native
  def connectSearchBox[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.SearchBoxProvided
  ] */](ctor: reactLib.reactMod.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.SearchBoxProvided, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.SearchBoxExposed
  ] = js.native
  def connectSortBy(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def connectStateResults(
    stateless: reactLib.reactMod.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.StateResultsProvided[reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.BasicDoc]
    ]
  ): reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState] = js.native
  def connectStateResults[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.StateResultsProvided[_]
  ] */](ctor: reactLib.reactMod.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.StateResultsProvided[reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.BasicDoc], 
    js.Object
  ] = js.native
  def connectStats(
    stateless: reactLib.reactMod.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.StatsProvided
    ]
  ): reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState] = js.native
  def connectStats[TProps /* <: stdLib.Partial[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.StatsProvided
  ] */](ctor: reactLib.reactMod.ComponentType[TProps]): reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
    TProps, 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.StatsProvided, 
    js.Object
  ] = js.native
  def connectToggleRefinement(Composed: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
}

