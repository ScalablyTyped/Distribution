package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackHTMLAttributes[T] extends HTMLAttributes[T] {
  var default: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var srcLang: js.UndefOr[java.lang.String] = js.undefined
}

object TrackHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    default: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    label: java.lang.String = null,
    src: java.lang.String = null,
    srcLang: java.lang.String = null
  ): TrackHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (label != null) __obj.updateDynamic("label")(label)
    if (src != null) __obj.updateDynamic("src")(src)
    if (srcLang != null) __obj.updateDynamic("srcLang")(srcLang)
    __obj.asInstanceOf[TrackHTMLAttributes[T]]
  }
}

