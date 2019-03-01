package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextfieldProps
  extends MDLHTMLAttributes
     with reactLib.reactMod.ReactNs.DOMAttributes[reactLib.HTMLInputElement] {
  var error: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var expandable: js.UndefOr[scala.Boolean] = js.undefined
  var expandableIcon: js.UndefOr[java.lang.String] = js.undefined
  var floatingLabel: js.UndefOr[scala.Boolean] = js.undefined
  var inputClassName: js.UndefOr[java.lang.String] = js.undefined
  var label: java.lang.String
  var maxRows: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object TextfieldProps {
  @scala.inline
  def apply(
    label: java.lang.String,
    DOMAttributes: reactLib.reactMod.ReactNs.DOMAttributes[reactLib.HTMLInputElement] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: reactLib.reactMod.ReactNs.ReactNode = null,
    expandable: js.UndefOr[scala.Boolean] = js.undefined,
    expandableIcon: java.lang.String = null,
    floatingLabel: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    inputClassName: java.lang.String = null,
    maxRows: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    onChange: reactLib.reactMod.ReactNs.FormEventHandler[reactLib.HTMLInputElement] = null,
    pattern: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    rows: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    value: java.lang.String | scala.Double = null
  ): TextfieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
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

