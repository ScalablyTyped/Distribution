package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputHTMLAttributes[T] extends HTMLAttributes[T] {
  var form: js.UndefOr[String] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object OutputHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    form: String = null,
    htmlFor: String = null,
    name: String = null
  ): OutputHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (form != null) __obj.updateDynamic("form")(form)
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OutputHTMLAttributes[T]]
  }
}

