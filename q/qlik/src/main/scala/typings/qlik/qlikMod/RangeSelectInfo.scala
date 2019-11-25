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
    val __obj = js.Dynamic.literal(qMeasure = qMeasure.asInstanceOf[js.Any], qRangeHi = qRangeHi.asInstanceOf[js.Any], qRangeLo = qRangeLo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeSelectInfo]
  }
}

