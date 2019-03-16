package typings
package reactDashMediumDashImageDashZoomLib.reactDashMediumDashImageDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageZoomProps extends js.Object {
  var defaultStyles: js.UndefOr[ImageZoomDefaultStyles] = js.undefined
  var image: ImageZoom_Image
  var isZoomed: js.UndefOr[scala.Boolean] = js.undefined
  var onUnzoom: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var onZoom: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var shouldHandleZoom: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var shouldReplaceImage: js.UndefOr[scala.Boolean] = js.undefined
  var shouldRespectMaxDimension: js.UndefOr[scala.Boolean] = js.undefined
  var zoomImage: js.UndefOr[ImageZoom_ZoomImage] = js.undefined
  var zoomMargin: js.UndefOr[scala.Double] = js.undefined
}

object ImageZoomProps {
  @scala.inline
  def apply(
    image: ImageZoom_Image,
    defaultStyles: ImageZoomDefaultStyles = null,
    isZoomed: js.UndefOr[scala.Boolean] = js.undefined,
    onUnzoom: () => js.Object = null,
    onZoom: () => js.Object = null,
    shouldHandleZoom: () => scala.Boolean = null,
    shouldReplaceImage: js.UndefOr[scala.Boolean] = js.undefined,
    shouldRespectMaxDimension: js.UndefOr[scala.Boolean] = js.undefined,
    zoomImage: ImageZoom_ZoomImage = null,
    zoomMargin: scala.Int | scala.Double = null
  ): ImageZoomProps = {
    val __obj = js.Dynamic.literal(image = image)
    if (defaultStyles != null) __obj.updateDynamic("defaultStyles")(defaultStyles)
    if (!js.isUndefined(isZoomed)) __obj.updateDynamic("isZoomed")(isZoomed)
    if (onUnzoom != null) __obj.updateDynamic("onUnzoom")(js.Any.fromFunction0(onUnzoom))
    if (onZoom != null) __obj.updateDynamic("onZoom")(js.Any.fromFunction0(onZoom))
    if (shouldHandleZoom != null) __obj.updateDynamic("shouldHandleZoom")(js.Any.fromFunction0(shouldHandleZoom))
    if (!js.isUndefined(shouldReplaceImage)) __obj.updateDynamic("shouldReplaceImage")(shouldReplaceImage)
    if (!js.isUndefined(shouldRespectMaxDimension)) __obj.updateDynamic("shouldRespectMaxDimension")(shouldRespectMaxDimension)
    if (zoomImage != null) __obj.updateDynamic("zoomImage")(zoomImage)
    if (zoomMargin != null) __obj.updateDynamic("zoomMargin")(zoomMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageZoomProps]
  }
}

