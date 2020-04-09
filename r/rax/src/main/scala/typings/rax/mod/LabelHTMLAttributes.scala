package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelHTMLAttributes[T] extends HTMLAttributes[T] {
  var form: js.UndefOr[String] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
}

object LabelHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, form: String = null, htmlFor: String = null): LabelHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelHTMLAttributes[T]]
  }
}

