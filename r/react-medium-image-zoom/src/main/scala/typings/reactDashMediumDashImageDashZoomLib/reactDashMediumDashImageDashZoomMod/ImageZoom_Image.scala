package typings
package reactDashMediumDashImageDashZoomLib.reactDashMediumDashImageDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageZoom_Image extends js.Object {
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var src: java.lang.String
  var style: js.UndefOr[js.Object] = js.undefined
}

object ImageZoom_Image {
  @scala.inline
  def apply(
    src: java.lang.String,
    alt: java.lang.String = null,
    className: java.lang.String = null,
    style: js.Object = null
  ): ImageZoom_Image = {
    val __obj = js.Dynamic.literal(src = src)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (className != null) __obj.updateDynamic("className")(className)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ImageZoom_Image]
  }
}

