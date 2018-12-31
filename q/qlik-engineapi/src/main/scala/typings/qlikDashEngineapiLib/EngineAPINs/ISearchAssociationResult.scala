package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchAssociationResult...
  */
trait ISearchAssociationResult extends js.Object {
  /**
    * Information about the fields containing search hits.
    */
  var qFieldDictionaries: js.Array[ISearchFieldDictionary]
  /**
    * List of the fields that contains search associations.
    */
  var qFieldNames: js.Array[java.lang.String]
  /**
    * List of the search terms.
    */
  var qSearchTerms: js.Array[java.lang.String]
  /**
    * List of search results.
    * The maximum number of search results in this list is set by qPage/qCount.
    */
  var qSearchTermsMatched: js.Array[ISearchMatchCombinations]
  /**
    * Total number of search results.
    * This number is not limited by qPage/qCount.
    */
  var qTotalSearchResults: scala.Double
}

