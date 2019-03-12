package typings
package reactDashToolboxLib.libAutocompleteAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteProps
  extends reactDashToolboxLib.libInputInputMod.InputProps
     with /**
  * Additional properties passed to inner Input component.
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Determines if user can create a new option with the current typed value.
    * @default false
    */
  var allowCreate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determines the opening direction. It can be auto, up or down.
    * @default auto
    */
  var direction: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.auto | reactDashToolboxLib.reactDashToolboxLibStrings.up | reactDashToolboxLib.reactDashToolboxLibStrings.down
  ] = js.undefined
  /**
    * Whether component should keep focus after value change.
    * @default false
    */
  var keepFocusOnChange: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, component can hold multiple values.
    * @default true
    */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Callback function that is fired when the components's query value changes.
    */
  var onQueryChange: js.UndefOr[js.Function] = js.undefined
  /**
    * Determines if the selected list is shown above or below input. It can be above or below.
    * @default above
    */
  var selectedPosition: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.above | reactDashToolboxLib.reactDashToolboxLibStrings.below | reactDashToolboxLib.reactDashToolboxLibStrings.none
  ] = js.undefined
  /**
    * Determines if the selected list is shown if the `value` keys don't exist in the source. Only works if passing the `value` prop as an Object.
    * @default false
    */
  var showSelectedWhenNotInSource: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the list of suggestions will not be filtered when a value is selected.
    * @default false
    */
  var showSuggestionsWhenValueIsSet: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Object of key/values or array representing all items suggested.
    */
  var source: js.UndefOr[js.Any] = js.undefined
  /**
    * Determines how suggestions are supplied.
    * @default start
    */
  var suggestionMatch: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.disabled | reactDashToolboxLib.reactDashToolboxLibStrings.start | reactDashToolboxLib.reactDashToolboxLibStrings.anywhere | reactDashToolboxLib.reactDashToolboxLibStrings.word
  ] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  @JSName("theme")
  var theme_AutocompleteProps: js.UndefOr[AutocompleteTheme with reactDashToolboxLib.libInputInputMod.InputTheme] = js.undefined
}

object AutocompleteProps {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Additional properties passed to inner Input component.
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    allowCreate: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    direction: reactDashToolboxLib.reactDashToolboxLibStrings.auto | reactDashToolboxLib.reactDashToolboxLibStrings.up | reactDashToolboxLib.reactDashToolboxLibStrings.down = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: reactLib.reactMod.ReactNs.ReactNode = null,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    hint: reactLib.reactMod.ReactNs.ReactNode = null,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    keepFocusOnChange: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.ReactNs.Key = null,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    maxLength: scala.Int | scala.Double = null,
    multiline: js.UndefOr[scala.Boolean] = js.undefined,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onBlur: js.Function = null,
    onChange: js.Function = null,
    onClick: js.Function = null,
    onContextMenu: js.Function = null,
    onDoubleClick: js.Function = null,
    onDrag: js.Function = null,
    onDragEnd: js.Function = null,
    onDragEnter: js.Function = null,
    onDragExit: js.Function = null,
    onDragLeave: js.Function = null,
    onDragOver: js.Function = null,
    onDragStart: js.Function = null,
    onDrop: js.Function = null,
    onFocus: js.Function = null,
    onKeyDown: js.Function = null,
    onKeyPress: js.Function = null,
    onKeyUp: js.Function = null,
    onMouseDown: js.Function = null,
    onMouseEnter: js.Function = null,
    onMouseLeave: js.Function = null,
    onMouseMove: js.Function = null,
    onMouseOut: js.Function = null,
    onMouseOver: js.Function = null,
    onMouseUp: js.Function = null,
    onQueryChange: js.Function = null,
    onTouchCancel: js.Function = null,
    onTouchEnd: js.Function = null,
    onTouchMove: js.Function = null,
    onTouchStart: js.Function = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    rows: scala.Int | scala.Double = null,
    selectedPosition: reactDashToolboxLib.reactDashToolboxLibStrings.above | reactDashToolboxLib.reactDashToolboxLibStrings.below | reactDashToolboxLib.reactDashToolboxLibStrings.none = null,
    showSelectedWhenNotInSource: js.UndefOr[scala.Boolean] = js.undefined,
    showSuggestionsWhenValueIsSet: js.UndefOr[scala.Boolean] = js.undefined,
    source: js.Any = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    suggestionMatch: reactDashToolboxLib.reactDashToolboxLibStrings.disabled | reactDashToolboxLib.reactDashToolboxLibStrings.start | reactDashToolboxLib.reactDashToolboxLibStrings.anywhere | reactDashToolboxLib.reactDashToolboxLibStrings.word = null,
    theme: AutocompleteTheme with reactDashToolboxLib.libInputInputMod.InputTheme = null,
    `type`: java.lang.String = null,
    value: js.Any = null
  ): AutocompleteProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowCreate)) __obj.updateDynamic("allowCreate")(allowCreate)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(keepFocusOnChange)) __obj.updateDynamic("keepFocusOnChange")(keepFocusOnChange)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onQueryChange != null) __obj.updateDynamic("onQueryChange")(onQueryChange)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (selectedPosition != null) __obj.updateDynamic("selectedPosition")(selectedPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(showSelectedWhenNotInSource)) __obj.updateDynamic("showSelectedWhenNotInSource")(showSelectedWhenNotInSource)
    if (!js.isUndefined(showSuggestionsWhenValueIsSet)) __obj.updateDynamic("showSuggestionsWhenValueIsSet")(showSuggestionsWhenValueIsSet)
    if (source != null) __obj.updateDynamic("source")(source)
    if (style != null) __obj.updateDynamic("style")(style)
    if (suggestionMatch != null) __obj.updateDynamic("suggestionMatch")(suggestionMatch.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AutocompleteProps]
  }
}

