package typings
package reactDashToolboxLib.libDropdownDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * If true the dropdown will preselect the first item if the supplied value matches none of the options' values.
    * @default true
    */
  var allowBlank: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the dropdown will open up or down depending on the position in the screen.
    * @default true
    */
  var auto: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the component as disabled.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Give an error string to display under the field.
    */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text string to use for the floating label element.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for setting the label from source
    */
  var labelKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name for the input field.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback function that is fired when the component is blurred.
    */
  var onBlur: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback function that is fired when the component's value changes.
    */
  var onChange: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback function that is fired when the component is focused.
    */
  var onFocus: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * If true, the dropdown has a required attribute.
    * @default false
    */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Array of data objects with the data to represent in the dropdown.
    */
  var source: coreDashJsLib.Array[_]
  /**
    * Callback function that returns a JSX template to represent the element.
    */
  var template: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[DropdownTheme] = js.undefined
  /**
    * Default value using JSON data.
    */
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Used for setting the value from source
    */
  var valueKey: js.UndefOr[java.lang.String] = js.undefined
}

object DropdownProps {
  @scala.inline
  def apply(
    source: coreDashJsLib.Array[_],
    allowBlank: js.UndefOr[scala.Boolean] = js.undefined,
    auto: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: java.lang.String = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    label: java.lang.String = null,
    labelKey: java.lang.String = null,
    name: java.lang.String = null,
    onBlur: coreDashJsLib.Function = null,
    onChange: coreDashJsLib.Function = null,
    onClick: coreDashJsLib.Function = null,
    onContextMenu: coreDashJsLib.Function = null,
    onDoubleClick: coreDashJsLib.Function = null,
    onDrag: coreDashJsLib.Function = null,
    onDragEnd: coreDashJsLib.Function = null,
    onDragEnter: coreDashJsLib.Function = null,
    onDragExit: coreDashJsLib.Function = null,
    onDragLeave: coreDashJsLib.Function = null,
    onDragOver: coreDashJsLib.Function = null,
    onDragStart: coreDashJsLib.Function = null,
    onDrop: coreDashJsLib.Function = null,
    onFocus: coreDashJsLib.Function = null,
    onMouseDown: coreDashJsLib.Function = null,
    onMouseEnter: coreDashJsLib.Function = null,
    onMouseLeave: coreDashJsLib.Function = null,
    onMouseMove: coreDashJsLib.Function = null,
    onMouseOut: coreDashJsLib.Function = null,
    onMouseOver: coreDashJsLib.Function = null,
    onMouseUp: coreDashJsLib.Function = null,
    onTouchCancel: coreDashJsLib.Function = null,
    onTouchEnd: coreDashJsLib.Function = null,
    onTouchMove: coreDashJsLib.Function = null,
    onTouchStart: coreDashJsLib.Function = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    template: coreDashJsLib.Function = null,
    theme: DropdownTheme = null,
    value: java.lang.String | scala.Double = null,
    valueKey: java.lang.String = null
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

