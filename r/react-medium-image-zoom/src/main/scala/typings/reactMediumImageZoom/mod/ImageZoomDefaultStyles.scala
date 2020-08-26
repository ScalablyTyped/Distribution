package typings.reactMediumImageZoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageZoomDefaultStyles extends js.Object {
  var image: js.UndefOr[js.Object] = js.native
  var overlay: js.UndefOr[js.Object] = js.native
  var zoomContainer: js.UndefOr[js.Object] = js.native
  var zoomImage: js.UndefOr[js.Object] = js.native
}

object ImageZoomDefaultStyles {
  @scala.inline
  def apply(): ImageZoomDefaultStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageZoomDefaultStyles]
  }
  @scala.inline
  implicit class ImageZoomDefaultStylesOps[Self <: ImageZoomDefaultStyles] (val x: Self) extends AnyVal {
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
    def setImage(value: js.Object): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setOverlay(value: js.Object): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setZoomContainer(value: js.Object): Self = this.set("zoomContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomContainer: Self = this.set("zoomContainer", js.undefined)
    @scala.inline
    def setZoomImage(value: js.Object): Self = this.set("zoomImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomImage: Self = this.set("zoomImage", js.undefined)
  }
  
}

