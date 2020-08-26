package typings.reactVirtualized.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverscanIndexRange extends js.Object {
  var overscanStartIndex: Double = js.native
  var overscanStopIndex: Double = js.native
}

object OverscanIndexRange {
  @scala.inline
  def apply(overscanStartIndex: Double, overscanStopIndex: Double): OverscanIndexRange = {
    val __obj = js.Dynamic.literal(overscanStartIndex = overscanStartIndex.asInstanceOf[js.Any], overscanStopIndex = overscanStopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverscanIndexRange]
  }
  @scala.inline
  implicit class OverscanIndexRangeOps[Self <: OverscanIndexRange] (val x: Self) extends AnyVal {
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
    def setOverscanStartIndex(value: Double): Self = this.set("overscanStartIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverscanStopIndex(value: Double): Self = this.set("overscanStopIndex", value.asInstanceOf[js.Any])
  }
  
}

