package typings
package reactDashMentionsLib.reactDashMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.TextareaHTMLAttributes<std.HTMLTextAreaElement>, 'onChange' | 'onBlur' | 'onKeyDown' | 'onSelect'> ]: react.react.TextareaHTMLAttributes<std.HTMLTextAreaElement>[P]} */ trait MentionsInputProps extends js.Object {
  /**
    * If set to `true` spaces will not interrupt matching suggestions
    */
  var allowSpaceInQuery: js.UndefOr[scala.Boolean] = js.undefined
  var children: reactLib.reactMod.ReactElement[MentionProps] | js.Array[reactLib.reactMod.ReactElement[MentionProps]]
  var className: js.UndefOr[java.lang.String] = js.undefined
  var classNames: js.UndefOr[js.Any] = js.undefined
  var inputRef: js.UndefOr[
    reactLib.reactMod.RefObject[stdLib.HTMLInputElement | stdLib.HTMLTextAreaElement]
  ] = js.undefined
  var onBlur: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.FocusEvent[stdLib.HTMLInputElement | stdLib.HTMLTextAreaElement], 
      /* clickedSuggestion */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[OnChangeHandlerFunc] = js.undefined
  var onKeyDown: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLInputElement | stdLib.HTMLTextAreaElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onSelect: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.UIEvent[reactLib.Element], scala.Unit]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set to `true` a regular text input element will be rendered
    * instead of a textarea
    */
  var singleLine: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var suggestionsPortalHost: js.UndefOr[stdLib.Element] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object MentionsInputProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactElement[MentionProps] | js.Array[reactLib.reactMod.ReactElement[MentionProps]],
    allowSpaceInQuery: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    classNames: js.Any = null,
    inputRef: reactLib.reactMod.RefObject[stdLib.HTMLInputElement | stdLib.HTMLTextAreaElement] = null,
    onBlur: (/* event */ reactLib.reactMod.FocusEvent[stdLib.HTMLInputElement | stdLib.HTMLTextAreaElement], /* clickedSuggestion */ scala.Boolean) => scala.Unit = null,
    onChange: OnChangeHandlerFunc = null,
    onKeyDown: /* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLInputElement | stdLib.HTMLTextAreaElement] => scala.Unit = null,
    onSelect: /* event */ reactLib.reactMod.UIEvent[reactLib.Element] => scala.Unit = null,
    placeholder: java.lang.String = null,
    singleLine: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Any = null,
    suggestionsPortalHost: stdLib.Element = null,
    value: java.lang.String = null
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

