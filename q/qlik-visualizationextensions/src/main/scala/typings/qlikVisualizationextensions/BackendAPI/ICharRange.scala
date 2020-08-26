package typings.qlikVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICharRange extends js.Object {
  /**
    * Number of occurrences found
    * Integer
    */
  var qCharCount: Double = js.native
  /**
    * Position of the first search occurrence
    * Integer
    */
  var qCharPos: Double = js.native
}

object ICharRange {
  @scala.inline
  def apply(qCharCount: Double, qCharPos: Double): ICharRange = {
    val __obj = js.Dynamic.literal(qCharCount = qCharCount.asInstanceOf[js.Any], qCharPos = qCharPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICharRange]
  }
  @scala.inline
  implicit class ICharRangeOps[Self <: ICharRange] (val x: Self) extends AnyVal {
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
    def setQCharCount(value: Double): Self = this.set("qCharCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setQCharPos(value: Double): Self = this.set("qCharPos", value.asInstanceOf[js.Any])
  }
  
}

