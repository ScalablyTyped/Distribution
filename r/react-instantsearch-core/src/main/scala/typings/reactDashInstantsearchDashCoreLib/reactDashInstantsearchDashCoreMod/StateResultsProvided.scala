package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StateResultsProvided[TDoc] extends js.Object {
  /** In case of multiple indices you can retrieve all the results */
  var allSearchResults: org.scalablytyped.runtime.StringDictionary[SearchResults[TDoc]]
  /** If the search failed, the error will be logged here. */
  var error: AlgoliaError
  /** Flag that indicates if React InstantSearch has detected that searches are stalled. */
  var isSearchStalled: js.Any
  /**
     * The search results.
     * In case of multiple indices: if used under <Index>, results will be those of the corresponding index
     * otherwise it’ll be those of the root index
     */
  var searchResults: SearchResults[TDoc]
  /** The search state of the instant search component.  */
  var searchState: SearchState
  /** If there is a search in progress. */
  var searching: scala.Boolean
  /** If there is a search in a list in progress. */
  var searchingForFacetValues: js.Any
}

