package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.FormEventHandler
import typings.react.reactMod.ReactNode
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextfieldProps
  extends MDLHTMLAttributes
     with DOMAttributes[HTMLInputElement] {
  var error: js.UndefOr[ReactNode] = js.undefined
  var expandable: js.UndefOr[Boolean] = js.undefined
  var expandableIcon: js.UndefOr[String] = js.undefined
  var floatingLabel: js.UndefOr[Boolean] = js.undefined
  var inputClassName: js.UndefOr[String] = js.undefined
  var label: String
  var maxRows: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object TextfieldProps {
  @scala.inline
  def apply(
    label: String,
    DOMAttributes: DOMAttributes[HTMLInputElement] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: ReactNode = null,
    expandable: js.UndefOr[Boolean] = js.undefined,
    expandableIcon: String = null,
    floatingLabel: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inputClassName: String = null,
    maxRows: Int | Double = null,
    name: String = null,
    onChange: FormEventHandler[HTMLInputElement] = null,
    pattern: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    title: String = null,
    value: String | Double = null
  ): TextfieldProps = {
    val __obj = js.Dynamic.literal(label = label)
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable)
    if (expandableIcon != null) __obj.updateDynamic("expandableIcon")(expandableIcon)
    if (!js.isUndefined(floatingLabel)) __obj.updateDynamic("floatingLabel")(floatingLabel)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName)
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextfieldProps]
  }
}

