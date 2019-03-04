package typings
package reactDashMdLib.libSelectionControlsRadioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioProps
  extends reactDashMdLib.libSelectionControlsSelectionControlMod.BaseSelectionControlProps {
  var checkedIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var checkedIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var checkedIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* value */ scala.Double | java.lang.String, /* event */ reactLib.Event, scala.Unit]
  ] = js.undefined
  var uncheckedIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var uncheckedIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var uncheckedIconClassName: js.UndefOr[java.lang.String] = js.undefined
}

object RadioProps {
  @scala.inline
  def apply(
    id: reactDashMdLib.libMod.IdPropType,
    name: scala.Double | java.lang.String,
    `aria-label`: java.lang.String = null,
    `aria-labelledby`: reactDashMdLib.libMod.IdPropType = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    checkedIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    checkedIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    checkedIconClassName: java.lang.String = null,
    className: java.lang.String = null,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    labelBefore: js.UndefOr[scala.Boolean] = js.undefined,
    onBlur: js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit] = null,
    onChange: js.Function2[/* value */ scala.Double | java.lang.String, /* event */ reactLib.Event, scala.Unit] = null,
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
    uncheckedIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    uncheckedIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    uncheckedIconClassName: java.lang.String = null,
    value: scala.Double | java.lang.String = null
  ): RadioProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon.asInstanceOf[js.Any])
    if (checkedIconChildren != null) __obj.updateDynamic("checkedIconChildren")(checkedIconChildren.asInstanceOf[js.Any])
    if (checkedIconClassName != null) __obj.updateDynamic("checkedIconClassName")(checkedIconClassName)
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
    if (uncheckedIcon != null) __obj.updateDynamic("uncheckedIcon")(uncheckedIcon.asInstanceOf[js.Any])
    if (uncheckedIconChildren != null) __obj.updateDynamic("uncheckedIconChildren")(uncheckedIconChildren.asInstanceOf[js.Any])
    if (uncheckedIconClassName != null) __obj.updateDynamic("uncheckedIconClassName")(uncheckedIconClassName)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioProps]
  }
}

