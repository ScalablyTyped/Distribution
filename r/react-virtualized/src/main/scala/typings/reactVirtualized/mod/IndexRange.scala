package typings.reactVirtualized.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexRange extends js.Object {
  var startIndex: Double = js.native
  var stopIndex: Double = js.native
}

object IndexRange {
  @scala.inline
  def apply(startIndex: Double, stopIndex: Double): IndexRange = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any], stopIndex = stopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexRange]
  }
  @scala.inline
  implicit class IndexRangeOps[Self <: IndexRange] (val x: Self) extends AnyVal {
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
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopIndex(value: Double): Self = this.set("stopIndex", value.asInstanceOf[js.Any])
  }
  
}

