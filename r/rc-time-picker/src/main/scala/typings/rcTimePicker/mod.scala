package typings.rcTimePicker

import typings.moment.mod.Moment
import typings.rcTimePicker.anon.Open
import typings.rcTimePicker.anon.PartialTimePickerProps
import typings.rcTimePicker.anon.ReadonlyPartialTimePicker
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-time-picker", JSImport.Namespace)
  @js.native
  class ^ protected () extends TimePicker {
    def this(props: ReadonlyPartialTimePicker) = this()
  }
  
  @js.native
  trait TimePicker
    extends Component[PartialTimePickerProps, js.Object, js.Any] {
    
    def close(): Unit = js.native
    
    def isAM(): Boolean = js.native
  }
  
  trait TimePickerProps extends StObject {
    
    def addon(timepicker: TimePicker): Element
    
    var allowEmpty: Boolean
    
    var className: String
    
    var clearIcon: ReactNode
    
    var clearText: String
    
    var defaultOpenValue: Moment
    
    var defaultValue: Moment
    
    var disabled: Boolean
    
    def disabledHours(): js.Array[Double]
    
    def disabledMinutes(hour: Double): js.Array[Double]
    
    def disabledSeconds(hour: Double, minute: Double): js.Array[Double]
    
    var focusOnOpen: Boolean
    
    var format: String
    
    var hideDisabledOptions: Boolean
    
    var hourStep: Double
    
    var id: String
    
    var inputIcon: ReactNode
    
    var inputReadOnly: Boolean
    
    var minuteStep: Double
    
    def onChange(value: Moment): Unit
    
    def onClose(state: Open): Unit
    
    def onOpen(state: Open): Unit
    
    var open: Boolean
    
    var placeholder: String
    
    var placement: String
    
    var popupClassName: String
    
    var prefixCls: String
    
    var secondStep: Double
    
    var showHour: Boolean
    
    var showMinute: Boolean
    
    var showSecond: Boolean
    
    var transitionName: String
    
    var use12Hours: Boolean
    
    var value: Moment
  }
  object TimePickerProps {
    
    inline def apply(
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
    
    extension [Self <: TimePickerProps](x: Self) {
      
      inline def setAddon(value: TimePicker => Element): Self = StObject.set(x, "addon", js.Any.fromFunction1(value))
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClearIcon(value: ReactNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      inline def setClearText(value: String): Self = StObject.set(x, "clearText", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenValue(value: Moment): Self = StObject.set(x, "defaultOpenValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValue(value: Moment): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledHours(value: () => js.Array[Double]): Self = StObject.set(x, "disabledHours", js.Any.fromFunction0(value))
      
      inline def setDisabledMinutes(value: Double => js.Array[Double]): Self = StObject.set(x, "disabledMinutes", js.Any.fromFunction1(value))
      
      inline def setDisabledSeconds(value: (Double, Double) => js.Array[Double]): Self = StObject.set(x, "disabledSeconds", js.Any.fromFunction2(value))
      
      inline def setFocusOnOpen(value: Boolean): Self = StObject.set(x, "focusOnOpen", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
      
      inline def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInputIcon(value: ReactNode): Self = StObject.set(x, "inputIcon", value.asInstanceOf[js.Any])
      
      inline def setInputIconUndefined: Self = StObject.set(x, "inputIcon", js.undefined)
      
      inline def setInputReadOnly(value: Boolean): Self = StObject.set(x, "inputReadOnly", value.asInstanceOf[js.Any])
      
      inline def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: Moment => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnClose(value: Open => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnOpen(value: Open => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
      
      inline def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
      
      inline def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
      
      inline def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Moment): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
