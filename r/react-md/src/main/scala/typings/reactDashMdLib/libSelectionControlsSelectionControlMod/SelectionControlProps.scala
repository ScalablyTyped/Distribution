package typings
package reactDashMdLib.libSelectionControlsSelectionControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionControlProps extends BaseSelectionControlProps {
  var checkedCheckboxIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var checkedCheckboxIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var checkedCheckboxIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var checkedRadioIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var checkedRadioIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var checkedRadioIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* result */ scala.Boolean | scala.Double | java.lang.String, 
      /* event */ reactLib.Event, 
      scala.Unit
    ]
  ] = js.undefined
  var `type`: Types
  var uncheckedCheckboxIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var uncheckedCheckboxIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var uncheckedCheckboxIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var uncheckedRadioIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var uncheckedRadioIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var uncheckedRadioIconClassName: js.UndefOr[java.lang.String] = js.undefined
}

object SelectionControlProps {
  @scala.inline
  def apply(
    id: reactDashMdLib.libMod.IdPropType,
    name: scala.Double | java.lang.String,
    `type`: Types,
    `aria-label`: java.lang.String = null,
    `aria-labelledby`: reactDashMdLib.libMod.IdPropType = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    checkedCheckboxIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    checkedCheckboxIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    checkedCheckboxIconClassName: java.lang.String = null,
    checkedRadioIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    checkedRadioIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    checkedRadioIconClassName: java.lang.String = null,
    className: java.lang.String = null,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    labelBefore: js.UndefOr[scala.Boolean] = js.undefined,
    onBlur: js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit] = null,
    onChange: js.Function2[
      /* result */ scala.Boolean | scala.Double | java.lang.String, 
      /* event */ reactLib.Event, 
      scala.Unit
    ] = null,
    onClick: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onDrag: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragEnd: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragEnter: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragExit: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragLeave: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragOver: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragStart: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDrop: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onFocus: js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit] = null,
    onKeyDown: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      scala.Unit
    ] = null,
    onKeyUp: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      scala.Unit
    ] = null,
    onMouseDown: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseEnter: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseLeave: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseMove: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseOut: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseOver: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseUp: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onTouchCancel: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchEnd: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchMove: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchStart: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    uncheckedCheckboxIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    uncheckedCheckboxIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    uncheckedCheckboxIconClassName: java.lang.String = null,
    uncheckedRadioIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    uncheckedRadioIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    uncheckedRadioIconClassName: java.lang.String = null,
    value: scala.Double | java.lang.String = null
  ): SelectionControlProps = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (checkedCheckboxIcon != null) __obj.updateDynamic("checkedCheckboxIcon")(checkedCheckboxIcon)
    if (checkedCheckboxIconChildren != null) __obj.updateDynamic("checkedCheckboxIconChildren")(checkedCheckboxIconChildren.asInstanceOf[js.Any])
    if (checkedCheckboxIconClassName != null) __obj.updateDynamic("checkedCheckboxIconClassName")(checkedCheckboxIconClassName)
    if (checkedRadioIcon != null) __obj.updateDynamic("checkedRadioIcon")(checkedRadioIcon)
    if (checkedRadioIconChildren != null) __obj.updateDynamic("checkedRadioIconChildren")(checkedRadioIconChildren.asInstanceOf[js.Any])
    if (checkedRadioIconClassName != null) __obj.updateDynamic("checkedRadioIconClassName")(checkedRadioIconClassName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelBefore)) __obj.updateDynamic("labelBefore")(labelBefore)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
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
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
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
    if (style != null) __obj.updateDynamic("style")(style)
    if (uncheckedCheckboxIcon != null) __obj.updateDynamic("uncheckedCheckboxIcon")(uncheckedCheckboxIcon)
    if (uncheckedCheckboxIconChildren != null) __obj.updateDynamic("uncheckedCheckboxIconChildren")(uncheckedCheckboxIconChildren.asInstanceOf[js.Any])
    if (uncheckedCheckboxIconClassName != null) __obj.updateDynamic("uncheckedCheckboxIconClassName")(uncheckedCheckboxIconClassName)
    if (uncheckedRadioIcon != null) __obj.updateDynamic("uncheckedRadioIcon")(uncheckedRadioIcon)
    if (uncheckedRadioIconChildren != null) __obj.updateDynamic("uncheckedRadioIconChildren")(uncheckedRadioIconChildren.asInstanceOf[js.Any])
    if (uncheckedRadioIconClassName != null) __obj.updateDynamic("uncheckedRadioIconClassName")(uncheckedRadioIconClassName)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionControlProps]
  }
}

