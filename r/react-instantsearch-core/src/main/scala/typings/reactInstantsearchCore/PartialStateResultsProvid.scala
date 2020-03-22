package typings.reactInstantsearchCore

import typings.reactInstantsearchCore.mod.AlgoliaError
import typings.reactInstantsearchCore.mod.AllSearchResults
import typings.reactInstantsearchCore.mod.SearchResults
import typings.reactInstantsearchCore.mod.SearchState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.StateResultsProvided<any>> */
trait PartialStateResultsProvid extends js.Object {
  var allSearchResults: js.UndefOr[AllSearchResults[_]] = js.undefined
  var error: js.UndefOr[AlgoliaError] = js.undefined
  var isSearchStalled: js.UndefOr[js.Any] = js.undefined
  var searchResults: js.UndefOr[SearchResults[_]] = js.undefined
  var searchState: js.UndefOr[SearchState] = js.undefined
  var searching: js.UndefOr[Boolean] = js.undefined
  var searchingForFacetValues: js.UndefOr[js.Any] = js.undefined
}

object PartialStateResultsProvid {
  @scala.inline
  def apply(
    allSearchResults: AllSearchResults[_] = null,
    error: AlgoliaError = null,
    isSearchStalled: js.Any = null,
    searchResults: SearchResults[_] = null,
    searchState: SearchState = null,
    searching: js.UndefOr[Boolean] = js.undefined,
    searchingForFacetValues: js.Any = null
  ): PartialStateResultsProvid = {
    val __obj = js.Dynamic.literal()
    if (allSearchResults != null) __obj.updateDynamic("allSearchResults")(allSearchResults.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (isSearchStalled != null) __obj.updateDynamic("isSearchStalled")(isSearchStalled.asInstanceOf[js.Any])
    if (searchResults != null) __obj.updateDynamic("searchResults")(searchResults.asInstanceOf[js.Any])
    if (searchState != null) __obj.updateDynamic("searchState")(searchState.asInstanceOf[js.Any])
    if (!js.isUndefined(searching)) __obj.updateDynamic("searching")(searching.asInstanceOf[js.Any])
    if (searchingForFacetValues != null) __obj.updateDynamic("searchingForFacetValues")(searchingForFacetValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStateResultsProvid]
  }
}

