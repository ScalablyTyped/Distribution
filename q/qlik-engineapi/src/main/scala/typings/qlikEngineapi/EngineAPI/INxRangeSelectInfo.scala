package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxRangeSelectInfo with extends of RangeSelectInfo
  */
@js.native
trait INxRangeSelectInfo extends IRangeSelectInfo {
  /**
    * Number of the measure to select.
    * Numbering starts from 0.
    */
  var qMeasureIx: Double = js.native
}

object INxRangeSelectInfo {
  @scala.inline
  def apply(qMeasureIx: Double, qRange: IRange): INxRangeSelectInfo = {
    val __obj = js.Dynamic.literal(qMeasureIx = qMeasureIx.asInstanceOf[js.Any], qRange = qRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxRangeSelectInfo]
  }
  @scala.inline
  implicit class INxRangeSelectInfoOps[Self <: INxRangeSelectInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQMeasureIx(value: Double): Self = this.set("qMeasureIx", value.asInstanceOf[js.Any])
  }
  
}

