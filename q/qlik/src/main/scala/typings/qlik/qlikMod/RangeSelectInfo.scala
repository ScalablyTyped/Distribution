package typings.qlik.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectInfo extends js.Object {
  var qMeasure: String
  var qRangeHi: Double
  var qRangeLo: Double
}

object RangeSelectInfo {
  @scala.inline
  def apply(qMeasure: String, qRangeHi: Double, qRangeLo: Double): RangeSelectInfo = {
    val __obj = js.Dynamic.literal(qMeasure = qMeasure, qRangeHi = qRangeHi, qRangeLo = qRangeLo)
  
    __obj.asInstanceOf[RangeSelectInfo]
  }
}

