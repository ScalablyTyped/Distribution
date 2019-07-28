package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceHTMLAttributes[T] extends HTMLAttributes[T] {
  var media: js.UndefOr[String] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcSet: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object SourceHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    media: String = null,
    sizes: String = null,
    src: String = null,
    srcSet: String = null,
    `type`: String = null
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

