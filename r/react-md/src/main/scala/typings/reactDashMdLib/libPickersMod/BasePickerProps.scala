package typings
package reactDashMdLib.libPickersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePickerProps
  extends reactDashMdLib.libMod.Props
     with reactDashMdLib.libTextFieldsTextFieldMod.SharedTextFieldProps {
  var DateTimeFormat: js.UndefOr[
    js.Function2[
      /* locales */ js.UndefOr[Locales | js.Array[Locales]], 
      /* options */ js.UndefOr[IntlFormat], 
      reactDashMdLib.Anon_Date
    ]
  ] = js.undefined
  var animateInline: js.UndefOr[scala.Boolean] = js.undefined
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  var autoOk: js.UndefOr[scala.Boolean] = js.undefined
  var cancelLabel: js.UndefOr[java.lang.String] = js.undefined
  var cancelPrimary: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var disableScrollLocking: js.UndefOr[scala.Boolean] = js.undefined
  var displayMode: js.UndefOr[
    reactDashMdLib.reactDashMdLibStrings.landscape | reactDashMdLib.reactDashMdLibStrings.portrait
  ] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var id: reactDashMdLib.libMod.IdPropType
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var lastChild: js.UndefOr[scala.Boolean] = js.undefined
  var locales: js.UndefOr[Locales] = js.undefined
  var okLabel: js.UndefOr[java.lang.String] = js.undefined
  var okPrimary: js.UndefOr[scala.Boolean] = js.undefined
  var onVisibilityChange: js.UndefOr[
    js.Function2[/* visible */ scala.Boolean, /* event */ reactLib.Event, scala.Unit]
  ] = js.undefined
  var pickerClassName: js.UndefOr[java.lang.String] = js.undefined
  var pickerContentClassName: js.UndefOr[java.lang.String] = js.undefined
  var pickerFooterClassName: js.UndefOr[java.lang.String] = js.undefined
  var pickerHeaderClassName: js.UndefOr[java.lang.String] = js.undefined
  var pickerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var portal: js.UndefOr[scala.Boolean] = js.undefined
  var renderNode: js.UndefOr[js.Object] = js.undefined
  var textFieldClassName: js.UndefOr[java.lang.String] = js.undefined
  var textFieldStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object BasePickerProps {
  @scala.inline
  def apply(
    id: reactDashMdLib.libMod.IdPropType,
    DateTimeFormat: js.Function2[
      /* locales */ js.UndefOr[Locales | js.Array[Locales]], 
      /* options */ js.UndefOr[IntlFormat], 
      reactDashMdLib.Anon_Date
    ] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    animateInline: js.UndefOr[scala.Boolean] = js.undefined,
    `aria-label`: java.lang.String = null,
    autoOk: js.UndefOr[scala.Boolean] = js.undefined,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    cancelLabel: java.lang.String = null,
    cancelPrimary: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    customSize: java.lang.String = null,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    disableScrollLocking: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    displayMode: reactDashMdLib.reactDashMdLibStrings.landscape | reactDashMdLib.reactDashMdLibStrings.portrait = null,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    errorText: reactLib.reactMod.ReactNs.ReactNode = null,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    helpOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    helpText: reactLib.reactMod.ReactNs.ReactNode = null,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    inlineIndicator: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    inputClassName: java.lang.String = null,
    inputStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    lastChild: js.UndefOr[scala.Boolean] = js.undefined,
    leftIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    leftIconStateful: js.UndefOr[scala.Boolean] = js.undefined,
    lineDirection: reactDashMdLib.libTextFieldsTextFieldMod.TextFieldLineDirections = null,
    locales: Locales = null,
    max: scala.Int | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    maxRows: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    name: scala.Double | java.lang.String = null,
    okLabel: java.lang.String = null,
    okPrimary: js.UndefOr[scala.Boolean] = js.undefined,
    onBlur: js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit] = null,
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
    onVisibilityChange: js.Function2[/* visible */ scala.Boolean, /* event */ reactLib.Event, scala.Unit] = null,
    paddedBlock: js.UndefOr[scala.Boolean] = js.undefined,
    passwordIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    passwordIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    passwordIconClassName: java.lang.String = null,
    passwordInitiallyVisible: js.UndefOr[scala.Boolean] = js.undefined,
    pattern: java.lang.String = null,
    pickerClassName: java.lang.String = null,
    pickerContentClassName: java.lang.String = null,
    pickerFooterClassName: java.lang.String = null,
    pickerHeaderClassName: java.lang.String = null,
    pickerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    placeholder: java.lang.String = null,
    portal: js.UndefOr[scala.Boolean] = js.undefined,
    renderNode: js.Object = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    resize: reactDashMdLib.Anon_DisableShrink = null,
    rightIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    rightIconStateful: js.UndefOr[scala.Boolean] = js.undefined,
    rows: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    textFieldClassName: java.lang.String = null,
    textFieldStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    `type`: reactDashMdLib.libTextFieldsTextFieldMod.TextFieldTypes = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): BasePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (DateTimeFormat != null) __obj.updateDynamic("DateTimeFormat")(DateTimeFormat)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(animateInline)) __obj.updateDynamic("animateInline")(animateInline)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel)
    if (!js.isUndefined(cancelPrimary)) __obj.updateDynamic("cancelPrimary")(cancelPrimary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc)
    if (customSize != null) __obj.updateDynamic("customSize")(customSize)
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (!js.isUndefined(disableScrollLocking)) __obj.updateDynamic("disableScrollLocking")(disableScrollLocking)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (!js.isUndefined(helpOnFocus)) __obj.updateDynamic("helpOnFocus")(helpOnFocus)
    if (helpText != null) __obj.updateDynamic("helpText")(helpText.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (inlineIndicator != null) __obj.updateDynamic("inlineIndicator")(inlineIndicator)
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(lastChild)) __obj.updateDynamic("lastChild")(lastChild)
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon)
    if (!js.isUndefined(leftIconStateful)) __obj.updateDynamic("leftIconStateful")(leftIconStateful)
    if (lineDirection != null) __obj.updateDynamic("lineDirection")(lineDirection)
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel)
    if (!js.isUndefined(okPrimary)) __obj.updateDynamic("okPrimary")(okPrimary)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
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
    if (onVisibilityChange != null) __obj.updateDynamic("onVisibilityChange")(onVisibilityChange)
    if (!js.isUndefined(paddedBlock)) __obj.updateDynamic("paddedBlock")(paddedBlock)
    if (passwordIcon != null) __obj.updateDynamic("passwordIcon")(passwordIcon)
    if (passwordIconChildren != null) __obj.updateDynamic("passwordIconChildren")(passwordIconChildren.asInstanceOf[js.Any])
    if (passwordIconClassName != null) __obj.updateDynamic("passwordIconClassName")(passwordIconClassName)
    if (!js.isUndefined(passwordInitiallyVisible)) __obj.updateDynamic("passwordInitiallyVisible")(passwordInitiallyVisible)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (pickerClassName != null) __obj.updateDynamic("pickerClassName")(pickerClassName)
    if (pickerContentClassName != null) __obj.updateDynamic("pickerContentClassName")(pickerContentClassName)
    if (pickerFooterClassName != null) __obj.updateDynamic("pickerFooterClassName")(pickerFooterClassName)
    if (pickerHeaderClassName != null) __obj.updateDynamic("pickerHeaderClassName")(pickerHeaderClassName)
    if (pickerStyle != null) __obj.updateDynamic("pickerStyle")(pickerStyle)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(portal)) __obj.updateDynamic("portal")(portal)
    if (renderNode != null) __obj.updateDynamic("renderNode")(renderNode)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon)
    if (!js.isUndefined(rightIconStateful)) __obj.updateDynamic("rightIconStateful")(rightIconStateful)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (textFieldClassName != null) __obj.updateDynamic("textFieldClassName")(textFieldClassName)
    if (textFieldStyle != null) __obj.updateDynamic("textFieldStyle")(textFieldStyle)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[BasePickerProps]
  }
}

