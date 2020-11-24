package typings.reactDayPicker.propsMod

import typings.react.mod.FocusEvent
import typings.reactDayPicker.classNamesMod.InputClassNames
import typings.reactDayPicker.dayPickerInputMod.default
import typings.reactDayPicker.modifiersMod.DayModifiers
import typings.std.Date
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayPickerInputProps extends js.Object {
  
  var classNames: js.UndefOr[InputClassNames] = js.native
  
  var clickUnselectsDay: js.UndefOr[Boolean] = js.native
  
  var component: js.UndefOr[js.Any] = js.native
  
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.native
  
  var format: js.UndefOr[String | js.Array[String]] = js.native
  
  var formatDate: js.UndefOr[js.Function3[/* date */ Date, /* format */ String, /* locale */ String, String]] = js.native
  
  var hideOnDayClick: js.UndefOr[Boolean] = js.native
  
  var inputProps: js.UndefOr[js.Object] = js.native
  
  var keepFocus: js.UndefOr[Boolean] = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.native
  
  var onDayChange: js.UndefOr[
    js.Function3[/* day */ Date, /* DayModifiers */ DayModifiers, /* dayPickerInput */ default, Unit]
  ] = js.native
  
  var onDayPickerHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onDayPickerShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.native
  
  var onKeyUp: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.native
  
  var overlayComponent: js.UndefOr[js.Any] = js.native
  
  var parseDate: js.UndefOr[
    js.Function3[/* str */ String, /* format */ String, /* locale */ String, Date | Unit]
  ] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var showOverlay: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var value: js.UndefOr[String | Date] = js.native
}
object DayPickerInputProps {
  
  @scala.inline
  def apply(): DayPickerInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPickerInputProps]
  }
  
  @scala.inline
  implicit class DayPickerInputPropsOps[Self <: DayPickerInputProps] (val x: Self) extends AnyVal {
    
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
    def setClassNames(value: InputClassNames): Self = this.set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    
    @scala.inline
    def setClickUnselectsDay(value: Boolean): Self = this.set("clickUnselectsDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickUnselectsDay: Self = this.set("clickUnselectsDay", js.undefined)
    
    @scala.inline
    def setComponent(value: js.Any): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setDayPickerProps(value: DayPickerProps): Self = this.set("dayPickerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayPickerProps: Self = this.set("dayPickerProps", js.undefined)
    
    @scala.inline
    def setFormatVarargs(value: String*): Self = this.set("format", js.Array(value :_*))
    
    @scala.inline
    def setFormat(value: String | js.Array[String]): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatDate(value: (/* date */ Date, /* format */ String, /* locale */ String) => String): Self = this.set("formatDate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFormatDate: Self = this.set("formatDate", js.undefined)
    
    @scala.inline
    def setHideOnDayClick(value: Boolean): Self = this.set("hideOnDayClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnDayClick: Self = this.set("hideOnDayClick", js.undefined)
    
    @scala.inline
    def setInputProps(value: js.Object): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setKeepFocus(value: Boolean): Self = this.set("keepFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepFocus: Self = this.set("keepFocus", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnDayChange(value: (/* day */ Date, /* DayModifiers */ DayModifiers, /* dayPickerInput */ default) => Unit): Self = this.set("onDayChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnDayChange: Self = this.set("onDayChange", js.undefined)
    
    @scala.inline
    def setOnDayPickerHide(value: () => Unit): Self = this.set("onDayPickerHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDayPickerHide: Self = this.set("onDayPickerHide", js.undefined)
    
    @scala.inline
    def setOnDayPickerShow(value: () => Unit): Self = this.set("onDayPickerShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDayPickerShow: Self = this.set("onDayPickerShow", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setOverlayComponent(value: js.Any): Self = this.set("overlayComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayComponent: Self = this.set("overlayComponent", js.undefined)
    
    @scala.inline
    def setParseDate(value: (/* str */ String, /* format */ String, /* locale */ String) => Date | Unit): Self = this.set("parseDate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteParseDate: Self = this.set("parseDate", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setShowOverlay(value: Boolean): Self = this.set("showOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOverlay: Self = this.set("showOverlay", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setValue(value: String | Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
