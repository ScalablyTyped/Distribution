package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchFieldDictionary...
  */
trait ISearchFieldDictionary extends js.Object {
  /**
    * Position of the field in the list of fields, starting from 0.
    * The list of fields is defined in qResults/qFieldNames and contains the search associations.
    */
  var qField: Double
  /**
    * List of the matching values.
    * The maximum number of values in this list is set by qMaxNbrFieldMatches.
    */
  var qResult: js.Array[ISearchTermResult]
}

object ISearchFieldDictionary {
  @scala.inline
  def apply(qField: Double, qResult: js.Array[ISearchTermResult]): ISearchFieldDictionary = {
    val __obj = js.Dynamic.literal(qField = qField, qResult = qResult)
  
    __obj.asInstanceOf[ISearchFieldDictionary]
  }
}

