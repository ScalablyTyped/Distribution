package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastHeaderMod {
  
  @JSImport("reactstrap/lib/ToastHeader", JSImport.Default)
  @js.native
  class default ()
    extends Component[ToastHeaderProps, js.Object, js.Any]
  
  type ToastHeader = Component[ToastHeaderProps, js.Object, js.Any]
  
  trait ToastHeaderProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var charCode: js.UndefOr[String | Double] = js.undefined
    
    var close: js.UndefOr[ReactNode] = js.undefined
    
    var closeAriaLabel: js.UndefOr[String] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var icon: js.UndefOr[String | ReactNode] = js.undefined
    
    var tag: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var toggle: js.UndefOr[MouseEventHandler[js.Any]] = js.undefined
    
    var wrapTag: js.UndefOr[ElementType[js.Any]] = js.undefined
  }
  object ToastHeaderProps {
    
    @scala.inline
    def apply(): ToastHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastHeaderProps]
    }
    
    @scala.inline
    implicit class ToastHeaderPropsMutableBuilder[Self <: ToastHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharCode(value: String | Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharCodeUndefined: Self = StObject.set(x, "charCode", js.undefined)
      
      @scala.inline
      def setClose(value: ReactNode): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseAriaLabel(value: String): Self = StObject.set(x, "closeAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseAriaLabelUndefined: Self = StObject.set(x, "closeAriaLabel", js.undefined)
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setIcon(value: String | ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setToggle(value: MouseEvent[js.Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      @scala.inline
      def setWrapTag(value: ElementType[js.Any]): Self = StObject.set(x, "wrapTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapTagUndefined: Self = StObject.set(x, "wrapTag", js.undefined)
    }
  }
}
