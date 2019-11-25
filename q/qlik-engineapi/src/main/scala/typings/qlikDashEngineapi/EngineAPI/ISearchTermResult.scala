package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchTermResult...
  */
trait ISearchTermResult extends js.Object {
  /**
    * Element number of the associated value.
    */
  var qElemNumber: Double
  /**
    * List of ranges.
    * For example, if the user searches the term read and the associative value is Reading,
    * then the corresponding range would be Read in Reading.
    */
  var qRanges: js.Array[ISearchCharRange]
  /**
    * Text of the associated value.
    */
  var qText: String
}

object ISearchTermResult {
  @scala.inline
  def apply(qElemNumber: Double, qRanges: js.Array[ISearchCharRange], qText: String): ISearchTermResult = {
    val __obj = js.Dynamic.literal(qElemNumber = qElemNumber.asInstanceOf[js.Any], qRanges = qRanges.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISearchTermResult]
  }
}

