package typings.reactWidgets.dateTimePickerMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactType
import typings.react.mod.global.JSX.Element
import typings.reactWidgets.commonPropsMod.AutoFocus
import typings.reactWidgets.commonPropsMod.ReactWidgetsCommonDropdownProps
import typings.reactWidgets.reactWidgetsStrings.century
import typings.reactWidgets.reactWidgetsStrings.decade
import typings.reactWidgets.reactWidgetsStrings.month
import typings.reactWidgets.reactWidgetsStrings.year
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimePickerProps
  extends ReactWidgetsCommonDropdownProps
     with AutoFocus {
  
  /**
    * Whether to show the date picker button.
    * @default true
    * @deprecated Use `date` instead
    */
  var calendar: js.UndefOr[Boolean] = js.native
  
  /**
    * Adds a css class to the input container element.
    */
  var containerClassName: js.UndefOr[String] = js.native
  
  /**
    * Set the culture of the DateTimePicker, passed to the configured localizer.
    */
  var culture: js.UndefOr[String] = js.native
  
  /**
    * Default current date at which the calendar opens. If none is provided, opens at today's
    * date or the value date (if any).
    * @default Date()
    */
  var currentDate: js.UndefOr[Date] = js.native
  
  /**
    * Default value for current date. Useful for suggesting a date when the caldenar opens without keep forcing it once 'value' is set.
    */
  var date: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the element used to render the calendar dropdown icon.
    */
  var dateIcon: js.UndefOr[Element] = js.native
  
  /**
    * Default current date
    */
  var defaultCurrentDate: js.UndefOr[Date] = js.native
  
  /**
    * The defaultOpen prop can be used to set an
    * initialization value for uncontrolled widgets.
    */
  var defaultOpen: js.UndefOr[Open] = js.native
  
  /**
    * Default value.
    */
  var defaultValue: js.UndefOr[Date] = js.native
  
  /**
    * The speed, in milliseconds, of the either dropdown animation.
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * A string format to be used while the date input has focus. Useful for showing a simpler
    * format for inputing.
    */
  var editFormat: js.UndefOr[String] = js.native
  
  /**
    * The highest level view the calendar can navigate up to. This value should be higher than
    * initialView.
    */
  var finalView: js.UndefOr[month | year | decade | century] = js.native
  
  /**
    * A string format used to display the date value.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * The starting and lowest level view the calendar can navigate down to.
    */
  var initialView: js.UndefOr[month | year | decade | century] = js.native
  
  /**
    * An object of props that is passed directly to the underlying input component.
    */
  var inputProps: js.UndefOr[js.Object] = js.native
  
  /**
    * The maximum Date that can be selected. Max only limits selection, it doesn't constrain
    * the date values that can be typed or pasted into the widget. If you need this behavior
    * you can constrain values via the onChange handler.
    * @default Date(2099, 11, 31)
    */
  var max: js.UndefOr[Date] = js.native
  
  /**
    * Object hash containing display text and/or text for screen readers. Use the messages
    * object to localize widget text and increase accessibility.
    */
  var messages: js.UndefOr[DateTimePickerMessages] = js.native
  
  /**
    * The minimum Date that can be selected. Min only limits selection, it doesn't constrain
    * the date values that can be typed or pasted into the widget. If you need this behavior
    * you can constrain values via the onChange handler.
    * @default Date(1900, 0, 1)
    */
  var min: js.UndefOr[Date] = js.native
  
  /**
    * The HTML name attribute, passed directly to the input element.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The native onBlur event, called when focus leaves the DateTimePicker entirely.
    */
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Change event Handler that is called when the value is changed. The handler is called with
    * both the current Date object (or null if it was not parseable), and the second argument
    * is a string representation of the date value, formated by the format prop.
    */
  var onChange: js.UndefOr[
    js.Function2[/* date */ js.UndefOr[Date], /* dateStr */ js.UndefOr[String], Unit]
  ] = js.native
  
  /**
    * Change event Handler that is called when the currentDate is changed. The handler is
    * called with the currentDate object.
    */
  var onCurrentDateChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[Date], Unit]] = js.native
  
  /**
    * The native onFocus event, called when focus enters the DateTimePicker.
    */
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent[_], Unit]] = js.native
  
  /**
    * The native onKeyPress event, called preventDefault will stop any custom behavior.
    */
  var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent[_], Unit]] = js.native
  
  /**
    * This handler fires when an item has been selected from the list or calendar. It fires
    * before the onChange handler, and fires regardless of whether the value has actually
    * changed.
    */
  var onSelect: js.UndefOr[js.Function1[/* date */ js.UndefOr[Date], Unit]] = js.native
  
  /**
    * Called when the DateTimePicker is about to open or close. onToggle should be used when
    * the open prop is set otherwise the widget will never open or close.
    */
  var onToggle: js.UndefOr[js.Function1[/* isOpen */ Open, Unit]] = js.native
  
  /**
    * Whether or not the DateTimePicker is open. When unset (undefined) the DateTimePicker will
    * handle the opening and closing internally.
    * @default false
    */
  var open: js.UndefOr[Open] = js.native
  
  /**
    * Determines how the widget parses the typed date string into a Date object. You can
    * provide an array of formats to try, or provide a function that returns a date to handle
    * parsing yourself. When parse is unspecified and the format prop is a String parse will
    * automatically use that format as its default
    */
  var parse: js.UndefOr[(js.Function1[/* str */ String, Date]) | js.Array[String] | String] = js.native
  
  /**
    * Text to display in the input when the value is empty.
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * A Transition component from react-transition-group v2.
    * The provided component will be used instead of the default SlideDownTransition for fully customizable animations.
    * The transition component is also injected with a dropUp prop indicating the direction it should open.
    */
  var popupTransition: js.UndefOr[ReactType[_] | String] = js.native
  
  /**
    * The amount of minutes between each entry in the time list.
    */
  var step: js.UndefOr[Double | Boolean] = js.native
  
  /**
    * Whether to show the time picker button.
    * @default true
    */
  var time: js.UndefOr[Boolean] = js.native
  
  /**
    * A customize the rendering of times but providing a custom component.
    */
  var timeComponent: js.UndefOr[ReactType[_] | String] = js.native
  
  /**
    * A string format used by the time dropdown to render times.
    */
  var timeFormat: js.UndefOr[String] = js.native
  
  /**
    * Specify the element used to render the time list dropdown icon.
    */
  var timeIcon: js.UndefOr[Element] = js.native
  
  /**
    * The current selected date, should be a Date instance or null.
    */
  var value: js.UndefOr[Date] = js.native
}
object DateTimePickerProps {
  
