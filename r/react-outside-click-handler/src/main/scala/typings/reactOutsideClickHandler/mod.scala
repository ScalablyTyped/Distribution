package typings.reactOutsideClickHandler

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline-block`
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline`
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.block
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.contents
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.flex
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-outside-click-handler", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("react-outside-click-handler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-outside-click-handler", "default.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    inline def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait DefaultProps extends StObject {
    
    var disabled: Boolean
    
    var display: block | flex | `inline` | `inline-block` | contents
    
    var useCapture: Boolean
  }
  object DefaultProps {
    
    inline def apply(
      disabled: Boolean,
      display: block | flex | `inline` | `inline-block` | contents,
      useCapture: Boolean
    ): DefaultProps = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], useCapture = useCapture.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultProps] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisplay(value: block | flex | `inline` | `inline-block` | contents): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setUseCapture(value: Boolean): Self = StObject.set(x, "useCapture", value.asInstanceOf[js.Any])
    }
  }
  
  type OutsideClickHandler = Component[Props, js.Object, Any]
  
  /* Inlined parent std.Partial<react-outside-click-handler.react-outside-click-handler.DefaultProps> */
  trait Props extends StObject {
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var display: js.UndefOr[block | flex | `inline` | `inline-block` | contents] = js.undefined
    
    def onOutsideClick(e: MouseEvent): Unit
    
    var useCapture: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    inline def apply(onOutsideClick: MouseEvent => Unit): Props = {
      val __obj = js.Dynamic.literal(onOutsideClick = js.Any.fromFunction1(onOutsideClick))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplay(value: block | flex | `inline` | `inline-block` | contents): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setOnOutsideClick(value: MouseEvent => Unit): Self = StObject.set(x, "onOutsideClick", js.Any.fromFunction1(value))
      
      inline def setUseCapture(value: Boolean): Self = StObject.set(x, "useCapture", value.asInstanceOf[js.Any])
      
      inline def setUseCaptureUndefined: Self = StObject.set(x, "useCapture", js.undefined)
    }
  }
}
