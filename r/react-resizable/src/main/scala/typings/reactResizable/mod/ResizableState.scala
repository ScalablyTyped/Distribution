package typings.reactResizable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizableState extends js.Object {
  var height: Double = js.native
  var resizing: Boolean = js.native
  var slackH: Double = js.native
  var slackW: Double = js.native
  var width: Double = js.native
}

object ResizableState {
  @scala.inline
  def apply(height: Double, resizing: Boolean, slackH: Double, slackW: Double, width: Double): ResizableState = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resizing = resizing.asInstanceOf[js.Any], slackH = slackH.asInstanceOf[js.Any], slackW = slackW.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizableState]
  }
  @scala.inline
  implicit class ResizableStateOps[Self <: ResizableState] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setResizing(value: Boolean): Self = this.set("resizing", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlackH(value: Double): Self = this.set("slackH", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlackW(value: Double): Self = this.set("slackW", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

