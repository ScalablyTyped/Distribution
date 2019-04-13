package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputHTMLAttributes[T] extends HTMLAttributes[T] {
  var accept: js.UndefOr[java.lang.String] = js.undefined
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var autoComplete: js.UndefOr[java.lang.String] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var capture: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
   // https://www.w3.org/TR/html-media-capture/#the-capture-attribute
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var form: js.UndefOr[java.lang.String] = js.undefined
  var formAction: js.UndefOr[java.lang.String] = js.undefined
  var formEncType: js.UndefOr[java.lang.String] = js.undefined
  var formMethod: js.UndefOr[java.lang.String] = js.undefined
  var formNoValidate: js.UndefOr[scala.Boolean] = js.undefined
  var formTarget: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var list: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  @JSName("onChange")
  var onChange_InputHTMLAttributes: js.UndefOr[ChangeEventHandler[T]] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var step: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | js.Array[java.lang.String] | scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object InputHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    accept: java.lang.String = null,
    alt: java.lang.String = null,
    autoComplete: java.lang.String = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    capture: scala.Boolean | java.lang.String = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    crossOrigin: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    form: java.lang.String = null,
    formAction: java.lang.String = null,
    formEncType: java.lang.String = null,
    formMethod: java.lang.String = null,
    formNoValidate: js.UndefOr[scala.Boolean] = js.undefined,
    formTarget: java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    list: java.lang.String = null,
    max: scala.Double | java.lang.String = null,
    maxLength: scala.Int | scala.Double = null,
    min: scala.Double | java.lang.String = null,
    minLength: scala.Int | scala.Double = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onChange: ChangeEventHandler[T] = null,
    pattern: java.lang.String = null,
    placeholder: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    src: java.lang.String = null,
    step: scala.Double | java.lang.String = null,
    `type`: java.lang.String = null,
    value: java.lang.String | js.Array[java.lang.String] | scala.Double = null,
    width: scala.Double | java.lang.String = null
  ): InputHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (form != null) __obj.updateDynamic("form")(form)
    if (formAction != null) __obj.updateDynamic("formAction")(formAction)
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType)
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod)
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate)
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputHTMLAttributes[T]]
  }
}

