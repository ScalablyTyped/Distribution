package typings
package reactDashMdLib.libPickersDatePickerContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps
  extends reactDashMdLib.libPickersMod.BasePickerProps {
  var calendarClassName: js.UndefOr[java.lang.String] = js.undefined
  var calendarDateClassName: js.UndefOr[java.lang.String] = js.undefined
  var calendarOuterDateClassName: js.UndefOr[java.lang.String] = js.undefined
  var calendarTitleClassName: js.UndefOr[java.lang.String] = js.undefined
  var calendarTitleFormat: js.UndefOr[reactDashMdLib.libPickersMod.CalendarTitleFormat] = js.undefined
  var calendarWeekdayClassName: js.UndefOr[java.lang.String] = js.undefined
  var calendarWeekdayFormat: js.UndefOr[reactDashMdLib.libPickersMod.NSL] = js.undefined
  var dateRenderer: js.UndefOr[
    js.Function2[
      /* date */ stdLib.Date, 
      /* day */ scala.Double, 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
  var defaultCalendarDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var defaultCalendarMode: js.UndefOr[
    reactDashMdLib.reactDashMdLibStrings.calendar | reactDashMdLib.reactDashMdLibStrings.year
  ] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var disableOuterDates: js.UndefOr[scala.Boolean] = js.undefined
  var firstDayOfWeek: js.UndefOr[
    reactDashMdLib.reactDashMdLibNumbers.`0` | reactDashMdLib.reactDashMdLibNumbers.`1` | reactDashMdLib.reactDashMdLibNumbers.`2` | reactDashMdLib.reactDashMdLibNumbers.`3` | reactDashMdLib.reactDashMdLibNumbers.`4` | reactDashMdLib.reactDashMdLibNumbers.`5` | reactDashMdLib.reactDashMdLibNumbers.`6`
  ] = js.undefined
  var formatOptions: js.UndefOr[reactDashMdLib.libPickersMod.IntlFormat] = js.undefined
  var getDateClassName: js.UndefOr[js.Function2[/* date */ stdLib.Date, /* day */ scala.Double, java.lang.String]] = js.undefined
  /**
    * @deprecated
    */
  var initialCalendarDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  var nextIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var nextIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var nextIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* formattedDate */ java.lang.String, 
      /* date */ stdLib.Date, 
      /* event */ stdLib.Event, 
      scala.Unit
    ]
  ] = js.undefined
  var onNextMonth: js.UndefOr[js.Function1[/* firstDayInMonth */ stdLib.Date, scala.Unit]] = js.undefined
  var onPreviousMonth: js.UndefOr[js.Function1[/* firstDayInMonth */ stdLib.Date, scala.Unit]] = js.undefined
  var onYearSelected: js.UndefOr[js.Function1[/* firstDayInYear */ stdLib.Date, scala.Unit]] = js.undefined
  var previousIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var previousIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var previousIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var showAllDays: js.UndefOr[scala.Boolean] = js.undefined
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var yearPickerClassName: js.UndefOr[java.lang.String] = js.undefined
  var yearsDisplayed: js.UndefOr[scala.Double] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    id: reactDashMdLib.libMod.IdPropType,
    DateTimeFormat: (/* locales */ js.UndefOr[
      reactDashMdLib.libPickersMod.Locales | js.Array[reactDashMdLib.libPickersMod.Locales]
    ], /* options */ js.UndefOr[reactDashMdLib.libPickersMod.IntlFormat]) => reactDashMdLib.Anon_Date = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    animateInline: js.UndefOr[scala.Boolean] = js.undefined,
    `aria-label`: java.lang.String = null,
    autoOk: js.UndefOr[scala.Boolean] = js.undefined,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    calendarClassName: java.lang.String = null,
    calendarDateClassName: java.lang.String = null,
    calendarOuterDateClassName: java.lang.String = null,
    calendarTitleClassName: java.lang.String = null,
    calendarTitleFormat: reactDashMdLib.libPickersMod.CalendarTitleFormat = null,
    calendarWeekdayClassName: java.lang.String = null,
    calendarWeekdayFormat: reactDashMdLib.libPickersMod.NSL = null,
    cancelLabel: java.lang.String = null,
    cancelPrimary: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    customSize: java.lang.String = null,
    dateRenderer: (/* date */ stdLib.Date, /* day */ scala.Double) => reactLib.reactMod.ReactNs.ReactElement[_] = null,
    defaultCalendarDate: java.lang.String | stdLib.Date = null,
    defaultCalendarMode: reactDashMdLib.reactDashMdLibStrings.calendar | reactDashMdLib.reactDashMdLibStrings.year = null,
    defaultValue: java.lang.String | stdLib.Date = null,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    disableOuterDates: js.UndefOr[scala.Boolean] = js.undefined,
    disableScrollLocking: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    displayMode: reactDashMdLib.reactDashMdLibStrings.landscape | reactDashMdLib.reactDashMdLibStrings.portrait = null,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    errorText: reactLib.reactMod.ReactNs.ReactNode = null,
    firstDayOfWeek: reactDashMdLib.reactDashMdLibNumbers.`0` | reactDashMdLib.reactDashMdLibNumbers.`1` | reactDashMdLib.reactDashMdLibNumbers.`2` | reactDashMdLib.reactDashMdLibNumbers.`3` | reactDashMdLib.reactDashMdLibNumbers.`4` | reactDashMdLib.reactDashMdLibNumbers.`5` | reactDashMdLib.reactDashMdLibNumbers.`6` = null,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    formatOptions: reactDashMdLib.libPickersMod.IntlFormat = null,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    getDateClassName: (/* date */ stdLib.Date, /* day */ scala.Double) => java.lang.String = null,
    helpOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    helpText: reactLib.reactMod.ReactNs.ReactNode = null,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    initialCalendarDate: java.lang.String | stdLib.Date = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    inlineIndicator: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    inputClassName: java.lang.String = null,
    inputStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    lastChild: js.UndefOr[scala.Boolean] = js.undefined,
    leftIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    leftIconStateful: js.UndefOr[scala.Boolean] = js.undefined,
    lineDirection: reactDashMdLib.libTextFieldsTextFieldMod.TextFieldLineDirections = null,
    locales: reactDashMdLib.libPickersMod.Locales = null,
    max: scala.Int | scala.Double = null,
    maxDate: stdLib.Date = null,
    maxLength: scala.Int | scala.Double = null,
    maxRows: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    minDate: stdLib.Date = null,
    name: scala.Double | java.lang.String = null,
    nextIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    nextIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    nextIconClassName: java.lang.String = null,
    okLabel: java.lang.String = null,
    okPrimary: js.UndefOr[scala.Boolean] = js.undefined,
    onBlur: /* event */ reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onChange: (/* formattedDate */ java.lang.String, /* date */ stdLib.Date, /* event */ stdLib.Event) => scala.Unit = null,
    onClick: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onDrag: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragEnd: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragEnter: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragExit: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragLeave: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragOver: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragStart: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDrop: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onFocus: /* event */ reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onKeyDown: /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onKeyUp: /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onMouseDown: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseEnter: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseLeave: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseMove: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOut: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOver: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseUp: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onNextMonth: /* firstDayInMonth */ stdLib.Date => scala.Unit = null,
    onPreviousMonth: /* firstDayInMonth */ stdLib.Date => scala.Unit = null,
    onTouchCancel: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchEnd: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchMove: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchStart: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onVisibilityChange: (/* visible */ scala.Boolean, /* event */ stdLib.Event) => scala.Unit = null,
    onYearSelected: /* firstDayInYear */ stdLib.Date => scala.Unit = null,
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
    previousIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    previousIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    previousIconClassName: java.lang.String = null,
    renderNode: js.Object = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    resize: reactDashMdLib.Anon_DisableShrink = null,
    rightIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    rightIconStateful: js.UndefOr[scala.Boolean] = js.undefined,
    rows: scala.Int | scala.Double = null,
    showAllDays: js.UndefOr[scala.Boolean] = js.undefined,
    step: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    textFieldClassName: java.lang.String = null,
    textFieldStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    timeZone: java.lang.String = null,
    `type`: reactDashMdLib.libTextFieldsTextFieldMod.TextFieldTypes = null,
    value: java.lang.String | stdLib.Date = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    yearPickerClassName: java.lang.String = null,
    yearsDisplayed: scala.Int | scala.Double = null
  ): DatePickerProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (DateTimeFormat != null) __obj.updateDynamic("DateTimeFormat")(js.Any.fromFunction2(DateTimeFormat))
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(animateInline)) __obj.updateDynamic("animateInline")(animateInline)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (calendarClassName != null) __obj.updateDynamic("calendarClassName")(calendarClassName)
    if (calendarDateClassName != null) __obj.updateDynamic("calendarDateClassName")(calendarDateClassName)
    if (calendarOuterDateClassName != null) __obj.updateDynamic("calendarOuterDateClassName")(calendarOuterDateClassName)
    if (calendarTitleClassName != null) __obj.updateDynamic("calendarTitleClassName")(calendarTitleClassName)
    if (calendarTitleFormat != null) __obj.updateDynamic("calendarTitleFormat")(calendarTitleFormat)
    if (calendarWeekdayClassName != null) __obj.updateDynamic("calendarWeekdayClassName")(calendarWeekdayClassName)
    if (calendarWeekdayFormat != null) __obj.updateDynamic("calendarWeekdayFormat")(calendarWeekdayFormat)
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel)
    if (!js.isUndefined(cancelPrimary)) __obj.updateDynamic("cancelPrimary")(cancelPrimary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc)
    if (customSize != null) __obj.updateDynamic("customSize")(customSize)
    if (dateRenderer != null) __obj.updateDynamic("dateRenderer")(js.Any.fromFunction2(dateRenderer))
    if (defaultCalendarDate != null) __obj.updateDynamic("defaultCalendarDate")(defaultCalendarDate.asInstanceOf[js.Any])
    if (defaultCalendarMode != null) __obj.updateDynamic("defaultCalendarMode")(defaultCalendarMode.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (!js.isUndefined(disableOuterDates)) __obj.updateDynamic("disableOuterDates")(disableOuterDates)
    if (!js.isUndefined(disableScrollLocking)) __obj.updateDynamic("disableScrollLocking")(disableScrollLocking)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (formatOptions != null) __obj.updateDynamic("formatOptions")(formatOptions)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (getDateClassName != null) __obj.updateDynamic("getDateClassName")(js.Any.fromFunction2(getDateClassName))
    if (!js.isUndefined(helpOnFocus)) __obj.updateDynamic("helpOnFocus")(helpOnFocus)
    if (helpText != null) __obj.updateDynamic("helpText")(helpText.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (initialCalendarDate != null) __obj.updateDynamic("initialCalendarDate")(initialCalendarDate.asInstanceOf[js.Any])
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
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon)
    if (nextIconChildren != null) __obj.updateDynamic("nextIconChildren")(nextIconChildren.asInstanceOf[js.Any])
    if (nextIconClassName != null) __obj.updateDynamic("nextIconClassName")(nextIconClassName)
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel)
    if (!js.isUndefined(okPrimary)) __obj.updateDynamic("okPrimary")(okPrimary)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onNextMonth != null) __obj.updateDynamic("onNextMonth")(js.Any.fromFunction1(onNextMonth))
    if (onPreviousMonth != null) __obj.updateDynamic("onPreviousMonth")(js.Any.fromFunction1(onPreviousMonth))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onVisibilityChange != null) __obj.updateDynamic("onVisibilityChange")(js.Any.fromFunction2(onVisibilityChange))
    if (onYearSelected != null) __obj.updateDynamic("onYearSelected")(js.Any.fromFunction1(onYearSelected))
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
    if (previousIcon != null) __obj.updateDynamic("previousIcon")(previousIcon)
    if (previousIconChildren != null) __obj.updateDynamic("previousIconChildren")(previousIconChildren.asInstanceOf[js.Any])
    if (previousIconClassName != null) __obj.updateDynamic("previousIconClassName")(previousIconClassName)
    if (renderNode != null) __obj.updateDynamic("renderNode")(renderNode)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon)
    if (!js.isUndefined(rightIconStateful)) __obj.updateDynamic("rightIconStateful")(rightIconStateful)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(showAllDays)) __obj.updateDynamic("showAllDays")(showAllDays)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (textFieldClassName != null) __obj.updateDynamic("textFieldClassName")(textFieldClassName)
    if (textFieldStyle != null) __obj.updateDynamic("textFieldStyle")(textFieldStyle)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (yearPickerClassName != null) __obj.updateDynamic("yearPickerClassName")(yearPickerClassName)
    if (yearsDisplayed != null) __obj.updateDynamic("yearsDisplayed")(yearsDisplayed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerProps]
  }
}

