package typings.reactDashOnsenui

import typings.react.reactMod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Autofocus extends js.Object {
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[_], Unit]] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Anon_Autofocus {
  @scala.inline
  def apply(
    autofocus: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    form: String = null,
    modifier: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* e */ ChangeEvent[_] => Unit = null,
    required: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    value: String = null
  ): Anon_Autofocus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (form != null) __obj.updateDynamic("form")(form)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (size != null) __obj.updateDynamic("size")(size)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Autofocus]
  }
}

