package typings.rcSlider

import typings.rcSlider.anon.ClickFocused
import typings.rcSlider.anon.Remove
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handleMod {
  
  @JSImport("rc-slider/lib/Handle", JSImport.Default)
  @js.native
  class default () extends Handle
  
  @js.native
  trait Handle
    extends Component[HandleProps, js.Object, js.Any] {
    
    def blur(): Unit = js.native
    
    def clickFocus(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MHandle(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MHandle(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var handle: HTMLElement = js.native
    
    def handleBlur(): Unit = js.native
    
    def handleKeyDown(): Unit = js.native
    
    def handleMouseDown(e: js.Any): Unit = js.native
    
    def handleMouseUp(): Unit = js.native
    
    var onMouseUpListener: Remove = js.native
    
    def setClickFocus(focused: js.Any): Unit = js.native
    
    def setHandleRef(node: js.Any): Unit = js.native
    
    @JSName("state")
    var state_Handle: ClickFocused = js.native
  }
  
  trait HandleProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var ariaValueTextFormatter: js.UndefOr[js.Function1[/* val */ Double, String]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object HandleProps {
    
    inline def apply(): HandleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleProps]
    }
    
    extension [Self <: HandleProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaValueTextFormatter(value: /* val */ Double => String): Self = StObject.set(x, "ariaValueTextFormatter", js.Any.fromFunction1(value))
      
      inline def setAriaValueTextFormatterUndefined: Self = StObject.set(x, "ariaValueTextFormatter", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
