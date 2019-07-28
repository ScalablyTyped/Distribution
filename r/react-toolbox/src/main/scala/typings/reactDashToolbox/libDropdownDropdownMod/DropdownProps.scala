package typings.reactDashToolbox.libDropdownDropdownMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.reactDashToolbox.libMod.ReactToolboxNs.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownProps extends Props {
  /**
    * If true the dropdown will preselect the first item if the supplied value matches none of the options' values.
    * @default true
    */
  var allowBlank: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the dropdown will open up or down depending on the position in the screen.
    * @default true
    */
  var auto: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the component as disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Give an error string to display under the field.
    */
  var error: js.UndefOr[String] = js.undefined
  /**
    * The text string to use for the floating label element.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Used for setting the label from source
    */
  var labelKey: js.UndefOr[String] = js.undefined
  /**
    * Name for the input field.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Callback function that is fired when the component is blurred.
    */
  var onBlur: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback function that is fired when the component's value changes.
    */
  var onChange: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback function that is fired when the component is focused.
    */
  var onFocus: js.UndefOr[js.Function] = js.undefined
  /**
    * If true, the dropdown has a required attribute.
    * @default false
    */
  var required: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of data objects with the data to represent in the dropdown.
    */
  var source: js.Array[_]
  /**
    * Callback function that returns a JSX template to represent the element.
    */
  var template: js.UndefOr[js.Function] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[DropdownTheme] = js.undefined
  /**
    * Default value using JSON data.
    */
  var value: js.UndefOr[String | Double] = js.undefined
  /**
    * Used for setting the value from source
    */
  var valueKey: js.UndefOr[String] = js.undefined
}

object DropdownProps {
  @scala.inline
  def apply(
    source: js.Array[_],
    allowBlank: js.UndefOr[Boolean] = js.undefined,
    auto: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    key: Key = null,
    label: String = null,
    labelKey: String = null,
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
    onMouseDown: js.Function = null,
    onMouseEnter: js.Function = null,
    onMouseLeave: js.Function = null,
    onMouseMove: js.Function = null,
    onMouseOut: js.Function = null,
    onMouseOver: js.Function = null,
    onMouseUp: js.Function = null,
    onTouchCancel: js.Function = null,
    onTouchEnd: js.Function = null,
    onTouchMove: js.Function = null,
    onTouchStart: js.Function = null,
    required: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    template: js.Function = null,
    theme: DropdownTheme = null,
    value: String | Double = null,
    valueKey: String = null
  ): DropdownProps = {
    val __obj = js.Dynamic.literal(source = source)
    if (!js.isUndefined(allowBlank)) __obj.updateDynamic("allowBlank")(allowBlank)
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (error != null) __obj.updateDynamic("error")(error)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey)
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
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (style != null) __obj.updateDynamic("style")(style)
    if (template != null) __obj.updateDynamic("template")(template)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey)
    __obj.asInstanceOf[DropdownProps]
  }
}

