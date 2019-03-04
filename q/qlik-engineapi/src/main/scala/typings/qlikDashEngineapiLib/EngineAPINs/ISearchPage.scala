package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchPage...
  */
trait ISearchPage extends js.Object {
  /**
    * Number of search groups to return (in qSearchGroupArray).
    */
  var qCount: scala.Double
  /**
    * Options of the search group items.
    * If this property is not set, all values are returned.
    * This property is to be used with the SearchResults method or the SearchObjects method.
    */
  var qGroupItemOptions: js.Array[ISearchGroupItemOptions]
  /**
    * Options of the search groups.
    * If this property is not set, all values are returned.
    * This property is to be used with the SearchResults method or the SearchObjects method.
    */
  var qGroupOptions: js.Array[ISearchGroupOptions]
  /**
    * Maximum number of matching values to return per search result.
    * The default value is -1; all values are returned.
    * This property is to be used with the SearchAssociations method.
    */
  var qMaxNbrFieldMatches: scala.Double
  /**
    * Position from the top, starting from 0.
    * If the offset is set to 0, the first search result to be returned is at position 0.
    */
  var qOffset: scala.Double
}

object ISearchPage {
  @scala.inline
  def apply(
    qCount: scala.Double,
    qGroupItemOptions: js.Array[ISearchGroupItemOptions],
    qGroupOptions: js.Array[ISearchGroupOptions],
    qMaxNbrFieldMatches: scala.Double,
    qOffset: scala.Double
  ): ISearchPage = {
    val __obj = js.Dynamic.literal(qCount = qCount, qGroupItemOptions = qGroupItemOptions, qGroupOptions = qGroupOptions, qMaxNbrFieldMatches = qMaxNbrFieldMatches, qOffset = qOffset)
  
    __obj.asInstanceOf[ISearchPage]
  }
}

