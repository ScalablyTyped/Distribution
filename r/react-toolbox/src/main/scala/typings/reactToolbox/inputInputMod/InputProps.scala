package typings.reactToolbox.inputInputMod

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.reactToolbox.componentsMod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProps extends Props {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * If true, component will be disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Give an error node to display under the field.
    */
  var error: js.UndefOr[ReactNode] = js.undefined
  /**
    * Indicates if the label is floating in the input field or not.
    * @default true
    */
  var floating: js.UndefOr[Boolean] = js.undefined
  /**
    * The text string to use for hint text element.
    */
  var hint: js.UndefOr[ReactNode] = js.undefined
  /**
    * Name of an icon to use as a label for the input.
    */
  var icon: js.UndefOr[ReactNode] = js.undefined
  /**
    * The text string to use for the floating label element.
    */
  var label: js.UndefOr[ReactNode] = js.undefined
  /**
    * Specifies the maximum number of characters allowed in the component
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * If true, a textarea element will be rendered. The textarea also grows and shrinks according to the number of lines.
    * @default false
    */
  var multiline: js.UndefOr[Boolean] = js.undefined
  /**
    * Name for the input field.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Callback function that is fired when component is blurred.
    */
  var onBlur: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback function that is fired when the component's value changes
    */
  var onChange: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback function that is fired when component is focused.
    */
  var onFocus: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback function that is fired when a key is pressed down.
    */
  var onKeyDown: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback function that is fired when a key is pressed.
    */
  var onKeyPress: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback function that is fired when a key is released.
    */
  var onKeyUp: js.UndefOr[js.Function] = js.undefined
  /**
    * If true, the html input has a required attribute.
    * @default false
    */
  var required: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of rows the multiline input field has.
    */
  var rows: js.UndefOr[Double] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[InputTheme] = js.undefined
  /**
    * Type of the input element. It can be a valid HTML5 input type.
    * @default "text"
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Current value of the input element.
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object InputProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: ReactNode = null,
    floating: js.UndefOr[Boolean] = js.undefined,
    hint: ReactNode = null,
    icon: ReactNode = null,
    key: Key = null,
    label: ReactNode = null,
    maxLength: js.UndefOr[Double] = js.undefined,
    multiline: js.UndefOr[Boolean] = js.undefined,
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
    onTouchCancel: js.Function = null,
    onTouchEnd: js.Function = null,
    onTouchMove: js.Function = null,
    onTouchStart: js.Function = null,
    required: js.UndefOr[Boolean] = js.undefined,
    rows: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    theme: InputTheme = null,
    `type`: String = null,
    value: js.Any = null
  ): InputProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating.get.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.get.asInstanceOf[js.Any])
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
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps]
  }
}

