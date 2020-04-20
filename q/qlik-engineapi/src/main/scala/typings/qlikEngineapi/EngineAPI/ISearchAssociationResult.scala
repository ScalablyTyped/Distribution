package typings.qlikEngineapi.EngineAPI

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
  var qFieldNames: js.Array[String]
  /**
    * List of the search terms.
    */
  var qSearchTerms: js.Array[String]
  /**
    * List of search results.
    * The maximum number of search results in this list is set by qPage/qCount.
    */
  var qSearchTermsMatched: js.Array[ISearchMatchCombinations]
  /**
    * Total number of search results.
    * This number is not limited by qPage/qCount.
    */
  var qTotalSearchResults: Double
}

object ISearchAssociationResult {
  @scala.inline
  def apply(
    qFieldDictionaries: js.Array[ISearchFieldDictionary],
    qFieldNames: js.Array[String],
    qSearchTerms: js.Array[String],
    qSearchTermsMatched: js.Array[ISearchMatchCombinations],
    qTotalSearchResults: Double
  ): ISearchAssociationResult = {
    val __obj = js.Dynamic.literal(qFieldDictionaries = qFieldDictionaries.asInstanceOf[js.Any], qFieldNames = qFieldNames.asInstanceOf[js.Any], qSearchTerms = qSearchTerms.asInstanceOf[js.Any], qSearchTermsMatched = qSearchTermsMatched.asInstanceOf[js.Any], qTotalSearchResults = qTotalSearchResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchAssociationResult]
  }
}

