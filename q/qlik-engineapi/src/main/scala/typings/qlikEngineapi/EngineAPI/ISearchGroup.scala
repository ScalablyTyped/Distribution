package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchGroup...
  */
trait ISearchGroup extends js.Object {
  /**
    * Type of the search group.
    * One of:
    *
    * -  1 for DatasetType: the type of the group is a data set.
    *      This group contains search matches that are related to fields in the app.
    * -  2 for GenericObjectsType: the type of the group is a generic object.
    *      This group contains search matches that are related to generic objects in the app.
    */
  var qGroupType: SearchObjectsGroupType
  /**
    * Identifier of the search group.
    */
  var qId: Double
  /**
    * List of items in the search group.
    * The group items are numbered
    * from
    * the value of SearchGroupOptions.qOffset
    * to
    * the value of SearchGroupOptions.qOffset + SearchGroupOptions.qCount
    */
  var qItems: js.Array[ISearchGroupItem]
  /**
    * Indexes of the search terms that are included in the group.
    * These search terms are related to the list of terms defined in SearchResult.qSearchTerms.
    */
  var qSearchTermsMatched: js.Array[Double]
  /**
    * Total number of distinct items in the search group.
    */
  var qTotalNumberOfItems: Double
}

object ISearchGroup {
  @scala.inline
  def apply(
    qGroupType: SearchObjectsGroupType,
    qId: Double,
    qItems: js.Array[ISearchGroupItem],
    qSearchTermsMatched: js.Array[Double],
    qTotalNumberOfItems: Double
  ): ISearchGroup = {
    val __obj = js.Dynamic.literal(qGroupType = qGroupType.asInstanceOf[js.Any], qId = qId.asInstanceOf[js.Any], qItems = qItems.asInstanceOf[js.Any], qSearchTermsMatched = qSearchTermsMatched.asInstanceOf[js.Any], qTotalNumberOfItems = qTotalNumberOfItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISearchGroup]
  }
}

