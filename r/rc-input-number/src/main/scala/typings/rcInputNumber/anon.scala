package typings.rcInputNumber

import typings.rcInputNumber.interfaceMod.ISize
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<rc-input-number.rc-input-number/es/interface.InputNumberProps> */
  trait PartialInputNumberProps extends StObject {
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var decimalSeparator: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var downHandler: js.UndefOr[ReactElement] = js.undefined
    
    var focusOnUpDown: js.UndefOr[Boolean] = js.undefined
    
    var formatter: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | String], String]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | String], Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function2[/* e */ js.Any, /* repeated */ js.Any, Unit]] = js.undefined
    
    var onKeyUp: js.UndefOr[js.Function2[/* e */ js.Any, /* repeated */ js.Any, Unit]] = js.undefined
    
    var onMouseUp: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var onPressEnter: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var parser: js.UndefOr[js.Function1[/* displayValue */ js.UndefOr[String], Double | String]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[ISize] = js.undefined
    
    var step: js.UndefOr[Double | String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var upHandler: js.UndefOr[ReactElement] = js.undefined
    
    var useTouch: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object PartialInputNumberProps {
    
    @scala.inline
    def apply(): PartialInputNumberProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInputNumberProps]
    }
    
    @scala.inline
    implicit class PartialInputNumberPropsMutableBuilder[Self <: PartialInputNumberProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDownHandler(value: ReactElement): Self = StObject.set(x, "downHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownHandlerUndefined: Self = StObject.set(x, "downHandler", js.undefined)
      
      @scala.inline
      def setFocusOnUpDown(value: Boolean): Self = StObject.set(x, "focusOnUpDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOnUpDownUndefined: Self = StObject.set(x, "focusOnUpDown", js.undefined)
      
      @scala.inline
      def setFormatter(value: /* value */ js.UndefOr[Double | String] => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.UndefOr[Double | String] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: (/* e */ js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: (/* e */ js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPressEnter(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPressEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressEnterUndefined: Self = StObject.set(x, "onPressEnter", js.undefined)
      
      @scala.inline
      def setParser(value: /* displayValue */ js.UndefOr[String] => Double | String): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setSize(value: ISize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUpHandler(value: ReactElement): Self = StObject.set(x, "upHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpHandlerUndefined: Self = StObject.set(x, "upHandler", js.undefined)
      
      @scala.inline
      def setUseTouch(value: Boolean): Self = StObject.set(x, "useTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTouchUndefined: Self = StObject.set(x, "useTouch", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
