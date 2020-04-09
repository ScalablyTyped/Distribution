package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaHTMLAttributes[T] extends HTMLAttributes[T] {
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var cols: js.UndefOr[Double] = js.undefined
  var dirName: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  @JSName("onChange")
  var onChange_TextareaHTMLAttributes: js.UndefOr[ChangeEventHandler[T]] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  var wrap: js.UndefOr[String] = js.undefined
}

object TextareaHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    autoComplete: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    cols: Int | Double = null,
    dirName: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    form: String = null,
    maxLength: Int | Double = null,
    minLength: Int | Double = null,
    name: String = null,
    onChange: ChangeEvent[T] => Unit = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    value: String | js.Array[String] | Double = null,
    wrap: String = null
  ): TextareaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (dirName != null) __obj.updateDynamic("dirName")(dirName.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextareaHTMLAttributes[T]]
  }
}

