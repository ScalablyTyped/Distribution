package typings.reactMediumImageZoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageZoomProps extends js.Object {
  var defaultStyles: js.UndefOr[ImageZoomDefaultStyles] = js.native
  var image: ImageZoomImage = js.native
  var isZoomed: js.UndefOr[Boolean] = js.native
  var onUnzoom: js.UndefOr[js.Function0[js.Object]] = js.native
  var onZoom: js.UndefOr[js.Function0[js.Object]] = js.native
  var shouldHandleZoom: js.UndefOr[js.Function0[Boolean]] = js.native
  var shouldReplaceImage: js.UndefOr[Boolean] = js.native
  var shouldRespectMaxDimension: js.UndefOr[Boolean] = js.native
  var zoomImage: js.UndefOr[ImageZoomZoomImage] = js.native
  var zoomMargin: js.UndefOr[Double] = js.native
}

object ImageZoomProps {
  @scala.inline
  def apply(image: ImageZoomImage): ImageZoomProps = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageZoomProps]
  }
  @scala.inline
  implicit class ImageZoomPropsOps[Self <: ImageZoomProps] (val x: Self) extends AnyVal {
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
    def setImage(value: ImageZoomImage): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultStyles(value: ImageZoomDefaultStyles): Self = this.set("defaultStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultStyles: Self = this.set("defaultStyles", js.undefined)
    @scala.inline
    def setIsZoomed(value: Boolean): Self = this.set("isZoomed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsZoomed: Self = this.set("isZoomed", js.undefined)
    @scala.inline
    def setOnUnzoom(value: () => js.Object): Self = this.set("onUnzoom", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnUnzoom: Self = this.set("onUnzoom", js.undefined)
    @scala.inline
    def setOnZoom(value: () => js.Object): Self = this.set("onZoom", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnZoom: Self = this.set("onZoom", js.undefined)
    @scala.inline
    def setShouldHandleZoom(value: () => Boolean): Self = this.set("shouldHandleZoom", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShouldHandleZoom: Self = this.set("shouldHandleZoom", js.undefined)
    @scala.inline
    def setShouldReplaceImage(value: Boolean): Self = this.set("shouldReplaceImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldReplaceImage: Self = this.set("shouldReplaceImage", js.undefined)
    @scala.inline
    def setShouldRespectMaxDimension(value: Boolean): Self = this.set("shouldRespectMaxDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldRespectMaxDimension: Self = this.set("shouldRespectMaxDimension", js.undefined)
    @scala.inline
    def setZoomImage(value: ImageZoomZoomImage): Self = this.set("zoomImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomImage: Self = this.set("zoomImage", js.undefined)
    @scala.inline
    def setZoomMargin(value: Double): Self = this.set("zoomMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomMargin: Self = this.set("zoomMargin", js.undefined)
  }
  
}

