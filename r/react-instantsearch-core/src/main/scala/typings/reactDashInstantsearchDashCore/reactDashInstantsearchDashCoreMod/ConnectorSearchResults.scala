package typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorSearchResults[TDoc] extends js.Object {
  var error: js.Any
  var isSearchStalled: Boolean
  var results: AllSearchResults[TDoc]
  var searching: Boolean
  var searchingForFacetValues: Boolean
}

object ConnectorSearchResults {
  @scala.inline
  def apply[TDoc](
    error: js.Any,
    isSearchStalled: Boolean,
    results: AllSearchResults[TDoc],
    searching: Boolean,
    searchingForFacetValues: Boolean
  ): ConnectorSearchResults[TDoc] = {
    val __obj = js.Dynamic.literal(error = error, isSearchStalled = isSearchStalled, results = results, searching = searching, searchingForFacetValues = searchingForFacetValues)
  
    __obj.asInstanceOf[ConnectorSearchResults[TDoc]]
  }
}

