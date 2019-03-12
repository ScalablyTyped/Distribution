package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorDescription[TProvided, TExposed] extends js.Object {
  /**
    * This method is called when a widget is about to unmount in order to clean the searchState.
    * It takes in the current props of the higher-order component and the searchState of all widgets and expect a new searchState in return.
    * props are the props that were provided to the higher-order component.
    * searchState holds the searchState of all widgets, with the shape {[widgetId]: widgetState}. Stateful widgets describe the format of their searchState
    * in their respective documentation entry.
    */
  var cleanUp: js.UndefOr[
    js.ThisFunction2[
      /* this */ reactLib.reactMod.Component[TExposed, js.Object, _], 
      /* props */ TExposed, 
      /* searchState */ SearchState, 
      SearchState
    ]
  ] = js.undefined
  var defaultProps: js.UndefOr[js.Any] = js.undefined
  var displayName: java.lang.String
  /**
    * This method allows the widget to register a custom metadata object for any props and state combination.
    * If your widget is stateful, the corresponding URL key should be declared on the metadata object as the id property, so that the InstantSearch
    * component can determine which URL keys it controls and which are foreign and should be left intact.
    * The metadata object also allows you to declare any data that you would like to pass down to all other widgets. The list of metadata objects of
    * all components is available as the fourth argument to the getProvidedProps method.
    * The CurrentRefinements widget leverages this mechanism in order to allow any widget to declare the filters it has applied. If you want to add
    * your own filter, declare a filters property on your widget’s metadata
    */
  var getMetadata: js.UndefOr[
    js.ThisFunction3[
      /* this */ reactLib.reactMod.Component[TExposed, js.Object, _], 
      /* props */ TExposed, 
      /* searchState */ SearchState, 
      /* repeated */ js.Any, 
      _
    ]
  ] = js.undefined
  /**
    * This method applies the current props and state to the provided SearchParameters, and returns a new SearchParameters. The SearchParameters
    * type is described in the Helper’s documentation.
    * Every time the props or state of a widget change, all the getSearchParameters methods of all the registered widgets are called in a chain
    * to produce a new SearchParameters. Then, if the output SearchParameters differs from the previous one, a new search is triggered.
    * As such, the getSearchParameters method allows you to describe how the state and props of a widget should affect the search parameters.
    */
  var getSearchParameters: js.UndefOr[
    js.ThisFunction3[
      /* this */ reactLib.reactMod.Component[TExposed, js.Object, _], 
      /* searchParameters */ algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParameters, 
      /* props */ TExposed, 
      /* searchState */ SearchState, 
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParameters
    ]
  ] = js.undefined
  var propTypes: js.UndefOr[js.Any] = js.undefined
  /**
    * This method defines exactly how the refine prop of widgets affects the search state.
    * It takes in the current props of the higher-order component, the search state of all widgets, as well as all arguments passed
    * to the refine and createURL props of stateful widgets, and returns a new state.
    */
  var refine: js.UndefOr[
    js.ThisFunction3[
      /* this */ reactLib.reactMod.Component[TExposed, js.Object, _], 
      /* props */ TExposed, 
      /* searchState */ SearchState, 
      /* repeated */ js.Any, 
      SearchState
    ]
  ] = js.undefined
  /**
    * This method needs to be implemented if you want to have the ability to perform a search for facet values inside your widget.
    * It takes in the current props of the higher-order component, the search state of all widgets, as well as all arguments passed to the searchForFacetValues
    * props of stateful widgets, and returns an object of the shape: {facetName: string, query: string, maxFacetHits?: number}. The default value for the
    * maxFacetHits is the one set by the API which is 10.
    */
  var searchForFacetValues: js.UndefOr[
    js.ThisFunction2[
      /* this */ reactLib.reactMod.Component[TExposed, js.Object, _], 
      /* searchState */ SearchState, 
      /* nextRefinement */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /**
    * This method should return the props to forward to the composed component.
    * props are the props that were provided to the higher-order component.
    * searchState holds the search state of all widgets. You can find the shape of all widgets search state in the corresponding guide.
    * searchResults holds the search results, search errors and search loading state, with the shape
    * {results: ?SearchResults, error: ?Error, searching: boolean, searchingForFacetValues: boolean}. The SearchResults type is described in the Helper’s documentation.
    * meta is the list of metadata from all widgets whose connector defines a getMetadata method.
    * searchForFacetValuesResults holds the search for facet values results.
    */
  def getProvidedProps(
    `this`: reactLib.reactMod.Component[TExposed, js.Object, _],
    props: TExposed,
    searchState: SearchState,
    searchResults: ConnectorSearchResults[_],
    metadata: js.Any,
    resultsFacetValues: js.Any
  ): TProvided
}

object ConnectorDescription {
  @scala.inline
  def apply[TProvided, TExposed](
    displayName: java.lang.String,
    getProvidedProps: (reactLib.reactMod.Component[TExposed, js.Object, _], TExposed, SearchState, ConnectorSearchResults[_], js.Any, js.Any) => TProvided,
    cleanUp: js.ThisFunction2[
      /* this */ reactLib.reactMod.Component[TExposed, js.Object, _], 
      /* props */ TExposed, 
      /* searchState */ SearchState, 
      SearchState
    ] = null,
    defaultProps: js.Any = null,
    getMetadata: js.ThisFunction3[
      /* this */ reactLib.reactMod.Component[TExposed, js.Object, _], 
      /* props */ TExposed, 
      /* searchState */ SearchState, 
      /* repeated */ js.Any, 
      _
    ] = null,
    getSearchParameters: js.ThisFunction3[
      /* this */ reactLib.reactMod.Component[TExposed, js.Object, _], 
      /* searchParameters */ algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParameters, 
      /* props */ TExposed, 
      /* searchState */ SearchState, 
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParameters
    ] = null,
    propTypes: js.Any = null,
    refine: js.ThisFunction3[
      /* this */ reactLib.reactMod.Component[TExposed, js.Object, _], 
      /* props */ TExposed, 
      /* searchState */ SearchState, 
      /* repeated */ js.Any, 
      SearchState
    ] = null,
    searchForFacetValues: js.ThisFunction2[
      /* this */ reactLib.reactMod.Component[TExposed, js.Object, _], 
      /* searchState */ SearchState, 
      /* nextRefinement */ js.UndefOr[js.Any], 
      _
    ] = null
  ): ConnectorDescription[TProvided, TExposed] = {
    val __obj = js.Dynamic.literal(displayName = displayName, getProvidedProps = js.Any.fromFunction6(getProvidedProps))
    if (cleanUp != null) __obj.updateDynamic("cleanUp")(cleanUp)
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps)
    if (getMetadata != null) __obj.updateDynamic("getMetadata")(getMetadata)
    if (getSearchParameters != null) __obj.updateDynamic("getSearchParameters")(getSearchParameters)
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes)
    if (refine != null) __obj.updateDynamic("refine")(refine)
    if (searchForFacetValues != null) __obj.updateDynamic("searchForFacetValues")(searchForFacetValues)
    __obj.asInstanceOf[ConnectorDescription[TProvided, TExposed]]
  }
}

