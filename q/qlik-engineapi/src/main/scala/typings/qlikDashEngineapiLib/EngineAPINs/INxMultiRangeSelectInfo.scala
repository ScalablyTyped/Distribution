package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qColumnsToSelect: scala.Double
}

object INxMultiRangeSelectInfo {
  @scala.inline
  def apply(qColumnsToSelect: scala.Double, qRange: IRange): INxMultiRangeSelectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qColumnsToSelect")(qColumnsToSelect)
    __obj.updateDynamic("qRange")(qRange)
    __obj.asInstanceOf[INxMultiRangeSelectInfo]
  }
}

