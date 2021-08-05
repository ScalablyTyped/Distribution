package typings.primereact

import typings.primereact.anon.Target
import typings.primereact.anon.Value
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.Component
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputNumberMod {
  
  @JSImport("primereact/components/inputnumber/InputNumber", "InputNumber")
  @js.native
  class InputNumber protected ()
    extends Component[InputNumberProps, js.Any, js.Any] {
    def this(props: InputNumberProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InputNumberProps, context: js.Any) = this()
  }
  
  trait InputNumberProps extends StObject {
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var buttonLayout: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var currencyDisplay: js.UndefOr[String] = js.undefined
    
    var decrementButtonClassName: js.UndefOr[String] = js.undefined
    
    var decrementButtonIcon: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var incrementButtonClassName: js.UndefOr[String] = js.undefined
    
    var incrementButtonIcon: js.UndefOr[String] = js.undefined
    
    var inputClassName: js.UndefOr[String] = js.undefined
    
    var inputId: js.UndefOr[String] = js.undefined
    
    var inputMode: js.UndefOr[String] = js.undefined
    
    var inputStyle: js.UndefOr[js.Object] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var localeMatcher: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxFractionDigits: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var minFractionDigits: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onValueChange: js.UndefOr[js.Function1[/* e */ Target, Unit]] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var showButtons: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var useGrouping: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object InputNumberProps {
    
    inline def apply(): InputNumberProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputNumberProps]
    }
    
    extension [Self <: InputNumberProps](x: Self) {
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setButtonLayout(value: String): Self = StObject.set(x, "buttonLayout", value.asInstanceOf[js.Any])
      
      inline def setButtonLayoutUndefined: Self = StObject.set(x, "buttonLayout", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyDisplay(value: String): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
      
      inline def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setDecrementButtonClassName(value: String): Self = StObject.set(x, "decrementButtonClassName", value.asInstanceOf[js.Any])
      
      inline def setDecrementButtonClassNameUndefined: Self = StObject.set(x, "decrementButtonClassName", js.undefined)
      
      inline def setDecrementButtonIcon(value: String): Self = StObject.set(x, "decrementButtonIcon", value.asInstanceOf[js.Any])
      
      inline def setDecrementButtonIconUndefined: Self = StObject.set(x, "decrementButtonIcon", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIncrementButtonClassName(value: String): Self = StObject.set(x, "incrementButtonClassName", value.asInstanceOf[js.Any])
      
      inline def setIncrementButtonClassNameUndefined: Self = StObject.set(x, "incrementButtonClassName", js.undefined)
      
      inline def setIncrementButtonIcon(value: String): Self = StObject.set(x, "incrementButtonIcon", value.asInstanceOf[js.Any])
      
      inline def setIncrementButtonIconUndefined: Self = StObject.set(x, "incrementButtonIcon", js.undefined)
      
      inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      inline def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setInputStyle(value: js.Object): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleMatcher(value: String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxFractionDigits(value: Double): Self = StObject.set(x, "maxFractionDigits", value.asInstanceOf[js.Any])
      
      inline def setMaxFractionDigitsUndefined: Self = StObject.set(x, "maxFractionDigits", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinFractionDigits(value: Double): Self = StObject.set(x, "minFractionDigits", value.asInstanceOf[js.Any])
      
      inline def setMinFractionDigitsUndefined: Self = StObject.set(x, "minFractionDigits", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* e */ Event => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ Value => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* e */ Event => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnValueChange(value: /* e */ Target => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setShowButtons(value: Boolean): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
      
      inline def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      inline def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
      
      inline def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
