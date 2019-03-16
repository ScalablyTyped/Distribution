package typings
package reactDashMediumDashImageDashZoomLib.reactDashMediumDashImageDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageZoom_ZoomImage extends js.Object {
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object ImageZoom_ZoomImage {
  @scala.inline
  def apply(
    alt: java.lang.String = null,
    className: java.lang.String = null,
    src: java.lang.String = null,
    style: js.Object = null
  ): ImageZoom_ZoomImage = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (className != null) __obj.updateDynamic("className")(className)
    if (src != null) __obj.updateDynamic("src")(src)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ImageZoom_ZoomImage]
  }
}

