package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxRangeSelectInfo with extends of RangeSelectInfo
  */
trait INxRangeSelectInfo extends IRangeSelectInfo {
  /**
    * Number of the measure to select.
    * Numbering starts from 0.
    */
  var qMeasureIx: Double
}

object INxRangeSelectInfo {
  @scala.inline
  def apply(qMeasureIx: Double, qRange: IRange): INxRangeSelectInfo = {
    val __obj = js.Dynamic.literal(qMeasureIx = qMeasureIx.asInstanceOf[js.Any], qRange = qRange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxRangeSelectInfo]
  }
}

