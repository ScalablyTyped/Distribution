package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharRange extends js.Object {
  var qCharCount: Double = js.native
  var qCharPos: Double = js.native
}

object CharRange {
  @scala.inline
  def apply(qCharCount: Double, qCharPos: Double): CharRange = {
    val __obj = js.Dynamic.literal(qCharCount = qCharCount.asInstanceOf[js.Any], qCharPos = qCharPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharRange]
  }
  @scala.inline
  implicit class CharRangeOps[Self <: CharRange] (val x: Self) extends AnyVal {
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

