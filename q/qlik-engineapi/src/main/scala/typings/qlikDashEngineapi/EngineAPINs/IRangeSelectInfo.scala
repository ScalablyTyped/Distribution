package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RangeSelectInfo...
  */
trait IRangeSelectInfo extends js.Object {
  /* ToCheck!
    qRangeLo	Lowest value in the range.	Double
    qRangeHi	Highest value in the range.	Double
    qMeasure	Label of the measure.	String
    */
  /**
    * Range of values.
    */
  var qRange: IRange
}

object IRangeSelectInfo {
  @scala.inline
  def apply(qRange: IRange): IRangeSelectInfo = {
    val __obj = js.Dynamic.literal(qRange = qRange)
  
    __obj.asInstanceOf[IRangeSelectInfo]
  }
}

