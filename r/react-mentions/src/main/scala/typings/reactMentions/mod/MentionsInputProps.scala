package typings.reactMentions.mod

import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactElement
import typings.react.mod.RefObject
import typings.react.mod.UIEvent
import typings.reactMentions.AnonTarget
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.TextareaHTMLAttributes<std.HTMLTextAreaElement>, 'onChange' | 'onBlur' | 'onKeyDown' | 'onSelect'> ]: react.react.TextareaHTMLAttributes<std.HTMLTextAreaElement>[P]} */ trait MentionsInputProps extends js.Object {
  /**
    * If set to `true` spaces will not interrupt matching suggestions
    */
  var allowSpaceInQuery: js.UndefOr[Boolean] = js.undefined
  var allowSuggestionsAboveCursor: js.UndefOr[Boolean] = js.undefined
  var children: ReactElement | js.Array[ReactElement]
  var className: js.UndefOr[String] = js.undefined
  var classNames: js.UndefOr[js.Any] = js.undefined
  var ignoreAccents: js.UndefOr[Boolean] = js.undefined
  var inputRef: js.UndefOr[RefObject[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
  var onBlur: js.UndefOr[
    js.Function2[
      /* event */ FocusEvent[HTMLInputElement | HTMLTextAreaElement], 
      /* clickedSuggestion */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[OnChangeHandlerFunc] = js.undefined
  var onKeyDown: js.UndefOr[
    js.Function1[/* event */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
  ] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* event */ UIEvent[Element], Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * If set to `true` a regular text input element will be rendered
    * instead of a textarea
    */
  var singleLine: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var suggestionsPortalHost: js.UndefOr[Element] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object MentionsInputProps {
  @scala.inline
  def apply(
    children: ReactElement | js.Array[ReactElement],
    allowSpaceInQuery: js.UndefOr[Boolean] = js.undefined,
    allowSuggestionsAboveCursor: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    classNames: js.Any = null,
    ignoreAccents: js.UndefOr[Boolean] = js.undefined,
    inputRef: RefObject[HTMLInputElement | HTMLTextAreaElement] = null,
    onBlur: (/* event */ FocusEvent[HTMLInputElement | HTMLTextAreaElement], /* clickedSuggestion */ Boolean) => Unit = null,
    onChange: (/* event */ AnonTarget, /* newValue */ String, /* newPlainTextValue */ String, /* mentions */ js.Array[MentionItem]) => Unit = null,
    onKeyDown: /* event */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onSelect: /* event */ UIEvent[Element] => Unit = null,
    placeholder: String = null,
    singleLine: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    suggestionsPortalHost: Element = null,
    value: String = null
  ): MentionsInputProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSpaceInQuery)) __obj.updateDynamic("allowSpaceInQuery")(allowSpaceInQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSuggestionsAboveCursor)) __obj.updateDynamic("allowSuggestionsAboveCursor")(allowSuggestionsAboveCursor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreAccents)) __obj.updateDynamic("ignoreAccents")(ignoreAccents.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(singleLine)) __obj.updateDynamic("singleLine")(singleLine.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suggestionsPortalHost != null) __obj.updateDynamic("suggestionsPortalHost")(suggestionsPortalHost.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionsInputProps]
  }
}

