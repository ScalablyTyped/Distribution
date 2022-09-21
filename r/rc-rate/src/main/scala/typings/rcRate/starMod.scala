package typings.rcRate

import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object starMod {
  
  @JSImport("rc-rate/es/Star", JSImport.Default)
  @js.native
  open class default () extends Star
  
  @js.native
  trait Star
    extends Component[StarProps, js.Object, Any] {
    
    def getClassName(): String = js.native
    
    def onClick(e: Any): Unit = js.native
    
    var onHover: MouseEventHandler[HTMLDivElement] = js.native
    
    var onKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
  }
  
  trait StarProps extends StObject {
    
    var allowHalf: js.UndefOr[Boolean] = js.undefined
    
    var character: js.UndefOr[ReactNode | (js.Function1[/* props */ this.type, ReactNode])] = js.undefined
    
    var characterRender: js.UndefOr[js.Function2[/* origin */ ReactElement, /* props */ this.type, ReactNode]] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function2[
          /* e */ (MouseEvent[HTMLDivElement, NativeMouseEvent]) | KeyboardEvent[HTMLDivElement], 
          /* index */ Double, 
          Unit
        ]
      ] = js.undefined
    
    var onHover: js.UndefOr[
        js.Function2[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* index */ Double, Unit]
      ] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object StarProps {
    
    inline def apply(): StarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StarProps]
    }
    
    extension [Self <: StarProps](x: Self) {
      
      inline def setAllowHalf(value: Boolean): Self = StObject.set(x, "allowHalf", value.asInstanceOf[js.Any])
      
      inline def setAllowHalfUndefined: Self = StObject.set(x, "allowHalf", js.undefined)
      
      inline def setCharacter(value: ReactNode | (js.Function1[StarProps, ReactNode])): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      inline def setCharacterFunction1(value: StarProps => ReactNode): Self = StObject.set(x, "character", js.Any.fromFunction1(value))
      
      inline def setCharacterRender(value: (/* origin */ ReactElement, StarProps) => ReactNode): Self = StObject.set(x, "characterRender", js.Any.fromFunction2(value))
      
      inline def setCharacterRenderUndefined: Self = StObject.set(x, "characterRender", js.undefined)
      
      inline def setCharacterUndefined: Self = StObject.set(x, "character", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setOnClick(
        value: (/* e */ (MouseEvent[HTMLDivElement, NativeMouseEvent]) | KeyboardEvent[HTMLDivElement], /* index */ Double) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnHover(value: (/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* index */ Double) => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction2(value))
      
      inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
