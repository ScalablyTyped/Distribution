package typings.reactTimePicker

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.AbstractView
import typings.react.mod.FocusEvent
import typings.react.mod.ModifierKey
import typings.react.mod.NativeKeyboardEvent
import typings.reactClock.distCjsClockMod.ClockProps
import typings.reactTimePicker.distCjsSharedTypesMod.AmPmType
import typings.reactTimePicker.distCjsSharedTypesMod.ClassName
import typings.reactTimePicker.distCjsSharedTypesMod.Detail
import typings.reactTimePicker.distCjsSharedTypesMod.LooseValue
import typings.reactTimePicker.distCjsSharedTypesMod.Value
import typings.reactTimePicker.distCjsTimeInputInputMod.InputProps
import typings.reactTimePicker.distCjsTimePickerMod.IconOrRenderFunction
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AmPm extends StObject {
    
    var amPm: AmPmType | Null
    
    var maxTime: js.UndefOr[String] = js.undefined
    
    var minTime: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | Null] = js.undefined
  }
  object AmPm {
    
    inline def apply(): AmPm = {
      val __obj = js.Dynamic.literal(amPm = null)
      __obj.asInstanceOf[AmPm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AmPm] (val x: Self) extends AnyVal {
      
      inline def setAmPm(value: AmPmType): Self = StObject.set(x, "amPm", value.asInstanceOf[js.Any])
      
      inline def setAmPmNull: Self = StObject.set(x, "amPm", null)
      
      inline def setMaxTime(value: String): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinTime(value: String): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait AmPmAriaLabel extends StObject {
    
    var amPmAriaLabel: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[ClassName] = js.undefined
    
    var clearAriaLabel: js.UndefOr[String] = js.undefined
    
    var clearIcon: js.UndefOr[IconOrRenderFunction | Null] = js.undefined
    
    var clockAriaLabel: js.UndefOr[String] = js.undefined
    
    var clockClassName: js.UndefOr[ClassName] = js.undefined
    
    var clockIcon: js.UndefOr[IconOrRenderFunction | Null] = js.undefined
    
    var closeClock: js.UndefOr[Boolean] = js.undefined
    
    var `data-testid`: js.UndefOr[String] = js.undefined
    
    var disableClock: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var hourAriaLabel: js.UndefOr[String] = js.undefined
    
    var hourPlaceholder: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDetail: js.UndefOr[Detail] = js.undefined
    
    var maxTime: js.UndefOr[String] = js.undefined
    
    var minTime: js.UndefOr[String] = js.undefined
    
    var minuteAriaLabel: js.UndefOr[String] = js.undefined
    
    var minutePlaceholder: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nativeInputAriaLabel: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Value, Unit]] = js.undefined
    
    var onClockClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClockOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLDivElement, Element], Unit]] = js.undefined
    
    var openClockOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var portalContainer: js.UndefOr[HTMLElement | Null] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var secondAriaLabel: js.UndefOr[String] = js.undefined
    
    var secondPlaceholder: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[LooseValue] = js.undefined
  }
  object AmPmAriaLabel {
    
    inline def apply(): AmPmAriaLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AmPmAriaLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AmPmAriaLabel] (val x: Self) extends AnyVal {
      
      inline def setAmPmAriaLabel(value: String): Self = StObject.set(x, "amPmAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setAmPmAriaLabelUndefined: Self = StObject.set(x, "amPmAriaLabel", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: ClassName): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameNull: Self = StObject.set(x, "className", null)
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNameVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "className", js.Array(value*))
      
      inline def setClearAriaLabel(value: String): Self = StObject.set(x, "clearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setClearAriaLabelUndefined: Self = StObject.set(x, "clearAriaLabel", js.undefined)
      
      inline def setClearIcon(value: IconOrRenderFunction): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      inline def setClearIconNull: Self = StObject.set(x, "clearIcon", null)
      
      inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      inline def setClockAriaLabel(value: String): Self = StObject.set(x, "clockAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setClockAriaLabelUndefined: Self = StObject.set(x, "clockAriaLabel", js.undefined)
      
      inline def setClockClassName(value: ClassName): Self = StObject.set(x, "clockClassName", value.asInstanceOf[js.Any])
      
      inline def setClockClassNameNull: Self = StObject.set(x, "clockClassName", null)
      
      inline def setClockClassNameUndefined: Self = StObject.set(x, "clockClassName", js.undefined)
      
      inline def setClockClassNameVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "clockClassName", js.Array(value*))
      
      inline def setClockIcon(value: IconOrRenderFunction): Self = StObject.set(x, "clockIcon", value.asInstanceOf[js.Any])
      
      inline def setClockIconNull: Self = StObject.set(x, "clockIcon", null)
      
      inline def setClockIconUndefined: Self = StObject.set(x, "clockIcon", js.undefined)
      
      inline def setCloseClock(value: Boolean): Self = StObject.set(x, "closeClock", value.asInstanceOf[js.Any])
      
      inline def setCloseClockUndefined: Self = StObject.set(x, "closeClock", js.undefined)
      
      inline def `setData-testid`(value: String): Self = StObject.set(x, "data-testid", value.asInstanceOf[js.Any])
      
      inline def `setData-testidUndefined`: Self = StObject.set(x, "data-testid", js.undefined)
      
      inline def setDisableClock(value: Boolean): Self = StObject.set(x, "disableClock", value.asInstanceOf[js.Any])
      
      inline def setDisableClockUndefined: Self = StObject.set(x, "disableClock", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHourAriaLabel(value: String): Self = StObject.set(x, "hourAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setHourAriaLabelUndefined: Self = StObject.set(x, "hourAriaLabel", js.undefined)
      
      inline def setHourPlaceholder(value: String): Self = StObject.set(x, "hourPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setHourPlaceholderUndefined: Self = StObject.set(x, "hourPlaceholder", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDetail(value: Detail): Self = StObject.set(x, "maxDetail", value.asInstanceOf[js.Any])
      
      inline def setMaxDetailUndefined: Self = StObject.set(x, "maxDetail", js.undefined)
      
      inline def setMaxTime(value: String): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinTime(value: String): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setMinuteAriaLabel(value: String): Self = StObject.set(x, "minuteAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMinuteAriaLabelUndefined: Self = StObject.set(x, "minuteAriaLabel", js.undefined)
      
      inline def setMinutePlaceholder(value: String): Self = StObject.set(x, "minutePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setMinutePlaceholderUndefined: Self = StObject.set(x, "minutePlaceholder", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNativeInputAriaLabel(value: String): Self = StObject.set(x, "nativeInputAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNativeInputAriaLabelUndefined: Self = StObject.set(x, "nativeInputAriaLabel", js.undefined)
      
      inline def setOnChange(value: /* value */ Value => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClockClose(value: () => Unit): Self = StObject.set(x, "onClockClose", js.Any.fromFunction0(value))
      
      inline def setOnClockCloseUndefined: Self = StObject.set(x, "onClockClose", js.undefined)
      
      inline def setOnClockOpen(value: () => Unit): Self = StObject.set(x, "onClockOpen", js.Any.fromFunction0(value))
      
      inline def setOnClockOpenUndefined: Self = StObject.set(x, "onClockOpen", js.undefined)
      
      inline def setOnFocus(value: /* event */ FocusEvent[HTMLDivElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOpenClockOnFocus(value: Boolean): Self = StObject.set(x, "openClockOnFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenClockOnFocusUndefined: Self = StObject.set(x, "openClockOnFocus", js.undefined)
      
      inline def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      inline def setPortalContainerNull: Self = StObject.set(x, "portalContainer", null)
      
      inline def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSecondAriaLabel(value: String): Self = StObject.set(x, "secondAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setSecondAriaLabelUndefined: Self = StObject.set(x, "secondAriaLabel", js.undefined)
      
      inline def setSecondPlaceholder(value: String): Self = StObject.set(x, "secondPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSecondPlaceholderUndefined: Self = StObject.set(x, "secondPlaceholder", js.undefined)
      
      inline def setValue(value: LooseValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
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
  
  trait Hour extends StObject {
    
    var hour: js.UndefOr[String | Null] = js.undefined
    
    var maxTime: js.UndefOr[String] = js.undefined
    
    var minTime: js.UndefOr[String] = js.undefined
    
    var showLeadingZeros: js.UndefOr[Boolean] = js.undefined
  }
  object Hour {
    
    inline def apply(): Hour = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hour]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hour] (val x: Self) extends AnyVal {
      
      inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHourNull: Self = StObject.set(x, "hour", null)
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setMaxTime(value: String): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinTime(value: String): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setShowLeadingZeros(value: Boolean): Self = StObject.set(x, "showLeadingZeros", value.asInstanceOf[js.Any])
      
      inline def setShowLeadingZerosUndefined: Self = StObject.set(x, "showLeadingZeros", js.undefined)
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
  
  trait MaxTime extends StObject {
    
    var maxTime: js.UndefOr[String] = js.undefined
    
    var minTime: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | Null] = js.undefined
  }
  object MaxTime {
    
    inline def apply(): MaxTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxTime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxTime] (val x: Self) extends AnyVal {
      
      inline def setMaxTime(value: String): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinTime(value: String): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait MinTime extends StObject {
    
    var hour: js.UndefOr[String | Null] = js.undefined
    
    var maxTime: js.UndefOr[String] = js.undefined
    
    var minTime: js.UndefOr[String] = js.undefined
    
    var minute: js.UndefOr[String | Null] = js.undefined
    
    var showLeadingZeros: js.UndefOr[Boolean] = js.undefined
  }
  object MinTime {
    
    inline def apply(): MinTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinTime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinTime] (val x: Self) extends AnyVal {
      
      inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHourNull: Self = StObject.set(x, "hour", null)
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setMaxTime(value: String): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinTime(value: String): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteNull: Self = StObject.set(x, "minute", null)
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setShowLeadingZeros(value: Boolean): Self = StObject.set(x, "showLeadingZeros", value.asInstanceOf[js.Any])
      
      inline def setShowLeadingZerosUndefined: Self = StObject.set(x, "showLeadingZeros", js.undefined)
    }
  }
  
  @js.native
  trait TypeofClock extends StObject {
    
    def apply(param0: ClockProps): typings.react.mod.global.JSX.Element = js.native
    
    val propTypes: TypeofpropTypes = js.native
  }
  
  @js.native
  trait TypeofInput extends StObject {
    
    def apply(param0: InputProps): typings.react.mod.global.JSX.Element = js.native
    
    var propTypes: AriaLabel = js.native
  }
  
  trait TypeofpropTypes extends StObject {
    
    var className: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]
    
    var formatHour: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    def hourHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    def hourHandOppositeLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    var hourHandWidth: js.Function3[
        /* props */ Record[String, Any], 
        /* propName */ String, 
        /* componentName */ String, 
        js.Error | Null
      ]
    
    def hourMarksLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    var hourMarksWidth: js.Function3[
        /* props */ Record[String, Any], 
        /* propName */ String, 
        /* componentName */ String, 
        js.Error | Null
      ]
    
    var locale: Requireable[String]
    
    def minuteHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    def minuteHandOppositeLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    var minuteHandWidth: js.Function3[
        /* props */ Record[String, Any], 
        /* propName */ String, 
        /* componentName */ String, 
        js.Error | Null
      ]
    
    def minuteMarksLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    var minuteMarksWidth: js.Function3[
        /* props */ Record[String, Any], 
        /* propName */ String, 
        /* componentName */ String, 
        js.Error | Null
      ]
    
    var renderHourMarks: Requireable[Boolean]
    
    var renderMinuteHand: Requireable[Boolean]
    
    var renderMinuteMarks: Requireable[Boolean]
    
    var renderNumbers: Requireable[Boolean]
    
    var renderSecondHand: Requireable[Boolean]
    
    def secondHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    def secondHandOppositeLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    var secondHandWidth: js.Function3[
        /* props */ Record[String, Any], 
        /* propName */ String, 
        /* componentName */ String, 
        js.Error | Null
      ]
    
    var size: Requireable[NonNullable[js.UndefOr[String | Double | Null]]]
    
    var value: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]]
  }
  object TypeofpropTypes {
    
    inline def apply(
      className: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]],
      formatHour: Requireable[js.Function1[/* repeated */ Any, Any]],
      hourHandLength: (Record[String, Any], String, String) => js.Error | Null,
      hourHandOppositeLength: (Record[String, Any], String, String) => js.Error | Null,
      hourHandWidth: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null,
      hourMarksLength: (Record[String, Any], String, String) => js.Error | Null,
      hourMarksWidth: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null,
      locale: Requireable[String],
      minuteHandLength: (Record[String, Any], String, String) => js.Error | Null,
      minuteHandOppositeLength: (Record[String, Any], String, String) => js.Error | Null,
      minuteHandWidth: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null,
      minuteMarksLength: (Record[String, Any], String, String) => js.Error | Null,
      minuteMarksWidth: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null,
      renderHourMarks: Requireable[Boolean],
      renderMinuteHand: Requireable[Boolean],
      renderMinuteMarks: Requireable[Boolean],
      renderNumbers: Requireable[Boolean],
      renderSecondHand: Requireable[Boolean],
      secondHandLength: (Record[String, Any], String, String) => js.Error | Null,
      secondHandOppositeLength: (Record[String, Any], String, String) => js.Error | Null,
      secondHandWidth: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null,
      size: Requireable[NonNullable[js.UndefOr[String | Double | Null]]],
      value: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]]
    ): TypeofpropTypes = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], formatHour = formatHour.asInstanceOf[js.Any], hourHandLength = js.Any.fromFunction3(hourHandLength), hourHandOppositeLength = js.Any.fromFunction3(hourHandOppositeLength), hourHandWidth = js.Any.fromFunction3(hourHandWidth), hourMarksLength = js.Any.fromFunction3(hourMarksLength), hourMarksWidth = js.Any.fromFunction3(hourMarksWidth), locale = locale.asInstanceOf[js.Any], minuteHandLength = js.Any.fromFunction3(minuteHandLength), minuteHandOppositeLength = js.Any.fromFunction3(minuteHandOppositeLength), minuteHandWidth = js.Any.fromFunction3(minuteHandWidth), minuteMarksLength = js.Any.fromFunction3(minuteMarksLength), minuteMarksWidth = js.Any.fromFunction3(minuteMarksWidth), renderHourMarks = renderHourMarks.asInstanceOf[js.Any], renderMinuteHand = renderMinuteHand.asInstanceOf[js.Any], renderMinuteMarks = renderMinuteMarks.asInstanceOf[js.Any], renderNumbers = renderNumbers.asInstanceOf[js.Any], renderSecondHand = renderSecondHand.asInstanceOf[js.Any], secondHandLength = js.Any.fromFunction3(secondHandLength), secondHandOppositeLength = js.Any.fromFunction3(secondHandOppositeLength), secondHandWidth = js.Any.fromFunction3(secondHandWidth), size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofpropTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofpropTypes] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setFormatHour(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "formatHour", value.asInstanceOf[js.Any])
      
      inline def setHourHandLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "hourHandLength", js.Any.fromFunction3(value))
      
      inline def setHourHandOppositeLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "hourHandOppositeLength", js.Any.fromFunction3(value))
      
      inline def setHourHandWidth(
        value: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null
      ): Self = StObject.set(x, "hourHandWidth", js.Any.fromFunction3(value))
      
      inline def setHourMarksLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "hourMarksLength", js.Any.fromFunction3(value))
      
      inline def setHourMarksWidth(
        value: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null
      ): Self = StObject.set(x, "hourMarksWidth", js.Any.fromFunction3(value))
      
      inline def setLocale(value: Requireable[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMinuteHandLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "minuteHandLength", js.Any.fromFunction3(value))
      
      inline def setMinuteHandOppositeLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "minuteHandOppositeLength", js.Any.fromFunction3(value))
      
      inline def setMinuteHandWidth(
        value: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null
      ): Self = StObject.set(x, "minuteHandWidth", js.Any.fromFunction3(value))
      
      inline def setMinuteMarksLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "minuteMarksLength", js.Any.fromFunction3(value))
      
      inline def setMinuteMarksWidth(
        value: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null
      ): Self = StObject.set(x, "minuteMarksWidth", js.Any.fromFunction3(value))
      
      inline def setRenderHourMarks(value: Requireable[Boolean]): Self = StObject.set(x, "renderHourMarks", value.asInstanceOf[js.Any])
      
      inline def setRenderMinuteHand(value: Requireable[Boolean]): Self = StObject.set(x, "renderMinuteHand", value.asInstanceOf[js.Any])
      
      inline def setRenderMinuteMarks(value: Requireable[Boolean]): Self = StObject.set(x, "renderMinuteMarks", value.asInstanceOf[js.Any])
      
      inline def setRenderNumbers(value: Requireable[Boolean]): Self = StObject.set(x, "renderNumbers", value.asInstanceOf[js.Any])
      
      inline def setRenderSecondHand(value: Requireable[Boolean]): Self = StObject.set(x, "renderSecondHand", value.asInstanceOf[js.Any])
      
      inline def setSecondHandLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "secondHandLength", js.Any.fromFunction3(value))
      
      inline def setSecondHandOppositeLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "secondHandOppositeLength", js.Any.fromFunction3(value))
      
      inline def setSecondHandWidth(
        value: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null
      ): Self = StObject.set(x, "secondHandWidth", js.Any.fromFunction3(value))
      
      inline def setSize(value: Requireable[NonNullable[js.UndefOr[String | Double | Null]]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
