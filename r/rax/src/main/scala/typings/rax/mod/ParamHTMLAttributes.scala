package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamHTMLAttributes[T] extends HTMLAttributes[T] {
  var name: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}

object ParamHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    name: String = null,
    value: String | js.Array[String] | Double = null
  ): ParamHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamHTMLAttributes[T]]
  }
}

