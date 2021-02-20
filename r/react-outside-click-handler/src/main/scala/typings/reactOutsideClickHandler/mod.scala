package typings.reactOutsideClickHandler

import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline-block`
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline`
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.block
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.contents
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.flex
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-outside-click-handler", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("react-outside-click-handler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-outside-click-handler", "default.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    @scala.inline
    def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DefaultProps extends StObject {
    
    var disabled: Boolean = js.native
    
    var display: block | flex | `inline` | `inline-block` | contents = js.native
    
    var useCapture: Boolean = js.native
  }
  object DefaultProps {
    
    @scala.inline
    def apply(
      disabled: Boolean,
      display: block | flex | `inline` | `inline-block` | contents,
      useCapture: Boolean
    ): DefaultProps = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], useCapture = useCapture.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps]
    }
    
    @scala.inline
    implicit class DefaultPropsMutableBuilder[Self <: DefaultProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay(value: block | flex | `inline` | `inline-block` | contents): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCapture(value: Boolean): Self = StObject.set(x, "useCapture", value.asInstanceOf[js.Any])
    }
  }
  
  type OutsideClickHandler = Component[Props, js.Object, js.Any]
  
  /* Inlined parent std.Partial<react-outside-click-handler.react-outside-click-handler.DefaultProps> */
  @js.native
  trait Props extends StObject {
    
    var children: ReactNode = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var display: js.UndefOr[block | flex | `inline` | `inline-block` | contents] = js.native
    
    def onOutsideClick(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
    
    var useCapture: js.UndefOr[Boolean] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(onOutsideClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Props = {
      val __obj = js.Dynamic.literal(onOutsideClick = js.Any.fromFunction1(onOutsideClick))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDisplay(value: block | flex | `inline` | `inline-block` | contents): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setOnOutsideClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onOutsideClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUseCapture(value: Boolean): Self = StObject.set(x, "useCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCaptureUndefined: Self = StObject.set(x, "useCapture", js.undefined)
    }
  }
}
