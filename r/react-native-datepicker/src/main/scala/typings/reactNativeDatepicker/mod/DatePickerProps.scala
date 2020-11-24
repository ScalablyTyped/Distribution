package typings.reactNativeDatepicker.mod

import typings.moment.mod.Moment
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNativeDatepicker.reactNativeDatepickerStrings.calendar
import typings.reactNativeDatepicker.reactNativeDatepickerStrings.date
import typings.reactNativeDatepicker.reactNativeDatepickerStrings.datetime
import typings.reactNativeDatepicker.reactNativeDatepickerStrings.spinner
import typings.reactNativeDatepicker.reactNativeDatepickerStrings.time
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerProps extends js.Object {
  
  var TouchableComponent: js.UndefOr[Component[js.Object, js.Object, _]] = js.native
  
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  
  var androidMode: js.UndefOr[
    typings.reactNativeDatepicker.reactNativeDatepickerStrings.default | calendar | spinner
  ] = js.native
  
  var cancelBtnTestID: js.UndefOr[String] = js.native
  
  var cancelBtnText: js.UndefOr[String] = js.native
  
  var confirmBtnTestID: js.UndefOr[String] = js.native
  
  var confirmBtnText: js.UndefOr[String] = js.native
  
  var customStyles: js.UndefOr[DatePickerCustomStylesProps] = js.native
  
  var date: js.UndefOr[String | Date | Moment] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var getDateStr: js.UndefOr[js.Function1[/* date */ Date, String]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hideText: js.UndefOr[Boolean] = js.native
  
  var iconComponent: js.UndefOr[Element] = js.native
  
  var iconSource: js.UndefOr[ImageURISource] = js.native
  
  var is24Hour: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var maxDate: js.UndefOr[String | Date] = js.native
  
  var minDate: js.UndefOr[String | Date] = js.native
  
  var minuteInterval: js.UndefOr[Double] = js.native
  
  var modalOnResponderTerminationRequest: js.UndefOr[js.Function1[/* e */ js.Any, Boolean]] = js.native
  
  var mode: js.UndefOr[date | datetime | time] = js.native
  
  var onCloseModal: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onDateChange: js.UndefOr[js.Function2[/* dateStr */ String, /* date */ Date, Unit]] = js.native
  
  var onOpenModal: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPressMask: js.UndefOr[js.Function0[Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var showIcon: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[StyleProp[_]] = js.native
  
  var testID: js.UndefOr[String] = js.native
  
  var timeZoneOffsetInMinutes: js.UndefOr[Double] = js.native
}
object DatePickerProps {
  
  @scala.inline
  def apply(): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerProps]
  }
  
  @scala.inline
  implicit class DatePickerPropsOps[Self <: DatePickerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTouchableComponent(value: Component[js.Object, js.Object, _]): Self = this.set("TouchableComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchableComponent: Self = this.set("TouchableComponent", js.undefined)
    
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFontScaling: Self = this.set("allowFontScaling", js.undefined)
    
    @scala.inline
    def setAndroidMode(value: typings.reactNativeDatepicker.reactNativeDatepickerStrings.default | calendar | spinner): Self = this.set("androidMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidMode: Self = this.set("androidMode", js.undefined)
    
    @scala.inline
    def setCancelBtnTestID(value: String): Self = this.set("cancelBtnTestID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelBtnTestID: Self = this.set("cancelBtnTestID", js.undefined)
    
    @scala.inline
    def setCancelBtnText(value: String): Self = this.set("cancelBtnText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelBtnText: Self = this.set("cancelBtnText", js.undefined)
    
    @scala.inline
    def setConfirmBtnTestID(value: String): Self = this.set("confirmBtnTestID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmBtnTestID: Self = this.set("confirmBtnTestID", js.undefined)
    
    @scala.inline
    def setConfirmBtnText(value: String): Self = this.set("confirmBtnText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmBtnText: Self = this.set("confirmBtnText", js.undefined)
    
    @scala.inline
    def setCustomStyles(value: DatePickerCustomStylesProps): Self = this.set("customStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomStyles: Self = this.set("customStyles", js.undefined)
    
    @scala.inline
    def setDate(value: String | Date | Moment): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setGetDateStr(value: /* date */ Date => String): Self = this.set("getDateStr", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetDateStr: Self = this.set("getDateStr", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHideText(value: Boolean): Self = this.set("hideText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideText: Self = this.set("hideText", js.undefined)
    
    @scala.inline
    def setIconComponent(value: Element): Self = this.set("iconComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconComponent: Self = this.set("iconComponent", js.undefined)
    
    @scala.inline
    def setIconSource(value: ImageURISource): Self = this.set("iconSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSource: Self = this.set("iconSource", js.undefined)
    
    @scala.inline
    def setIs24Hour(value: Boolean): Self = this.set("is24Hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs24Hour: Self = this.set("is24Hour", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: String | Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: String | Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMinuteInterval(value: Double): Self = this.set("minuteInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteInterval: Self = this.set("minuteInterval", js.undefined)
    
    @scala.inline
    def setModalOnResponderTerminationRequest(value: /* e */ js.Any => Boolean): Self = this.set("modalOnResponderTerminationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteModalOnResponderTerminationRequest: Self = this.set("modalOnResponderTerminationRequest", js.undefined)
    
    @scala.inline
    def setMode(value: date | datetime | time): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOnCloseModal(value: () => Unit): Self = this.set("onCloseModal", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCloseModal: Self = this.set("onCloseModal", js.undefined)
    
    @scala.inline
    def setOnDateChange(value: (/* dateStr */ String, /* date */ Date) => Unit): Self = this.set("onDateChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDateChange: Self = this.set("onDateChange", js.undefined)
    
    @scala.inline
    def setOnOpenModal(value: () => Unit): Self = this.set("onOpenModal", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpenModal: Self = this.set("onOpenModal", js.undefined)
    
    @scala.inline
    def setOnPressMask(value: () => Unit): Self = this.set("onPressMask", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPressMask: Self = this.set("onPressMask", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setShowIcon(value: Boolean): Self = this.set("showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIcon: Self = this.set("showIcon", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[_]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    
    @scala.inline
    def setTimeZoneOffsetInMinutes(value: Double): Self = this.set("timeZoneOffsetInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZoneOffsetInMinutes: Self = this.set("timeZoneOffsetInMinutes", js.undefined)
  }
}
