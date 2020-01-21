package typings.reactMediumImageZoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageZoomDefaultStyles extends js.Object {
  var image: js.UndefOr[js.Object] = js.undefined
  var overlay: js.UndefOr[js.Object] = js.undefined
  var zoomContainer: js.UndefOr[js.Object] = js.undefined
  var zoomImage: js.UndefOr[js.Object] = js.undefined
}

object ImageZoomDefaultStyles {
  @scala.inline
  def apply(
    image: js.Object = null,
    overlay: js.Object = null,
    zoomContainer: js.Object = null,
    zoomImage: js.Object = null
  ): ImageZoomDefaultStyles = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (zoomContainer != null) __obj.updateDynamic("zoomContainer")(zoomContainer.asInstanceOf[js.Any])
    if (zoomImage != null) __obj.updateDynamic("zoomImage")(zoomImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageZoomDefaultStyles]
  }
}

