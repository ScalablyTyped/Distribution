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
    val __obj = js.Dynamic.literal(qMeasure = qMeasure, qRangeHi = qRangeHi, qRangeLo = qRangeLo)
  
    __obj.asInstanceOf[RangeSelectInfo]
  }
}

