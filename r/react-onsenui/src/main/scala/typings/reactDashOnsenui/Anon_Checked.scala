package typings.reactDashOnsenui

import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Checked extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var float: js.UndefOr[Boolean] = js.undefined
  var inputId: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[_], Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[_], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[_], Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Anon_Checked {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    float: js.UndefOr[Boolean] = js.undefined,
    inputId: String = null,
    modifier: String = null,
    name: String = null,
    onBlur: /* e */ FocusEvent[_] => Unit = null,
    onChange: /* e */ ChangeEvent[_] => Unit = null,
    onFocus: /* e */ FocusEvent[_] => Unit = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    value: String = null
  ): Anon_Checked = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(float)) __obj.updateDynamic("float")(float)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Checked]
  }
}

