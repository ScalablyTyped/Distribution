package typings.rmcInputNumber

import typings.react.mod.ReactNode
import typings.rmcInputNumber.anon.FocusOnUpDown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    @scala.inline
    def defaultProps_=(x: FocusOnUpDown): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
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
  
  @js.native
  trait PropsType
    extends typings.rmcInputNumber.baseMod.PropsType {
    
    var className: js.UndefOr[js.Any] = js.native
    
    var downHandler: js.UndefOr[ReactNode] = js.native
    
    var focusOnUpDown: js.UndefOr[Boolean] = js.native
    
    var formatter: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var upHandler: js.UndefOr[ReactNode] = js.native
  }
  object PropsType {
    
    @scala.inline
    def apply(): PropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit class PropsTypeMutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: js.Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDownHandler(value: ReactNode): Self = StObject.set(x, "downHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownHandlerUndefined: Self = StObject.set(x, "downHandler", js.undefined)
      
      @scala.inline
      def setFocusOnUpDown(value: Boolean): Self = StObject.set(x, "focusOnUpDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOnUpDownUndefined: Self = StObject.set(x, "focusOnUpDown", js.undefined)
      
      @scala.inline
      def setFormatter(value: /* v */ js.Any => Unit): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setUpHandler(value: ReactNode): Self = StObject.set(x, "upHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpHandlerUndefined: Self = StObject.set(x, "upHandler", js.undefined)
    }
  }
  
  type StateType = typings.rmcInputNumber.baseMod.StateType
}
