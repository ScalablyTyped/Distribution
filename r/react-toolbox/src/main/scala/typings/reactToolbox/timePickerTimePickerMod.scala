package typings.reactToolbox

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.reactToolboxStrings.`24hr`
import typings.reactToolbox.reactToolboxStrings.ampm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timePickerTimePickerMod {
  
  @JSImport("react-toolbox/components/time_picker/TimePicker", JSImport.Default)
  @js.native
  open class default protected () extends TimePicker {
    def this(props: TimePickerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TimePickerProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/time_picker/TimePicker", "TimePicker")
  @js.native
  open class TimePicker protected ()
    extends Component[TimePickerProps, js.Object, Any] {
    def this(props: TimePickerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TimePickerProps, context: Any) = this()
  }
  
  trait TimePickerProps
    extends StObject
       with /**
    * Additional properties passed to Radio container.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Whether time picker is active.
      * @default false
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Label used for cancel button.
      * @default "Cancel"
      */
    var cancelLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Provide error text which will be displayed under the field.
      */
    var error: js.UndefOr[String] = js.undefined
    
    /**
      * Format to display the clock. It can be 24hr or ampm.
      * @default "24hr"
      */
    var format: js.UndefOr[`24hr` | ampm] = js.undefined
    
    /**
      * A key to identify an Icon from Material Design Icons or a custom Icon Element.
      */
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * This class will be applied to Input component of TimePicker.
      */
    var inputClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The text string to use for the floating label element in the input component.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Label used for 'OK' button on Dialog.
      * @default "Ok"
      */
    var okLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Callback called when the picker value is changed.
      */
    var onChange: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback fired on Input click.
      */
    var onClick: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback fired after dismissing the Dialog.
      */
    var onDismiss: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback called when the ESC key is pressed with the overlay active.
      */
    var onEscKeyDown: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback invoked on Input key press.
      */
    var onKeyPress: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback to be invoked when the dialog overlay is clicked.
      */
    var onOverlayClick: js.UndefOr[js.Function] = js.undefined
    
    /**
      * The input element will be readonly and look like disabled.
      */
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[TimePickerTheme] = js.undefined
    
    /**
      * Datetime object with currrently selected time.
      */
    var value: js.UndefOr[js.Date] = js.undefined
  }
  object TimePickerProps {
    
    inline def apply(): TimePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimePickerProps]
    }
    
    extension [Self <: TimePickerProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setCancelLabel(value: String): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
      
      inline def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFormat(value: `24hr` | ampm): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOkLabel(value: String): Self = StObject.set(x, "okLabel", value.asInstanceOf[js.Any])
      
      inline def setOkLabelUndefined: Self = StObject.set(x, "okLabel", js.undefined)
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDismiss(value: js.Function): Self = StObject.set(x, "onDismiss", value.asInstanceOf[js.Any])
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnEscKeyDown(value: js.Function): Self = StObject.set(x, "onEscKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOnEscKeyDownUndefined: Self = StObject.set(x, "onEscKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: js.Function): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnOverlayClick(value: js.Function): Self = StObject.set(x, "onOverlayClick", value.asInstanceOf[js.Any])
      
      inline def setOnOverlayClickUndefined: Self = StObject.set(x, "onOverlayClick", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setTheme(value: TimePickerTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TimePickerTheme extends StObject {
    
    /**
      * Added to the number which is active in clock face.
      */
    var active: js.UndefOr[String] = js.undefined
    
    /**
      * AM label in dialog header when mode is AM/PM.
      */
    var am: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the dialog when the selected format is AM.
      */
    var amFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Wrapper for AM and PM labels in header when mode is AM/PM.
      */
    var ampm: js.UndefOr[String] = js.undefined
    
    /**
      * Used for buttons inside the dialog of the picker.
      */
    var button: js.UndefOr[String] = js.undefined
    
    /**
      * Clock root class element.
      */
    var clock: js.UndefOr[String] = js.undefined
    
    /**
      * Wrapper for the proper positioning of the clock.
      */
    var clockWrapper: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the dialog component.
      */
    var dialog: js.UndefOr[String] = js.undefined
    
    /**
      * Used to style the clock face.
      */
    var face: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the clock's hand.
      */
    var hand: js.UndefOr[String] = js.undefined
    
    /**
      * Dialog header wrapper class.
      */
    var header: js.UndefOr[String] = js.undefined
    
    /**
      * Used for hours in dialog header.
      */
    var hours: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the dialog hours are displayed.
      */
    var hoursDisplay: js.UndefOr[String] = js.undefined
    
    /**
      * Used for Input element that opens the picker.
      */
    var input: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the knob of the hand.
      */
    var knob: js.UndefOr[String] = js.undefined
    
    /**
      * Used for minutes in dialog header.
      */
    var minutes: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the dialog minutes are displayed.
      */
    var minutesDisplay: js.UndefOr[String] = js.undefined
    
    /**
      * Each of the numbers in the clock's face.
      */
    var number: js.UndefOr[String] = js.undefined
    
    /**
      * Placeholder for the clock inside the dialog (inner wrapper).
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * PM label in dialog header when mode is AM/PM.
      */
    var pm: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the dialog when the selected format is PM.
      */
    var pmFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Is the : separator between hours and minutes in dialog header.
      */
    var separator: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the knob when no round number is selected.
      */
    var small: js.UndefOr[String] = js.undefined
  }
  object TimePickerTheme {
    
    inline def apply(): TimePickerTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimePickerTheme]
    }
    
    extension [Self <: TimePickerTheme](x: Self) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAm(value: String): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
      
      inline def setAmFormat(value: String): Self = StObject.set(x, "amFormat", value.asInstanceOf[js.Any])
      
      inline def setAmFormatUndefined: Self = StObject.set(x, "amFormat", js.undefined)
      
      inline def setAmUndefined: Self = StObject.set(x, "am", js.undefined)
      
      inline def setAmpm(value: String): Self = StObject.set(x, "ampm", value.asInstanceOf[js.Any])
      
      inline def setAmpmUndefined: Self = StObject.set(x, "ampm", js.undefined)
      
      inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setClock(value: String): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
      
      inline def setClockUndefined: Self = StObject.set(x, "clock", js.undefined)
      
      inline def setClockWrapper(value: String): Self = StObject.set(x, "clockWrapper", value.asInstanceOf[js.Any])
      
      inline def setClockWrapperUndefined: Self = StObject.set(x, "clockWrapper", js.undefined)
      
      inline def setDialog(value: String): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
      
      inline def setFace(value: String): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
      
      inline def setFaceUndefined: Self = StObject.set(x, "face", js.undefined)
      
      inline def setHand(value: String): Self = StObject.set(x, "hand", value.asInstanceOf[js.Any])
      
      inline def setHandUndefined: Self = StObject.set(x, "hand", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHours(value: String): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setHoursDisplay(value: String): Self = StObject.set(x, "hoursDisplay", value.asInstanceOf[js.Any])
      
      inline def setHoursDisplayUndefined: Self = StObject.set(x, "hoursDisplay", js.undefined)
      
      inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setKnob(value: String): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
      
      inline def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
      
      inline def setMinutes(value: String): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesDisplay(value: String): Self = StObject.set(x, "minutesDisplay", value.asInstanceOf[js.Any])
      
      inline def setMinutesDisplayUndefined: Self = StObject.set(x, "minutesDisplay", js.undefined)
      
      inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPm(value: String): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
      
      inline def setPmFormat(value: String): Self = StObject.set(x, "pmFormat", value.asInstanceOf[js.Any])
      
      inline def setPmFormatUndefined: Self = StObject.set(x, "pmFormat", js.undefined)
      
      inline def setPmUndefined: Self = StObject.set(x, "pm", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    }
  }
}
