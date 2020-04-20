package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxMultiRangeSelectInfo with extends of RangeSelectInfo
  */
trait INxMultiRangeSelectInfo extends IRangeSelectInfo {
  /**
    * Number of the columns to select.
    * Numbering starts from 0.
    */
  var qColumnsToSelect: Double
}

object INxMultiRangeSelectInfo {
  @scala.inline
  def apply(qColumnsToSelect: Double, qRange: IRange): INxMultiRangeSelectInfo = {
    val __obj = js.Dynamic.literal(qColumnsToSelect = qColumnsToSelect.asInstanceOf[js.Any], qRange = qRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxMultiRangeSelectInfo]
  }
}

