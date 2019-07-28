package typings.react.reactMod

import typings.react.reactStrings.Empty
import typings.react.reactStrings.`use-credentials`
import typings.react.reactStrings.anonymous
import typings.react.reactStrings.async
import typings.react.reactStrings.auto
import typings.react.reactStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImgHTMLAttributes[T] extends HTMLAttributes[T] {
  var alt: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[anonymous | `use-credentials` | Empty] = js.undefined
  var decoding: js.UndefOr[async | auto | sync] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcSet: js.UndefOr[String] = js.undefined
  var useMap: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object ImgHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    alt: String = null,
    crossOrigin: anonymous | `use-credentials` | Empty = null,
    decoding: async | auto | sync = null,
    height: Double | String = null,
    sizes: String = null,
    src: String = null,
    srcSet: String = null,
    useMap: String = null,
    width: Double | String = null
  ): ImgHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (decoding != null) __obj.updateDynamic("decoding")(decoding.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (src != null) __obj.updateDynamic("src")(src)
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet)
    if (useMap != null) __obj.updateDynamic("useMap")(useMap)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImgHTMLAttributes[T]]
  }
}

