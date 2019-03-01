package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectInfo extends js.Object {
  var qMeasure: java.lang.String
  var qRangeHi: scala.Double
  var qRangeLo: scala.Double
}

object RangeSelectInfo {
  @scala.inline
  def apply(qMeasure: java.lang.String, qRangeHi: scala.Double, qRangeLo: scala.Double): RangeSelectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qMeasure")(qMeasure)
    __obj.updateDynamic("qRangeHi")(qRangeHi)
    __obj.updateDynamic("qRangeLo")(qRangeLo)
    __obj.asInstanceOf[RangeSelectInfo]
  }
}

