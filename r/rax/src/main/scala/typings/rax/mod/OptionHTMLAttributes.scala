package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionHTMLAttributes[T] extends HTMLAttributes[T] {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}

object OptionHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    value: String | js.Array[String] | Double = null
  ): OptionHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionHTMLAttributes[T]]
  }
}

