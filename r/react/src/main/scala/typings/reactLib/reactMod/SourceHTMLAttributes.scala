package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceHTMLAttributes[T] extends HTMLAttributes[T] {
  var media: js.UndefOr[java.lang.String] = js.undefined
  var sizes: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var srcSet: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SourceHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    media: java.lang.String = null,
    sizes: java.lang.String = null,
    src: java.lang.String = null,
    srcSet: java.lang.String = null,
    `type`: java.lang.String = null
  ): SourceHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (media != null) __obj.updateDynamic("media")(media)
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (src != null) __obj.updateDynamic("src")(src)
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SourceHTMLAttributes[T]]
  }
}

