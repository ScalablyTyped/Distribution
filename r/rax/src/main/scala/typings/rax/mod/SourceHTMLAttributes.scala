package typings.rax.mod

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
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceHTMLAttributes[T]]
  }
}

