package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollDetails extends js.Object {
  var current: Position = js.native
  var diff: ScrollDifference = js.native
  var initial: Position = js.native
  // the maximum allowable scroll for the frame
  var max: Position = js.native
}

object ScrollDetails {
  @scala.inline
  def apply(current: Position, diff: ScrollDifference, initial: Position, max: Position): ScrollDetails = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollDetails]
  }
  @scala.inline
  implicit class ScrollDetailsOps[Self <: ScrollDetails] (val x: Self) extends AnyVal {
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
    def setCurrent(value: Position): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiff(value: ScrollDifference): Self = this.set("diff", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitial(value: Position): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Position): Self = this.set("max", value.asInstanceOf[js.Any])
  }
  
}

