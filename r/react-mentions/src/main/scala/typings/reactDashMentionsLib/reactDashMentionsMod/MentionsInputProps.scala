package typings
package reactDashMentionsLib.reactDashMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionsInputProps extends js.Object {
  /**
    * If set to `true` spaces will not interrupt matching suggestions
    */
  var allowSpaceInQuery: js.UndefOr[scala.Boolean] = js.undefined
  var children: reactLib.reactMod.ReactNs.ReactElement[MentionProps] | js.Array[reactLib.reactMod.ReactNs.ReactElement[MentionProps]]
  var className: js.UndefOr[java.lang.String] = js.undefined
  var displayTransform: js.UndefOr[DisplayTransformFunc] = js.undefined
  var inputRef: js.UndefOr[
    reactLib.reactMod.ReactNs.RefObject[reactLib.HTMLTextAreaElement] | reactLib.reactMod.ReactNs.RefObject[reactLib.HTMLInputElement]
  ] = js.undefined
  var markup: js.UndefOr[java.lang.String] = js.undefined
  var onBlur: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLInputElement] | reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLTextAreaElement], 
      /* clickedSuggestion */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[OnChangeHandlerFunc] = js.undefined
  var onKeyDown: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLTextAreaElement] | reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLInputElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onSelect: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.UIEvent[reactLib.Element], scala.Unit]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var regex: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * If set to `true` a regular text input element will be rendered
    * instead of a textarea
    */
  var singleLine: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var suggestionsPortalHost: js.UndefOr[reactLib.Element] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object MentionsInputProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactElement[MentionProps] | js.Array[reactLib.reactMod.ReactNs.ReactElement[MentionProps]],
    allowSpaceInQuery: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    displayTransform: DisplayTransformFunc = null,
    inputRef: reactLib.reactMod.ReactNs.RefObject[reactLib.HTMLTextAreaElement] | reactLib.reactMod.ReactNs.RefObject[reactLib.HTMLInputElement] = null,
    markup: java.lang.String = null,
    onBlur: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLInputElement] | reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLTextAreaElement], 
      /* clickedSuggestion */ scala.Boolean, 
      scala.Unit
    ] = null,
    onChange: OnChangeHandlerFunc = null,
    onKeyDown: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLTextAreaElement] | reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLInputElement], 
      scala.Unit
    ] = null,
    onSelect: js.Function1[/* event */ reactLib.reactMod.ReactNs.UIEvent[reactLib.Element], scala.Unit] = null,
    placeholder: java.lang.String = null,
    regex: stdLib.RegExp = null,
    singleLine: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Any = null,
    suggestionsPortalHost: reactLib.Element = null,
    value: java.lang.String = null
  ): MentionsInputProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSpaceInQuery)) __obj.updateDynamic("allowSpaceInQuery")(allowSpaceInQuery)
    if (className != null) __obj.updateDynamic("className")(className)
    if (displayTransform != null) __obj.updateDynamic("displayTransform")(displayTransform)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (markup != null) __obj.updateDynamic("markup")(markup)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (!js.isUndefined(singleLine)) __obj.updateDynamic("singleLine")(singleLine)
    if (style != null) __obj.updateDynamic("style")(style)
    if (suggestionsPortalHost != null) __obj.updateDynamic("suggestionsPortalHost")(suggestionsPortalHost)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MentionsInputProps]
  }
}

