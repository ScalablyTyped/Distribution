package typings.react.reactMod

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
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionHTMLAttributes[T]]
  }
}

