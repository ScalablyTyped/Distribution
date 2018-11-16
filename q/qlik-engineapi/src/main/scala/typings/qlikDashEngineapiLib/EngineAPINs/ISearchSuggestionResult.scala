package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * SearchSuggestionResult...
     */

trait ISearchSuggestionResult extends js.Object {
  /**
           * List of field names that contain search hits.
           */
  var qFieldNames: js.Array[java.lang.String]
  /**
           * List of suggestions.
           */
  var qSuggestions: js.Array[ISearchSuggestItem]
}

