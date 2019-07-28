package typings.reactDashMentions.reactDashMentionsMod

import typings.react.Element
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.ReactElement
import typings.react.reactMod.RefObject
import typings.react.reactMod.UIEvent
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
  var children: ReactElement | js.Array[ReactElement]
  var className: js.UndefOr[String] = js.undefined
  var classNames: js.UndefOr[js.Any] = js.undefined
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
  var suggestionsPortalHost: js.UndefOr[typings.std.Element] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object MentionsInputProps {
  @scala.inline
  def apply(
    children: ReactElement | js.Array[ReactElement],
    allowSpaceInQuery: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    classNames: js.Any = null,
    inputRef: RefObject[HTMLInputElement | HTMLTextAreaElement] = null,
    onBlur: (/* event */ FocusEvent[HTMLInputElement | HTMLTextAreaElement], /* clickedSuggestion */ Boolean) => Unit = null,
    onChange: OnChangeHandlerFunc = null,
    onKeyDown: /* event */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onSelect: /* event */ UIEvent[Element] => Unit = null,
    placeholder: String = null,
    singleLine: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    suggestionsPortalHost: typings.std.Element = null,
    value: String = null
  ): MentionsInputProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSpaceInQuery)) __obj.updateDynamic("allowSpaceInQuery")(allowSpaceInQuery)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classNames != null) __obj.updateDynamic("classNames")(classNames)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(singleLine)) __obj.updateDynamic("singleLine")(singleLine)
    if (style != null) __obj.updateDynamic("style")(style)
    if (suggestionsPortalHost != null) __obj.updateDynamic("suggestionsPortalHost")(suggestionsPortalHost)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MentionsInputProps]
  }
}

