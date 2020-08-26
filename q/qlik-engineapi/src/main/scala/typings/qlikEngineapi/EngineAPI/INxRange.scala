package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxRange...
  */
@js.native
trait INxRange extends js.Object {
  /**
    * Position in the expression of the first character of the field name.
    */
  var qCount: Double = js.native
  /**
    * Number of characters in the field name.
    */
  var qFrom: Double = js.native
}

object INxRange {
  @scala.inline
  def apply(qCount: Double, qFrom: Double): INxRange = {
    val __obj = js.Dynamic.literal(qCount = qCount.asInstanceOf[js.Any], qFrom = qFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxRange]
  }
  @scala.inline
  implicit class INxRangeOps[Self <: INxRange] (val x: Self) extends AnyVal {
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
    def setQCount(value: Double): Self = this.set("qCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setQFrom(value: Double): Self = this.set("qFrom", value.asInstanceOf[js.Any])
  }
  
}

