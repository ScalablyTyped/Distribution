package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaHTMLAttributes[T] extends HTMLAttributes[T] {
  var charSet: js.UndefOr[java.lang.String] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var httpEquiv: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object MetaHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    charSet: java.lang.String = null,
    content: java.lang.String = null,
    httpEquiv: java.lang.String = null,
    name: java.lang.String = null
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

