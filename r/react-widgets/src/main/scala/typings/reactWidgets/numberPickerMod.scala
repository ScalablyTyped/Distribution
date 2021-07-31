package typings.reactWidgets

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactWidgets.commonPropsMod.AutoFocus
import typings.reactWidgets.commonPropsMod.ReactWidgetsCommonProps
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberPickerMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-widgets/lib/NumberPicker", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends Component[NumberPickerProps, ComponentState, js.Any] {
    def this(props: NumberPickerProps) = this()
    def this(props: NumberPickerProps, context: js.Any) = this()
  }
  @JSImport("react-widgets/lib/NumberPicker", JSImport.Namespace)
  @js.native
  val ^ : js.Object & NumberPickerClass = js.native
  
  type NumberPickerClass = ComponentClass[NumberPickerProps, ComponentState]
  
  trait NumberPickerMessages extends StObject {
    
    /**
      * Number picker spinner down button text for screen readers.
      * @default "decrement value"
      */
    var decrement: js.UndefOr[String] = js.undefined
    
    /**
      * Number picker spinner up button text for screen readers.
      * @default "increment value"
      */
    var increment: js.UndefOr[String] = js.undefined
  }
  object NumberPickerMessages {
    
    @scala.inline
    def apply(): NumberPickerMessages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberPickerMessages]
    }
    
    @scala.inline
    implicit class NumberPickerMessagesMutableBuilder[Self <: NumberPickerMessages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecrement(value: String): Self = StObject.set(x, "decrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecrementUndefined: Self = StObject.set(x, "decrement", js.undefined)
      
      @scala.inline
      def setIncrement(value: String): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
    }
  }
  
  trait NumberPickerProps
    extends StObject
       with ReactWidgetsCommonProps
       with AutoFocus {
    
    /**
      * Set the culture of the NumberPicker, passed to the configured localizer.
      */
    var culture: js.UndefOr[String] = js.undefined
    
    /**
      * Default Value.
      */
    var defaultValue: js.UndefOr[Double] = js.undefined
    
    /**
      * A format string used to display the number value. Localizer dependent, read localization
      * for more info.
      * @see http://jquense.github.io/react-widgets/docs/#i18n
      */
    var format: js.UndefOr[js.Any] = js.undefined
    
    /**
      * An object of props that is passed directly to the underlying input component.
      */
    var inputProps: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The maximum number that the NumberPicker value.
      * @default Infinity
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * Object hash containing display text and/or text for screen readers. Use the messages
      * object to localize widget text and increase accessibility.
      */
    var messages: js.UndefOr[NumberPickerMessages] = js.undefined
    
    /**
      * The minimum number that the NumberPicker value.
      * @default -Infinity
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * The HTML name attribute, passed directly to the input element.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Change event Handler that is called when the value is changed. The handler is called with
      * the current numeric value or null.
      */
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.undefined
    
    /**
      * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
      */
    var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
    
    /**
      * The native onKeyPress event, called preventDefault will stop any custom behavior.
      */
    var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
    
    /**
      * Controls the visibility of the NumberPicker popup. Use defaultOpen to set an initial value for uncontrolled widgets.
      * @default false
      */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines how the NumberPicker parses a number from the localized string representation.
      * You can also provide a parser Function to pair with a custom format.
      */
    var parse: js.UndefOr[
        js.Array[String] | (js.Function2[/* str */ String, /* culture */ String, Double])
      ] = js.undefined
    
    /**
      * Text to display in the input when the value is empty.
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Specify how precise the value should be when typing, incrementing, or decrementing the
      * value. When empty, precision is parsed from the current format and culture.
      */
    var precision: js.UndefOr[Double] = js.undefined
    
    /**
      * Amount to increase or decrease value when using the spinner buttons.
      * @default 1
      */
    var step: js.UndefOr[Double] = js.undefined
    
    /**
      * The current value of the NumberPicker.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object NumberPickerProps {
    
    @scala.inline
    def apply(): NumberPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberPickerProps]
    }
    
    @scala.inline
    implicit class NumberPickerPropsMutableBuilder[Self <: NumberPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setFormat(value: js.Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setInputProps(value: js.Object): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMessages(value: NumberPickerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* event */ KeyboardEvent => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: /* event */ KeyboardEvent => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setParse(value: js.Array[String] | (js.Function2[/* str */ String, /* culture */ String, Double])): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseFunction2(value: (/* str */ String, /* culture */ String) => Double): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setParseVarargs(value: String*): Self = StObject.set(x, "parse", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = js.Object & NumberPickerClass
  
  /* This means you don't have to write `^`, but can instead just say `numberPickerMod.foo` */
  override def _to: js.Object & NumberPickerClass = ^
}
