package typings.rax.mod

import typings.rax.raxStrings._empty
import typings.rax.raxStrings.`use-credentials`
import typings.rax.raxStrings.anonymous
import typings.rax.raxStrings.async
import typings.rax.raxStrings.auto
import typings.rax.raxStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImgHTMLAttributes[T] extends HTMLAttributes[T] {
  var alt: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.undefined
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
    crossOrigin: anonymous | `use-credentials` | _empty = null,
    decoding: async | auto | sync = null,
    height: Double | String = null,
    sizes: String = null,
    src: String = null,
    srcSet: String = null,
    useMap: String = null,
    width: Double | String = null
  ): ImgHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (decoding != null) __obj.updateDynamic("decoding")(decoding.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    if (useMap != null) __obj.updateDynamic("useMap")(useMap.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImgHTMLAttributes[T]]
  }
}

