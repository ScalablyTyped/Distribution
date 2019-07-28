package typings.qlikDashEngineapi.EngineAPINs

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
  var qSearchTerms: js.Array[String]
  /**
    * Total number of groups.
    */
  var qTotalNumberOfGroups: Double
}

object ISearchResult {
  @scala.inline
  def apply(qSearchGroupArray: ISearchGroup, qSearchTerms: js.Array[String], qTotalNumberOfGroups: Double): ISearchResult = {
    val __obj = js.Dynamic.literal(qSearchGroupArray = qSearchGroupArray, qSearchTerms = qSearchTerms, qTotalNumberOfGroups = qTotalNumberOfGroups)
  
    __obj.asInstanceOf[ISearchResult]
  }
}

