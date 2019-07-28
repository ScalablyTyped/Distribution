package typings.react.reactMod

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
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (charSet != null) __obj.updateDynamic("charSet")(charSet)
    if (content != null) __obj.updateDynamic("content")(content)
    if (httpEquiv != null) __obj.updateDynamic("httpEquiv")(httpEquiv)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MetaHTMLAttributes[T]]
  }
}

