package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoHTMLAttributes[T] extends MediaHTMLAttributes[T] {
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var playsInline: js.UndefOr[scala.Boolean] = js.undefined
  var poster: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object VideoHTMLAttributes {
  @scala.inline
  def apply[T](
    MediaHTMLAttributes: MediaHTMLAttributes[T] = null,
    height: scala.Double | java.lang.String = null,
    playsInline: js.UndefOr[scala.Boolean] = js.undefined,
    poster: java.lang.String = null,
    width: scala.Double | java.lang.String = null
  ): VideoHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, MediaHTMLAttributes)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(playsInline)) __obj.updateDynamic("playsInline")(playsInline)
    if (poster != null) __obj.updateDynamic("poster")(poster)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoHTMLAttributes[T]]
  }
}

