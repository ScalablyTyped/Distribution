package typings
package reactDashMdLib.libSlidersSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps
  extends reactDashMdLib.libMod.Props {
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var discrete: js.UndefOr[scala.Boolean] = js.undefined
  var discreteInkTransitionTime: js.UndefOr[scala.Double] = js.undefined
  var discreteTicks: js.UndefOr[scala.Double] = js.undefined
  var discreteValueClassName: js.UndefOr[java.lang.String] = js.undefined
  var discreteValueStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var inputWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var leftIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* value */ scala.Double, /* event */ reactLib.Event, scala.Unit]] = js.undefined
  var onDragChange: js.UndefOr[
    js.Function3[
      /* dragPercentage */ scala.Double, 
      /* value */ scala.Double, 
      /* event */ reactLib.Event, 
      scala.Unit
    ]
  ] = js.undefined
  var rightIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var thumbClassName: js.UndefOr[java.lang.String] = js.undefined
  var thumbStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tickWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var trackClassName: js.UndefOr[java.lang.String] = js.undefined
  var trackFillClassName: js.UndefOr[java.lang.String] = js.undefined
  var trackFillStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var trackStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
  var valuePrecision: js.UndefOr[scala.Double] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    defaultValue: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    discrete: js.UndefOr[scala.Boolean] = js.undefined,
    discreteInkTransitionTime: scala.Int | scala.Double = null,
    discreteTicks: scala.Int | scala.Double = null,
    discreteValueClassName: java.lang.String = null,
    discreteValueStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    id: reactDashMdLib.libMod.IdPropType = null,
    inputWidth: scala.Double | java.lang.String = null,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    leftIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    onBlur: js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit] = null,
    onChange: js.Function2[/* value */ scala.Double, /* event */ reactLib.Event, scala.Unit] = null,
    onClick: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onDrag: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragChange: js.Function3[
      /* dragPercentage */ scala.Double, 
      /* value */ scala.Double, 
      /* event */ reactLib.Event, 
      scala.Unit
    ] = null,
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
    rightIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    step: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    thumbClassName: java.lang.String = null,
    thumbStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    tickWidth: scala.Double | java.lang.String = null,
    trackClassName: java.lang.String = null,
    trackFillClassName: java.lang.String = null,
    trackFillStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    trackStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    value: scala.Int | scala.Double = null,
    valuePrecision: scala.Int | scala.Double = null
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(discrete)) __obj.updateDynamic("discrete")(discrete)
    if (discreteInkTransitionTime != null) __obj.updateDynamic("discreteInkTransitionTime")(discreteInkTransitionTime.asInstanceOf[js.Any])
    if (discreteTicks != null) __obj.updateDynamic("discreteTicks")(discreteTicks.asInstanceOf[js.Any])
    if (discreteValueClassName != null) __obj.updateDynamic("discreteValueClassName")(discreteValueClassName)
    if (discreteValueStyle != null) __obj.updateDynamic("discreteValueStyle")(discreteValueStyle)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputWidth != null) __obj.updateDynamic("inputWidth")(inputWidth.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragChange != null) __obj.updateDynamic("onDragChange")(onDragChange)
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
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (thumbClassName != null) __obj.updateDynamic("thumbClassName")(thumbClassName)
    if (thumbStyle != null) __obj.updateDynamic("thumbStyle")(thumbStyle)
    if (tickWidth != null) __obj.updateDynamic("tickWidth")(tickWidth.asInstanceOf[js.Any])
    if (trackClassName != null) __obj.updateDynamic("trackClassName")(trackClassName)
    if (trackFillClassName != null) __obj.updateDynamic("trackFillClassName")(trackFillClassName)
    if (trackFillStyle != null) __obj.updateDynamic("trackFillStyle")(trackFillStyle)
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valuePrecision != null) __obj.updateDynamic("valuePrecision")(valuePrecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

