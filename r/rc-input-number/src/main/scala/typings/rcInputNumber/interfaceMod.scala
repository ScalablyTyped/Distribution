package typings.rcInputNumber

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcInputNumber.rcInputNumberStrings.large
    - typings.rcInputNumber.rcInputNumberStrings.middle
    - typings.rcInputNumber.rcInputNumberStrings.small
  */
  trait ISize extends StObject
  object ISize {
    
    inline def large: typings.rcInputNumber.rcInputNumberStrings.large = "large".asInstanceOf[typings.rcInputNumber.rcInputNumberStrings.large]
    
    inline def middle: typings.rcInputNumber.rcInputNumberStrings.middle = "middle".asInstanceOf[typings.rcInputNumber.rcInputNumberStrings.middle]
    
    inline def small: typings.rcInputNumber.rcInputNumberStrings.small = "small".asInstanceOf[typings.rcInputNumber.rcInputNumberStrings.small]
  }
  
  trait InputNumberProps
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var autoComplete: String
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var decimalSeparator: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var downHandler: ReactElement
    
    var focusOnUpDown: Boolean
    
    var formatter: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | String], String]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    def onBlur(arg: js.Any*): Unit
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | String], Unit]] = js.undefined
    
    def onFocus(arg: js.Any*): Unit
    
    def onKeyDown(e: js.Any, arg: js.Any*): Unit
    
    def onKeyUp(e: js.Any, arg: js.Any*): Unit
    
    def onMouseUp(arg: js.Any*): Unit
    
    var onPressEnter: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var parser: js.UndefOr[js.Function1[/* displayValue */ js.UndefOr[String], Double | String]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var required: Boolean
    
    var size: js.UndefOr[ISize] = js.undefined
    
    var step: js.UndefOr[Double | String] = js.undefined
    
    var style: CSSProperties
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var upHandler: ReactElement
    
    var useTouch: Boolean
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object InputNumberProps {
    
    inline def apply(
      autoComplete: String,
      downHandler: ReactElement,
      focusOnUpDown: Boolean,
      onBlur: /* repeated */ js.Any => Unit,
      onFocus: /* repeated */ js.Any => Unit,
      onKeyDown: (js.Any, /* repeated */ js.Any) => Unit,
      onKeyUp: (js.Any, /* repeated */ js.Any) => Unit,
      onMouseUp: /* repeated */ js.Any => Unit,
      required: Boolean,
      style: CSSProperties,
      upHandler: ReactElement,
      useTouch: Boolean
    ): InputNumberProps = {
      val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], downHandler = downHandler.asInstanceOf[js.Any], focusOnUpDown = focusOnUpDown.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction2(onKeyDown), onKeyUp = js.Any.fromFunction2(onKeyUp), onMouseUp = js.Any.fromFunction1(onMouseUp), required = required.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], upHandler = upHandler.asInstanceOf[js.Any], useTouch = useTouch.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputNumberProps]
    }
    
    extension [Self <: InputNumberProps](x: Self) {
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
      
      inline def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
      
      inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDownHandler(value: ReactElement): Self = StObject.set(x, "downHandler", value.asInstanceOf[js.Any])
      
      inline def setFocusOnUpDown(value: Boolean): Self = StObject.set(x, "focusOnUpDown", value.asInstanceOf[js.Any])
      
      inline def setFormatter(value: /* value */ js.UndefOr[Double | String] => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnChange(value: /* value */ js.UndefOr[Double | String] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnKeyDown(value: (js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
      
      inline def setOnKeyUp(value: (js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction2(value))
      
      inline def setOnMouseUp(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnPressEnter(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPressEnter", js.Any.fromFunction1(value))
      
      inline def setOnPressEnterUndefined: Self = StObject.set(x, "onPressEnter", js.undefined)
      
      inline def setParser(value: /* displayValue */ js.UndefOr[String] => Double | String): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setSize(value: ISize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUpHandler(value: ReactElement): Self = StObject.set(x, "upHandler", value.asInstanceOf[js.Any])
      
      inline def setUseTouch(value: Boolean): Self = StObject.set(x, "useTouch", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait InputNumberState extends StObject {
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    var inputValue: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object InputNumberState {
    
    inline def apply(): InputNumberState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputNumberState]
    }
    
    extension [Self <: InputNumberState](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
