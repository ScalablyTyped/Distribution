package typings.reactDatePicker

import org.scalablytyped.runtime.Instantiable0
import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.AbstractView
import typings.react.mod.FocusEvent
import typings.react.mod.ModifierKey
import typings.react.mod.NativeKeyboardEvent
import typings.reactCalendar.anon.ActiveStartDate
import typings.reactCalendar.anon.GoToRangeStartOnSelect
import typings.reactCalendar.mod.default
import typings.reactDatePicker.distCjsDateInputInputMod.InputProps
import typings.reactDatePicker.distCjsDatePickerMod.IconOrRenderFunction
import typings.reactDatePicker.distCjsSharedTypesMod.ClassName
import typings.reactDatePicker.distCjsSharedTypesMod.Detail
import typings.reactDatePicker.distCjsSharedTypesMod.LooseValue
import typings.reactDatePicker.distCjsSharedTypesMod.Value
import typings.reactDatePicker.reactDatePickerStrings.century
import typings.reactDatePicker.reactDatePickerStrings.day
import typings.reactDatePicker.reactDatePickerStrings.decade
import typings.reactDatePicker.reactDatePickerStrings.end
import typings.reactDatePicker.reactDatePickerStrings.month
import typings.reactDatePicker.reactDatePickerStrings.range
import typings.reactDatePicker.reactDatePickerStrings.start
import typings.reactDatePicker.reactDatePickerStrings.year
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AriaLabel extends StObject {
    
    var ariaLabel: Requireable[String]
    
    var autoFocus: Requireable[Boolean]
    
    var className: Validator[String]
    
    var disabled: Requireable[Boolean]
    
    var inputRef: Requireable[
        NonNullable[js.UndefOr[(js.Function1[/* repeated */ Any, Any]) | InferProps[Current] | Null]]
      ]
    
    var max: Requireable[Double]
    
    var min: Requireable[Double]
    
    var name: Requireable[String]
    
    var nameForClass: Requireable[String]
    
    var onChange: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var onKeyDown: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var onKeyUp: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var placeholder: Requireable[String]
    
    var required: Requireable[Boolean]
    
    var showLeadingZeros: Requireable[Boolean]
    
    var step: Requireable[Double]
    
    var value: Requireable[String]
  }
  object AriaLabel {
    
    inline def apply(
      ariaLabel: Requireable[String],
      autoFocus: Requireable[Boolean],
      className: Validator[String],
      disabled: Requireable[Boolean],
      inputRef: Requireable[
          NonNullable[js.UndefOr[(js.Function1[/* repeated */ Any, Any]) | InferProps[Current] | Null]]
        ],
      max: Requireable[Double],
      min: Requireable[Double],
      name: Requireable[String],
      nameForClass: Requireable[String],
      onChange: Requireable[js.Function1[/* repeated */ Any, Any]],
      onKeyDown: Requireable[js.Function1[/* repeated */ Any, Any]],
      onKeyUp: Requireable[js.Function1[/* repeated */ Any, Any]],
      placeholder: Requireable[String],
      required: Requireable[Boolean],
      showLeadingZeros: Requireable[Boolean],
      step: Requireable[Double],
      value: Requireable[String]
    ): AriaLabel = {
      val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], autoFocus = autoFocus.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], inputRef = inputRef.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameForClass = nameForClass.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onKeyUp = onKeyUp.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], showLeadingZeros = showLeadingZeros.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AriaLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AriaLabel] (val x: Self) extends AnyVal {
      
      inline def setAriaLabel(value: Requireable[String]): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAutoFocus(value: Requireable[Boolean]): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: Validator[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Requireable[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setInputRef(
        value: Requireable[
              NonNullable[js.UndefOr[(js.Function1[/* repeated */ Any, Any]) | InferProps[Current] | Null]]
            ]
      ): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Requireable[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Requireable[Double]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setName(value: Requireable[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameForClass(value: Requireable[String]): Self = StObject.set(x, "nameForClass", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnKeyDown(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOnKeyUp(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: Requireable[String]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Requireable[Boolean]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setShowLeadingZeros(value: Requireable[Boolean]): Self = StObject.set(x, "showLeadingZeros", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Requireable[Double]): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Requireable[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait AutoFocus extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var calendarAriaLabel: js.UndefOr[String] = js.undefined
    
    var calendarClassName: js.UndefOr[ClassName] = js.undefined
    
    var calendarIcon: js.UndefOr[IconOrRenderFunction | Null] = js.undefined
    
    var className: js.UndefOr[ClassName] = js.undefined
    
    var clearAriaLabel: js.UndefOr[String] = js.undefined
    
    var clearIcon: js.UndefOr[IconOrRenderFunction | Null] = js.undefined
    
    var closeCalendar: js.UndefOr[Boolean] = js.undefined
    
    var `data-testid`: js.UndefOr[String] = js.undefined
    
    var dayAriaLabel: js.UndefOr[String] = js.undefined
    
    var dayPlaceholder: js.UndefOr[String] = js.undefined
    
    var disableCalendar: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var maxDetail: js.UndefOr[Detail] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var monthAriaLabel: js.UndefOr[String] = js.undefined
    
    var monthPlaceholder: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nativeInputAriaLabel: js.UndefOr[String] = js.undefined
    
    var onCalendarClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onCalendarOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Value, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLDivElement, Element], Unit]] = js.undefined
    
    var openCalendarOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var portalContainer: js.UndefOr[HTMLElement | Null] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var returnValue: js.UndefOr[start | end | range] = js.undefined
    
    var showLeadingZeros: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[LooseValue] = js.undefined
    
    var yearAriaLabel: js.UndefOr[String] = js.undefined
    
    var yearPlaceholder: js.UndefOr[String] = js.undefined
  }
  object AutoFocus {
    
    inline def apply(): AutoFocus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFocus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoFocus] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCalendarAriaLabel(value: String): Self = StObject.set(x, "calendarAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCalendarAriaLabelUndefined: Self = StObject.set(x, "calendarAriaLabel", js.undefined)
      
      inline def setCalendarClassName(value: ClassName): Self = StObject.set(x, "calendarClassName", value.asInstanceOf[js.Any])
      
      inline def setCalendarClassNameNull: Self = StObject.set(x, "calendarClassName", null)
      
      inline def setCalendarClassNameUndefined: Self = StObject.set(x, "calendarClassName", js.undefined)
      
      inline def setCalendarClassNameVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "calendarClassName", js.Array(value*))
      
      inline def setCalendarIcon(value: IconOrRenderFunction): Self = StObject.set(x, "calendarIcon", value.asInstanceOf[js.Any])
      
      inline def setCalendarIconNull: Self = StObject.set(x, "calendarIcon", null)
      
      inline def setCalendarIconUndefined: Self = StObject.set(x, "calendarIcon", js.undefined)
      
      inline def setClassName(value: ClassName): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameNull: Self = StObject.set(x, "className", null)
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNameVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "className", js.Array(value*))
      
      inline def setClearAriaLabel(value: String): Self = StObject.set(x, "clearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setClearAriaLabelUndefined: Self = StObject.set(x, "clearAriaLabel", js.undefined)
      
      inline def setClearIcon(value: IconOrRenderFunction): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      inline def setClearIconNull: Self = StObject.set(x, "clearIcon", null)
      
      inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      inline def setCloseCalendar(value: Boolean): Self = StObject.set(x, "closeCalendar", value.asInstanceOf[js.Any])
      
      inline def setCloseCalendarUndefined: Self = StObject.set(x, "closeCalendar", js.undefined)
      
      inline def `setData-testid`(value: String): Self = StObject.set(x, "data-testid", value.asInstanceOf[js.Any])
      
      inline def `setData-testidUndefined`: Self = StObject.set(x, "data-testid", js.undefined)
      
      inline def setDayAriaLabel(value: String): Self = StObject.set(x, "dayAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setDayAriaLabelUndefined: Self = StObject.set(x, "dayAriaLabel", js.undefined)
      
      inline def setDayPlaceholder(value: String): Self = StObject.set(x, "dayPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setDayPlaceholderUndefined: Self = StObject.set(x, "dayPlaceholder", js.undefined)
      
      inline def setDisableCalendar(value: Boolean): Self = StObject.set(x, "disableCalendar", value.asInstanceOf[js.Any])
      
      inline def setDisableCalendarUndefined: Self = StObject.set(x, "disableCalendar", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxDetail(value: Detail): Self = StObject.set(x, "maxDetail", value.asInstanceOf[js.Any])
      
      inline def setMaxDetailUndefined: Self = StObject.set(x, "maxDetail", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMonthAriaLabel(value: String): Self = StObject.set(x, "monthAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthAriaLabelUndefined: Self = StObject.set(x, "monthAriaLabel", js.undefined)
      
      inline def setMonthPlaceholder(value: String): Self = StObject.set(x, "monthPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setMonthPlaceholderUndefined: Self = StObject.set(x, "monthPlaceholder", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNativeInputAriaLabel(value: String): Self = StObject.set(x, "nativeInputAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNativeInputAriaLabelUndefined: Self = StObject.set(x, "nativeInputAriaLabel", js.undefined)
      
      inline def setOnCalendarClose(value: () => Unit): Self = StObject.set(x, "onCalendarClose", js.Any.fromFunction0(value))
      
      inline def setOnCalendarCloseUndefined: Self = StObject.set(x, "onCalendarClose", js.undefined)
      
      inline def setOnCalendarOpen(value: () => Unit): Self = StObject.set(x, "onCalendarOpen", js.Any.fromFunction0(value))
      
      inline def setOnCalendarOpenUndefined: Self = StObject.set(x, "onCalendarOpen", js.undefined)
      
      inline def setOnChange(value: /* value */ Value => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* event */ FocusEvent[HTMLDivElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOpenCalendarOnFocus(value: Boolean): Self = StObject.set(x, "openCalendarOnFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenCalendarOnFocusUndefined: Self = StObject.set(x, "openCalendarOnFocus", js.undefined)
      
      inline def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      inline def setPortalContainerNull: Self = StObject.set(x, "portalContainer", null)
      
      inline def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setReturnValue(value: start | end | range): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
      
      inline def setShowLeadingZeros(value: Boolean): Self = StObject.set(x, "showLeadingZeros", value.asInstanceOf[js.Any])
      
      inline def setShowLeadingZerosUndefined: Self = StObject.set(x, "showLeadingZeros", js.undefined)
      
      inline def setValue(value: LooseValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setYearAriaLabel(value: String): Self = StObject.set(x, "yearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setYearAriaLabelUndefined: Self = StObject.set(x, "yearAriaLabel", js.undefined)
      
      inline def setYearPlaceholder(value: String): Self = StObject.set(x, "yearPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setYearPlaceholderUndefined: Self = StObject.set(x, "yearPlaceholder", js.undefined)
    }
  }
  
  /* Inlined react.react.ChangeEvent<std.HTMLInputElement> & {  target :std.HTMLInputElement} */
  trait ChangeEventHTMLInputEleme extends StObject {
    
    var bubbles: Boolean
    
    var cancelable: Boolean
    
    var currentTarget: EventTarget & HTMLInputElement
    
    var defaultPrevented: Boolean
    
    var eventPhase: Double
    
    def isDefaultPrevented(): Boolean
    
    def isPropagationStopped(): Boolean
    
    var isTrusted: Boolean
    
    var nativeEvent: Event
    
    def persist(): Unit
    
    def preventDefault(): Unit
    
    def stopPropagation(): Unit
    
    var target: EventTarget & HTMLInputElement
    
    var timeStamp: Double
    
    var `type`: String
  }
  object ChangeEventHTMLInputEleme {
    
    inline def apply(
      bubbles: Boolean,
      cancelable: Boolean,
      currentTarget: EventTarget & HTMLInputElement,
      defaultPrevented: Boolean,
      eventPhase: Double,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      nativeEvent: Event,
      persist: () => Unit,
      preventDefault: () => Unit,
      stopPropagation: () => Unit,
      target: EventTarget & HTMLInputElement,
      timeStamp: Double,
      `type`: String
    ): ChangeEventHTMLInputEleme = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEventHTMLInputEleme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEventHTMLInputEleme] (val x: Self) extends AnyVal {
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCurrentTarget(value: EventTarget & HTMLInputElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      inline def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setNativeEvent(value: Event): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      inline def setPersist(value: () => Unit): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: EventTarget & HTMLInputElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.ChangeEvent<std.HTMLSelectElement> & {  target :std.HTMLSelectElement} */
  trait ChangeEventHTMLSelectElem extends StObject {
    
    var bubbles: Boolean
    
    var cancelable: Boolean
    
    var currentTarget: EventTarget & HTMLSelectElement
    
    var defaultPrevented: Boolean
    
    var eventPhase: Double
    
    def isDefaultPrevented(): Boolean
    
    def isPropagationStopped(): Boolean
    
    var isTrusted: Boolean
    
    var nativeEvent: Event
    
    def persist(): Unit
    
    def preventDefault(): Unit
    
    def stopPropagation(): Unit
    
    var target: EventTarget & HTMLSelectElement
    
    var timeStamp: Double
    
    var `type`: String
  }
  object ChangeEventHTMLSelectElem {
    
    inline def apply(
      bubbles: Boolean,
      cancelable: Boolean,
      currentTarget: EventTarget & HTMLSelectElement,
      defaultPrevented: Boolean,
      eventPhase: Double,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      nativeEvent: Event,
      persist: () => Unit,
      preventDefault: () => Unit,
      stopPropagation: () => Unit,
      target: EventTarget & HTMLSelectElement,
      timeStamp: Double,
      `type`: String
    ): ChangeEventHTMLSelectElem = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEventHTMLSelectElem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEventHTMLSelectElem] (val x: Self) extends AnyVal {
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCurrentTarget(value: EventTarget & HTMLSelectElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      inline def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setNativeEvent(value: Event): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      inline def setPersist(value: () => Unit): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: EventTarget & HTMLSelectElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Current extends StObject {
    
    var current: Requireable[Any]
  }
  object Current {
    
    inline def apply(current: Requireable[Any]): Current = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Requireable[Any]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.KeyboardEvent<std.HTMLInputElement> & {  target :std.HTMLInputElement} */
  trait KeyboardEventHTMLInputEle extends StObject {
    
    var altKey: Boolean
    
    var bubbles: Boolean
    
    var cancelable: Boolean
    
    /** @deprecated */
    var charCode: Double
    
    var code: String
    
    var ctrlKey: Boolean
    
    var currentTarget: EventTarget & HTMLInputElement
    
    var defaultPrevented: Boolean
    
    var detail: Double
    
    var eventPhase: Double
    
    /**
      * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
      */
    def getModifierState(key: ModifierKey): Boolean
    
    def isDefaultPrevented(): Boolean
    
    def isPropagationStopped(): Boolean
    
    var isTrusted: Boolean
    
    /**
      * See the [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#named-key-attribute-values). for possible values
      */
    var key: String
    
    /** @deprecated */
    var keyCode: Double
    
    var locale: String
    
    var location: Double
    
    var metaKey: Boolean
    
    var nativeEvent: NativeKeyboardEvent
    
    def persist(): Unit
    
    def preventDefault(): Unit
    
    var repeat: Boolean
    
    var shiftKey: Boolean
    
    def stopPropagation(): Unit
    
    var target: EventTarget
    
    var timeStamp: Double
    
    var `type`: String
    
    var view: AbstractView
    
    /** @deprecated */
    var which: Double
  }
  object KeyboardEventHTMLInputEle {
    
    inline def apply(
      altKey: Boolean,
      bubbles: Boolean,
      cancelable: Boolean,
      charCode: Double,
      code: String,
      ctrlKey: Boolean,
      currentTarget: EventTarget & HTMLInputElement,
      defaultPrevented: Boolean,
      detail: Double,
      eventPhase: Double,
      getModifierState: ModifierKey => Boolean,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      key: String,
      keyCode: Double,
      locale: String,
      location: Double,
      metaKey: Boolean,
      nativeEvent: NativeKeyboardEvent,
      persist: () => Unit,
      preventDefault: () => Unit,
      repeat: Boolean,
      shiftKey: Boolean,
      stopPropagation: () => Unit,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      view: AbstractView,
      which: Double
    ): KeyboardEventHTMLInputEle = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), repeat = repeat.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardEventHTMLInputEle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyboardEventHTMLInputEle] (val x: Self) extends AnyVal {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCharCode(value: Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setCurrentTarget(value: EventTarget & HTMLInputElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setGetModifierState(value: ModifierKey => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
      
      inline def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      inline def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setNativeEvent(value: NativeKeyboardEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      inline def setPersist(value: () => Unit): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setView(value: AbstractView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.KeyboardEvent<std.HTMLSelectElement> & {  target :std.HTMLSelectElement} */
  trait KeyboardEventHTMLSelectEl extends StObject {
    
    var altKey: Boolean
    
    var bubbles: Boolean
    
    var cancelable: Boolean
    
    /** @deprecated */
    var charCode: Double
    
    var code: String
    
    var ctrlKey: Boolean
    
    var currentTarget: EventTarget & HTMLSelectElement
    
    var defaultPrevented: Boolean
    
    var detail: Double
    
    var eventPhase: Double
    
    /**
      * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
      */
    def getModifierState(key: ModifierKey): Boolean
    
    def isDefaultPrevented(): Boolean
    
    def isPropagationStopped(): Boolean
    
    var isTrusted: Boolean
    
    /**
      * See the [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#named-key-attribute-values). for possible values
      */
    var key: String
    
    /** @deprecated */
    var keyCode: Double
    
    var locale: String
    
    var location: Double
    
    var metaKey: Boolean
    
    var nativeEvent: NativeKeyboardEvent
    
    def persist(): Unit
    
    def preventDefault(): Unit
    
    var repeat: Boolean
    
    var shiftKey: Boolean
    
    def stopPropagation(): Unit
    
    var target: EventTarget
    
    var timeStamp: Double
    
    var `type`: String
    
    var view: AbstractView
    
    /** @deprecated */
    var which: Double
  }
  object KeyboardEventHTMLSelectEl {
    
    inline def apply(
      altKey: Boolean,
      bubbles: Boolean,
      cancelable: Boolean,
      charCode: Double,
      code: String,
      ctrlKey: Boolean,
      currentTarget: EventTarget & HTMLSelectElement,
      defaultPrevented: Boolean,
      detail: Double,
      eventPhase: Double,
      getModifierState: ModifierKey => Boolean,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      key: String,
      keyCode: Double,
      locale: String,
      location: Double,
      metaKey: Boolean,
      nativeEvent: NativeKeyboardEvent,
      persist: () => Unit,
      preventDefault: () => Unit,
      repeat: Boolean,
      shiftKey: Boolean,
      stopPropagation: () => Unit,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      view: AbstractView,
      which: Double
    ): KeyboardEventHTMLSelectEl = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), repeat = repeat.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardEventHTMLSelectEl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyboardEventHTMLSelectEl] (val x: Self) extends AnyVal {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCharCode(value: Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setCurrentTarget(value: EventTarget & HTMLSelectElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setGetModifierState(value: ModifierKey => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
      
      inline def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      inline def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setNativeEvent(value: NativeKeyboardEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      inline def setPersist(value: () => Unit): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setView(value: AbstractView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxDate extends StObject {
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var month: js.UndefOr[String | Null] = js.undefined
    
    var year: js.UndefOr[String | Null] = js.undefined
  }
  object MaxDate {
    
    inline def apply(): MaxDate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxDate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxDate] (val x: Self) extends AnyVal {
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthNull: Self = StObject.set(x, "month", null)
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearNull: Self = StObject.set(x, "year", null)
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  trait MinDate extends StObject {
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var year: js.UndefOr[String | Null] = js.undefined
  }
  object MinDate {
    
    inline def apply(): MinDate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinDate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinDate] (val x: Self) extends AnyVal {
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearNull: Self = StObject.set(x, "year", null)
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  trait Placeholder extends StObject {
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var valueType: js.UndefOr[century | decade | year | month | day] = js.undefined
  }
  object Placeholder {
    
    inline def apply(): Placeholder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Placeholder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Placeholder] (val x: Self) extends AnyVal {
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setValueType(value: century | decade | year | month | day): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    }
  }
  
  @js.native
  trait TypeofCalendar
    extends StObject
       with Instantiable0[default] {
    
    var defaultProps: GoToRangeStartOnSelect = js.native
    
    var propTypes: ActiveStartDate = js.native
  }
  
  @js.native
  trait TypeofInput extends StObject {
    
    def apply(param0: InputProps): typings.react.mod.global.JSX.Element = js.native
    
    var propTypes: AriaLabel = js.native
  }
}
