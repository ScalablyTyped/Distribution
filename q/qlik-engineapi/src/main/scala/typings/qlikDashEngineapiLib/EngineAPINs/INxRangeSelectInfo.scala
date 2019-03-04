package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qMeasureIx: scala.Double
}

object INxRangeSelectInfo {
  @scala.inline
  def apply(qMeasureIx: scala.Double, qRange: IRange): INxRangeSelectInfo = {
    val __obj = js.Dynamic.literal(qMeasureIx = qMeasureIx, qRange = qRange)
  
    __obj.asInstanceOf[INxRangeSelectInfo]
  }
}

