package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchResult...
  */
trait ISearchResult extends js.Object {
  /**
    * List of search groups.
    * The groups are numbered
    * from
    * the value of SearchPage.qOffset
    * to
    * the value of SearchPage.qOffset + SearchPage.qCount.
    */
  var qSearchGroupArray: ISearchGroup
  /**
    * List of the search terms.
    */
  var qSearchTerms: js.Array[java.lang.String]
  /**
    * Total number of groups.
    */
  var qTotalNumberOfGroups: scala.Double
}

object ISearchResult {
  @scala.inline
  def apply(
    qSearchGroupArray: ISearchGroup,
    qSearchTerms: js.Array[java.lang.String],
    qTotalNumberOfGroups: scala.Double
  ): ISearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qSearchGroupArray")(qSearchGroupArray)
    __obj.updateDynamic("qSearchTerms")(qSearchTerms)
    __obj.updateDynamic("qTotalNumberOfGroups")(qTotalNumberOfGroups)
    __obj.asInstanceOf[ISearchResult]
  }
}

