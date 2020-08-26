package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseControlProps extends js.Object {
  var captureClick: js.UndefOr[Boolean] = js.native
  var captureDoubleClick: js.UndefOr[Boolean] = js.native
  var captureDrag: js.UndefOr[Boolean] = js.native
  var captureScroll: js.UndefOr[Boolean] = js.native
}

object BaseControlProps {
  @scala.inline
  def apply(): BaseControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseControlProps]
  }
  @scala.inline
  implicit class BaseControlPropsOps[Self <: BaseControlProps] (val x: Self) extends AnyVal {
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
    def setCaptureClick(value: Boolean): Self = this.set("captureClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureClick: Self = this.set("captureClick", js.undefined)
    @scala.inline
    def setCaptureDoubleClick(value: Boolean): Self = this.set("captureDoubleClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureDoubleClick: Self = this.set("captureDoubleClick", js.undefined)
    @scala.inline
    def setCaptureDrag(value: Boolean): Self = this.set("captureDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureDrag: Self = this.set("captureDrag", js.undefined)
    @scala.inline
    def setCaptureScroll(value: Boolean): Self = this.set("captureScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureScroll: Self = this.set("captureScroll", js.undefined)
  }
  
}

