package typings.rcRate

import typings.rcRate.esStarMod.StarProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLUListElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRateMod {
  
  @JSImport("rc-rate/es/Rate", JSImport.Default)
  @js.native
  open class default protected () extends Rate {
    def this(props: RateProps) = this()
  }
  object default {
    
    @JSImport("rc-rate/es/Rate", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-rate/es/Rate", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-rate/es/Rate", "default.defaultProps.allowClear")
      @js.native
      def allowClear: Boolean = js.native
      inline def allowClear_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowClear")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate/es/Rate", "default.defaultProps.allowHalf")
      @js.native
      def allowHalf: Boolean = js.native
      inline def allowHalf_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowHalf")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate/es/Rate", "default.defaultProps.character")
      @js.native
      def character: String = js.native
      inline def character_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("character")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate/es/Rate", "default.defaultProps.count")
      @js.native
      def count: Double = js.native
      inline def count_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate/es/Rate", "default.defaultProps.defaultValue")
      @js.native
      def defaultValue: Double = js.native
      inline def defaultValue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate/es/Rate", "default.defaultProps.direction")
      @js.native
      def direction: String = js.native
      inline def direction_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate/es/Rate", "default.defaultProps.onChange")
      @js.native
      def onChange: js.Function0[Unit] = js.native
      inline def onChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate/es/Rate", "default.defaultProps.onHoverChange")
      @js.native
      def onHoverChange: js.Function0[Unit] = js.native
      inline def onHoverChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onHoverChange")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate/es/Rate", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate/es/Rate", "default.defaultProps.tabIndex")
      @js.native
      def tabIndex: Double = js.native
      inline def tabIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    inline def getDerivedStateFromProps(nextProps: RateProps, state: RateState): RateState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RateState]
  }
  
  @js.native
  trait Rate extends Component[RateProps, RateState, Any] {
    
    def blur(): Unit = js.native
    
    def changeValue(value: Double): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MRate(): Unit = js.native
    
    def focus(): Unit = js.native
    
    def getStarDOM(index: Double): HTMLElement = js.native
    
    def getStarValue(index: Double, x: Double): Double = js.native
    
    def onBlur(): Unit = js.native
    
    def onClick(event: KeyboardEvent[Element], index: Double): Unit = js.native
    def onClick(event: MouseEvent[Element, NativeMouseEvent], index: Double): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    def onHover(event: MouseEvent[HTMLDivElement, NativeMouseEvent], index: Double): Unit = js.native
    
    var onKeyDown: KeyboardEventHandler[HTMLUListElement] = js.native
    
    def onMouseLeave(): Unit = js.native
    
    var rate: HTMLUListElement = js.native
    
    def saveRate(node: HTMLUListElement): Unit = js.native
    
    def saveRef(index: Double): js.Function1[/* node */ typings.rcRate.esStarMod.default, Unit] = js.native
    
    var stars: Record[String, typings.rcRate.esStarMod.default] = js.native
  }
  
  /* Inlined parent std.Pick<rc-rate.rc-rate/es/Star.StarProps, 'count' | 'character' | 'characterRender' | 'allowHalf' | 'disabled'> */
  trait RateProps extends StObject {
    
    var allowClear: js.UndefOr[Boolean] = js.undefined
    
    var allowHalf: js.UndefOr[Boolean] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var character: js.UndefOr[ReactNode | (js.Function1[/* props */ StarProps, ReactNode])] = js.undefined
    
    var characterRender: js.UndefOr[js.Function2[/* origin */ ReactElement, /* props */ StarProps, ReactNode]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var defaultValue: js.UndefOr[Double] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onHoverChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLUListElement]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object RateProps {
    
    inline def apply(): RateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RateProps]
    }
    
    extension [Self <: RateProps](x: Self) {
      
      inline def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      inline def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      inline def setAllowHalf(value: Boolean): Self = StObject.set(x, "allowHalf", value.asInstanceOf[js.Any])
      
      inline def setAllowHalfUndefined: Self = StObject.set(x, "allowHalf", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCharacter(value: ReactNode | (js.Function1[/* props */ StarProps, ReactNode])): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      inline def setCharacterFunction1(value: /* props */ StarProps => ReactNode): Self = StObject.set(x, "character", js.Any.fromFunction1(value))
      
      inline def setCharacterRender(value: (/* origin */ ReactElement, /* props */ StarProps) => ReactNode): Self = StObject.set(x, "characterRender", js.Any.fromFunction2(value))
      
      inline def setCharacterRenderUndefined: Self = StObject.set(x, "characterRender", js.undefined)
      
      inline def setCharacterUndefined: Self = StObject.set(x, "character", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnHoverChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onHoverChange", js.Any.fromFunction1(value))
      
      inline def setOnHoverChangeUndefined: Self = StObject.set(x, "onHoverChange", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RateState extends StObject {
    
    var cleanedValue: Double
    
    var focused: Boolean
    
    var hoverValue: js.UndefOr[Double] = js.undefined
    
    var value: Double
  }
  object RateState {
    
    inline def apply(cleanedValue: Double, focused: Boolean, value: Double): RateState = {
      val __obj = js.Dynamic.literal(cleanedValue = cleanedValue.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RateState]
    }
    
    extension [Self <: RateState](x: Self) {
      
      inline def setCleanedValue(value: Double): Self = StObject.set(x, "cleanedValue", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setHoverValue(value: Double): Self = StObject.set(x, "hoverValue", value.asInstanceOf[js.Any])
      
      inline def setHoverValueUndefined: Self = StObject.set(x, "hoverValue", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
