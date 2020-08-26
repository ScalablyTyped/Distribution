package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationControlProps extends BaseControlProps {
  var className: js.UndefOr[String] = js.native
  var compassLabel: js.UndefOr[String] = js.native
  var onViewStateChange: js.UndefOr[ViewStateChangeHandler] = js.native
  var onViewportChange: js.UndefOr[ViewportChangeHandler] = js.native
  var showCompass: js.UndefOr[Boolean] = js.native
  var showZoom: js.UndefOr[Boolean] = js.native
  var zoomInLabel: js.UndefOr[String] = js.native
  var zoomOutLabel: js.UndefOr[String] = js.native
}

object NavigationControlProps {
  @scala.inline
  def apply(): NavigationControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationControlProps]
  }
  @scala.inline
  implicit class NavigationControlPropsOps[Self <: NavigationControlProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCompassLabel(value: String): Self = this.set("compassLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompassLabel: Self = this.set("compassLabel", js.undefined)
    @scala.inline
    def setOnViewStateChange(value: /* info */ ViewStateChangeInfo => Unit): Self = this.set("onViewStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnViewStateChange: Self = this.set("onViewStateChange", js.undefined)
    @scala.inline
    def setOnViewportChange(value: /* viewState */ ViewportProps => Unit): Self = this.set("onViewportChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnViewportChange: Self = this.set("onViewportChange", js.undefined)
    @scala.inline
    def setShowCompass(value: Boolean): Self = this.set("showCompass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCompass: Self = this.set("showCompass", js.undefined)
    @scala.inline
    def setShowZoom(value: Boolean): Self = this.set("showZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowZoom: Self = this.set("showZoom", js.undefined)
    @scala.inline
    def setZoomInLabel(value: String): Self = this.set("zoomInLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomInLabel: Self = this.set("zoomInLabel", js.undefined)
    @scala.inline
    def setZoomOutLabel(value: String): Self = this.set("zoomOutLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomOutLabel: Self = this.set("zoomOutLabel", js.undefined)
  }
  
}

