package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorSearchResults[TDoc] extends js.Object {
  var error: js.Any
  var isSearchStalled: scala.Boolean
  var results: AllSearchResults[TDoc]
  var searching: scala.Boolean
  var searchingForFacetValues: scala.Boolean
}

object ConnectorSearchResults {
  @scala.inline
  def apply[TDoc](
    error: js.Any,
    isSearchStalled: scala.Boolean,
    results: AllSearchResults[TDoc],
    searching: scala.Boolean,
    searchingForFacetValues: scala.Boolean
  ): ConnectorSearchResults[TDoc] = {
    val __obj = js.Dynamic.literal(error = error, isSearchStalled = isSearchStalled, results = results, searching = searching, searchingForFacetValues = searchingForFacetValues)
  
    __obj.asInstanceOf[ConnectorSearchResults[TDoc]]
  }
}

