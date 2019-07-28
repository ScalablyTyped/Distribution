package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseHTMLAttributes[T] extends HTMLAttributes[T] {
  var href: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object BaseHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, href: String = null, target: String = null): BaseHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (href != null) __obj.updateDynamic("href")(href)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[BaseHTMLAttributes[T]]
  }
}

