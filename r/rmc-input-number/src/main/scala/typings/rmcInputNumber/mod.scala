package typings.rmcInputNumber

import typings.react.mod.ReactNode
import typings.rmcInputNumber.anon.FocusOnUpDown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-input-number", JSImport.Default)
  @js.native
  class default () extends InputNumber
  /* static members */
  object default {
    
    @JSImport("rmc-input-number", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-input-number", "default.defaultProps")
    @js.native
    def defaultProps: FocusOnUpDown = js.native
    inline def defaultProps_=(x: FocusOnUpDown): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait InputNumber
    extends typings.rmcInputNumber.baseMod.default[PropsType, StateType] {
    
    @JSName("componentDidMount")
    def componentDidMount_MInputNumber(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInputNumber(): Unit = js.native
    
    @JSName("componentWillUpdate")
    def componentWillUpdate_MInputNumber(): Unit = js.native
    
    var end: js.Any = js.native
    
    def focus(): Unit = js.native
    
    def formatWrapper(num: js.Any): js.Any = js.native
    
    def getRatio(e: js.Any): Double = js.native
    
    var input: js.Any = js.native
    
    def setInput(input: js.Any): Unit = js.native
    
    var start: js.Any = js.native
  }
  
  trait PropsType
    extends StObject
       with typings.rmcInputNumber.baseMod.PropsType {
    
    var className: js.UndefOr[js.Any] = js.undefined
    
    var downHandler: js.UndefOr[ReactNode] = js.undefined
    
    var focusOnUpDown: js.UndefOr[Boolean] = js.undefined
    
    var formatter: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var upHandler: js.UndefOr[ReactNode] = js.undefined
  }
  object PropsType {
    
    inline def apply(): PropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsType]
    }
    
    extension [Self <: PropsType](x: Self) {
      
      inline def setClassName(value: js.Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDownHandler(value: ReactNode): Self = StObject.set(x, "downHandler", value.asInstanceOf[js.Any])
      
      inline def setDownHandlerUndefined: Self = StObject.set(x, "downHandler", js.undefined)
      
      inline def setFocusOnUpDown(value: Boolean): Self = StObject.set(x, "focusOnUpDown", value.asInstanceOf[js.Any])
      
      inline def setFocusOnUpDownUndefined: Self = StObject.set(x, "focusOnUpDown", js.undefined)
      
      inline def setFormatter(value: /* v */ js.Any => Unit): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setUpHandler(value: ReactNode): Self = StObject.set(x, "upHandler", value.asInstanceOf[js.Any])
      
      inline def setUpHandlerUndefined: Self = StObject.set(x, "upHandler", js.undefined)
    }
  }
  
  type StateType = typings.rmcInputNumber.baseMod.StateType
}
