package typings.reactDashMediumDashImageDashZoom.reactDashMediumDashImageDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageZoomProps extends js.Object {
  var defaultStyles: js.UndefOr[ImageZoomDefaultStyles] = js.undefined
  var image: ImageZoom_Image
  var isZoomed: js.UndefOr[Boolean] = js.undefined
  var onUnzoom: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var onZoom: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var shouldHandleZoom: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var shouldReplaceImage: js.UndefOr[Boolean] = js.undefined
  var shouldRespectMaxDimension: js.UndefOr[Boolean] = js.undefined
  var zoomImage: js.UndefOr[ImageZoom_ZoomImage] = js.undefined
  var zoomMargin: js.UndefOr[Double] = js.undefined
}

object ImageZoomProps {
  @scala.inline
  def apply(
    image: ImageZoom_Image,
    defaultStyles: ImageZoomDefaultStyles = null,
    isZoomed: js.UndefOr[Boolean] = js.undefined,
    onUnzoom: () => js.Object = null,
    onZoom: () => js.Object = null,
    shouldHandleZoom: () => Boolean = null,
    shouldReplaceImage: js.UndefOr[Boolean] = js.undefined,
    shouldRespectMaxDimension: js.UndefOr[Boolean] = js.undefined,
    zoomImage: ImageZoom_ZoomImage = null,
    zoomMargin: Int | Double = null
  ): ImageZoomProps = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (defaultStyles != null) __obj.updateDynamic("defaultStyles")(defaultStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(isZoomed)) __obj.updateDynamic("isZoomed")(isZoomed.asInstanceOf[js.Any])
    if (onUnzoom != null) __obj.updateDynamic("onUnzoom")(js.Any.fromFunction0(onUnzoom))
    if (onZoom != null) __obj.updateDynamic("onZoom")(js.Any.fromFunction0(onZoom))
    if (shouldHandleZoom != null) __obj.updateDynamic("shouldHandleZoom")(js.Any.fromFunction0(shouldHandleZoom))
    if (!js.isUndefined(shouldReplaceImage)) __obj.updateDynamic("shouldReplaceImage")(shouldReplaceImage.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRespectMaxDimension)) __obj.updateDynamic("shouldRespectMaxDimension")(shouldRespectMaxDimension.asInstanceOf[js.Any])
    if (zoomImage != null) __obj.updateDynamic("zoomImage")(zoomImage.asInstanceOf[js.Any])
    if (zoomMargin != null) __obj.updateDynamic("zoomMargin")(zoomMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageZoomProps]
  }
}

