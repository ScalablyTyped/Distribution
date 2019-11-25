package typings.reactDashSimpleDashCodeDashEditor

import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoFocus extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var ignoreTabKey: js.UndefOr[Boolean] = js.undefined
  var insertSpaces: js.UndefOr[Boolean] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLTextAreaElement], Unit]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLTextAreaElement, NativeMouseEvent], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLTextAreaElement], Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLTextAreaElement], Unit]] = js.undefined
  var onKeyUp: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLTextAreaElement], Unit]] = js.undefined
  var padding: js.UndefOr[Double | String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabSize: js.UndefOr[Double] = js.undefined
  // Props for the textarea
  var textareaId: js.UndefOr[String] = js.undefined
  // Props for the component
  var value: String
  def highlight(value: String): String | ReactNode
  def onValueChange(value: String): Unit
}

object Anon_AutoFocus {
  @scala.inline
  def apply(
    highlight: String => String | ReactNode,
    onValueChange: String => Unit,
    value: String,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    form: String = null,
    ignoreTabKey: js.UndefOr[Boolean] = js.undefined,
    insertSpaces: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    minLength: Int | Double = null,
    name: String = null,
    onBlur: /* e */ FocusEvent[HTMLTextAreaElement] => Unit = null,
    onClick: /* e */ MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onFocus: /* e */ FocusEvent[HTMLTextAreaElement] => Unit = null,
    onKeyDown: /* e */ KeyboardEvent[HTMLTextAreaElement] => Unit = null,
    onKeyUp: /* e */ KeyboardEvent[HTMLTextAreaElement] => Unit = null,
    padding: Double | String = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tabSize: Int | Double = null,
    textareaId: String = null
  ): Anon_AutoFocus = {
    val __obj = js.Dynamic.literal(highlight = js.Any.fromFunction1(highlight), onValueChange = js.Any.fromFunction1(onValueChange), value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreTabKey)) __obj.updateDynamic("ignoreTabKey")(ignoreTabKey.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaces)) __obj.updateDynamic("insertSpaces")(insertSpaces.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (textareaId != null) __obj.updateDynamic("textareaId")(textareaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoFocus]
  }
}

