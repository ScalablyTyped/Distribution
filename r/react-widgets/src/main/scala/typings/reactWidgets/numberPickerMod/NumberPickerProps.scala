package typings.reactWidgets.numberPickerMod

import typings.reactWidgets.commonPropsMod.AutoFocus
import typings.reactWidgets.commonPropsMod.ReactWidgetsCommonProps
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberPickerProps
  extends ReactWidgetsCommonProps
     with AutoFocus {
  
  /**
    * Set the culture of the NumberPicker, passed to the configured localizer.
    */
  var culture: js.UndefOr[String] = js.native
  
  /**
    * Default Value.
    */
  var defaultValue: js.UndefOr[Double] = js.native
  
  /**
    * A format string used to display the number value. Localizer dependent, read localization
    * for more info.
    * @see http://jquense.github.io/react-widgets/docs/#i18n
    */
  var format: js.UndefOr[js.Any] = js.native
  
  /**
    * An object of props that is passed directly to the underlying input component.
    */
  var inputProps: js.UndefOr[js.Object] = js.native
  
  /**
    * The maximum number that the NumberPicker value.
    * @default Infinity
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Object hash containing display text and/or text for screen readers. Use the messages
    * object to localize widget text and increase accessibility.
    */
  var messages: js.UndefOr[NumberPickerMessages] = js.native
  
  /**
    * The minimum number that the NumberPicker value.
    * @default -Infinity
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * The HTML name attribute, passed directly to the input element.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Change event Handler that is called when the value is changed. The handler is called with
    * the current numeric value or null.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.native
  
  /**
    * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  
  /**
    * The native onKeyPress event, called preventDefault will stop any custom behavior.
    */
  var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  
  /**
    * Controls the visibility of the NumberPicker popup. Use defaultOpen to set an initial value for uncontrolled widgets.
    * @default false
    */
  var open: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines how the NumberPicker parses a number from the localized string representation.
    * You can also provide a parser Function to pair with a custom format.
    */
  var parse: js.UndefOr[
    js.Array[String] | (js.Function2[/* str */ String, /* culture */ String, Double])
  ] = js.native
  
  /**
    * Text to display in the input when the value is empty.
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * Specify how precise the value should be when typing, incrementing, or decrementing the
    * value. When empty, precision is parsed from the current format and culture.
    */
  var precision: js.UndefOr[Double] = js.native
  
  /**
    * Amount to increase or decrease value when using the spinner buttons.
    * @default 1
    */
  var step: js.UndefOr[Double] = js.native
  
  /**
    * The current value of the NumberPicker.
    */
  var value: js.UndefOr[Double] = js.native
}
object NumberPickerProps {
  
  @scala.inline
  def apply(): NumberPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberPickerProps]
  }
  
  @scala.inline
  implicit class NumberPickerPropsOps[Self <: NumberPickerProps] (val x: Self) extends AnyVal {
    
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
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setFormat(value: js.Any): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setInputProps(value: js.Object): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMessages(value: NumberPickerMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ js.UndefOr[Double] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* event */ KeyboardEvent => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: /* event */ KeyboardEvent => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setParseFunction2(value: (/* str */ String, /* culture */ String) => Double): Self = this.set("parse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParseVarargs(value: String*): Self = this.set("parse", js.Array(value :_*))
    
    @scala.inline
    def setParse(value: js.Array[String] | (js.Function2[/* str */ String, /* culture */ String, Double])): Self = this.set("parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
