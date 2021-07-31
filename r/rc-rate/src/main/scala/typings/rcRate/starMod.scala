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
  class default () extends Star
  
  @js.native
  trait Star
    extends Component[StarProps, js.Object, js.Any] {
    
    def getClassName(): String = js.native
    
    def onClick(e: js.Any): Unit = js.native
    
    var onHover: MouseEventHandler[HTMLDivElement] = js.native
    
    var onKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
  }
  
  trait StarProps extends StObject {
    
    var allowHalf: js.UndefOr[Boolean] = js.undefined
    
    var character: js.UndefOr[ReactNode] = js.undefined
    
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
    
    @scala.inline
    def apply(): StarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StarProps]
    }
    
    @scala.inline
    implicit class StarPropsMutableBuilder[Self <: StarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHalf(value: Boolean): Self = StObject.set(x, "allowHalf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHalfUndefined: Self = StObject.set(x, "allowHalf", js.undefined)
      
      @scala.inline
      def setCharacter(value: ReactNode): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterRender(value: (/* origin */ ReactElement, StarProps) => ReactNode): Self = StObject.set(x, "characterRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCharacterRenderUndefined: Self = StObject.set(x, "characterRender", js.undefined)
      
      @scala.inline
      def setCharacterUndefined: Self = StObject.set(x, "character", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (/* e */ (MouseEvent[HTMLDivElement, NativeMouseEvent]) | KeyboardEvent[HTMLDivElement], /* index */ Double) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnHover(value: (/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* index */ Double) => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
