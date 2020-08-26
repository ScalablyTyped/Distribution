package typings.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait touchTypes extends js.Object {
  var activeSplitter: Null | Double = js.native
  var dragging: Boolean = js.native
  var mouseDown: Boolean = js.native
}

object touchTypes {
  @scala.inline
  def apply(dragging: Boolean, mouseDown: Boolean): touchTypes = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], mouseDown = mouseDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[touchTypes]
  }
  @scala.inline
  implicit class touchTypesOps[Self <: touchTypes] (val x: Self) extends AnyVal {
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
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseDown(value: Boolean): Self = this.set("mouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveSplitter(value: Double): Self = this.set("activeSplitter", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveSplitterNull: Self = this.set("activeSplitter", null)
  }
  
}

