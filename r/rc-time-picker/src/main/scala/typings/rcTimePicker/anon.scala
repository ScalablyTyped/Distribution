package typings.rcTimePicker

import typings.moment.mod.Moment
import typings.rcTimePicker.mod.TimePicker
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Open extends StObject {
    
    var open: Boolean
  }
  object Open {
    
    @scala.inline
    def apply(open: Boolean): Open = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[Open]
    }
    
    @scala.inline
    implicit class OpenMutableBuilder[Self <: Open] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<rc-time-picker.rc-time-picker.TimePickerProps> */
  trait PartialTimePickerProps extends StObject {
    
    var addon: js.UndefOr[js.Function1[/* timepicker */ this.type, Element]] = js.undefined
    
    var allowEmpty: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearIcon: js.UndefOr[ReactNode] = js.undefined
    
    var clearText: js.UndefOr[String] = js.undefined
    
    var defaultOpenValue: js.UndefOr[Moment] = js.undefined
    
    var defaultValue: js.UndefOr[Moment] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
    
    var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.undefined
    
    var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.undefined
    
    var focusOnOpen: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var hideDisabledOptions: js.UndefOr[Boolean] = js.undefined
    
    var hourStep: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputIcon: js.UndefOr[ReactNode] = js.undefined
    
    var inputReadOnly: js.UndefOr[Boolean] = js.undefined
    
    var minuteStep: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Moment, Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* state */ Open, Unit]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function1[/* state */ Open, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var popupClassName: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var secondStep: js.UndefOr[Double] = js.undefined
    
    var showHour: js.UndefOr[Boolean] = js.undefined
    
    var showMinute: js.UndefOr[Boolean] = js.undefined
    
    var showSecond: js.UndefOr[Boolean] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var use12Hours: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[Moment] = js.undefined
  }
  object PartialTimePickerProps {
    
    @scala.inline
    def apply(): PartialTimePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTimePickerProps]
    }
    
    @scala.inline
    implicit class PartialTimePickerPropsMutableBuilder[Self <: PartialTimePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddon(value: PartialTimePickerProps => Element): Self = StObject.set(x, "addon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddonUndefined: Self = StObject.set(x, "addon", js.undefined)
      
      @scala.inline
      def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearIcon(value: ReactNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      @scala.inline
      def setClearText(value: String): Self = StObject.set(x, "clearText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearTextUndefined: Self = StObject.set(x, "clearText", js.undefined)
      
      @scala.inline
      def setDefaultOpenValue(value: Moment): Self = StObject.set(x, "defaultOpenValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenValueUndefined: Self = StObject.set(x, "defaultOpenValue", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Moment): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledHours(value: () => js.Array[Double]): Self = StObject.set(x, "disabledHours", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
      
      @scala.inline
      def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = StObject.set(x, "disabledMinutes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledMinutesUndefined: Self = StObject.set(x, "disabledMinutes", js.undefined)
      
      @scala.inline
      def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = StObject.set(x, "disabledSeconds", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDisabledSecondsUndefined: Self = StObject.set(x, "disabledSeconds", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFocusOnOpen(value: Boolean): Self = StObject.set(x, "focusOnOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOnOpenUndefined: Self = StObject.set(x, "focusOnOpen", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
      
      @scala.inline
      def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputIcon(value: ReactNode): Self = StObject.set(x, "inputIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputIconUndefined: Self = StObject.set(x, "inputIcon", js.undefined)
      
      @scala.inline
      def setInputReadOnly(value: Boolean): Self = StObject.set(x, "inputReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputReadOnlyUndefined: Self = StObject.set(x, "inputReadOnly", js.undefined)
      
      @scala.inline
      def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ Moment => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* state */ Open => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: /* state */ Open => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
      
      @scala.inline
      def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
      
      @scala.inline
      def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
      
      @scala.inline
      def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
      
      @scala.inline
      def setValue(value: Moment): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<std.Partial<rc-time-picker.rc-time-picker.TimePickerProps>> */
  trait ReadonlyPartialTimePicker extends StObject {
    
    val addon: js.UndefOr[js.Function1[/* timepicker */ TimePicker, Element]] = js.undefined
    
    val allowEmpty: js.UndefOr[Boolean] = js.undefined
    
    val className: js.UndefOr[String] = js.undefined
    
    val clearIcon: js.UndefOr[ReactNode] = js.undefined
    
    val clearText: js.UndefOr[String] = js.undefined
    
    val defaultOpenValue: js.UndefOr[Moment] = js.undefined
    
    val defaultValue: js.UndefOr[Moment] = js.undefined
    
    val disabled: js.UndefOr[Boolean] = js.undefined
    
    val disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
    
    val disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.undefined
    
    val disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.undefined
    
    val focusOnOpen: js.UndefOr[Boolean] = js.undefined
    
    val format: js.UndefOr[String] = js.undefined
    
    val hideDisabledOptions: js.UndefOr[Boolean] = js.undefined
    
    val hourStep: js.UndefOr[Double] = js.undefined
    
    val id: js.UndefOr[String] = js.undefined
    
    val inputIcon: js.UndefOr[ReactNode] = js.undefined
    
    val inputReadOnly: js.UndefOr[Boolean] = js.undefined
    
    val minuteStep: js.UndefOr[Double] = js.undefined
    
    val onChange: js.UndefOr[js.Function1[/* value */ Moment, Unit]] = js.undefined
    
    val onClose: js.UndefOr[js.Function1[/* state */ Open, Unit]] = js.undefined
    
    val onOpen: js.UndefOr[js.Function1[/* state */ Open, Unit]] = js.undefined
    
    val open: js.UndefOr[Boolean] = js.undefined
    
    val placeholder: js.UndefOr[String] = js.undefined
    
    val placement: js.UndefOr[String] = js.undefined
    
    val popupClassName: js.UndefOr[String] = js.undefined
    
    val prefixCls: js.UndefOr[String] = js.undefined
    
    val secondStep: js.UndefOr[Double] = js.undefined
    
    val showHour: js.UndefOr[Boolean] = js.undefined
    
    val showMinute: js.UndefOr[Boolean] = js.undefined
    
    val showSecond: js.UndefOr[Boolean] = js.undefined
    
    val transitionName: js.UndefOr[String] = js.undefined
    
    val use12Hours: js.UndefOr[Boolean] = js.undefined
    
    val value: js.UndefOr[Moment] = js.undefined
  }
  object ReadonlyPartialTimePicker {
    
    @scala.inline
    def apply(): ReadonlyPartialTimePicker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyPartialTimePicker]
    }
    
    @scala.inline
    implicit class ReadonlyPartialTimePickerMutableBuilder[Self <: ReadonlyPartialTimePicker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddon(value: /* timepicker */ TimePicker => Element): Self = StObject.set(x, "addon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddonUndefined: Self = StObject.set(x, "addon", js.undefined)
      
      @scala.inline
      def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearIcon(value: ReactNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      @scala.inline
      def setClearText(value: String): Self = StObject.set(x, "clearText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearTextUndefined: Self = StObject.set(x, "clearText", js.undefined)
      
      @scala.inline
      def setDefaultOpenValue(value: Moment): Self = StObject.set(x, "defaultOpenValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenValueUndefined: Self = StObject.set(x, "defaultOpenValue", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Moment): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledHours(value: () => js.Array[Double]): Self = StObject.set(x, "disabledHours", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
      
      @scala.inline
      def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = StObject.set(x, "disabledMinutes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledMinutesUndefined: Self = StObject.set(x, "disabledMinutes", js.undefined)
      
      @scala.inline
      def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = StObject.set(x, "disabledSeconds", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDisabledSecondsUndefined: Self = StObject.set(x, "disabledSeconds", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFocusOnOpen(value: Boolean): Self = StObject.set(x, "focusOnOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOnOpenUndefined: Self = StObject.set(x, "focusOnOpen", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
      
      @scala.inline
      def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputIcon(value: ReactNode): Self = StObject.set(x, "inputIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputIconUndefined: Self = StObject.set(x, "inputIcon", js.undefined)
      
      @scala.inline
      def setInputReadOnly(value: Boolean): Self = StObject.set(x, "inputReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputReadOnlyUndefined: Self = StObject.set(x, "inputReadOnly", js.undefined)
      
      @scala.inline
      def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ Moment => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* state */ Open => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: /* state */ Open => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
      
      @scala.inline
      def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
      
      @scala.inline
      def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
      
      @scala.inline
      def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
      
      @scala.inline
      def setValue(value: Moment): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
