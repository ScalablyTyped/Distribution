package typings.reactDashForm.reactDashFormMod

import typings.react.reactMod.SelectHTMLAttributes
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps
  extends SelectHTMLAttributes[HTMLSelectElement]
     with FieldProps {
  var options: SelectOptions
}

object SelectProps {
  @scala.inline
  def apply(
    options: SelectOptions,
    FieldProps: FieldProps = null,
    SelectHTMLAttributes: SelectHTMLAttributes[HTMLSelectElement] = null,
    placeholder: String = null
  ): SelectProps = {
    val __obj = js.Dynamic.literal(options = options)
    js.Dynamic.global.Object.assign(__obj, FieldProps)
    js.Dynamic.global.Object.assign(__obj, SelectHTMLAttributes)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[SelectProps]
  }
}

