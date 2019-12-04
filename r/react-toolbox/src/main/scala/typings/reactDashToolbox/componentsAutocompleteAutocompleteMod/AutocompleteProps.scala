package typings.reactDashToolbox.componentsAutocompleteAutocompleteMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.ReactNode
import typings.reactDashToolbox.componentsInputInputMod.InputProps
import typings.reactDashToolbox.componentsInputInputMod.InputTheme
import typings.reactDashToolbox.reactDashToolboxStrings.above
import typings.reactDashToolbox.reactDashToolboxStrings.anywhere
import typings.reactDashToolbox.reactDashToolboxStrings.auto
import typings.reactDashToolbox.reactDashToolboxStrings.below
import typings.reactDashToolbox.reactDashToolboxStrings.disabled
import typings.reactDashToolbox.reactDashToolboxStrings.down
import typings.reactDashToolbox.reactDashToolboxStrings.none
import typings.reactDashToolbox.reactDashToolboxStrings.start
import typings.reactDashToolbox.reactDashToolboxStrings.up
import typings.reactDashToolbox.reactDashToolboxStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteProps
  extends InputProps
     with /**
  * Additional properties passed to inner Input component.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Determines if user can create a new option with the current typed value.
    * @default false
    */
  var allowCreate: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines the opening direction. It can be auto, up or down.
    * @default auto
    */
  var direction: js.UndefOr[auto | up | down] = js.undefined
  /**
    * Whether component should keep focus after value change.
    * @default false
    */
  var keepFocusOnChange: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, component can hold multiple values.
    * @default true
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback function that is fired when the components's query value changes.
    */
  var onQueryChange: js.UndefOr[js.Function] = js.undefined
  /**
    * Determines if the selected list is shown above or below input. It can be above or below.
    * @default above
    */
  var selectedPosition: js.UndefOr[above | below | none] = js.undefined
  /**
    * Determines if the selected list is shown if the `value` keys don't exist in the source. Only works if passing the `value` prop as an Object.
    * @default false
    */
  var showSelectedWhenNotInSource: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the list of suggestions will not be filtered when a value is selected.
    * @default false
    */
  var showSuggestionsWhenValueIsSet: js.UndefOr[Boolean] = js.undefined
  /**
    * Object of key/values or array representing all items suggested.
    */
  var source: js.UndefOr[js.Any] = js.undefined
  /**
    * Determines how suggestions are supplied.
    * @default start
    */
  var suggestionMatch: js.UndefOr[disabled | start | anywhere | word] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  @JSName("theme")
  var theme_AutocompleteProps: js.UndefOr[AutocompleteTheme with InputTheme] = js.undefined
}

object AutocompleteProps {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Additional properties passed to inner Input component.
    */
  /* key */ StringDictionary[js.Any] = null,
    allowCreate: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    direction: auto | up | down = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: ReactNode = null,
    floating: js.UndefOr[Boolean] = js.undefined,
    hint: ReactNode = null,
    icon: ReactNode = null,
    keepFocusOnChange: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    label: ReactNode = null,
    maxLength: Int | Double = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
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
    required: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    selectedPosition: above | below | none = null,
    showSelectedWhenNotInSource: js.UndefOr[Boolean] = js.undefined,
    showSuggestionsWhenValueIsSet: js.UndefOr[Boolean] = js.undefined,
    source: js.Any = null,
    style: CSSProperties = null,
    suggestionMatch: disabled | start | anywhere | word = null,
    theme: AutocompleteTheme with InputTheme = null,
    `type`: String = null,
    value: js.Any = null
  ): AutocompleteProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowCreate)) __obj.updateDynamic("allowCreate")(allowCreate.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(keepFocusOnChange)) __obj.updateDynamic("keepFocusOnChange")(keepFocusOnChange.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter.asInstanceOf[js.Any])
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit.asInstanceOf[js.Any])
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave.asInstanceOf[js.Any])
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown.asInstanceOf[js.Any])
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress.asInstanceOf[js.Any])
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter.asInstanceOf[js.Any])
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove.asInstanceOf[js.Any])
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut.asInstanceOf[js.Any])
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver.asInstanceOf[js.Any])
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp.asInstanceOf[js.Any])
    if (onQueryChange != null) __obj.updateDynamic("onQueryChange")(onQueryChange.asInstanceOf[js.Any])
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (selectedPosition != null) __obj.updateDynamic("selectedPosition")(selectedPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(showSelectedWhenNotInSource)) __obj.updateDynamic("showSelectedWhenNotInSource")(showSelectedWhenNotInSource.asInstanceOf[js.Any])
    if (!js.isUndefined(showSuggestionsWhenValueIsSet)) __obj.updateDynamic("showSuggestionsWhenValueIsSet")(showSuggestionsWhenValueIsSet.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suggestionMatch != null) __obj.updateDynamic("suggestionMatch")(suggestionMatch.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteProps]
  }
}

