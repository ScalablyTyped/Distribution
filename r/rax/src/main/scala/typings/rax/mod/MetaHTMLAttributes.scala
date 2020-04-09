package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaHTMLAttributes[T] extends HTMLAttributes[T] {
  var charSet: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var httpEquiv: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object MetaHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    charSet: String = null,
    content: String = null,
    httpEquiv: String = null,
    name: String = null
  ): MetaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (charSet != null) __obj.updateDynamic("charSet")(charSet.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (httpEquiv != null) __obj.updateDynamic("httpEquiv")(httpEquiv.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaHTMLAttributes[T]]
  }
}

