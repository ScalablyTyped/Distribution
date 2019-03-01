package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImgHTMLAttributes[T] extends HTMLAttributes[T] {
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var crossOrigin: js.UndefOr[
    reactLib.reactLibStrings.anonymous | reactLib.reactLibStrings.`use-credentials` | reactLib.reactLibStrings.Empty
  ] = js.undefined
  var decoding: js.UndefOr[
    reactLib.reactLibStrings.async | reactLib.reactLibStrings.auto | reactLib.reactLibStrings.sync
  ] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var sizes: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var srcSet: js.UndefOr[java.lang.String] = js.undefined
  var useMap: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object ImgHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    alt: java.lang.String = null,
    crossOrigin: reactLib.reactLibStrings.anonymous | reactLib.reactLibStrings.`use-credentials` | reactLib.reactLibStrings.Empty = null,
    decoding: reactLib.reactLibStrings.async | reactLib.reactLibStrings.auto | reactLib.reactLibStrings.sync = null,
    height: scala.Double | java.lang.String = null,
    sizes: java.lang.String = null,
    src: java.lang.String = null,
    srcSet: java.lang.String = null,
    useMap: java.lang.String = null,
    width: scala.Double | java.lang.String = null
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

