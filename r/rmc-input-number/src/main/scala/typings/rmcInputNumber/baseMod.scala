package typings.rmcInputNumber

import typings.react.mod.Component
import typings.rmcInputNumber.anon.Max
import typings.rmcInputNumber.rmcInputNumberStrings.down
import typings.rmcInputNumber.rmcInputNumberStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("rmc-input-number/lib/base", JSImport.Default)
  @js.native
  abstract class default[P /* <: PropsType */, S /* <: StateType */] protected () extends BaseComponent[P, S] {
    def this(props: P) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rmc-input-number/lib/base", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-input-number/lib/base", "default.defaultProps")
    @js.native
    def defaultProps: Max = js.native
    inline def defaultProps_=(x: Max): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BaseComponent[P /* <: PropsType */, S /* <: StateType */] extends Component[P, S, Any] {
    
    def action(`type`: up | down, e: Any): Unit = js.native
    def action(`type`: up | down, e: Any, ratio: Any): Unit = js.native
    def action(`type`: up | down, e: Any, ratio: Any, recursive: Any): Unit = js.native
    def action(`type`: up | down, e: Any, ratio: Unit, recursive: Any): Unit = js.native
    
    var autoStepTimer: Any = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MBaseComponent(nextProps: P): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MBaseComponent(): Unit = js.native
    
    def down(e: Any): Unit = js.native
    def down(e: Any, ratio: Any): Unit = js.native
    def down(e: Any, ratio: Any, recursive: Any): Unit = js.native
    def down(e: Any, ratio: Unit, recursive: Any): Unit = js.native
    
    def getCurrentValidValue(value: Any): Any = js.native
    
    def getMaxPrecision(currentValue: Any): Double = js.native
    def getMaxPrecision(currentValue: Any, ratio: Double): Double = js.native
    
    def getPrecision(value: Any): Double = js.native
    
    def getPrecisionFactor(currentValue: Any): Double = js.native
    def getPrecisionFactor(currentValue: Any, ratio: Double): Double = js.native
    
    def getValidValue(value: Any): Any = js.native
    
    def getValueFromEvent(e: Any): Any = js.native
    
    def isNotCompleteNumber(num: Any): Boolean = js.native
    
    def onBlur(e: Any, args: Any*): Unit = js.native
    
    def onChange(e: Any): Unit = js.native
    
    def onFocus(args: Any*): Unit = js.native
    
    def setValue(v: Any): Unit = js.native
    def setValue(v: Any, callback: Any): Unit = js.native
    
    def step(`type`: up | down, e: Any): Boolean = js.native
    def step(`type`: up | down, e: Any, ratio: Double): Boolean = js.native
    
    def stepCompute(`type`: up | down, `val`: Any, rat: Any): Any = js.native
    
    def stop(): Unit = js.native
    
    def toNumber(num: Any): Any = js.native
    
    def toNumberWhenUserInput(num: Any): Any = js.native
    
    def toPrecisionAsStep(num: Any): Any = js.native
    
    def up(e: Any): Unit = js.native
    def up(e: Any, ratio: Any): Unit = js.native
    def up(e: Any, ratio: Any, recursive: Any): Unit = js.native
    def up(e: Any, ratio: Unit, recursive: Any): Unit = js.native
  }
  
  trait PropsType extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[Any], Unit]] = js.undefined
    
    var parser: js.UndefOr[js.Function1[/* v */ Any, Unit]] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[String | Double] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object PropsType {
    
    inline def apply(): PropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsType]
    }
    
    extension [Self <: PropsType](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnBlur(value: /* e */ Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* e */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setParser(value: /* v */ Any => Unit): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setStep(value: String | Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait StateType extends StObject {
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    var inputValue: js.UndefOr[Double] = js.undefined
    
    var value: Double
  }
  object StateType {
    
    inline def apply(value: Double): StateType = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateType]
    }
    
    extension [Self <: StateType](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setInputValue(value: Double): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
