package typings.rcTimePicker.mod

import typings.moment.mod.Moment
import typings.rcTimePicker.anon.Open
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerProps extends js.Object {
  
  def addon(timepicker: TimePicker): Element = js.native
  
  var allowEmpty: Boolean = js.native
  
  var className: String = js.native
  
  var clearIcon: ReactNode = js.native
  
  var clearText: String = js.native
  
  var defaultOpenValue: Moment = js.native
  
  var defaultValue: Moment = js.native
  
  var disabled: Boolean = js.native
  
  def disabledHours(): js.Array[Double] = js.native
  
  def disabledMinutes(hour: Double): js.Array[Double] = js.native
  
  def disabledSeconds(hour: Double, minute: Double): js.Array[Double] = js.native
  
  var focusOnOpen: Boolean = js.native
  
  var format: String = js.native
  
  var hideDisabledOptions: Boolean = js.native
  
  var hourStep: Double = js.native
  
  var id: String = js.native
  
  var inputIcon: ReactNode = js.native
  
  var inputReadOnly: Boolean = js.native
  
  var minuteStep: Double = js.native
  
  def onChange(value: Moment): Unit = js.native
  
  def onClose(state: Open): Unit = js.native
  
  def onOpen(state: Open): Unit = js.native
  
  var open: Boolean = js.native
  
  var placeholder: String = js.native
  
  var placement: String = js.native
  
  var popupClassName: String = js.native
  
  var prefixCls: String = js.native
  
  var secondStep: Double = js.native
  
  var showHour: Boolean = js.native
  
  var showMinute: Boolean = js.native
  
  var showSecond: Boolean = js.native
  
  var transitionName: String = js.native
  
  var use12Hours: Boolean = js.native
  
  var value: Moment = js.native
}
object TimePickerProps {
  
  @scala.inline
  def apply(
    addon: TimePicker => Element,
    allowEmpty: Boolean,
    className: String,
    clearText: String,
    defaultOpenValue: Moment,
    defaultValue: Moment,
    disabled: Boolean,
    disabledHours: () => js.Array[Double],
    disabledMinutes: Double => js.Array[Double],
    disabledSeconds: (Double, Double) => js.Array[Double],
    focusOnOpen: Boolean,
    format: String,
    hideDisabledOptions: Boolean,
    hourStep: Double,
    id: String,
    inputReadOnly: Boolean,
    minuteStep: Double,
    onChange: Moment => Unit,
    onClose: Open => Unit,
    onOpen: Open => Unit,
    open: Boolean,
    placeholder: String,
    placement: String,
    popupClassName: String,
    prefixCls: String,
    secondStep: Double,
    showHour: Boolean,
    showMinute: Boolean,
    showSecond: Boolean,
    transitionName: String,
    use12Hours: Boolean,
    value: Moment
  ): TimePickerProps = {
    val __obj = js.Dynamic.literal(addon = js.Any.fromFunction1(addon), allowEmpty = allowEmpty.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], clearText = clearText.asInstanceOf[js.Any], defaultOpenValue = defaultOpenValue.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledHours = js.Any.fromFunction0(disabledHours), disabledMinutes = js.Any.fromFunction1(disabledMinutes), disabledSeconds = js.Any.fromFunction2(disabledSeconds), focusOnOpen = focusOnOpen.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], hideDisabledOptions = hideDisabledOptions.asInstanceOf[js.Any], hourStep = hourStep.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputReadOnly = inputReadOnly.asInstanceOf[js.Any], minuteStep = minuteStep.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onClose = js.Any.fromFunction1(onClose), onOpen = js.Any.fromFunction1(onOpen), open = open.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popupClassName = popupClassName.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], secondStep = secondStep.asInstanceOf[js.Any], showHour = showHour.asInstanceOf[js.Any], showMinute = showMinute.asInstanceOf[js.Any], showSecond = showSecond.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any], use12Hours = use12Hours.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerProps]
  }
  
  @scala.inline
  implicit class TimePickerPropsOps[Self <: TimePickerProps] (val x: Self) extends AnyVal {
    
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
    def setAddon(value: TimePicker => Element): Self = this.set("addon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearText(value: String): Self = this.set("clearText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOpenValue(value: Moment): Self = this.set("defaultOpenValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: Moment): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledHours(value: () => js.Array[Double]): Self = this.set("disabledHours", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisabledMinutes(value: Double => js.Array[Double]): Self = this.set("disabledMinutes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisabledSeconds(value: (Double, Double) => js.Array[Double]): Self = this.set("disabledSeconds", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFocusOnOpen(value: Boolean): Self = this.set("focusOnOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDisabledOptions(value: Boolean): Self = this.set("hideDisabledOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourStep(value: Double): Self = this.set("hourStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputReadOnly(value: Boolean): Self = this.set("inputReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteStep(value: Double): Self = this.set("minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: Moment => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClose(value: Open => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpen(value: Open => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupClassName(value: String): Self = this.set("popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondStep(value: Double): Self = this.set("secondStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHour(value: Boolean): Self = this.set("showHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMinute(value: Boolean): Self = this.set("showMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSecond(value: Boolean): Self = this.set("showSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse12Hours(value: Boolean): Self = this.set("use12Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Moment): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIcon(value: ReactNode): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    
    @scala.inline
    def setInputIcon(value: ReactNode): Self = this.set("inputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputIcon: Self = this.set("inputIcon", js.undefined)
  }
}
