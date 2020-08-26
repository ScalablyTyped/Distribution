package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxMultiRangeSelectInfo with extends of RangeSelectInfo
  */
@js.native
trait INxMultiRangeSelectInfo extends IRangeSelectInfo {
  /**
    * Number of the columns to select.
    * Numbering starts from 0.
    */
  var qColumnsToSelect: Double = js.native
}

object INxMultiRangeSelectInfo {
  @scala.inline
  def apply(qColumnsToSelect: Double, qRange: IRange): INxMultiRangeSelectInfo = {
    val __obj = js.Dynamic.literal(qColumnsToSelect = qColumnsToSelect.asInstanceOf[js.Any], qRange = qRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxMultiRangeSelectInfo]
  }
  @scala.inline
  implicit class INxMultiRangeSelectInfoOps[Self <: INxMultiRangeSelectInfo] (val x: Self) extends AnyVal {
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
    def setQColumnsToSelect(value: Double): Self = this.set("qColumnsToSelect", value.asInstanceOf[js.Any])
  }
  
}