  @scala.inline
  def apply(): DateTimePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimePickerProps]
  }
  
  @scala.inline
  implicit class DateTimePickerPropsOps[Self <: DateTimePickerProps] (val x: Self) extends AnyVal {
    
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
    def setCalendar(value: Boolean): Self = this.set("calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    
    @scala.inline
    def setCurrentDate(value: Date): Self = this.set("currentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentDate: Self = this.set("currentDate", js.undefined)
    
    @scala.inline
    def setDate(value: Boolean): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDateIcon(value: Element): Self = this.set("dateIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateIcon: Self = this.set("dateIcon", js.undefined)
    
    @scala.inline
    def setDefaultCurrentDate(value: Date): Self = this.set("defaultCurrentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCurrentDate: Self = this.set("defaultCurrentDate", js.undefined)
    
    @scala.inline
    def setDefaultOpen(value: Open): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Date): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEditFormat(value: String): Self = this.set("editFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditFormat: Self = this.set("editFormat", js.undefined)
    
    @scala.inline
    def setFinalView(value: month | year | decade | century): Self = this.set("finalView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalView: Self = this.set("finalView", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setInitialView(value: month | year | decade | century): Self = this.set("initialView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialView: Self = this.set("initialView", js.undefined)
    
    @scala.inline
    def setInputProps(value: js.Object): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setMax(value: Date): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMessages(value: DateTimePickerMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMin(value: Date): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* date */ js.UndefOr[Date], /* dateStr */ js.UndefOr[String]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnCurrentDateChange(value: /* date */ js.UndefOr[Date] => Unit): Self = this.set("onCurrentDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCurrentDateChange: Self = this.set("onCurrentDateChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* event */ KeyboardEvent[_] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: /* event */ KeyboardEvent[_] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* date */ js.UndefOr[Date] => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnToggle(value: /* isOpen */ Open => Unit): Self = this.set("onToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    
    @scala.inline
    def setOpen(value: Open): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setParseVarargs(value: String*): Self = this.set("parse", js.Array(value :_*))
    
    @scala.inline
    def setParseFunction1(value: /* str */ String => Date): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParse(value: (js.Function1[/* str */ String, Date]) | js.Array[String] | String): Self = this.set("parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPopupTransition(value: ReactType[_] | String): Self = this.set("popupTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupTransition: Self = this.set("popupTransition", js.undefined)
    
    @scala.inline
    def setStep(value: Double | Boolean): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setTime(value: Boolean): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setTimeComponent(value: ReactType[_] | String): Self = this.set("timeComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeComponent: Self = this.set("timeComponent", js.undefined)
    
    @scala.inline
    def setTimeFormat(value: String): Self = this.set("timeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeFormat: Self = this.set("timeFormat", js.undefined)
    
    @scala.inline
    def setTimeIcon(value: Element): Self = this.set("timeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeIcon: Self = this.set("timeIcon", js.undefined)
    
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
