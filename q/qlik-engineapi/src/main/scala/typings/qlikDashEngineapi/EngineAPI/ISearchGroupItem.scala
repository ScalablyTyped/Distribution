package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchGroupItem...
  */
trait ISearchGroupItem extends js.Object {
  /**
    * Identifier of the item.
    * It corresponds to:
    *
    * - The name of the field, if the type of the search group is data set.
    * - The id of the generic object if the type of the search group is generic object.
    */
  var qIdentifier: String
  /**
    * List of matches in the search group item.
    * The group item matches are numbered
    * from
    * the value of SearchGroupItemOptions.qOffset
    * to
    * the value of SearchGroupItemOptions.qOffset + SearchGroupItemOptions.qCount.
    */
  var qItemMatches: js.Array[ISearchGroupItemMatch]
  /**
    * Type of the group item.
    */
  var qItemType: SearchObjectsItemType
  /**
    * Indexes of the search terms that are included in the group item.
    * These search terms are related to the list of terms defined in SearchResult.qSearchTerms.
    */
  var qSearchTermsMatched: js.Array[Double]
  /**
    * Total number of distinct matches in the search group item.
    */
  var qTotalNumberOfMatches: Double
}

object ISearchGroupItem {
  @scala.inline
  def apply(
    qIdentifier: String,
    qItemMatches: js.Array[ISearchGroupItemMatch],
    qItemType: SearchObjectsItemType,
    qSearchTermsMatched: js.Array[Double],
    qTotalNumberOfMatches: Double
  ): ISearchGroupItem = {
    val __obj = js.Dynamic.literal(qIdentifier = qIdentifier, qItemMatches = qItemMatches, qItemType = qItemType, qSearchTermsMatched = qSearchTermsMatched, qTotalNumberOfMatches = qTotalNumberOfMatches)
  
    __obj.asInstanceOf[ISearchGroupItem]
  }
}

