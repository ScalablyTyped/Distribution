package typings.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviousAndNextLocation extends js.Object {
  var nextPath: NumberOrStringArray = js.native
  var nextTreeIndex: Double = js.native
  var prevPath: NumberOrStringArray = js.native
  var prevTreeIndex: Double = js.native
}

object PreviousAndNextLocation {
  @scala.inline
  def apply(
    nextPath: NumberOrStringArray,
    nextTreeIndex: Double,
    prevPath: NumberOrStringArray,
    prevTreeIndex: Double
  ): PreviousAndNextLocation = {
    val __obj = js.Dynamic.literal(nextPath = nextPath.asInstanceOf[js.Any], nextTreeIndex = nextTreeIndex.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousAndNextLocation]
  }
  @scala.inline
  implicit class PreviousAndNextLocationOps[Self <: PreviousAndNextLocation] (val x: Self) extends AnyVal {
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
    def setNextPathVarargs(value: (String | Double)*): Self = this.set("nextPath", js.Array(value :_*))
    @scala.inline
    def setNextPath(value: NumberOrStringArray): Self = this.set("nextPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextTreeIndex(value: Double): Self = this.set("nextTreeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevPathVarargs(value: (String | Double)*): Self = this.set("prevPath", js.Array(value :_*))
    @scala.inline
    def setPrevPath(value: NumberOrStringArray): Self = this.set("prevPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevTreeIndex(value: Double): Self = this.set("prevTreeIndex", value.asInstanceOf[js.Any])
  }
  
}

