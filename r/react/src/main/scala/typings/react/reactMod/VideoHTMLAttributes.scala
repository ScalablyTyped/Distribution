package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoHTMLAttributes[T] extends MediaHTMLAttributes[T] {
  var disablePictureInPicture: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var playsInline: js.UndefOr[Boolean] = js.undefined
  var poster: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object VideoHTMLAttributes {
  @scala.inline
  def apply[T](
    MediaHTMLAttributes: MediaHTMLAttributes[T] = null,
    disablePictureInPicture: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    playsInline: js.UndefOr[Boolean] = js.undefined,
    poster: String = null,
    width: Double | String = null
  ): VideoHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, MediaHTMLAttributes)
    if (!js.isUndefined(disablePictureInPicture)) __obj.updateDynamic("disablePictureInPicture")(disablePictureInPicture)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(playsInline)) __obj.updateDynamic("playsInline")(playsInline)
    if (poster != null) __obj.updateDynamic("poster")(poster)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoHTMLAttributes[T]]
  }
}

