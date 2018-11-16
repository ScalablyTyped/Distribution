package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * SearchCombinationOptions...
     */

trait ISearchCombinationOptions extends js.Object {
  /**
           * For SearchSuggest method, this array is empty.
           * For SearchResults method, this array is empty,
           * or contains qNum and/or qElemNum.
           * It allows the user to request details in the outputted SearchGroupItemMatch.
           * For more information, see SearchGroupItemMatch
           */
  var qAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Encoding used to compute qRanges of type SearchCharRange.
           * Possible values: Utf8 (default), Utf16
           */
  var qCharEncoding: qlikDashEngineapiLib.qlikDashEngineapiLibStrings.Utf8 | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.Utf16
  /**
           * Search context.
           * The default value is LockedFieldsOnly.
           * One of:
           *
           * - Cleared: In this mode, the first step is to clear any current selections in the app.
           *   The second step is to search for one or more terms in the values of the app.
           *
           * - LockedFieldsOnly: In this mode, the search applies only to the values associated with
           *   the selections made in locked fields, ignoring selections in any unlocked field. If no locked fields,
           *   the behavior is identical to the Cleared context. You cannot make any new selections in a locked field.
           *   You can get search hits for the associated values of a locked field but you cannot get the search hits
           *   for the non associative values.
           *
           * - CurrentSelections: In this mode, the current selections are kept (if any). Search for one or more terms
           *   in the values of the app. New selections are made on top of the current selections. If no selections were
           *   made before the search, this mode is identical to the Cleared context.
           */
  var qContext: ContextType
  /**
           * List of the search fields.
           * If empty, the search is performed in all fields of the app.
           */
  var qSearchFields: js.Array[java.lang.String]
}

