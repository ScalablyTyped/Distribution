package typings.reactNativeDatepicker

import typings.moment.mod.Moment
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeDatepicker.reactNativeDatepickerStrings.calendar
import typings.reactNativeDatepicker.reactNativeDatepickerStrings.date
import typings.reactNativeDatepicker.reactNativeDatepickerStrings.datetime
import typings.reactNativeDatepicker.reactNativeDatepickerStrings.spinner
import typings.reactNativeDatepicker.reactNativeDatepickerStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-datepicker", JSImport.Default)
  @js.native
  open class default protected () extends DatePicker {
    def this(props: DatePickerProps) = this()
  }
  
  @js.native
  trait DatePicker
    extends Component[DatePickerProps, js.Object, Any] {
    
    def onPressCancel(): Unit = js.native
    
    def onPressDate(): Unit = js.native
  }
  
  trait DatePickerCustomStylesProps extends StObject {
    
    var btnCancel: js.UndefOr[StyleProp[Any]] = js.undefined
    
    var btnConfirm: js.UndefOr[StyleProp[Any]] = js.undefined
    
    var btnTextCancel: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var btnTextConfirm: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var dateIcon: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
    
    var dateInput: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var datePicker: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var datePickerCon: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var dateText: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var dateTouchBody: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var disabled: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var placeholderText: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  }
  object DatePickerCustomStylesProps {
    
    inline def apply(): DatePickerCustomStylesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerCustomStylesProps]
    }
    
    extension [Self <: DatePickerCustomStylesProps](x: Self) {
      
      inline def setBtnCancel(value: StyleProp[Any]): Self = StObject.set(x, "btnCancel", value.asInstanceOf[js.Any])
      
      inline def setBtnCancelNull: Self = StObject.set(x, "btnCancel", null)
      
      inline def setBtnCancelUndefined: Self = StObject.set(x, "btnCancel", js.undefined)
      
      inline def setBtnConfirm(value: StyleProp[Any]): Self = StObject.set(x, "btnConfirm", value.asInstanceOf[js.Any])
      
      inline def setBtnConfirmNull: Self = StObject.set(x, "btnConfirm", null)
      
      inline def setBtnConfirmUndefined: Self = StObject.set(x, "btnConfirm", js.undefined)
      
      inline def setBtnTextCancel(value: StyleProp[TextStyle]): Self = StObject.set(x, "btnTextCancel", value.asInstanceOf[js.Any])
      
      inline def setBtnTextCancelNull: Self = StObject.set(x, "btnTextCancel", null)
      
      inline def setBtnTextCancelUndefined: Self = StObject.set(x, "btnTextCancel", js.undefined)
      
      inline def setBtnTextConfirm(value: StyleProp[TextStyle]): Self = StObject.set(x, "btnTextConfirm", value.asInstanceOf[js.Any])
      
      inline def setBtnTextConfirmNull: Self = StObject.set(x, "btnTextConfirm", null)
      
      inline def setBtnTextConfirmUndefined: Self = StObject.set(x, "btnTextConfirm", js.undefined)
      
      inline def setDateIcon(value: StyleProp[ImageStyle]): Self = StObject.set(x, "dateIcon", value.asInstanceOf[js.Any])
      
      inline def setDateIconNull: Self = StObject.set(x, "dateIcon", null)
      
      inline def setDateIconUndefined: Self = StObject.set(x, "dateIcon", js.undefined)
      
      inline def setDateInput(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dateInput", value.asInstanceOf[js.Any])
      
      inline def setDateInputNull: Self = StObject.set(x, "dateInput", null)
      
      inline def setDateInputUndefined: Self = StObject.set(x, "dateInput", js.undefined)
      
      inline def setDatePicker(value: StyleProp[ViewStyle]): Self = StObject.set(x, "datePicker", value.asInstanceOf[js.Any])
      
      inline def setDatePickerCon(value: StyleProp[ViewStyle]): Self = StObject.set(x, "datePickerCon", value.asInstanceOf[js.Any])
      
      inline def setDatePickerConNull: Self = StObject.set(x, "datePickerCon", null)
      
      inline def setDatePickerConUndefined: Self = StObject.set(x, "datePickerCon", js.undefined)
      
      inline def setDatePickerNull: Self = StObject.set(x, "datePicker", null)
      
      inline def setDatePickerUndefined: Self = StObject.set(x, "datePicker", js.undefined)
      
      inline def setDateText(value: StyleProp[TextStyle]): Self = StObject.set(x, "dateText", value.asInstanceOf[js.Any])
      
      inline def setDateTextNull: Self = StObject.set(x, "dateText", null)
      
      inline def setDateTextUndefined: Self = StObject.set(x, "dateText", js.undefined)
      
      inline def setDateTouchBody(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dateTouchBody", value.asInstanceOf[js.Any])
      
      inline def setDateTouchBodyNull: Self = StObject.set(x, "dateTouchBody", null)
      
      inline def setDateTouchBodyUndefined: Self = StObject.set(x, "dateTouchBody", js.undefined)
      
      inline def setDisabled(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setPlaceholderText(value: StyleProp[TextStyle]): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTextNull: Self = StObject.set(x, "placeholderText", null)
      
      inline def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
    }
  }
  
  trait DatePickerProps extends StObject {
    
    var TouchableComponent: js.UndefOr[Component[js.Object, js.Object, Any]] = js.undefined
    
    var allowFontScaling: js.UndefOr[Boolean] = js.undefined
    
    var androidMode: js.UndefOr[
        typings.reactNativeDatepicker.reactNativeDatepickerStrings.default | calendar | spinner
      ] = js.undefined
    
    var cancelBtnTestID: js.UndefOr[String] = js.undefined
    
    var cancelBtnText: js.UndefOr[String] = js.undefined
    
    var confirmBtnTestID: js.UndefOr[String] = js.undefined
    
    var confirmBtnText: js.UndefOr[String] = js.undefined
    
    var customStyles: js.UndefOr[DatePickerCustomStylesProps] = js.undefined
    
    var date: js.UndefOr[String | js.Date | Moment] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var getDateStr: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var hideText: js.UndefOr[Boolean] = js.undefined
    
    var iconComponent: js.UndefOr[Element] = js.undefined
    
    var iconSource: js.UndefOr[ImageURISource] = js.undefined
    
    var is24Hour: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[String | js.Date] = js.undefined
    
    var minDate: js.UndefOr[String | js.Date] = js.undefined
    
    var minuteInterval: js.UndefOr[Double] = js.undefined
    
    var modalOnResponderTerminationRequest: js.UndefOr[js.Function1[/* e */ Any, Boolean]] = js.undefined
    
    var mode: js.UndefOr[date | datetime | time] = js.undefined
    
    var onCloseModal: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onDateChange: js.UndefOr[js.Function2[/* dateStr */ String, /* date */ js.Date, Unit]] = js.undefined
    
    var onOpenModal: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPressMask: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[Any]] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    var timeZoneOffsetInMinutes: js.UndefOr[Double] = js.undefined
  }
  object DatePickerProps {
    
    inline def apply(): DatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerProps]
    }
    
    extension [Self <: DatePickerProps](x: Self) {
      
      inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
      
      inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
      
      inline def setAndroidMode(value: typings.reactNativeDatepicker.reactNativeDatepickerStrings.default | calendar | spinner): Self = StObject.set(x, "androidMode", value.asInstanceOf[js.Any])
      
      inline def setAndroidModeUndefined: Self = StObject.set(x, "androidMode", js.undefined)
      
      inline def setCancelBtnTestID(value: String): Self = StObject.set(x, "cancelBtnTestID", value.asInstanceOf[js.Any])
      
      inline def setCancelBtnTestIDUndefined: Self = StObject.set(x, "cancelBtnTestID", js.undefined)
      
      inline def setCancelBtnText(value: String): Self = StObject.set(x, "cancelBtnText", value.asInstanceOf[js.Any])
      
      inline def setCancelBtnTextUndefined: Self = StObject.set(x, "cancelBtnText", js.undefined)
      
      inline def setConfirmBtnTestID(value: String): Self = StObject.set(x, "confirmBtnTestID", value.asInstanceOf[js.Any])
      
      inline def setConfirmBtnTestIDUndefined: Self = StObject.set(x, "confirmBtnTestID", js.undefined)
      
      inline def setConfirmBtnText(value: String): Self = StObject.set(x, "confirmBtnText", value.asInstanceOf[js.Any])
      
      inline def setConfirmBtnTextUndefined: Self = StObject.set(x, "confirmBtnText", js.undefined)
      
      inline def setCustomStyles(value: DatePickerCustomStylesProps): Self = StObject.set(x, "customStyles", value.asInstanceOf[js.Any])
      
      inline def setCustomStylesUndefined: Self = StObject.set(x, "customStyles", js.undefined)
      
      inline def setDate(value: String | js.Date | Moment): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGetDateStr(value: /* date */ js.Date => String): Self = StObject.set(x, "getDateStr", js.Any.fromFunction1(value))
      
      inline def setGetDateStrUndefined: Self = StObject.set(x, "getDateStr", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideText(value: Boolean): Self = StObject.set(x, "hideText", value.asInstanceOf[js.Any])
      
      inline def setHideTextUndefined: Self = StObject.set(x, "hideText", js.undefined)
      
      inline def setIconComponent(value: Element): Self = StObject.set(x, "iconComponent", value.asInstanceOf[js.Any])
      
      inline def setIconComponentUndefined: Self = StObject.set(x, "iconComponent", js.undefined)
      
      inline def setIconSource(value: ImageURISource): Self = StObject.set(x, "iconSource", value.asInstanceOf[js.Any])
      
      inline def setIconSourceUndefined: Self = StObject.set(x, "iconSource", js.undefined)
      
      inline def setIs24Hour(value: Boolean): Self = StObject.set(x, "is24Hour", value.asInstanceOf[js.Any])
      
      inline def setIs24HourUndefined: Self = StObject.set(x, "is24Hour", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: String | js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: String | js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinuteInterval(value: Double): Self = StObject.set(x, "minuteInterval", value.asInstanceOf[js.Any])
      
      inline def setMinuteIntervalUndefined: Self = StObject.set(x, "minuteInterval", js.undefined)
      
      inline def setModalOnResponderTerminationRequest(value: /* e */ Any => Boolean): Self = StObject.set(x, "modalOnResponderTerminationRequest", js.Any.fromFunction1(value))
      
      inline def setModalOnResponderTerminationRequestUndefined: Self = StObject.set(x, "modalOnResponderTerminationRequest", js.undefined)
      
      inline def setMode(value: date | datetime | time): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnCloseModal(value: () => Unit): Self = StObject.set(x, "onCloseModal", js.Any.fromFunction0(value))
      
      inline def setOnCloseModalUndefined: Self = StObject.set(x, "onCloseModal", js.undefined)
      
      inline def setOnDateChange(value: (/* dateStr */ String, /* date */ js.Date) => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction2(value))
      
      inline def setOnDateChangeUndefined: Self = StObject.set(x, "onDateChange", js.undefined)
      
      inline def setOnOpenModal(value: () => Unit): Self = StObject.set(x, "onOpenModal", js.Any.fromFunction0(value))
      
      inline def setOnOpenModalUndefined: Self = StObject.set(x, "onOpenModal", js.undefined)
      
      inline def setOnPressMask(value: () => Unit): Self = StObject.set(x, "onPressMask", js.Any.fromFunction0(value))
      
      inline def setOnPressMaskUndefined: Self = StObject.set(x, "onPressMask", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setStyle(value: StyleProp[Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTimeZoneOffsetInMinutes(value: Double): Self = StObject.set(x, "timeZoneOffsetInMinutes", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneOffsetInMinutesUndefined: Self = StObject.set(x, "timeZoneOffsetInMinutes", js.undefined)
      
      inline def setTouchableComponent(value: Component[js.Object, js.Object, Any]): Self = StObject.set(x, "TouchableComponent", value.asInstanceOf[js.Any])
      
      inline def setTouchableComponentUndefined: Self = StObject.set(x, "TouchableComponent", js.undefined)
    }
  }
}
